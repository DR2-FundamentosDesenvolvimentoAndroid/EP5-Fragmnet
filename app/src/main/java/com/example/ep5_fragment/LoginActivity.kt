package com.example.ep5_fragment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        var login: String = "will"
        var senha: String = "will"

        btnAcessar.setOnClickListener{
            if(boxEmail.text.toString() == login && boxPassword.text.toString() == senha){
                var inttLogin = Intent(this, Exercicio::class.java)
                startActivity(inttLogin)
                Toast.makeText(this,
                    "Seja WELCOMIDO!",
                    Toast.LENGTH_LONG
                ).show()
            }
            else{
                Toast.makeText(this,
                    "Email ou senha incorretos",
                    Toast.LENGTH_SHORT
                ).show()
            }

        }


    }

}
