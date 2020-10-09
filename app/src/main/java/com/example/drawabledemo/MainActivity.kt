package com.example.drawabledemo

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun shapeDrawable(view: View) {
        startActivity(Intent(this,ShapeDrawableActivity::class.java))
    }
    fun stateListDrawable(view: View) {
        startActivity(Intent(this,ShapeSelectorActivity::class.java))
    }

    fun layerDrawable(view: View) {
        startActivity(Intent(this,ShapeLayerActivity::class.java))
    }

    fun levelListDrawable(view: View) {
        startActivity(Intent(this,LevelListActivity::class.java))
    }
}