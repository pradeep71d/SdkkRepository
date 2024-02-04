package com.example.pradeepsdkklibraryyy

import android.content.Context
import android.widget.Toast

class Toastter {
    fun createToast(context: Context, msz: String) {
        Toast.makeText(context, msz, Toast.LENGTH_LONG).show()
    } //this module library fun is created inside module library
} //we can use this library fun inside whole project, other projects also(by publishing library on Git)