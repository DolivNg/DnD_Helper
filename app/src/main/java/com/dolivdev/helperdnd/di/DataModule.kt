package com.dolivdev.helperdnd.di

import android.content.Context
import com.dolivdev.helperdnd.data.EquipmentRepositoryImpl
import com.dolivdev.helperdnd.domain.repositoryes.EquipmentRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DataModule {
    @Provides
    @Singleton
    fun provideEquipmentRepository(@ApplicationContext context : Context): EquipmentRepository{
        return EquipmentRepositoryImpl(context)
    }
}