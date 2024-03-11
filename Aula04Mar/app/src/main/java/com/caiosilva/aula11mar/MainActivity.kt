package com.caiosilva.aula11mar

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.caiosilva.aula11mar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        showFragments()
    }

    private fun showFragments() {
        supportFragmentManager
            .beginTransaction()
            .replace(binding.frameLayoutPrimeiroFragment.id, PrimeiroFragment())
            .commit()

        supportFragmentManager
            .beginTransaction()
            .replace(binding.frameLayoutSegundoFragment.id, SegundoFragment())
            .commit()
    }
}
