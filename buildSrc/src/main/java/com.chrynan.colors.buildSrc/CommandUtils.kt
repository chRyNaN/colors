package com.chrynan.colors.buildSrc

import com.chrynan.colors.buildSrc.LibraryConstants
import java.io.InputStream
import java.nio.charset.Charset

@Suppress("UnusedReceiverParameter")
val LibraryConstants.versionCode: Int
    get() = getCommitCount()

private fun getCommitCount(): Int {
    val result = exec(
        listOf(
            "/bin/sh",
            "-c",
            "git rev-list HEAD | wc -l"
        ) // needs to explicitly use "/bin/sh" so that we can use the '|' character.
    )

    when (result) {
        is ExecutionResult.Error -> throw result.toException()
        is ExecutionResult.Success -> return result.message.toIntOrNull() ?: error("Invalid response for git count.")
    }
}

private const val EXIT_VALUE_SUCCESS = 0

private sealed class ExecutionResult {

    data class Success(
        val message: String,
        val exitValue: Int? = null
    ) : ExecutionResult()

    data class Error(
        val message: String? = null,
        val exitValue: Int? = null,
        val throwable: Throwable? = null
    ) : ExecutionResult()
}

private fun ExecutionResult.Error.toException(): Exception =
    RuntimeException(
        "Error executing command. $exitValue: $message",
        throwable
    )

private fun exec(commands: Collection<String>): ExecutionResult =
    try {
        val process = Runtime.getRuntime().exec(commands.toTypedArray())

        val outputMessage = process.inputStream.readToString().trim()
        val errorMessage = process.errorStream.readToString().trim()

        val exitValue = process.waitFor()

        if (exitValue == EXIT_VALUE_SUCCESS) {
            ExecutionResult.Success(message = outputMessage)
        } else {
            ExecutionResult.Error(
                message = errorMessage,
                exitValue = exitValue
            )
        }
    } catch (throwable: Throwable) {
        ExecutionResult.Error(throwable = throwable)
    }

private fun InputStream.readToString(charset: Charset = Charsets.UTF_8): String =
    bufferedReader(charset).use { it.readText() }
