package com.example.prueba

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val enrollButton = findViewById<Button>(R.id.button)
        enrollButton.setOnClickListener(){

            val text = enrollStudent()
            val duration = Toast.LENGTH_SHORT

            Toast.makeText(applicationContext, text, duration).show()
        }
    }

    private fun enrollStudent(): String{
        var message:String = "Welcome "

        val name = findViewById<EditText>(R.id.formEditTextName)
        val surname = findViewById<EditText>(R.id.formEditTextSurname)
        val cui = findViewById<EditText>(R.id.formEditTextCui)
        val email = findViewById<EditText>(R.id.formEditTextEmail)
        val phoneNumber = findViewById<EditText>(R.id.formEditTextPhoneNumber)
        val semester = findViewById<EditText>(R.id.formEditTextSemester)
        val birthdate = findViewById<EditText>(R.id.formEditTextBirthdate)

        message = """
            $message${name.text}${surname.text}
            CUI: ${cui.text}
            Email:${email.text}
            Semester N°${semester.text}
            Phone: ${phoneNumber.text}
            """

        return message
    }
}