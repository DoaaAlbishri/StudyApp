package com.example.studyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Android : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_android)
        setTitle("Android Review")

        var myLayout = findViewById<ConstraintLayout>(R.id.clMain)
        val words = arrayListOf<String>(
            "Android Studio setup",
            "Documentation",
            "Resource Files",
            "Design View and XML",
            "UI Elements",
            "OnClickListener"
        )
        val explain = arrayListOf<String>(
            "Download Android Studio",
            "official documentation",
            "some resource files in the Project Overview",
            "XML mode",
            "UI (User Interface) Element",
            "Button event"
        )
        val description = arrayListOf<String>(
            "Click on \"Download Android Studio\" once the page loads. https://developer.android.com/studio",
            "Android Studio Documentation - https://developer.android.com/docs",
            "colors.xml and themes.xml files. Making changes to these files allows us to set a base color for every UI Element (more on those later) we create. These UI Elements can then be changed individually if we choose to do so.",
            "Refer to the official documentation if you need help with application design: https://developer.android.com/studio/write/layout-editor",
            "Explore UI Elements further by customizing them in 'Design' and 'Code' mode.",
            "Once your button is initialized, we can add an OnClickListener with the following code:\"myButton.setOnClickListener { myFuction() }\""
        )

        val myRv = findViewById<RecyclerView>(R.id.myRv)
        myRv.adapter = RecyclerViewAdapter(words, explain, description)
        myRv.layoutManager = LinearLayoutManager(this)
    }
}