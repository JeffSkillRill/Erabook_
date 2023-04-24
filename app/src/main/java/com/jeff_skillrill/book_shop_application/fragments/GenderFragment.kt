package com.jeff_skillrill.book_shop_application.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.jeff_skillrill.book_shop_application.R
import com.jeff_skillrill.book_shop_application.databinding.FragmentGenderBinding

class GenderFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentGenderBinding.inflate(inflater, container, false)
        binding.continueBtn.setOnClickListener {
            if (binding.radioGr.checkedRadioButtonId != -1) {
                findNavController().navigate(R.id.action_genderFragment_to_ageFragment)
            } else {
                Toast.makeText(requireContext(), "Please select one of them", Toast.LENGTH_SHORT).show()
            }
        }
        return binding.root
    }
}