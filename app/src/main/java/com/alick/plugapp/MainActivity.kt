package com.alick.plugapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.alick.plugin.JsonUtils

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //{"name":"崔兴旺","age":31}
        val user = JsonUtils.parseJson2Bean("{\"name\":\"崔兴旺\",\"age\":31}", User::class.java)
        Toast.makeText(this,user.toString(),Toast.LENGTH_SHORT).show()
    }
}