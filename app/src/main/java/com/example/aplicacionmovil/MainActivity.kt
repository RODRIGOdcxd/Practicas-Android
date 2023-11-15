package com.example.aplicacionmovil

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val vlBtnSaludar = findViewById<Button>(R.id.btnCalcular)
        vlBtnSaludar.setOnClickListener(){
            CalcularCts()
        }
    }

    fun CalcularCts(){
        val sueldo = findViewById<EditText>(R.id.txtSueldo).text.toString().toDoubleOrNull() ?: 0.0
        val mesesT = findViewById<EditText>(R.id.txtMesTrabajo).text.toString().toIntOrNull() ?: 0
        val hijos = findViewById<EditText>(R.id.txtHijos).text.toString().toIntOrNull() ?: 0
        val salida = findViewById<TextView>(R.id.lblCTS)
        var calculo = (((sueldo + (sueldo / 6) + (hijos * 106) + (mesesT + 50)) * mesesT) / 12)
        salida.setText(calculo.toString())
    }

//    fun Saludar(){
//        val vltxtSaludo = findViewById<EditText>(R.id.txtnombre)
//        val vltxtMensaje = findViewById<TextView>(R.id.lblMensaje)
//        var mensaje = "";
//        mensaje = vltxtSaludo.text.toString() + " " + "Bienvenido al Curso"
//        vltxtMensaje.setText(mensaje)
//    }
}