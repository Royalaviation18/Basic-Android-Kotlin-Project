package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonUpload = findViewById<Button>(R.id.btnUpload)
        val buttonDownload = findViewById<Button>(R.id.btnDownload)

        buttonUpload.setOnClickListener(View.OnClickListener {
            Toast.makeText(this,"Uploading",Toast.LENGTH_SHORT).show()
        })

        buttonDownload.setOnClickListener(View.OnClickListener {
            Toast.makeText(this,"Downloading",Toast.LENGTH_SHORT).show()
        })
    }
}