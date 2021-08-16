package com.umit.travellingdealerapp.dataStructure

import com.umit.travellingdealerapp.node.BaseNode

class LinkedList<T> {

    var head: BaseNode<T>? = null
    private var tail: BaseNode<T>? = null
    private var size = 0

    fun isEmpty(): Boolean {
        return size == 0
    }

    fun append(node: BaseNode<T>) {
        if (isEmpty()) {
            push(node)
            return
        }

        tail?.next = node

        tail = tail?.next
        size++
    }

    fun push(node: BaseNode<T>): LinkedList<T> {
        head = node
        if (tail == null) {
            tail = head
        }
        size++
        return this
    }
}
