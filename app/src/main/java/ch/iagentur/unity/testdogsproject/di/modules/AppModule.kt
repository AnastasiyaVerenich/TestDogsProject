package ch.iagentur.unity.testdogsproject.di.modules

import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule constructor(private val context: Context) {

    @Provides
    @Singleton
    fun provideApplicationContext(): Context {
        return context
    }
}