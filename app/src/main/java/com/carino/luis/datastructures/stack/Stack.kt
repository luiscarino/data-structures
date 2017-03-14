package com.carino.luis.datastructures.stack

import com.carino.luis.datastructures.linked_list.Element

/**
 * Created by luiscarino on 3/13/17.
 */
interface Stack<T> {
    fun push(newElement: Element<T>)
    fun pop() : Element<T>?
}