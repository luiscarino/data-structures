package stack

import com.carino.luis.datastructures.linked_list.Element
import com.carino.luis.datastructures.stack.StackImpl
import org.junit.Test
import kotlin.test.assertEquals

/**
 * Created by luiscarino on 3/13/17.
 */
class StackImplTestKotlin {

    val e1 = Element(true)
    val e2 = Element(false)
    val e3 = Element(true)

    @Test
    fun testPush(){
        val stack = StackImpl<Boolean>()
        stack.push(e1)
        stack.push(e2)
        assertEquals(stack.pop(), e2)
    }

    @Test
    fun TestPop(){
        val stack = StackImpl<Boolean>()
        stack.push(e1)
        stack.push(e2)
        stack.push(e3)
        assertEquals(stack.pop(), e3)
        assertEquals(stack.pop(), e2)
        assertEquals(stack.pop(), e1)
        assertEquals(stack.pop(), null)
    }
}