package com.carino.luis.datastructures

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.carino.luis.datastructures.linked_list.Element
import com.carino.luis.datastructures.linked_list.LinkedList

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val e1 = Element(1)
        val e2 = Element(2)
        val e3 = Element(3)
        val myList = LinkedList(e1)
        myList.append(e2)
        myList.append(e3)

        Log.d("TAG",  myList.head?.next?.next?.data.toString())
    }
}
