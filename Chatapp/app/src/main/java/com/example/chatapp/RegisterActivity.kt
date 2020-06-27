package com.example.chatapp

import android.app.Activity
import android.content.Intent
import android.graphics.drawable.BitmapDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.util.Log
import kotlinx.android.synthetic.main.activity_loging.*
import kotlinx.android.synthetic.main.activity_loging.Log_email_text
import kotlinx.android.synthetic.main.activity_loging.Log_password_text
import kotlinx.android.synthetic.main.activity_loging.log_btn
import kotlinx.android.synthetic.main.activity_loging.nav_reg_text
import kotlinx.android.synthetic.main.activity_register.*


class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        log_btn.setOnClickListener {
        var email = Log_email_text.text.toString()
        var password = Log_password_text.text.toString()
            var username = Reg_user_text.text.toString()


            Log.d("RegisterActivity","Username is " + username)
            Log.d("RegisterActivity","Email is " + email)
            Log.d("RegisterActivity","Password is " + password)



        }

        nav_reg_text.setOnClickListener {
            var intent = Intent(this, LogingActivity::class.java)
            startActivity(intent)
        }

        pro_btn.setOnClickListener {

            Log.d("RegisterActivity","image is " )
        }

        pro_btn.setOnClickListener {
            Log.d("RegisterActivity","image")
            var intent = Intent(Intent.ACTION_PICK)
            intent.type ="image/*"
            startActivityForResult(intent,0)

        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if(requestCode == 0 && resultCode == Activity.RESULT_OK && data != null){
            Log.d("RegisterActivity","image is selected " )

            val uri = data.data
            val bitmap = MediaStore.Images.Media.getBitmap(contentResolver,uri)
            select_image_viwe_reg.setImageBitmap(bitmap)
            pro_btn.alpha = 0f
           // val bitmapDrawable = BitmapDrawable(bitmap)
          //  pro_btn.setBackgroundDrawable(bitmapDrawable)
        }
    }


}
