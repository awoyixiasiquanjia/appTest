package com.example.myapplication.hilt
import android.app.Activity
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.qualifiers.ActivityContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(ActivityComponent::class)
@Module
class MultipModule {

    @selectedBean("构造1")
    @Provides
    fun  getMutipBean(activity: Activity) :MultipleBean{
        val a = Person()

        Log.e("HiltComponentActivity=","activity_name="+activity.javaClass.simpleName)
        return  MultipleBean()
    }

    @selectedBean("构造2")
    @Provides
    fun getMutipBean2():MultipleBean{
        return MultipleBean("另外一个参数获取的")
    }

}