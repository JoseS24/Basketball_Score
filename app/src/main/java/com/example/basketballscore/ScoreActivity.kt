package com.example.basketballscore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.basketballscore.databinding.ActivityMainBinding
import com.example.basketballscore.databinding.ActivityScoreBinding

class ScoreActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityScoreBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bundle = intent.extras!!
        val marcadorLocales = bundle.getInt("marcadorFinalL") ?: ""
        val marcadorVisitantes = bundle.getInt("marcadorFinalV") ?: ""

        binding.finalLocal.text = marcadorLocales.toString()
        binding.finalVisita.text = marcadorVisitantes.toString()

        if(marcadorLocales.toString() > marcadorVisitantes.toString()) {
            binding.mensajeFinal.text = "¡Ganó el equipo local!"
        }else if(marcadorLocales.toString() < marcadorVisitantes.toString()) {
            binding.mensajeFinal.text = "¡Ganaron los visitantes!"
        }else{
            binding.mensajeFinal.text = "Fue un empate"
        }
    }
}