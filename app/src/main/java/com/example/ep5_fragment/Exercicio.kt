package com.example.ep5_fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.activity_exercicio.*
import kotlinx.android.synthetic.main.activity_login.*

class Exercicio : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercicio)

        menuView.setupWithNavController(findNavController(R.id.fragmentView))
    }



//    override fun onViewCreated(view: View, savedInstanceState: Bundle?){
//        super.onViewCreated(view, savedInstanceState)
//
//        btnAcessar.setOnClickListener{
//            findNavController().navigate(R.id.homeFragExercicio)
//        }
//    }
}
