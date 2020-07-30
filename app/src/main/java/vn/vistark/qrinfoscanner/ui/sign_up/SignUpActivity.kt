package vn.vistark.qrinfoscanner.ui.sign_up

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sign_in.*
import kotlinx.android.synthetic.main.activity_sign_up.*
import vn.vistark.qrinfoscanner.R

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        initEvents()
    }

    private fun initEvents() {
        tvSignInBtn.setOnClickListener {
            onBackPressed()
        }
    }
}