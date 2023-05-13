package com.example.ibda_frontend

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ReActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recyclerview)

        val profileList = arrayListOf(
            Profiles(R.drawable.man, "김철수1","자바 개발자"),
            Profiles(R.drawable.woman, "김철수2","자바 개발자"),
            Profiles(R.drawable.woman, "김철수3","자바 개발자"),
            Profiles(R.drawable.man, "김철수1","자바 개발자"),
            Profiles(R.drawable.woman, "김철수2","자바 개발자"),
            Profiles(R.drawable.woman, "김철수3","자바 개발자"),
            Profiles(R.drawable.man, "김철수1","자바 개발자"),
            Profiles(R.drawable.woman, "김철수2","자바 개발자"),
            Profiles(R.drawable.woman, "김철수3","자바 개발자"),
            Profiles(R.drawable.man, "김철수1","자바 개발자"),
            Profiles(R.drawable.woman, "김철수2","자바 개발자"),
            Profiles(R.drawable.woman, "김철수3","자바 개발자"),
            Profiles(R.drawable.man, "김철수1","자바 개발자"),
            Profiles(R.drawable.woman, "김철수2","자바 개발자"),
            Profiles(R.drawable.woman, "김철수3","자바 개발자"),
            Profiles(R.drawable.man, "김철수1","자바 개발자"),
            Profiles(R.drawable.woman, "김철수2","자바 개발자"),
            Profiles(R.drawable.woman, "김철수3","자바 개발자"),
            Profiles(R.drawable.man, "김철수1","자바 개발자"),
            Profiles(R.drawable.woman, "김철수2","자바 개발자"),
            Profiles(R.drawable.woman, "김철수3","자바 개발자"),

            )
        val rvProfile = findViewById<RecyclerView>(R.id.rv_profile)
        rvProfile.layoutManager = GridLayoutManager(this,3)
        rvProfile.setHasFixedSize(true)

        rvProfile.adapter = ProfileAdapter(profileList)

        val loginButton = findViewById<Button>(R.id.btn_back2)
        loginButton.setOnClickListener {
            // TODO: 로그인 처리 로직 추가
            val intent = Intent(this@ReActivity, MainActivity::class.java)
            startActivity(intent)
            //finish()


        }
        val button = findViewById<Button>(R.id.btn_right)
        button.setOnClickListener {
            // 팝업 창 표시
            val popup = MainActivity.MyPopupFragment()
            popup.show(supportFragmentManager, "popup")
        }
    }
}
