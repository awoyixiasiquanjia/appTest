package com.example.myapplication.viewmode

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.R
import com.example.myapplication.databinding.ActivityViewModelBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


@AndroidEntryPoint
class ViewModelActivity : AppCompatActivity() {

    lateinit var myViewModel: MyViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // setContentView(R.layout.activity_view_model)
        val inflate = ActivityViewModelBinding.inflate(layoutInflater)
        setContentView(inflate.root)

       myViewModel = ViewModelProvider(this).get(MyViewModel::class.java)
        inflate.tvButtom.setOnClickListener{
            myViewModel.count ++
            inflate.tvShow.text = "显示的数据${myViewModel.count}"
        }
    }

}