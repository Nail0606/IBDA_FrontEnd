package com.example.ibda_frontend

import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ReActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recyclerview)

        val profileList = arrayListOf(
            Profiles(R.drawable.man, "김철수1", 25,"자바 개발자"),
            Profiles(R.drawable.woman, "김철수2", 25,"자바 개발자"),
            Profiles(R.drawable.woman, "김철수3", 25,"자바 개발자"),
            Profiles(R.drawable.man, "김철수4", 25,"자바 개발자"),
            Profiles(R.drawable.woman, "김철수5", 25,"자바2 개발자"),
            Profiles(R.drawable.man, "김철수6", 25,"자바3 개발자"),
            Profiles(R.drawable.woman, "김철수7", 25,"자바 개발자"),
            Profiles(R.drawable.man, "김철수8", 25,"자바5 개발자"),
            Profiles(R.drawable.man, "김철수9", 25,"자바8 개발자"),
            Profiles(R.drawable.man, "김철수10", 25,"자바 개발자"),
            Profiles(R.drawable.woman, "김철수11", 25,"자바 개발자"),
            Profiles(R.drawable.man, "김철수12", 25,"자바0 개발자"),
            Profiles(R.drawable.man, "김철수13", 25,"자바 개발자"),
            Profiles(R.drawable.woman, "김철수14", 25,"자바 개발자"),
            Profiles(R.drawable.man, "김철수15", 25,"자바 개발자"),
            Profiles(R.drawable.man, "김철수16", 25,"자바11 개발자"),
            Profiles(R.drawable.man, "김철수17", 25,"자바 개발자"),
            Profiles(R.drawable.man, "김철수18", 25,"자바23 개발자"),
            Profiles(R.drawable.man, "김철수19", 25,"자바 개발자"),
            Profiles(R.drawable.man, "김철수20", 25,"자바44 개발자"),
            Profiles(R.drawable.woman, "김철수21", 25,"자바 개발자")
        )
        val rvProfile = findViewById<RecyclerView>(R.id.rv_profile)
        rvProfile.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL, false)
        rvProfile.setHasFixedSize(true)

        rvProfile.adapter = ProfileAdapter(profileList)
    }
}