package com.example.myapplication.hilt

import javax.inject.Inject
import javax.inject.Singleton

class Student {
     var user: User

   @Inject constructor(user: User){
        this.user = user
    }

}