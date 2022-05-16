package org.d3if1012.galerihewan.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView
import org.d3if1012.galerihewan.R
import org.d3if1012.galerihewan.databinding.ActivityMainBinding
import org.d3if1012.galerihewan.model.Hewan

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}