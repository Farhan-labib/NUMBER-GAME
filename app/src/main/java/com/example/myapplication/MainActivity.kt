package com.example.myapplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RelativeLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {
        var random1:Int=0
        var random2:Int=0
        var point:Int=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        random1=(0..100).shuffled().last()
        val displaytext : Button= findViewById<Button>(R.id.button)
        displaytext.setText(random1.toString())

        random2=(0..100).shuffled().last()
        val displaytext2 : Button= findViewById<Button>(R.id.button2)
        displaytext2.setText(random2.toString())


    }

    fun buttonclick(view: View){
        if(random1 >= random2){
            point=point+1
            val p : TextView= findViewById<TextView>(R.id.tv)
            p.setText(point.toString())
            var a : androidx.constraintlayout.widget.ConstraintLayout= findViewById<androidx.constraintlayout.widget.ConstraintLayout>(R.id.background)
            a.setBackgroundColor(Color.GREEN)

        }else{
            point=point-1
            var p : TextView= findViewById<TextView>(R.id.tv)
            p.setText(point.toString())
            var a : androidx.constraintlayout.widget.ConstraintLayout= findViewById<androidx.constraintlayout.widget.ConstraintLayout>(R.id.background)
            a.setBackgroundColor(Color.RED)
        }

        random1=(0..100).shuffled().last()
        var displaytext : Button= findViewById<Button>(R.id.button)
        displaytext.setText(random1.toString())
        random2=(0..100).shuffled().last()
        var displaytext2 : Button= findViewById<Button>(R.id.button2)
        displaytext2.setText(random2.toString())

    }

    fun buttonclick2(view: View){
        if(random1<=random2){
            point=point+1
            var p : TextView= findViewById<TextView>(R.id.tv)
            p.setText(point.toString())
            var a : androidx.constraintlayout.widget.ConstraintLayout= findViewById<androidx.constraintlayout.widget.ConstraintLayout>(R.id.background)
            a.setBackgroundColor(Color.GREEN)

        }else{
            point=point-1
            var p : TextView= findViewById<TextView>(R.id.tv)
            p.setText(point.toString())
            var a : androidx.constraintlayout.widget.ConstraintLayout= findViewById<androidx.constraintlayout.widget.ConstraintLayout>(R.id.background)
            a.setBackgroundColor(Color.RED)
        }

        random1=(0..100).shuffled().last()
        var displaytext : Button= findViewById<Button>(R.id.button)
        displaytext.setText(random1.toString())
        random2=(0..100).shuffled().last()
        var displaytext2 : Button= findViewById<Button>(R.id.button2)
        displaytext2.setText(random2.toString())

    }
}

