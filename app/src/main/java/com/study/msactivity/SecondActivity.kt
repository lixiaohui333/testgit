package com.study.msactivity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btn_goto.setOnClickListener {

            println("--------"+Thread.currentThread().id)
            println("--------"+ taskId)
            CommUtil.mainActivity?.setInfo("Second Text Change")
        }

    }
}
