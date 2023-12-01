package com.example.mywallet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mywallet.data.Datasource
import com.example.mywallet.data.Note
import com.example.mywallet.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    var dataset: List<Note> = emptyList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        dataset = Datasource().loadNote()
    }
}