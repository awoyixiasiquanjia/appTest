package com.example.myapplication.navigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.myapplication.R
import kotlinx.android.synthetic.main.main_ft.view.*

class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val viewALl = inflater.inflate(R.layout.main_ft, container, false)
        initView(viewALl)
        return viewALl
    }

    private fun initView(viewALl: View) {
        viewALl.tv_onclick.setOnClickListener{
            val bundle= bundleOf("userName" to "真正的人")
            Navigation.findNavController(it).navigate(R.id.action_1)
        }

    }


}