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
            Profiles(R.drawable.man, "김철수", 25,"자바 개발자"),
            Profiles(R.drawable.woman, "김철수", 25,"자바 개발자"),
            Profiles(R.drawable.woman, "김철수", 25,"자바 개발자"),
            Profiles(R.drawable.man, "김철수", 25,"자바 개발자"),
            Profiles(R.drawable.woman, "김철수", 25,"자바2 개발자"),
            Profiles(R.drawable.man, "김철다", 25,"자바3 개발자"),
            Profiles(R.drawable.woman, "김철니", 25,"자바 개발자"),
            Profiles(R.drawable.man, "김철습", 25,"자바5 개발자"),
            Profiles(R.drawable.man, "김철갑", 25,"자바8 개발자"),
            Profiles(R.drawable.man, "김철반", 25,"자바 개발자"),
            Profiles(R.drawable.woman, "김철여", 25,"자바 개발자"),
            Profiles(R.drawable.man, "김철세", 25,"자바0 개발자"),
            Profiles(R.drawable.man, "김철하", 25,"자바 개발자"),
            Profiles(R.drawable.woman, "김철녕", 25,"자바 개발자"),
            Profiles(R.drawable.man, "김철안", 25,"자바 개발자"),
            Profiles(R.drawable.man, "김철이", 25,"자바11 개발자"),
            Profiles(R.drawable.man, "김철뭐", 25,"자바 개발자"),
            Profiles(R.drawable.man, "김철시", 25,"자바23 개발자"),
            Profiles(R.drawable.man, "김철수", 25,"자바 개발자"),
            Profiles(R.drawable.man, "김철수", 25,"자바44 개발자"),
            Profiles(R.drawable.woman, "김수아", 25,"자바 개발자")
        )
        val rvProfile = findViewById<RecyclerView>(R.id.rv_profile)
        rvProfile.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL, false)
        rvProfile.setHasFixedSize(true)

        rvProfile.adapter = ProfileAdapter(profileList)
    }
}