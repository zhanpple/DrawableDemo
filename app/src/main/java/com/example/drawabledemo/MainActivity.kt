package com.example.drawabledemo

import android.content.Intent
import android.os.Bundle
import android.view.View

/**
 * 对应关系
private Drawable inflateFromTag(@NonNull String name) {
    switch (name) {
        case "selector":
        return new StateListDrawable();
        case "animated-selector":
        return new AnimatedStateListDrawable();
        case "level-list":
        return new LevelListDrawable();
        case "layer-list":
        return new LayerDrawable();
        case "transition":
        return new TransitionDrawable();
        case "ripple":
        return new RippleDrawable();
        case "adaptive-icon":
        return new AdaptiveIconDrawable();
        case "color":
        return new ColorDrawable();
        case "shape":
        return new GradientDrawable();
        case "vector":
        return new VectorDrawable();
        case "animated-vector":
        return new AnimatedVectorDrawable();
        case "scale":
        return new ScaleDrawable();
        case "clip":
        return new ClipDrawable();
        case "rotate":
        return new RotateDrawable();
        case "animated-rotate":
        return new AnimatedRotateDrawable();
        case "animation-list":
        return new AnimationDrawable();
        case "inset":
        return new InsetDrawable();
        case "bitmap":
        return new BitmapDrawable();
        case "nine-patch":
        return new NinePatchDrawable();
        case "animated-image":
        return new AnimatedImageDrawable();
        default:
        return null;
    }
}
 *
 */

class MainActivity : BaseActivity() {
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

    fun rippleDrawable(view: View) {
        startActivity(Intent(this,RippleDrawableActivity::class.java))
    }

    fun insertDrawable(view: View) {
        startActivity(Intent(this,InsertDrawableActivity::class.java))
    }

    fun scaleDrawable(view: View) {
        startActivity(Intent(this,ScaleDrawableActivity::class.java))
    }
    fun clipDrawable(view: View) {
        startActivity(Intent(this,ClipDrawableActivity::class.java))
    }

    fun rotateDrawable(view: View) {
        startActivity(Intent(this,RotateDrawableActivity::class.java))
    }

    fun transitionDrawable(view: View) {
        startActivity(Intent(this,TransitionDrawableActivity::class.java))
    }

    fun animationDrawable(view: View) {
        startActivity(Intent(this,AnimationDrawableActivity::class.java))
    }

    fun codeBuild(view: View){
        startActivity(Intent(this,CodeBuildActivity::class.java))
    }
}