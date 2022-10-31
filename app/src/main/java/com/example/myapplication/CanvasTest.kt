package com.example.myapplication

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Rect
import android.util.AttributeSet
import android.view.View

class CanvasTest :View {
    constructor(context: Context?) : super(context)
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    )
    val paingreen : Paint

    val paintRed :Paint


    init {
        paingreen = Paint().apply {
              style = Paint.Style.STROKE
              color = Color.parseColor("#00b5ad")
              strokeWidth =3f
        }

        paintRed =Paint().apply {
            style = Paint.Style.STROKE
            color= Color.RED
            strokeWidth=3f
        }
    }


    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        val rect = Rect(0,0,100,100)
        canvas.drawRect(rect,paingreen)
        canvas.translate(50f,50f)
        canvas.drawRect(rect,paintRed)
    }



}