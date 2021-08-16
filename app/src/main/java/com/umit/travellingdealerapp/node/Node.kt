package com.umit.travellingdealerapp.node

data class Node(
    override var value: Pair<Int, Int>?,
    override var next: BaseNode<Pair<Int, Int>?>? = null
) : BaseNode<Pair<Int, Int>?>(value, next)
