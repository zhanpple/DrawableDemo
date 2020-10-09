package com.example.drawabledemo.view

import android.content.Context
import android.graphics.Canvas
import android.util.AttributeSet
import android.view.View

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
//    var mXmlDrawable: Drawable? = null
//
//    init {
//        mXmlDrawable = ContextCompat.getDrawable(context, R.drawable.shape_drawable_01)
//    }


    override fun onDraw(canvas: Canvas?) {
//        canvas?.let {
//            mXmlDrawable?.draw(canvas)
//        }
    }


}