package com.example.studentportal

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_create_portal.*

const val EXTRA_PORTAL = "EXTRA_PORTAL"

class CreatePortal : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_portal)
        initViews()
    }

    private fun initViews(){
        btnAddPortal.setOnClickListener { onAddClick() }
    }

    private fun onAddClick() {

        val portal = Portal(
            tiTitle.text.toString(),
            tiUrl.text.toString()
        )
        val resultIntent = Intent()
        resultIntent.putExtra(EXTRA_PORTAL, portal)
        setResult(Activity.RESULT_OK, resultIntent)
        finish()


        //val mainActivityIntent = Intent(this, MainActivity::class.java)
        //mainActivityIntent.putExtra(MainActivity.PORTAL_EXTRA, portal)
        //startActivity(mainActivityIntent)
    }
}
