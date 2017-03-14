package com.carino.luis.datastructures.stack

import com.carino.luis.datastructures.linked_list.Element
import com.carino.luis.datastructures.linked_list.LinkedList

/**
 * Created by luiscarino on 3/13/17.
 */
class StackImpl<T>: Stack<T> {

    var ll: LinkedList<T> = LinkedList()

    override fun push(newElement: Element<T>) {
        ll.addFirst(newElement)
    }

    override fun pop(): Element<T>? {
       return ll.deleteFirst()
    }
}
