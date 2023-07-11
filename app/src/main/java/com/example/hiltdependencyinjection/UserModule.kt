package com.example.hiltdependencyinjection

import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.FragmentComponent
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject
import javax.inject.Named
import javax.inject.Singleton

//@InstallIn(FragmentComponent::class)
@InstallIn(ActivityComponent::class)
//@InstallIn(SingletonComponent::class)
@Module
class UserModule {


    @Provides
    @Named("sql")
    fun providesSQLRepository() : UserRepository{
        return FirebaseRepository()
    }

    @Provides
    @Named("firebase")
    fun providesFirebaseRepository(sqlRepository: SQLRepository) : UserRepository{
        return sqlRepository
    }


//    @Binds
//    abstract fun bindUserRepository(sqlRepository: SQLRepository) : UserRepository
}