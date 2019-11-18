package com.example.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val myName: MyName = MyName( "Narein")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        

        binding.buttonDone.setOnClickListener {
            //it = object (button) associated to an event
            addNickName(it)
        }

        binding.myName = myName


    }

    private fun addNickName( it: View?){

        //apply = execute multiple setters

        binding.apply{myName?.name = editText2.text.toString()
        this.invalidateAll()

        }

    }
}
