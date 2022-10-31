package com.example.myapplication

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.view.View

class XfermodeView: View {
    constructor(context: Context?) : super(context)
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    )
    val srcBitmap :Bitmap
    val desBitmap:Bitmap
    val paint :Paint

    init {
        srcBitmap = getSRC()
        desBitmap =getDst()
        paint = Paint()
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        canvas.drawColor(Color.parseColor("#00b5ad"))
        canvas.saveLayer(0f,0f,width.toFloat()/2,height.toFloat()/2,paint,Canvas.ALL_SAVE_FLAG) //生成一个透明的画布
        canvas.drawBitmap(desBitmap,0f,0f,null)  //首先画一个圆
        paint.xfermode = PorterDuffXfermode(PorterDuff.Mode.SRC_IN)
        canvas.drawBitmap(srcBitmap,0f,0f,paint)
    }

    //创建目标图片
    fun getDst():Bitmap{ //圆形
        val createBitmap = Bitmap.createBitmap(500, 500, Bitmap.Config.ARGB_8888)
        val canvas = Canvas().apply {
            setBitmap(createBitmap)
        }

        val paint = Paint().apply {
            color = Color.BLUE
        }
        canvas.drawCircle(250f,250f,250f,paint)
        return createBitmap;
    }

    fun getSRC():Bitmap{   //矩形
        val createBitmap = Bitmap.createBitmap(500, 500, Bitmap.Config.ARGB_8888);
        val canvas = Canvas().apply {
            setBitmap(createBitmap)
        }
        val  paint = Paint().apply {
            color = Color.RED
        }

        canvas.drawRect(0f,0f,500f,500f,paint)
        return createBitmap;
    }




}