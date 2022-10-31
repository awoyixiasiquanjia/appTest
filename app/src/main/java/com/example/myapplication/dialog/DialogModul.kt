package com.example.myapplication.dialog

import android.content.Context
import com.example.myapplication.R
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.qualifiers.ActivityContext


@InstallIn(ActivityComponent::class)
@Module
class DialogModul {

    @Provides
    fun getDialog(@ActivityContext context: Context):MyDialog{
        val myDialog = MyDialog(context, R.style.testStyle)
        myDialog.setCanceledOnTouchOutside(false)
        myDialog.setCancelable(true)
        return  myDialog
    }





}