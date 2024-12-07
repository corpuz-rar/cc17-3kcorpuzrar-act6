package com.example.act6_30days

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    private lateinit var Contents: List<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) {
            v, insets -> val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        Contents = listOf(
            getString(R.string.Day_1_Desc), getString(R.string.Day_2_Desc),
            getString(R.string.Day_3_Desc), getString(R.string.Day_4_Desc),
            getString(R.string.Day_5_Desc), getString(R.string.Day_6_Desc),
            getString(R.string.Day_7_Desc), getString(R.string.Day_8_Desc),
            getString(R.string.Day_9_Desc), getString(R.string.Day_10_Desc),
            getString(R.string.Day_11_Desc), getString(R.string.Day_12_Desc),
            getString(R.string.Day_13_Desc), getString(R.string.Day_14_Desc),
            getString(R.string.Day_15_Desc), getString(R.string.Day_16_Desc),
            getString(R.string.Day_17_Desc), getString(R.string.Day_18_Desc),
            getString(R.string.Day_19_Desc), getString(R.string.Day_20_Desc),
            getString(R.string.Day_21_Desc), getString(R.string.Day_22_Desc),
            getString(R.string.Day_23_Desc), getString(R.string.Day_24_Desc),
            getString(R.string.Day_25_Desc), getString(R.string.Day_26_Desc),
            getString(R.string.Day_27_Desc), getString(R.string.Day_28_Desc),
            getString(R.string.Day_29_Desc), getString(R.string.Day_30_Desc)
        )

        val Recycler_View_MA = findViewById<RecyclerView>(R.id.recyclerview_layout)
        val Layout_Manager_MA = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        Recycler_View_MA.layoutManager = Layout_Manager_MA
        Recycler_View_MA.adapter = Adapter(Contents)
    }
}