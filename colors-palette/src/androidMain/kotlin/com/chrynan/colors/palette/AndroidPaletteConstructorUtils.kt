@file:Suppress("unused")

package com.chrynan.colors.palette

import android.content.Context
import android.content.res.Resources
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Rect
import android.graphics.drawable.BitmapDrawable
import kotlin.math.ceil
import kotlin.math.max
import kotlin.math.sqrt

suspend fun Palette.Companion.generate(
    bitmapDrawable: BitmapDrawable,
    resizeArea: Int = 112 * 112,
    maxColorCount: Int = 16
): Palette = generate(
    bitmap = bitmapDrawable.bitmap,
    resizeArea = resizeArea,
    maxColorCount = maxColorCount
)

suspend fun Palette.Companion.generate(
    bitmap: Bitmap,
    resizeArea: Int = 112 * 112,
    maxColorCount: Int = 16
): Palette {
    val scaledBitmap = scaleBitmapDown(bitmap = bitmap, resizeArea = resizeArea)

    val pixels = getPixelsFromBitmap(bitmap = scaledBitmap)

    if (scaledBitmap != bitmap) {
        scaledBitmap.recycle()
    }

    return Palette.generate(pixels = pixels, maxColorCount = maxColorCount)
}

suspend fun Palette.Companion.generate(
    resources: Resources,
    resourceId: Int,
    options: BitmapFactory.Options? = null,
    resizeArea: Int = 112 * 112,
    maxColorCount: Int = 16
): Palette {
    val bitmap = if (options != null) {
        BitmapFactory.decodeResource(resources, resourceId, options)
    } else {
        BitmapFactory.decodeResource(resources, resourceId)
    }

    return generate(bitmap = bitmap, resizeArea = resizeArea, maxColorCount = maxColorCount)
}

suspend fun Palette.Companion.generate(
    context: Context,
    resourceId: Int,
    options: BitmapFactory.Options? = null,
    resizeArea: Int = 112 * 112,
    maxColorCount: Int = 16
): Palette = generate(
    resources = context.resources,
    resourceId = resourceId,
    options = options,
    resizeArea = resizeArea,
    maxColorCount = maxColorCount
)

private fun getPixelsFromBitmap(bitmap: Bitmap, region: Rect? = null): IntArray {
    val bitmapWidth = bitmap.width
    val bitmapHeight = bitmap.height
    val pixels = IntArray(bitmapWidth * bitmapHeight)

    bitmap.getPixels(pixels, 0, bitmapWidth, 0, 0, bitmapWidth, bitmapHeight)

    return if (region == null) {
        // If we don't have a region, return all of the pixels
        pixels
    } else {
        // If we do have a region, lets create a subset array containing only the region's
        // pixels
        val regionWidth = region.width()
        val regionHeight = region.height()

        // pixels contains all of the pixels, so we need to iterate through each row and
        // copy the regions pixels into a new smaller array
        val subsetPixels = IntArray(regionWidth * regionHeight)

        for (row in 0 until regionHeight) {
            System.arraycopy(
                pixels,
                (row + region.top) * bitmapWidth + region.left,
                subsetPixels,
                row * regionWidth,
                regionWidth
            )
        }

        subsetPixels
    }
}

private fun scaleBitmapDown(
    bitmap: Bitmap,
    resizeArea: Int = 112 * 112,
    resizeMaxDimension: Int = -1
): Bitmap {
    var scaleRatio = -1.0

    if (resizeArea > 0) {
        val bitmapArea = bitmap.width * bitmap.height

        if (bitmapArea > resizeArea) {
            scaleRatio = sqrt(resizeArea / bitmapArea.toDouble())
        }
    } else if (resizeMaxDimension > 0) {
        val maxDimension = max(bitmap.width, bitmap.height)

        if (maxDimension > resizeMaxDimension) {
            scaleRatio = resizeMaxDimension / maxDimension.toDouble()
        }
    }

    return if (scaleRatio <= 0) {
        // Scaling has been disabled or not needed so just return the Bitmap
        bitmap
    } else Bitmap.createScaledBitmap(
        bitmap,
        ceil(bitmap.width * scaleRatio).toInt(),
        ceil(bitmap.height * scaleRatio).toInt(),
        false
    )
}
