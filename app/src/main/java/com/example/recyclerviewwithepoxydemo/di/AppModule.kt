package com.example.recyclerviewwithepoxydemo.di

import com.example.recyclerviewwithepoxydemo.data.remote.RickAndMortyApi
import com.example.recyclerviewwithepoxydemo.data.repository.MainRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideMainRepository(
        api: RickAndMortyApi
    ): MainRepository =
        MainRepository(api = api)
}