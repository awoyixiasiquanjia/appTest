package com.example.myapplication.lifecycle

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myapplication.R

class EmptyFragment:Fragment {
   val   TAG:String = "======"

    constructor()

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.e(TAG,"==EmptyFragment=onAttach")
    }




    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.e(TAG,"==EmptyFragment=onActivityCreated")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e(TAG,"==EmptyFragment=onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.e(TAG,"==EmptyFragment=onCreateView")
        return inflater.inflate(R.layout.empty,container,false)
    }

//    override fun onCreateView(
//        inflater: LayoutInflater,
//        container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        Log.e(TAG,"==onCreateView")
//        return super.onCreateView(inflater, container, savedInstanceState)
//    }

    override fun onResume() {
        super.onResume()
        Log.e(TAG,"==EmptyFragment=onResume")
    }

    override fun onStop() {
        super.onStop()
        Log.e(TAG,"==EmptyFragment=onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.e(TAG,"==EmptyFragment=onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e(TAG,"==EmptyFragment=onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.e(TAG,"==EmptyFragment=onDetach")
    }
}