package com.example.drawabledemo

import android.content.res.ColorStateList
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.GradientDrawable
import android.graphics.drawable.RippleDrawable
import android.graphics.drawable.ShapeDrawable
import android.graphics.drawable.shapes.PathShape
import android.graphics.drawable.shapes.RoundRectShape
import android.os.Bundle
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_code_build.*

class CodeBuildActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_code_build)

        //ShapeDrawable
        val mPath = Path()
        mPath.addCircle(150F,150F,100F,Path.Direction.CCW)
        val shapeDrawable = ShapeDrawable()
        //path stdWidth stdHeight会根据view实际大小进行等比缩放
        val pathShape = PathShape(mPath, 300F, 300F)
        shapeDrawable.shape = pathShape
        val paint = shapeDrawable.paint
        paint.style = Paint.Style.STROKE
        paint.strokeWidth = 20F
        shapeDrawable.setTint(Color.MAGENTA)
        shapeBt.background = shapeDrawable


        val drawable = ContextCompat.getDrawable(this, R.drawable.ripple_draw_01)
        rippleBt.background = drawable

        // rippleDrawable mask 颜色无效
        val rippleDrawable = RippleDrawable(
            ColorStateList.valueOf(Color.RED),
            ColorDrawable(Color.YELLOW), null
        )
        rippleBt1.background = rippleDrawable

        // rippleDrawable mask 颜色无效

        val shape = ShapeDrawable()
        val roundedCorners = floatArrayOf(50f, 50f, 50f, 50f, 50f, 50f, 50f, 50f)
        shape.shape = RoundRectShape(roundedCorners, null, roundedCorners)
        shape.setTint(Color.MAGENTA)

        val rippleDrawable2 = RippleDrawable(
            ColorStateList.valueOf(Color.BLUE),
            shape, null
        )
        rippleBt2.background = rippleDrawable2


        val gradientDrawable = GradientDrawable()
        gradientDrawable.shape = GradientDrawable.RECTANGLE
        gradientDrawable.setStroke(10,Color.CYAN)
        gradientDrawable.cornerRadius = 20F
        gradientDrawable.colors= intArrayOf(Color.RED,Color.GREEN)
        gradientDrawable.gradientType = GradientDrawable.LINEAR_GRADIENT
        gradientDrawable.orientation = GradientDrawable.Orientation.BL_TR
        shapeBt2.background = gradientDrawable
    }
}
