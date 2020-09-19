package com.example.calculando

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_suma.setOnClickListener {sumando()}
        button_resta.setOnClickListener {restando()}
        button_division.setOnClickListener {dividiendo()}
        button_multiplicacion.setOnClickListener {multiplicando()}

    }
    fun sumando(){
        val numero1 = numero1.text.toString().toDouble()
        val numero2 = numero2.text.toString().toDouble()
        var suma = numero1 + numero2
        respuesta.text ="${suma.toDouble()}"
    }


    fun restando(){
        val numero1 = numero1.text.toString().toDouble()
        val numero2 = numero2.text.toString().toDouble()
        var resta = numero1 - numero2
        respuesta.text ="${resta.toDouble()}"
    }


    fun dividiendo(){
        val numero1 = numero1.text.toString().toDouble()
        val numero2 = numero2.text.toString().toDouble()
        var division = numero1 / numero2
        respuesta.text ="${division.toDouble()}"
    }

    fun multiplicando(){
        val numero1 = numero1.text.toString().toDouble()
        val numero2 = numero2.text.toString().toDouble()
        var multiplicacion = numero1 * numero2
        respuesta.text ="${multiplicacion.toDouble()}"
    }



}

