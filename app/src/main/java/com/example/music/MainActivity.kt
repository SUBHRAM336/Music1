package com.example.music

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Window
import android.view.WindowManager
import android.view.accessibility.AccessibilityNodeInfo
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.concurrent.timer
import kotlin.concurrent.timerTask

@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN , WindowManager.LayoutParams.FLAG_FULLSCREEN )

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val animation=AnimationUtils.loadAnimation(this,R.anim.righttoleft)
        ellipse_1.startAnimation(animation)

        val animation1 =AnimationUtils.loadAnimation(this,R.anim.lefttoright)
        ellipse_3.startAnimation(animation1)

           val animation2=AnimationUtils.loadAnimation(this,R.anim.lefttoright)
        ellipse_2.startAnimation(animation2)

            val animation3=AnimationUtils.loadAnimation(this,R.anim.fade_in)
        secondactivity.startAnimation(animation3)

     //   val handler=Handler()
       // val runnable= Runnable {
       //  val i=Intent(this,secondActivity::class.java)
        //    startActivity(i)
      //  }
      //  handler.postDelayed(runnable,4000)
      }
}