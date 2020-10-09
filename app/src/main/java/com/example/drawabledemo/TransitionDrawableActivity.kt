package com.example.drawabledemo

import android.graphics.drawable.TransitionDrawable
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_transition_drawable.*


class TransitionDrawableActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transition_drawable)

        val transitionDrawable = button.background as TransitionDrawable
        val transitionDrawable2 = button2.background as TransitionDrawable
        button.setOnClickListener {
            transitionDrawable.startTransition(2000)
            transitionDrawable2.startTransition(2000)
        }
        button2.setOnClickListener {
            transitionDrawable.reverseTransition(2000)
            transitionDrawable2.reverseTransition(2000)
        }
    }
}
