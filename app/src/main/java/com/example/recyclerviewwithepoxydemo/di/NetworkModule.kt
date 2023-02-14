package com.example.recyclerviewwithepoxydemo.di

import androidx.databinding.ktx.BuildConfig
import com.example.recyclerviewwithepoxydemo.data.remote.RickAndMortyApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {
    @Provides
    @Singleton
    fun provideClient(

    ): OkHttpClient {
        val loggingInterceptor: HttpLoggingInterceptor = HttpLoggingInterceptor()
        loggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
        return OkHttpClient.Builder()
            .readTimeout(15, TimeUnit.SECONDS)
            .writeTimeout(15, TimeUnit.SECONDS)
            .connectTimeout(20, TimeUnit.SECONDS)
            .also { client ->
                if (BuildConfig.DEBUG) {
                    client.addInterceptor(loggingInterceptor)
                }
            }
            .build()
    }


    @Provides
    @Singleton
    fun provideRetrofitBuilder(client: OkHttpClient): Retrofit.Builder =
        Retrofit.Builder()
            .client(client)
            .addConverterFactory(GsonConverterFactory.create())

    @Provides
    @Singleton
    fun provideAuthService(retrofitBuilder: Retrofit.Builder): RickAndMortyApi =
        retrofitBuilder.baseUrl("https://rickandmortyapi.com/api/")
            .build()
            .create(RickAndMortyApi::class.java)
}