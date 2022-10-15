package com.example.basketballscore

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.basketballscore.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.marcadorFinal.setOnClickListener() {
            val locales = binding.marcadorLocal.text.toString().toInt()
            val visita = binding.marcadorVisitante.text.toString().toInt()
            marcadorFinal(locales, visita)
        }
        binding.reiniciarMarcador.setOnClickListener {
            binding.marcadorLocal.text = "0"
            binding.marcadorVisitante.text = "0"
        }
        binding.mas1Local.setOnClickListener {
            val puntoLocal = binding.marcadorLocal.text.toString().toInt()
            puntosLocal(puntoLocal)
            binding.marcadorLocal.text = puntosLocal(puntoLocal).toString()
        }
        binding.mas2Local.setOnClickListener {
            val punto2Local = binding.marcadorLocal.text.toString().toInt()
            puntos2Local(punto2Local)
            binding.marcadorLocal.text = puntos2Local(punto2Local).toString()
        }
        binding.menos1Local.setOnClickListener {
            val restarLocal = binding.marcadorLocal.text.toString().toInt()
            menosLocal(restarLocal)
            binding.marcadorLocal.text = menosLocal(restarLocal).toString()
        }
        binding.mas1Visita.setOnClickListener {
            val puntoVisita = binding.marcadorVisitante.text.toString().toInt()
            puntosVisita(puntoVisita)
            binding.marcadorVisitante.text = puntosVisita(puntoVisita).toString()
        }
        binding.mas2Visita.setOnClickListener {
            val punto2Visita = binding.marcadorVisitante.text.toString().toInt()
            puntos2Visita(punto2Visita)
            binding.marcadorVisitante.text = puntos2Visita(punto2Visita).toString()
        }
        binding.menos1Visita.setOnClickListener {
            val restarVisita = binding.marcadorVisitante.text.toString().toInt()
            menosVisita(restarVisita)
            binding.marcadorVisitante.text = menosVisita(restarVisita).toString()
        }

    }
        private fun marcadorFinal(local: Int, visit: Int) {
            val intent = Intent(this, ScoreActivity::class.java)
            intent.putExtra("marcadorFinalL", local)
            intent.putExtra("marcadorFinalV", visit)
            startActivity(intent)
    }
        private fun puntosLocal(puntoLocal: Int): Int {
            val sumar = puntoLocal +  1
        return sumar
    }
        private fun puntos2Local(puntoLocal: Int): Int {
            val sumar = puntoLocal +  2
        return sumar
    }
        private fun menosLocal(restarLocal: Int): Int {
            if (restarLocal > 0) {
                val restar = restarLocal - 1
                return restar
            } else {
                return 0
            }
    }
        private fun puntosVisita(puntoVisita: Int): Int {
            val sumar = puntoVisita +  1
        return sumar
    }
        private fun puntos2Visita(puntoVisita: Int): Int {
            val sumar = puntoVisita +  2
        return sumar
    }
        private fun menosVisita(restarVisita: Int): Int {
            if (restarVisita > 0) {
                val restar = restarVisita - 1
                return restar
            } else {
                return 0
            }
    }
}