package com.example.hiltdependencyinjection

import android.content.Context
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.FragmentComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject
import javax.inject.Named
import javax.inject.Singleton

//@InstallIn(FragmentComponent::class)
//@InstallIn(ActivityComponent::class)
@InstallIn(SingletonComponent::class)
@Module
class UserModule {


    @Provides
    @Named("sql")
    fun providesSQLRepository(sqlRepository: SQLRepository) : UserRepository{
        return sqlRepository
    }

    @Provides
    @FirebaseQualifier
    fun providesFirebaseRepository(@ApplicationContext context: Context) : UserRepository{
        return FirebaseRepository(context)
    }


//    @Binds
//    abstract fun bindUserRepository(sqlRepository: SQLRepository) : UserRepository
}