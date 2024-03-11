package com.caiosilva.aula11mar

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.caiosilva.aula11mar.databinding.FragmentSegundoBinding

class SegundoFragment: Fragment() {

    private lateinit var binding: FragmentSegundoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSegundoBinding.inflate(inflater)

        return binding.root
    }
}