package com.axnetlabs.phpcrudecrud

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import java.io.File
import java.io.BufferedReader
import com.axnetlabs.phpcrudecrud.MainActivity2

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        // read file using example text
        // python script snippit
        // output = publish.subscribe("test", data_string, hostname="172.22.32.140")
        // then i cram that into example.txt
        // finally i read it in java
        // dont know how to connect this to the actuall andorid app but thats how i wired things upo

        fun main(args: Array<String>) {
            val bufferedReader: BufferedReader = File("example.txt").bufferedReader()
            val inputString = bufferedReader.use { it.readText() }
            println(inputString)
        }

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
//
// start your next activity
            startActivity(intent)

        }


    }

}