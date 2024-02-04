package com.example.pradeepsdkklibraryyy

import android.content.Context
import android.widget.Toast

// if we create Class then we need to create class object in main module(app module) to use new created module fun

// class Toastter { //we can create class, or directly import fun in main module(app module)
fun createToast(context: Context, msz: String) {
    Toast.makeText(context, msz, Toast.LENGTH_LONG).show()
}
//this module library fun is created inside module library
//we can use this library fun inside whole project, other projects also(by publishing library on Git)
//}