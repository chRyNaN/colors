@file:Suppress("unused")

package com.chrynan.colors.palette.internal

internal class PriorityQueue<ELEMENT>(
    comparator: Comparator<ELEMENT>
) : Collection<ELEMENT>,
    MutableCollection<ELEMENT> {

    private val heap = MinHeap(comparator)

    override val size: Int
        get() = heap.size

    override fun contains(element: ELEMENT): Boolean = heap.contains(element)

    override fun containsAll(elements: Collection<ELEMENT>): Boolean = heap.containsAll(elements)

    override fun isEmpty(): Boolean = heap.isEmpty()

    override fun iterator(): MutableIterator<ELEMENT> = heap.iterator()

    override fun add(element: ELEMENT): Boolean = heap.add(element)

    override fun addAll(elements: Collection<ELEMENT>): Boolean = heap.addAll(elements)

    override fun clear() = heap.clear()

    override fun remove(element: ELEMENT): Boolean = heap.remove(element)

    override fun removeAll(elements: Collection<ELEMENT>): Boolean = heap.removeAll(elements)

    override fun retainAll(elements: Collection<ELEMENT>): Boolean = heap.retainAll(elements)

    fun offer(element: ELEMENT) = heap.add(element)

    fun poll(): ELEMENT = heap.poll()

    fun pollOrNull(): ELEMENT? =
        try {
            heap.poll()
        } catch (exception: NoSuchElementException) {
            null
        }

    fun peek(): ELEMENT = heap.peek()

    fun peekOrNull(): ELEMENT? =
        try {
            heap.peek()
        } catch (exception: NoSuchElementException) {
            null
        }
}
