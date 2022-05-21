package com.example.pathfinder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.pathfinder.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        val adapter = Adapter(AlgoList.algoList)
        binding?.rvalgo?.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding?.rvalgo?.adapter = adapter

        binding?.reset?.setOnClickListener {
            // TODO
        }
        binding?.solve?.setOnClickListener {
            // TODO
        }

    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }

}