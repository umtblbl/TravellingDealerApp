package com.umit.travellingdealerapp.extensions

import com.umit.travellingdealerapp.node.Node
import com.umit.travellingdealerapp.type.PowType
import kotlin.math.pow
import kotlin.math.sqrt

fun Node.sumOfNodes(): Double {
    var total = 0.0

    val headNode = this
    var tempNode = this.next

    while (tempNode != null) {
        tempNode.value?.let { value ->
            total += headNode.distance(value.first, value.second)
        }
        tempNode = tempNode.next
    }

    return total
}

fun Node.distance(x: Int, y: Int): Double {
    return value?.let { value ->
        val diffX = (x - value.first).toDouble().pow(PowType.Square.value)
        val diffY = (y - value.second).toDouble().pow(PowType.Square.value)
        return sqrt(diffX + diffY)
    } ?: 0.0
}

fun Node.delete() {
    value = null
}
