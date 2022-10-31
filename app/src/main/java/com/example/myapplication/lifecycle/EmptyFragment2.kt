package com.example.myapplication.lifecycle

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myapplication.R

class EmptyFragment2:Fragment {
   val   TAG:String = "======"

    constructor()

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.e(TAG,"==EmptyFragment2=onAttach")
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.e(TAG,"==EmptyFragment2=onActivityCreated")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e(TAG,"==EmptyFragment2=onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.e(TAG,"==EmptyFragment2=onCreateView")
        return inflater.inflate(R.layout.empty_2,container,false)
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
        Log.e(TAG,"==EmptyFragment2=onResume")
    }

    override fun onStop() {
        super.onStop()
        Log.e(TAG,"==EmptyFragment2=onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.e(TAG,"==EmptyFragment2=onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e(TAG,"==EmptyFragment2=onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.e(TAG,"==EmptyFragment2=onDetach")
    }
}