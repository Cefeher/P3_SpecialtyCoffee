package com.cefehe.p3_specialtycoffee

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import com.cefehe.p3_specialtycoffee.databinding.ActivityDrawerBinding
import com.google.android.material.navigation.NavigationView

class DrawerActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDrawerBinding
    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(ActivityDrawerBinding.inflate(layoutInflater).also { binding = it }
            .root)

        setSupportActionBar(binding.toolbar)

        val drawerLayout: DrawerLayout = binding.drawerLayout
        val navView: NavigationView = binding.navView

        val navHosFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHosFragment.navController

        NavigationUI.setupWithNavController(navView, navController)

        appBarConfiguration = AppBarConfiguration(setOf(
            //Top-level destinations
            R.id.inicio,
            R.id.origen1,
            R.id.origen2,
            R.id.origen3
            ),
            drawerLayout
        )
        NavigationUI.setupWithNavController(binding.toolbar, navController, appBarConfiguration)

        //fixme: workaround
        supportActionBar?.title = "ORIGENES";

    }
}