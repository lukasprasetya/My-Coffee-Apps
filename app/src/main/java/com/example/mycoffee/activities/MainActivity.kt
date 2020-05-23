package com.example.mycoffee.activities

import CafeModel
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.ImageView
import android.widget.Toast
import androidx.databinding.adapters.ActionMenuViewBindingAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mycoffee.R
import com.example.mycoffee.adapter.CafeAdapter
import com.example.mycoffee.adapter.OnCafeClickListener
import com.example.mycoffee.data.CafeData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), OnCafeClickListener , View.OnClickListener {
    private var list: ArrayList<CafeModel> = arrayListOf()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()
        window?.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN)

        list.addAll(CafeData.listData)
        showRecyclerList()

        val btnMoveAbout: ImageView = findViewById(R.id.iv_user)
        btnMoveAbout.setOnClickListener(this)

    }

    private fun showRecyclerList() {
        rv_cafe?.layoutManager = LinearLayoutManager(this)
        val cafeAdapter = CafeAdapter(list, this)
        rv_cafe?.adapter = cafeAdapter

        rv_cafe?.setHasFixedSize(true)
    }

    override fun onCafeClick(cafe: CafeModel) {
      //  Toast.makeText(this, cafe.name, Toast.LENGTH_LONG).show()
        val intent= Intent(this, DetailActivity::class.java)
        intent.putExtra("CAFEIMAGE", cafe.imgheader.toString())
        intent.putExtra("CAFENAME", cafe.name)
        intent.putExtra("CAFESUBNAME", cafe.subname)
        intent.putExtra("CAFERATING", cafe.rating)
        intent.putExtra("CAFEADDRESS", cafe.address)
        intent.putExtra("CAFEDETAIL", cafe.detail)
        intent.putExtra("CAFEREVIEW1", cafe.review1)
        intent.putExtra("CAFEREVIEW2", cafe.review2)
        startActivity(intent)

//        startActivity(Intent(this, DetailActivity::class.java))
    }
    override fun onClick(v: View){
        when(v.id){
            R.id.iv_user ->{
                val moveIntent = Intent(this@MainActivity, AboutActivity::class.java)
                startActivity(moveIntent)

            }
        }
    }


}
