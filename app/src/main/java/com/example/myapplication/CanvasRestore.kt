package com.example.myapplication

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Rect
import android.util.AttributeSet
import android.view.View

class CanvasRestore:View {
    constructor(context: Context?) : super(context)
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    )

    init {

    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        val rect1 = Rect(0,0,600,600);
        canvas.clipRect(rect1)
        canvas.drawColor(Color.RED)
        val save_1 = canvas.save()

        val rect2 = Rect(0,0,200,200);
        canvas.clipRect(rect2)
        canvas.drawColor(Color.BLUE)
     //   val save_2 = canvas.save()
        //canvas.restoreToCount(save_1)
        canvas.drawColor(Color.CYAN)
    }
}