package com.example.myapplication

import javax.inject.Inject
import javax.inject.Named

class UserRegService @Inject constructor(
    private val userRepository: UserRepository,
    @Named("message") private val notificationService: NotificationService
        ){
    fun registerUser(email: String,password :String) {
        userRepository.saveUser(email, password)
        notificationService.send(email,"shauryasingh@gmail.com", "Welcome to our app")
    }
}