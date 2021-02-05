package cordobarentar.com.miprimerkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //variables y constantes
        //Tipeado inferido
        var nombre = "Fabio" //asume que es un string

        val edad = 25 //val es una constante que asume que es un integer

        var nombre2 : String = "Jose"
        var edad2 = edad

        //Array
        val numerosPares = arrayOf(2,4,6)


        //NULL SAFETY
        var nombreNuevo : String? = null

        nombreNuevo = "hola"

        nombreNuevo?.length   //el ? es poque fue declarado nulleable

        nombreNuevo!!.length //fuerza a usarlo, no es buena practica usarlo

        //String
        val texto = "jose tiene 25 anos"  //que seria lo mismo que
        val texto2 = "$nombre tiene $edad anos"

        //comparadores !=    ==  <>   <=

        val menor = edad in 1..20

        if (edad in 1..18){
            val esMenor = true
        }

        //asi seria el Switch
        var saludo = "Hola"
        var saludo2 = "Hola dos"
        when (nombre){
            "Carlos" -> {
                saludo = "$saludo $nombre"
                saludo2 = "$saludo2 $nombre"     //si tenes mas de una linea hay que ponerla entre las llaves
                }
            "Jorge"-> saludo = "$saludo $nombre"
            "Pepe"-> saludo = "$saludo $nombre"
            else -> saludo = "$saludo anonimo"
        }



        //clausula FOR

        for (numero in numerosPares)
        {
            Log.i("Numero",numero.toString())
        }

        //Casteo de variables
        val edad3 : String = "54"
        val edadEntera = edad3.toInt()

        //Funciones
        fun ejemplo() : String {  //devuelve un string

            return "a"
        }

        fun ejemplo2() : Int{    //devuelve un integer

            return 1
        }

        //funcion que le pasamos dos parametros del tipo Int y devuelve un Int
        fun sumar(numero1 : Int, numero2:Int) : Int{

            return numero1 + numero2
        }

        //Operaciones Landa

        class Persona {
            var edad : Int = 24
            var nombre : String = "pepe"

        }
        val anoDeNacimientoDePepe = {persona : Persona, anioActual:Int -> anioActual - persona.edad}


        /*
        boton.setOnClickListener {}  //aca adentro le ponemos un landa y le indicamos lo que tiene que hacer
                                     //eso simplificaria el uso de un click con respecto a java
        */



        //en kotlin por default es public a menos que se defina
        //Ver Visibilidad de constantes y variables

        var a = 123
        //otra forma de definir una clase
        class Person2 (var nombre:String, var appCompatActivity: AppCompatActivity:String, var edad:Int,
        var tieneAuto:Boolean = false){

            //aca adentro generariamos el constructor
            //VER VIDEO CLASE GRABADA
        //constructor()
            val a1 = a + 123 / 4

        }

        //KOTLIN NO NECESITA GETTER AND SETTER !!!  SE AUTO GENERA
        //VER VIDEO







    }
}