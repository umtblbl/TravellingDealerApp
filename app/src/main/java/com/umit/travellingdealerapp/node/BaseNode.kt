package com.umit.travellingdealerapp.node

abstract class BaseNode<T>(open var value: T, open var next: BaseNode<T>? = null)
