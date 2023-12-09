package com.example.tugasmodule

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI.setupWithNavController
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
//import com.example.tugasmodule.R.id.navigation_home
//import com.example.tugasmodule.R.id.navigation_settings
import com.example.tugasmodule.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

   private lateinit var navController: NavController

    private lateinit var recyclerView: RecyclerView
    private lateinit var dataList: ArrayList<DataClass>
    lateinit var imageList: Array<Int>
    lateinit var materiList: Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navHostFragment =supportFragmentManager.findFragmentById(R.id.mainContainer) as NavHostFragment
        navController = navHostFragment.navController

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.botomNavView)
        setupWithNavController(bottomNavigationView, navController)

        imageList = arrayOf(
            R.drawable.very_satisfied,
            R.drawable.satisfied,
            R.drawable.lessatisfied,
            R.drawable.neutral)

        materiList = arrayOf(
            "Very Satesfied",
            "Satesfied",
            "Lessatesfied",
            "neutral")

        recyclerView = findViewById(R.id.mainContainer)
        recyclerView.layoutManager = LinearLayoutManager(this)


    }

    private fun setupWithNavController() {
        TODO("Not yet implemented")
    }

    private fun getData(){
        for (i in  imageList.indices){
            val dataClass = DataClass(imageList[i], materiList[i])
            dataList.add(dataClass)
        }
        recyclerView.adapter = AdapterClass(dataList)
    }
}