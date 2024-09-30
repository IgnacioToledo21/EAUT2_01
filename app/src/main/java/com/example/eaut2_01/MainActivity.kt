package com.example.eaut2_01

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity()

    object datos {
        const val PROGRAMMER_NAME: String = "Juan"
        const val PROGRAMMER_AGE: Int = 25
        const val PROGRAMMER_LANGUAGE: String = "Kotlin"

    }

class Programador() : ProgramadorInterface {
    override fun getProgrammerData(): ProgrammerData {
        val prog: ProgrammerData = ProgrammerData(getName(), getAge(), getLanguage())
        return prog
    }
}

    object clog {
        const val TAG_LOG: String ":!:!:TAG"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initAct()
    }
        private fun initAct() {
            val prog: ProgrammerData = Programador().getProgrammerData()
        }

        private fun getName(): String {
            return "Juan"
        }

        private fun getAge(): Int = 25

        private fun getLanguage(): String = "Kotlin"

        interface ProgramadorInterface {
            fun getProgrammerData(): ProgrammerData
        }

        data class ProgrammerData(
            val name: String,
            val age: Int,
            val language: String
        )

