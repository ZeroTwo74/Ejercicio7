package com.example.ejercicio78

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun accion1(v: View){//Explicita
        Log.w("Intenciones APP", "Se preciono el boton1")
        val intencion1 = Intent(this, Tecladito::class.java)
        startActivity(intencion1)
    }
    fun accion2(v: View){//Implicita
        Log.w("Intenciones APP", "Se preciono el boton2")
        val aPagina = Intent(Intent.ACTION_VIEW)
        aPagina.data = Uri.parse("https://google.com.mx")
        startActivity(aPagina)
    }

}