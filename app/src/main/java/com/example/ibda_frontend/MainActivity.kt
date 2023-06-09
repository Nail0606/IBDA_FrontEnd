package com.example.ibda_frontend
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.DialogFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            // 팝업 창 표시
            val popup = MyPopupFragment()
            popup.show(supportFragmentManager, "popup")
        }

        val btnMoveToLogin = findViewById<Button>(R.id.btn_MoveLogin)
        btnMoveToLogin.setOnClickListener {
            val intent = Intent(this@MainActivity, LoginActivity::class.java)
            startActivity(intent)
        }

        val btnMoveToReCycle = findViewById<Button>(R.id.btn_MoveRecycle)
        btnMoveToReCycle.setOnClickListener {
            val intent = Intent(this@MainActivity, ReActivity::class.java)
            startActivity(intent)
        }
    }

    class MyPopupFragment : DialogFragment() {

        override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?

        ): View? {
            return inflater.inflate(R.layout.popup_layout_main, container, false)
        }

        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)

            val closeButton = view.findViewById<Button>(R.id.closeButton)
            closeButton.setOnClickListener {
                // 팝업 창 닫기
                dismiss()
            }
        }

        override fun onStart() {
            super.onStart()
            // 팝업 창 크기 조정
            dialog?.window?.setLayout(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
            )
        }
    }
}
