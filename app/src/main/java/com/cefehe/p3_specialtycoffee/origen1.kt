package com.cefehe.p3_specialtycoffee

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.cefehe.p3_specialtycoffee.databinding.ActivityDrawerBinding
import com.cefehe.p3_specialtycoffee.databinding.ActivityMainBinding
import com.cefehe.p3_specialtycoffee.databinding.FragmentOrigen1Binding

class origen1 : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_origen1, container, false)
    }


}