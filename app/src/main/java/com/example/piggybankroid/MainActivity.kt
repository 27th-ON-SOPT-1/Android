package com.example.piggybankroid

import android.content.Context
import android.os.Bundle
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.properties.Delegates

class MainActivity : AppCompatActivity() {

    private lateinit var viewPagerAdapter: ViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().add(R.id.change_view, HomeFragment()).commit()

        sample_bottom_blue.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.btn_home -> supportFragmentManager.beginTransaction()
                    .replace(R.id.change_view, HomeFragment()).commit()
                R.id.btn_list -> supportFragmentManager.beginTransaction()
                    .replace(R.id.change_view, ListFragment()).commit()
                R.id.btn_goods -> supportFragmentManager.beginTransaction()
                    .replace(R.id.change_view, GoodsFragment()).commit()
                R.id.btn_profile -> supportFragmentManager.beginTransaction()
                    .replace(R.id.change_view, ProfileFragment()).commit()
            }
            true
        }

    }
}