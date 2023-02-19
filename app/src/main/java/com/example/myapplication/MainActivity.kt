package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var userRegService: UserRegService
    @Inject
    lateinit var emailService: EmailService
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val component=DaggerUserRegComponent.factory().create(3)
           component.inject(this)
            userRegService.registerUser("shaurya.com","123456")
    }
}