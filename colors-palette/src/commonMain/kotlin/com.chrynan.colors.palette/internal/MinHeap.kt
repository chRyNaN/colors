package com.chrynan.colors.palette.internal

internal class MinHeap<ELEMENT>(
    private val comparator: Comparator<ELEMENT>
) : Collection<ELEMENT>,
    MutableCollection<ELEMENT> {

    override val size: Int
        get() = heap.size

    private val heap = ArrayList<ELEMENT>()

    override fun addAll(elements: Collection<ELEMENT>): Boolean {
        elements.forEach { add(it) }
        return true
    }

    override fun clear() {
        heap.clear()
    }

    override fun remove(element: ELEMENT): Boolean = heap.remove(element)

    override fun removeAll(elements: Collection<ELEMENT>): Boolean = heap.removeAll(elements)

    override fun retainAll(elements: Collection<ELEMENT>): Boolean = heap.retainAll(elements)

    override fun isEmpty(): Boolean = size == 0

    override fun iterator(): MutableIterator<ELEMENT> = heap.iterator()

    override fun contains(element: ELEMENT): Boolean = heap.contains(element)

    override fun containsAll(elements: Collection<ELEMENT>): Boolean = heap.containsAll(elements)

    override fun add(element: ELEMENT): Boolean {
        heap.add(size, element)
        heapifyUp()
        return true
    }

    fun peek(): ELEMENT {
        if (size == 0) throw NoSuchElementException()
        return heap[0]
    }

    fun poll(): ELEMENT {
        if (size == 0) throw NoSuchElementException()
        val element = heap[0]
        heap[0] = heap[size - 1]
        heap.removeLastOrNull()
        heapifyDown()
        return element
    }

    private fun getLeftChildIndex(parentIndex: Int): Int = 2 * parentIndex + 1

    private fun getRightChildIndex(parentIndex: Int): Int = 2 * parentIndex + 2

    private fun getParentIndex(childIndex: Int): Int = (childIndex - 1) / 2

    private fun hasLeftChild(index: Int): Boolean = getLeftChildIndex(index) < size

    private fun hasRightChild(index: Int): Boolean = getRightChildIndex(index) < size

    private fun hasParent(index: Int): Boolean = getParentIndex(index) >= 0

    private fun leftChild(parentIndex: Int): ELEMENT = heap[getLeftChildIndex(parentIndex)]

    private fun rightChild(parentIndex: Int): ELEMENT = heap[getRightChildIndex(parentIndex)]

    private fun parent(childIndex: Int): ELEMENT = heap[getParentIndex(childIndex)]

    private fun swap(index1: Int, index2: Int) {
        val element = heap[index1]
        heap[index1] = heap[index2]
        heap[index2] = element
    }

    private fun heapifyUp() {
        var index = size - 1

        while (hasParent(index) && comparator.compare(parent(index), heap[index]) > 0) {
            swap(getParentIndex(index), index)
            index = getParentIndex(index)
        }
    }

    private fun heapifyDown() {
        var index = 0
        while (hasLeftChild(index)) {
            var smallestChildIndex = getLeftChildIndex(index)

            if (hasRightChild(index) && comparator.compare(
                    rightChild(index),
                    leftChild(index)
                ) < 0
            ) {
                smallestChildIndex = getRightChildIndex(index)
            }

            if (comparator.compare(heap[index], heap[smallestChildIndex]) < 0) {
                break
            } else {
                swap(index, smallestChildIndex)
            }

            index = smallestChildIndex
        }
    }
}
