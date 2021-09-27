package com.example.studyapp

import android.app.AlertDialog
import android.content.Context
import android.content.DialogInterface
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_row.view.*


class RecyclerViewAdapter(
    private val words: ArrayList<String>, private val explain: ArrayList<String>,private val description: ArrayList<String>
) : RecyclerView.Adapter<RecyclerViewAdapter.ItemViewHolder>(){

    class ItemViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView)

    var ctx: Context? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        ctx=parent.getContext();
        return ItemViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_row, parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val word=words[position]
        val word2=explain[position]
        val word3=description[position]


        holder.itemView.apply{

            tv.text=word
            tv2.text=word2
        }


        holder.itemView.setOnClickListener {
            println("hello world")
            // first we create a variable to hold an AlertDialog builder
            val dialogBuilder = AlertDialog.Builder(ctx)
            // then we set up the input
            //val input = EditText(this)
            // here we set the message of our alert dialog
            dialogBuilder.setMessage("$word3")
                // negative button text and action
                .setNegativeButton("OK", DialogInterface.OnClickListener { dialog, id ->
                    dialog.cancel()
                })

            // create dialog box
            val alert = dialogBuilder.create()
            // set title for alert dialog box
            alert.setTitle("$word")
            // add the Edit Text
           // alert.setView(input)
            // show alert dialog
            alert.show()
        }
    }

    override fun getItemCount(): Int =words.size

}