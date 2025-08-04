package com.isaacer.adimigoster// uygulamama verilen kimlik google playe yüklerken bu kimlik adı altında yüklerim.

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.isaacer.adimigoster.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



      binding.button.setOnClickListener {

         val kullaniciningirdigiadi= binding.adsoyad.text.toString()
          binding.adMSoyadMGSter.text=kullaniciningirdigiadi
      }


    }
}