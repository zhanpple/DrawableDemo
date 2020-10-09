package com.example.drawabledemo

import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_animation_drawable.*


class AnimationDrawableActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animation_drawable)

        val transitionDrawable = button.background as AnimationDrawable
        val transitionDrawable2 = button2.background as AnimationDrawable
        button.setOnClickListener {
            transitionDrawable.start()
            transitionDrawable2.start()
        }
        button2.setOnClickListener {
            transitionDrawable.stop()
            transitionDrawable2.stop()
        }
    }
}
