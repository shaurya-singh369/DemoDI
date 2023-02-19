package com.example.myapplication

import android.util.Log
import javax.inject.Inject
interface NotificationService {
    fun send (to: String,from:String,body:String?)
}
class EmailService @Inject constructor() : NotificationService{
    override fun send(to:String, from:String, body:String?)    {
        Log.d("Dagger", "Sending email to $to from $from with body $body")
    }
}
class MessageService @Inject constructor(private val retryCount:Int) : NotificationService{
    override fun send(to:String, from:String, body:String?)    {
        Log.d("Dagger", "Sending message to $to from $from with body $body retry count $retryCount")
    }
}