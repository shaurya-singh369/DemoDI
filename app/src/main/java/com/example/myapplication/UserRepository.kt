package com.example.myapplication

import android.util.Log
import javax.inject.Inject
interface UserRepository {
    fun saveUser(email: String, password: String)
}
class SQLRepository @Inject constructor() : UserRepository{
    override fun saveUser(email: String, password: String) {
        Log.d("Dagger", "Saving user to the SQL")
    }
}
class FirebaseRepository : UserRepository{
    override fun saveUser(email: String, password: String) {
        Log.d("Dagger", "Saving user to the firebase")
    }
}