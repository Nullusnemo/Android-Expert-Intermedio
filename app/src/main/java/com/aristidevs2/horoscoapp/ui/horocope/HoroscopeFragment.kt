package com.aristidevs2.horoscoapp.ui.horocope

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.aristidevs2.horoscoapp.R
import com.aristidevs2.horoscoapp.databinding.FragmentHoroscopeBinding

class HoroscopeFragment : Fragment() {

    private var _binding: FragmentHoroscopeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentHoroscopeBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
}