package com.axnetlabs.phpcrudecrud

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View


class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)


        fun MoveApp(view: View)
        {
            val intent = Intent(this, MainActivity2::class.java)
// To pass any data to next activity

// start your next activity
            startActivity(intent)

        }
        fun DoThing(view: View)
        {
            val intent = Intent(this, MainActivity4::class.java)
// To pass any data to next activity

// start your next activity
            startActivity(intent)

        }
    }
}