package com.example.myapplication

import dagger.BindsInstance
import dagger.Component

@Component(modules = [UserRepositoryModule::class, NotificationServiceModule::class] )
interface UserRegComponent {

    @Component.Factory
   interface Factory {
       fun create(@BindsInstance retryCount:Int): UserRegComponent
   }
   fun inject(mainActivity:MainActivity)
}