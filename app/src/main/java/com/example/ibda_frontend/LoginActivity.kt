package com.example.ibda_frontend
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // 로그인 버튼 클릭 시 다음 페이지로 이동
        val loginButton = findViewById<Button>(R.id.btn_login)
        loginButton.setOnClickListener {
            // TODO: 로그인 처리 로직 추가
            val intent = Intent(this@LoginActivity, MainActivity::class.java)
            startActivity(intent)
            //finish()
        }
        // 회원가입 버튼 클릭 시 회원가입 페이지로 이동
//        val signUpButton = findViewById<Button>(R.id.btn_sign_up)
//        signUpButton.setOnClickListener {
//            val intent = Intent(this@LoginActivity, SignUpActivity::class.java)
//            startActivity(intent)
//        }

        val btnGoBack = findViewById<Button>(R.id.btn_back)
        btnGoBack.setOnClickListener {
            finish()
        }
    }

}

