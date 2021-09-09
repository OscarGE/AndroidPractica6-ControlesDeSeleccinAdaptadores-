package com.example.practica6_controlesdeseleccinadaptadores

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.avatar)
//        val datos=arrayOf("Elem1","Elem2","Elem3","Elem4","Elem5")
//        val adaptador1 = ArrayAdapter(this,android.R.layout.simple_spinner_item,datos)
//
//        val adaptador2= ArrayAdapter.createFromResource(this,R.array.valores_array,android.R.layout.simple_spinner_item)
//
//        val cmbOpciones1: Spinner=findViewById(R.id.cmbOpciones1)
//        adaptador1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
//        cmbOpciones1.adapter=adaptador1
//
//        val cmbOpciones2: Spinner=findViewById(R.id.cmbOpciones2)
//        adaptador2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
//        cmbOpciones2.adapter=adaptador2
//
//        cmbOpciones1.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
//            override fun onNothingSelected(p0: AdapterView<*>?) {
//                Toast.makeText(
//                    applicationContext,
//                    "Sin selección Spinner1",
//                    Toast.LENGTH_SHORT
//                ).show()
//            }
//            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
//                val pos= p0?.getItemAtPosition(p2)
//                Toast.makeText(
//                    applicationContext,
//                    "Seleccionando: $pos Spinner1",
//                    Toast.LENGTH_SHORT
//                ).show()
//            }
//        }
//        cmbOpciones2.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
//            override fun onNothingSelected(p0: AdapterView<*>?) {
//                Toast.makeText(
//                    applicationContext,
//                    "Sin selección Spinner2",
//                    Toast.LENGTH_SHORT
//                ).show()
//            }
//            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
//                val pos= p0?.getItemAtPosition(p2)
//                Toast.makeText(
//                    applicationContext,
//                    "Seleccionando: $pos Spinner2",
//                    Toast.LENGTH_SHORT
//                ).show()
//            }
//        }
//        val imgLogo: ImageView=findViewById(R.id.imgLogo)
//        imgLogo.setImageResource(R.drawable.logo_android)
//
        val arrayCaras=arrayOf("Cara 1","Cara 2","Cara 3","Cara 4","Cara 5","Cara 6","Cara 7","Cara 8","Cara 9","Cara 10")
        val arrayCuerpos=arrayOf("Cuerpo 1","Cuerpo 2","Cuerpo 3","Cuerpo 4","Cuerpo 5","Cuerpo 6","Cuerpo 7","Cuerpo 8","Cuerpo 9","Cuerpo 10")
        val sCara: Spinner=findViewById(R.id.sCara)
        val sCuerpo: Spinner=findViewById(R.id.sCuerpo)
        val imgCara: ImageView=findViewById(R.id.imgCara)
        val imgCuerpo: ImageView=findViewById(R.id.imgCuerpo)

        val adaptador1 = ArrayAdapter(this,android.R.layout.simple_spinner_item,arrayCaras)
        adaptador1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        sCara.adapter=adaptador1
        val adaptador2 = ArrayAdapter(this,android.R.layout.simple_spinner_item,arrayCuerpos)
        adaptador2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        sCuerpo.adapter=adaptador2

        sCara.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val elemento= p0?.getItemAtPosition(p2)
                when(elemento){
                    "Cara 1" -> imgCara.setImageResource(R.drawable.cara1)
                    "Cara 2" -> imgCara.setImageResource(R.drawable.cara2)
                    "Cara 3" -> imgCara.setImageResource(R.drawable.cara3)
                    "Cara 4" -> imgCara.setImageResource(R.drawable.cara4)
                    "Cara 5" -> imgCara.setImageResource(R.drawable.cara5)
                    "Cara 6" -> imgCara.setImageResource(R.drawable.cara6)
                    "Cara 7" -> imgCara.setImageResource(R.drawable.cara7)
                    "Cara 8" -> imgCara.setImageResource(R.drawable.cara8)
                    "Cara 9" -> imgCara.setImageResource(R.drawable.cara9)
                    "Cara 10"-> imgCara.setImageResource(R.drawable.cara10)
                }
            }
            override fun onNothingSelected(p0: AdapterView<*>?) {}
        }
        sCuerpo.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val elemento= p0?.getItemAtPosition(p2)
                when(elemento){
                    "Cuerpo 1" -> imgCuerpo.setImageResource(R.drawable.cuerpo1)
                    "Cuerpo 2" -> imgCuerpo.setImageResource(R.drawable.cuerpo2)
                    "Cuerpo 3" -> imgCuerpo.setImageResource(R.drawable.cuerpo3)
                    "Cuerpo 4" -> imgCuerpo.setImageResource(R.drawable.cuerpo4)
                    "Cuerpo 5" -> imgCuerpo.setImageResource(R.drawable.cuerpo5)
                    "Cuerpo 6" -> imgCuerpo.setImageResource(R.drawable.cuerpo6)
                    "Cuerpo 7" -> imgCuerpo.setImageResource(R.drawable.cuerpo7)
                    "Cuerpo 8" -> imgCuerpo.setImageResource(R.drawable.cuerpo8)
                    "Cuerpo 9" -> imgCuerpo.setImageResource(R.drawable.cuerpo9)
                    "Cuerpo 10"-> imgCuerpo.setImageResource(R.drawable.cuerpo10)
                }
            }
            override fun onNothingSelected(p0: AdapterView<*>?) {}
        }

    }

}