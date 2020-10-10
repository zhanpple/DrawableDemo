package com.example.drawabledemo.view

import android.content.Context
import android.graphics.Canvas
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.util.Log
import android.view.View
import androidx.core.content.ContextCompat
import com.example.drawabledemo.R

/**
 * Created at 9:54 2020/10/9
 *
 * @author zmp
 *
 *
 * des:
 */
class MyDrawableView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {

    private var mXmlDrawable: Drawable? = null

    init {
        mXmlDrawable =
            ContextCompat.getDrawable(context, R.drawable.ripple_draw_04)
        mXmlDrawable?.callback = this
    }

    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
        super.onSizeChanged(w, h, oldw, oldh)
        mXmlDrawable?.setBounds(0, 0, right - left, bottom - top)
    }


    override fun onDraw(canvas: Canvas?) {
        canvas?.let {
            //需要设置bounds 才会显示
            Log.e(TAG, "onDraw: ")
            mXmlDrawable?.draw(canvas)
        }
    }

    //Drawable设置Hotspot
    override fun dispatchDrawableHotspotChanged(x: Float, y: Float) {
        super.dispatchDrawableHotspotChanged(x, y)
        mXmlDrawable?.setHotspot(x, y)
    }

    //Drawable状态改变通知
    override fun drawableStateChanged() {
        super.drawableStateChanged()
        mXmlDrawable?.state = drawableState
    }

    //是否需要刷新Drawable
    override fun verifyDrawable(who: Drawable): Boolean {
        val verifyDrawable = super.verifyDrawable(who)
        Log.e(TAG, "verifyDrawable:$verifyDrawable ")
        return who == mXmlDrawable || verifyDrawable
    }


    companion object {
        private const val TAG = "MyDrawableView"
    }

}