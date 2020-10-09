package com.example.drawabledemo

import android.os.Bundle
import android.widget.SeekBar
import kotlinx.android.synthetic.main.activity_clip_drawable.*

class ClipDrawableActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clip_drawable)

        seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                button1.drawable?.level = progress * 100
                button2.background?.level = progress * 100
                levelTv.text = "level:$progress"
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
            }

        })
    }
}
