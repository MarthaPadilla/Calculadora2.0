package com.example.calculadora20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btnevent(view: View) {
        if(nuevaop){
            texto.setText("")
        }
        nuevaop=false
        val seleccion = view as Button
        var btclickselec: String = texto.text.toString()
        when (seleccion.id) {

            cero.id -> {
                btclickselec += "0"
            }
           Uno.id -> {
                btclickselec += "1"
            }
            Dos.id -> {
                btclickselec += "2"
            }
            Tres.id -> {
                btclickselec += "3"
            }
            Cuatro.id -> {
                btclickselec += "4"
            }
            Cinco.id -> {
                btclickselec += "5"
            }
            Seis.id -> {
                btclickselec += "6"
            }
            Siete.id -> {
                btclickselec += "7"
            }
            Ocho.id -> {
                btclickselec += "8"
            }
            Borrar.id -> {
                btclickselec += "9"
            }

            Punto.id -> {
                btclickselec += "."
            }


        }

        texto.setText(btclickselec)
    }
        var operacion="*"
        var numeroAnterior=""
       var nuevaop=true
    fun btoperacion(view: View){

        val selecionar= view as Button
        when(selecionar.id) {

            Divicion.id -> {
                operacion="/"
            }
            Multiplicar.id -> {
                operacion="*"
            }
            Resta.id -> {
                operacion="-"
            }
            Suma.id -> {
                operacion="+"
            }
            Porcentaje.id -> {
                operacion= "%"

            }
        }
        numeroAnterior=texto.text.toString()
        nuevaop=true

}
    fun btCalcular(view: View){

        val nuevonumero=texto.text.toString()
        var resultado :Double?=null
        when(operacion){

            "/"-> {
                resultado= numeroAnterior.toDouble()/nuevonumero.toDouble()
            }
            "*"-> {
                resultado= numeroAnterior.toDouble()*nuevonumero.toDouble()
            }
            "-"-> {
                resultado= numeroAnterior.toDouble()-nuevonumero.toDouble()
            }
            "+"-> {
                resultado= numeroAnterior.toDouble()+nuevonumero.toDouble()
            }
            "%"-> {
                resultado= numeroAnterior.toDouble()/100.toDouble()
            }
        }
        texto.setText(resultado.toString())
        nuevaop=true
    }

    fun btborrar(view: View){
        val valor= texto.text.toString().toDouble()
        texto.setText(valor.toString())

    }
    fun btlimpiar(view: View){
        texto.setText("0")
        nuevaop=true


    }
}




