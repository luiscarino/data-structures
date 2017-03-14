package com.carino.luis.datastructures.linked_list

/**
 * Singly linked list impl.
 * Created by luiscarino on 3/3/17.
 */
class LinkedList<T>(var head: Element<T>? = null) {

    fun append(newElement: Element<T>) {
        if (head == null) {
            head = newElement
        } else {
            var current = head
            while (current?.next != null) {
                current = current?.next
            }
            current?.next = newElement
        }
    }

    fun getAt(position: Int): Element<T>? {
        var current = head
        if (position == 1) {
            return current
        } else {
            var cnt = 1
            do {
                current = current?.next
                cnt += 1
                if (position == cnt) {
                    break
                }
            } while (current?.next != null)

            if (position != cnt) {
                return null
            } else
                return current
        }
    }

    fun insert(newElement: Element<T>, position: Int) {
        val current = head
        if (position == 1) {
            head = newElement
            newElement.next = current
        } else {
            val finalPosition = getAt(position)
            if (finalPosition?.next != null) {
                val initialPosition = getAt(position - 1)
                initialPosition?.next = newElement
                newElement.next = finalPosition
            }
        }
    }


    fun delete(value: T) {
        var current = head
        var previous: Element<T>? = null
        while (value != current?.data && current?.next != null) {
            previous = current!!
            current = current.next
        }

        if (current?.data == value) {
            if (previous != null) {
                previous.next = current?.next
            } else {
                head = current?.next
            }
        }
    }

    fun addFirst(newElement: Element<T>) {
        newElement.next = head
        head = newElement
    }

    fun deleteFirst() : Element<T>? {
        if (head == null) {
            return null
        } else {
            val current = head
            head = current?.next
            return current
        }
    }

}