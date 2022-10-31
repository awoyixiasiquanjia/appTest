package com.example.myapplication

import android.content.Context
import android.graphics.*
import android.os.Build
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View

class MyCir :
    View {
    constructor(context: Context?) :this(context,null)
    constructor(context: Context?, attrs: AttributeSet?) :this(context,attrs,0)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)
    private val  paint = Paint()
    private val  patch = Path()
    private  var  mCanvas:Canvas
    private  var mBitmap:Bitmap
    init {
        mBitmap= Bitmap.createBitmap(1000,800,Bitmap.Config.ARGB_8888)
        mCanvas= Canvas()
        mCanvas.setBitmap(mBitmap)
        mCanvas.drawColor(Color.WHITE)
        paint.setColor(Color.parseColor("#00b5ad"))
        paint.strokeWidth =2f
        paint.setStyle(Paint.Style.STROKE)
//        paint.strokeWidth= 10f
//        paint.textSize = 40f;
      //  paint.style= Paint.Style.STROKE
    }

    override fun onDraw(canvas: Canvas) {
//        canvas.drawCircle((width/2).toFloat(),(width/2).toFloat(),100f,paint)
//        paint.reset()
//       canvas.drawText("我是绘制的文字",0f,100f,paint)
        mCanvas.drawPath(patch,paint);
        canvas.drawBitmap(mBitmap,0f,0f,paint);
        super.onDraw(canvas)
    }

    override fun dispatchDraw(canvas: Canvas?) {
        super.dispatchDraw(canvas)
    }

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()


    }

    override fun dispatchTouchEvent(event: MotionEvent): Boolean {
        when(event.action){
            MotionEvent.ACTION_DOWN -> {
                patch.moveTo(event.x,event.y)
                return true
            }
            MotionEvent.ACTION_MOVE ->{
                patch.lineTo(event.x,event.y)
                invalidate()
                return  true
            }
        }
        return super.dispatchTouchEvent(event)
    }

    fun clearCanvas(){


    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
    }



}