package com.example.eaut2_01

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    // Método onCreate, que se ejecuta al crear la actividad
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initAct()
    }

    // Inicializa la actividad y obtiene los datos del programador
    private fun initAct() {
        val prog: ProgrammerData = Programador().getProgrammerData()
        // Aquí puedes hacer algo con los datos del programador, por ejemplo imprimir
        println("Nombre: ${prog.name}, Edad: ${prog.age}, Lenguaje: ${prog.language}")
    }
}

// Interfaz ProgramadorInterface con el método para obtener datos
interface ProgramadorInterface {
    fun getProgrammerData(): ProgrammerData
}

// Clase Programador que implementa la interfaz ProgramadorInterface
class Programador : ProgramadorInterface {
    override fun getProgrammerData(): ProgrammerData {
        return ProgrammerData(getName(), getAge(), getLanguage())
    }

    private fun getName(): String {
        return datos.PROGRAMMER_NAME
    }

    private fun getAge(): Int {
        return datos.PROGRAMMER_AGE
    }

    private fun getLanguage(): String {
        return datos.PROGRAMMER_LANGUAGE
    }
}

// Objeto que contiene los datos del programador
object datos {
    const val PROGRAMMER_NAME = "Juan"
    const val PROGRAMMER_AGE = 25
    const val PROGRAMMER_LANGUAGE = "Kotlin"
}

// Data class para almacenar los datos del programador
data class ProgrammerData(
    val name: String,
    val age: Int,
    val language: String
)

// Objeto clog que contiene la constante TAG_LOG para logs
object clog {
    const val TAG_LOG: String = ":!:!:TAG"
}
