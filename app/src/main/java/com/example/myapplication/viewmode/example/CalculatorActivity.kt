package com.example.myapplication.viewmode.example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.R
import com.example.myapplication.databinding.ActivityCalculatorBinding

class CalculatorActivity : AppCompatActivity() {
    lateinit var mCalculatorViewmodel:CalculatorViewmodel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // setContentView(R.layout.activity_calculator)
         mCalculatorViewmodel = ViewModelProvider(this).get(CalculatorViewmodel::class.java)
      //val mCalculatorViewmodel:CalculatorViewmodel by  viewModels()
        val contentView = DataBindingUtil.setContentView<ActivityCalculatorBinding>(
            this,
            R.layout.activity_calculator
        )
        contentView.vm = mCalculatorViewmodel
        contentView.lifecycleOwner = this
    }
}