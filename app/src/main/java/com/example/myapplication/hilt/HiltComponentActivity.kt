package com.example.myapplication.hilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.myapplication.R
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Named

@AndroidEntryPoint
class HiltComponentActivity : AppCompatActivity {

    @Inject
    lateinit var person: Person

    @Inject
    lateinit var student: Student

    @selectedBean("构造2")
    @Inject
    lateinit var multipleBean:MultipleBean

    @selectedBean("构造1")
    @Inject
    lateinit var multipleBean2:MultipleBean

    @selectedBean("构造1")
    @Inject
    lateinit var multipleBean3:MultipleBean


    var oldAge:Int =23

    constructor(){
        Log.w("HiltComponentActivity","oldAge hashCode=="+oldAge.hashCode())
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hilt_component)
      //Log.w("HiltComponentActivity","user=="+user.hashCode()  + "user1 = "+user1.hashCode())
//
//        Log.w("HiltComponentActivity","student=="+student.hashCode())

        Log.w("HiltComponentActivity","multipleBean=="+multipleBean.hashCode() + "multipleBean2=="+multipleBean2.hashCode()
        +"multipleBean3="+multipleBean3.hashCode()
        )

        Log.w("HiltComponentActivity","person=="+person.hashCode())

        //Log.w("HiltComponentActivity","name=="+this.javaClass.superclass.simpleName)
    }
}