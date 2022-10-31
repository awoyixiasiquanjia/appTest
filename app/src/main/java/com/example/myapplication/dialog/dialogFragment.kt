package com.example.myapplication.dialog

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.myapplication.R

class dialogFragment:Fragment {
   val   TAG:String = "======"

    constructor()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val inflate = inflater.inflate(R.layout.empty_dialog, container, false)
        inflate.findViewById<View>(R.id.click).setOnClickListener {
            Toast.makeText(inflate.context,"点击了fragment", Toast.LENGTH_SHORT).show()
        }
        return inflate
    }

}