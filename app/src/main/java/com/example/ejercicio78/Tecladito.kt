package com.example.ejercicio78

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Tecladito : AppCompatActivity() {

    private var numeroActual = ""
    private var agregarNumero = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tecladito2)

        val textV = findViewById<TextView>(R.id.txtCon)
        var b1 = findViewById<Button>(R.id.btn1)
        val b2 = findViewById<Button>(R.id.btn2)
        val b3 = findViewById<Button>(R.id.btn3)
        val b4 = findViewById<Button>(R.id.btn4)
        val b5 = findViewById<Button>(R.id.btnDel)
        val b6 = findViewById<Button>(R.id.btnC)

        b1.setOnClickListener {

            agregarNumero = "1"
            numeroActual += agregarNumero
            textV.text = numeroActual
        }
        b2.setOnClickListener {

            agregarNumero = "2"
            numeroActual += agregarNumero
            textV.text = numeroActual
        }
        b3.setOnClickListener {
            agregarNumero = "3"
            numeroActual += agregarNumero
            textV.text = numeroActual
        }
        b4.setOnClickListener {
            agregarNumero = "4"
            numeroActual += agregarNumero
            textV.text = numeroActual
        }
        b5.setOnClickListener {
            if (numeroActual.isNotEmpty()) {
                numeroActual = numeroActual.dropLast(1)
                textV.text = numeroActual
            }
        }
        b6.setOnClickListener{

            numeroActual = ""
            textV.text = numeroActual
        }

        }






}
