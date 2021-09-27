package com.example.studyapp

import android.content.DialogInterface
import android.graphics.ColorSpace
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.LinearLayout
import androidx.appcompat.app.AlertDialog
import androidx.cardview.widget.CardView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Kotlin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin)
        setTitle("Kotlin Review")

        var myLayout = findViewById<ConstraintLayout>(R.id.clMain)
        val words = arrayListOf<String>(
            "What is Kotlin?",
            "val and var",
            "User Input",
            "Data Types",
            "Basic Operations",
            "If Statements"
        )
        val explain = arrayListOf<String>(
            "Kotlin is language",
            "Variables",
            "User input in Kotlin is very simple",
            "Basic Data Types",
            "Basic math operations",
            "Decision making"
        )
        val description = arrayListOf<String>(
            "Kotlin is an open-source statically typed programming language developed by JetBrains\nFor more information, see the official documentation: https://kotlinlang.org/",
            "Kotlin requires each variable to be labeled val or var.  Variables labeled with the val keyword are immutable. On the other hand, variables with the var keyword are mutable and can be changed anytime.",
            "User input in Kotlin is very simple.  We simply create a variable that holds the input, then get the user input with readLine()",
            "Basic Data Types Integers, Floats, Strings, and Booleans.  For a more comprehensive look at data types, you can refer to the Kotlin Docs: https://kotlinlang.org/docs/basic-types.html",
            "Basic math operations : addition, subtraction, multiplication, division, and the modulo operator.",
            "If statements are one of the most fundamental aspects of programming. We use if statements to guide our program in the right direction."
        )

        val myRv = findViewById<RecyclerView>(R.id.myRv)
        myRv.adapter = RecyclerViewAdapter(words, explain,description)
        myRv.layoutManager = LinearLayoutManager(this)
    }
}