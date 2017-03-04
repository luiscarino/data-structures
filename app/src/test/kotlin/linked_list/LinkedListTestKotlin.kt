package linked_list

import com.carino.luis.datastructures.linked_list.Element
import com.carino.luis.datastructures.linked_list.LinkedList
import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

/**
 * Created by luiscarino on 3/4/17.
 */
class LinkedListTestKotlin {

    @Test
    fun testLinkedList(){
        val e1 = Element(1)
        val e2 = Element(2)
        val e3 = Element(3)
        val e4 = Element(4)
        val e5 = Element(5)
        var myList = LinkedList(e1)
        myList.append(e2)
        myList.append(e3)

        assertNotNull(myList.head)
        assertEquals(myList.head?.data, 1)
        assertEquals(myList.head?.next?.data, 2)
        assertEquals(myList.head?.next?.next?.data, 3)

        assertEquals(myList.getAt(0), null)
        assertEquals(myList.getAt(1), e1)
        assertEquals(myList.getAt(2), e2)
        assertEquals(myList.getAt(3), e3)
        assertEquals(myList.getAt(6), null)

        myList.insert(e4, 1)
        assertEquals(myList.getAt(1), e4)
        assertEquals(myList.getAt(2), e1)
        assertEquals(myList.getAt(3), e2)
        assertEquals(myList.getAt(4), e3)

        myList.insert(e5, 2)
        assertEquals(myList.getAt(2), e5)

        myList.delete(1)
        assertEquals(myList.getAt(3), e2)




    }
}
