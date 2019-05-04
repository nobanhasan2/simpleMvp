package com.myres.noban.simplemvp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast


class MainActivity : AppCompatActivity(),MainView {

    lateinit var presenter: MainPresenter
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter = MainPresenter(this)
        presenter.generateText("Hello ")
    }
    override fun showToast(message:String) {
       Toast.makeText(applicationContext,message,Toast.LENGTH_LONG).show()
    }
}
