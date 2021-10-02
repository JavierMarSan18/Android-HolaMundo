package com.jjms.android_holamundo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun onClick(view: android.view.View) {

        var cajaTexto : EditText = findViewById(R.id.txtNombre)
        val nombre : String = cajaTexto.text.toString()

        Toast.makeText(this, "Hola $nombre", Toast.LENGTH_LONG).show()
    }
}