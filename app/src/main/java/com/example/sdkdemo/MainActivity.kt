package com.example.sdkdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pradeepsdkklibraryyy.createToast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
     //   val toast= Toastter() //we are using library fun here in core app
        createToast(this,"heloooToasterllllppp")//we can use this fun in other projects also
    }// to use this fun in other project, we need to publish this library from Git
}