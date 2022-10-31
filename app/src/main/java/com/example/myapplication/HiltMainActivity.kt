package com.example.myapplication
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import com.example.myapplication.AIDL.AIDLActivity
import com.example.myapplication.databinding.DatabindActivity
import com.example.myapplication.dialog.DialogActivity
import com.example.myapplication.hilt.HiltComponentActivity
import com.example.myapplication.kotlin.getName
import com.example.myapplication.lifecycle.LifeCycleActivity
import com.example.myapplication.livedata.LiveDataActivity
import com.example.myapplication.navigation.NavigationActivity
import com.example.myapplication.viewbind.viewding_kotlinActivity
import com.example.myapplication.viewmode.ViewModelActivity
import com.example.myapplication.viewmode.example.CalculatorActivity

class HiltMainActivity : AppCompatActivity() {
    val TAG = "hiltmainactivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hilt_main)
        val tv_text3 = findViewById<TextView>(R.id.tv_text3)
        tv_text3.post {
            tv_text3.setText("测绘师")

        }

        var intent = Intent(this, HiltComponentActivity::class.java)
        findViewById<View>(R.id.tv_text1).setOnClickListener {
          startActivity(intent)
        }
        findViewById<View>(R.id.tv_text2).setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }


        findViewById<View>(R.id.tv_text4).setOnClickListener {
            var intent = Intent(this, DialogActivity::class.java)
            startActivity(intent)
        }

        findViewById<View>(R.id.tv_text5).setOnClickListener {
            var intent = Intent(this, LiveDataActivity::class.java)
            startActivity(intent)
        }

        findViewById<View>(R.id.tv_text3).setOnClickListener {
            val a :Float = 3.40f
            val userName = a.getUserName();
//            val name = a.getName("我是测试")
            a.yundong()
            var intent = Intent(this, LifeCycleActivity::class.java)
            startActivity(intent)
        }

        findViewById<View>(R.id.tv_text6).setOnClickListener {
            var intent = Intent(this, ViewBindActivity::class.java)
            startActivity(intent)
        }


        findViewById<View>(R.id.tv_text7).setOnClickListener {
            var intent = Intent(this, viewding_kotlinActivity::class.java)
            startActivity(intent)
        }

        findViewById<View>(R.id.tv_text8).setOnClickListener {
            var intent = Intent(this, DatabindActivity::class.java)
            startActivity(intent)
        }
        findViewById<View>(R.id.tv_text9).setOnClickListener {
            var intent = Intent(this, ViewModelActivity::class.java)
            startActivity(intent)
        }

        findViewById<View>(R.id.tv_text10).setOnClickListener {
            var intent = Intent(this, CalculatorActivity::class.java)
            startActivity(intent)
        }

        findViewById<View>(R.id.tv_text11).setOnClickListener {
            var intent = Intent(this, KotlinActivity::class.java)
            startActivity(intent)
        }

        findViewById<View>(R.id.tv_text12).setOnClickListener {
            var intent = Intent(this, NavigationActivity::class.java)
            startActivity(intent)
        }

        findViewById<View>(R.id.tv_text13).setOnClickListener {
            var intent = Intent(this, AIDLActivity::class.java)
            startActivity(intent)
        }

    }

   fun Float.getUserName():String{
       getAge()
       return "我是测试名字"
   }

private fun getAge(){

}

    fun TextView.isBold():Boolean =  this.isBold()

    fun TextView.isBold_2():Boolean {
        return  this.isBold()
    }

    fun <T> T.yundong():String{
        return "运动一下呗"
   }

    override fun onPause() {
        super.onPause()
        Log.e(TAG,"HiltMainActivity = onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e(TAG,"HiltMainActivity = onStop")
    }


    override fun onDestroy() {
        super.onDestroy()
        Log.e(TAG,"HiltMainActivity = onDestroy")
    }

}