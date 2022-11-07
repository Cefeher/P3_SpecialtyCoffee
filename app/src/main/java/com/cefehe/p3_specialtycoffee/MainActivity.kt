package com.cefehe.p3_specialtycoffee

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import com.cefehe.p3_specialtycoffee.databinding.ActivityDrawerBinding
import com.cefehe.p3_specialtycoffee.databinding.ActivityMainBinding
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_P3_SpecialtyCoffee)
        super.onCreate(savedInstanceState)
        setContentView(ActivityMainBinding.inflate(layoutInflater).also { binding = it }
            .root)


        setSupportActionBar(binding.toolbar)
        binding.btnGotoDrawerActivity.setOnClickListener {
            startActivity(Intent(this, DrawerActivity::class.java))
        }

    }
}