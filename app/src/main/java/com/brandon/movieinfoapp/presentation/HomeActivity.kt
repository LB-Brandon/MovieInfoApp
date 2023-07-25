package com.brandon.movieinfoapp.presentation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.brandon.movieinfoapp.R
import com.brandon.movieinfoapp.databinding.ActivityHomeBinding
import com.brandon.movieinfoapp.presentation.movie.MovieActivity

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(
            this,
            R.layout.activity_home
        )

        binding.movieButton.setOnClickListener() {
            val intent = Intent(this, MovieActivity::class.java)
            startActivity(intent)
        }
    }
}