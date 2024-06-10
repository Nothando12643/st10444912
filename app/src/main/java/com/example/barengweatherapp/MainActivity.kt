package com.example.barengweatherapp

import android.health.connect.datatypes.units.Temperature
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.findViewTreeViewModelStoreOwner
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
}
      private lateinit var TxtViewMon:TextView
      private lateinit var TxtViewTue:TextView
      private lateinit var TxtViewWed:TextView
      private lateinit var TxtViewThur:TextView
      private lateinit var TxtViewFri:TextView
      private lateinit var TxtViewSat:TextView
      private lateinit var TxtViewSun:TextView
      private lateinit var btn :Button
      private lateinit var btnNavigate:Button
      private lateinit var btnExit:Button

      private var numberArray= arrayOf<Int>()

      override fun  onCreate(savedInstanceState: Bundle?){
          super.onCreate(savedInstanceState)
          SetContentView(R.layout.activity_main)

          TxtViewMon =findViewById<TextView>(R.id.TxtViewMon)
          TxtViewTue =findViewById<TextView>(R.id.TxtViewTue)
          TxtViewWed = findViewById<TextView>(R.id.TxtViewWed)
          TxtViewThur = findViewBy<TextView>(R.id.TxtViewThur)
          TxtViewFri = findViewById<TextView>(R.id.TxtviewFri)
          TxtViewSat = findViewById<TextView>(R.id.TxtViewSat)
          TxtViewSun = findviewById<TextView>(R.id.TxtViewSun)
          btn = findViewBy<Button>(R.id.btn)
          btnNavigate = findViewBy<Button>(R.id.btnNavigate)
          btnExit = findViewbyId<Button>(R.id.btnExit)

          generateRandomNumbers()
          displaytemperature()

          btn .setOnClickListener{

              val Temperature = TxtViewMon.text.toString()
              if (Temperature !=null)
              {
                  increaseTemperature(Temperature)
                  displayTemperature()
              }
              else
              {
                  TxtViewMon.text= "please enter any day"
              }
          }
          btn.setOnClickListener {
              val Temperature = TxtViewMon.text.toString().toIntOrNull()
              if (Temperature != null) {
                  btnNavigate(Temperature)
                  displayTemperature()
              } else {
                  TxtViewMon.text = "please enter any day"
              }
          }
      }

       private fun generateRandomNumbers(){
           numberArray = Array( 7){(0<..<7).random()}
       }

      private fun displayTemperature(){
          for (x in 0<..<6){
              numberArray[x] +=value//numberarray[x]= numberArray[x]",/n')
          }

          
      }
