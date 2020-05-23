package com.example.mycoffee.activities

import android.os.Bundle
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import com.example.mycoffee.R
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        supportActionBar?.hide()
        window?.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN)

        iv_img_header.setImageResource(getIntent().getStringExtra("CAFEIMAGE").toInt())
        tv_title_cafe.text= getIntent().getStringExtra("CAFENAME")
        tv_subtitle_cafe.text= getIntent().getStringExtra("CAFESUBNAME")
        tv_rating.text= getIntent().getStringExtra("CAFERATING")
        tv_cafe_address.text= getIntent().getStringExtra("CAFEADDRESS")
        tv_detail_about_cafe.text= getIntent().getStringExtra("CAFEDETAIL")
        tv_review1.text= getIntent().getStringExtra("CAFEREVIEW1")
       // tv_review2.text= getIntent().getStringExtra("CAFEREVIEW2")


    }
}
