package com.ashhasib.awesomelogin

import android.graphics.drawable.AnimationDrawable
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadBackGroundAnimation()

    }

    private fun loadBackGroundAnimation() {
        val animationDrawable = mainLayout.background as AnimationDrawable

        animationDrawable.setEnterFadeDuration(4000)
        animationDrawable.setExitFadeDuration(4000)

        animationDrawable.start()
    }
}
