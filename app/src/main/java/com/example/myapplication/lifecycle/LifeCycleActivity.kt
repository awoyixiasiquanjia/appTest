package com.example.myapplication.lifecycle
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.LifecycleOwner
import com.example.myapplication.R
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class LifeCycleActivity : AppCompatActivity() {

    @Inject
    lateinit var mLifeCycleOwner:LifeCycleOwner

    @Inject
    lateinit var myLiftObser:MyLiftObser

    @Inject
    lateinit var myLiftObser2:MyLifeObser_2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_life_cycle)
        lifecycle.addObserver(myLiftObser)
        lifecycle.addObserver(myLiftObser2)

        val emptyFragment = EmptyFragment()
        val emptyFragment_2 = EmptyFragment2()
        val beginTransaction = supportFragmentManager.beginTransaction()
        val ftparent = findViewById<FrameLayout>(R.id.ft)
          beginTransaction.add(emptyFragment_2,"tata")
        findViewById<ViewGroup>(R.id.ft).childCount
        beginTransaction.commitNow()
        val fragments = supportFragmentManager.fragments;
        ftparent.childCount
        findViewById<View>(R.id.text_1).setOnClickListener {
            beginTransaction.add(R.id.ft,emptyFragment_2)
             beginTransaction.replace(R.id.ft,emptyFragment_2)
             beginTransaction.add(emptyFragment,"df")
            beginTransaction.commitNow()
            Log.e("=====","ftparent.childCount=${supportFragmentManager.fragments}")
            Log.e("===","++++++")
            val beginTransaction1 = supportFragmentManager.beginTransaction()
            beginTransaction1.let {
                it.hide(emptyFragment)
                it.show(emptyFragment_2)
            }.commit()
            beginTransaction1.hide(emptyFragment)
            beginTransaction1.show(emptyFragment_2)
        }
        findViewById<View>(R.id.text_2).setOnClickListener {
                      MyState.CREATED.compareTo(MyState.DESTROYED)
        }

    }

    override fun onStart() {
        super.onStart()
     //   mLifeCycleOwner.onStart()




    }



    override fun onDestroy() {
        super.onDestroy()
       // mLifeCycleOwner.onStop()
    }


}