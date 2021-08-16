package com.umit.travellingdealerapp

import android.annotation.SuppressLint
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.umit.travellingdealerapp.dataStructure.LinkedList
import com.umit.travellingdealerapp.extensions.delete
import com.umit.travellingdealerapp.extensions.sumOfNodes
import com.umit.travellingdealerapp.node.Node
import com.umit.travellingdealerapp.type.CustomerType
import com.umit.travellingdealerapp.type.FactoryType

class MainActivity : AppCompatActivity() {

    private lateinit var view: View
    private lateinit var linkedList: LinkedList<Pair<Int, Int>?>

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.addNotesButton)?.setOnClickListener {
            linkedList = addNodesToList()

            val totalDistance = (linkedList.head as Node).sumOfNodes() * 2
            findViewById<TextView>(R.id.resultTextView).text = getString(R.string.total_length) + "\n$totalDistance"
        }

        findViewById<Button>(R.id.deleteNodesButton)?.setOnClickListener {
            if (this::linkedList.isInitialized) {
                (linkedList.head as Node).delete()
                findViewById<TextView>(R.id.resultTextView).text = getString(R.string.list_is_empty)
            }
        }
    }

    private fun addNodesToList(): LinkedList<Pair<Int, Int>?> {
        return LinkedList<Pair<Int, Int>?>().apply {
            append(getFactory())
            getCustomersNodes().forEach { append(it) }
        }
    }

    private fun getCustomersNodes(): List<Node> {
        return CustomerType.values().map { Node(Pair(it.x, it.y)) }
    }

    private fun getFactory(): Node {
        return FactoryType.Factory.let { Node(Pair(it.x, it.y)) }
    }
}