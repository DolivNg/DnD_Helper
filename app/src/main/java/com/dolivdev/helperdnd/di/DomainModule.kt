package com.dolivdev.helperdnd.di

import com.dolivdev.helperdnd.domain.repositoryes.EquipmentRepository
import com.dolivdev.helperdnd.domain.usecase.equipment.FilterSearchEquipmentUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
class DomainModule {
    @Provides
    fun provideFilterSearchEquipmentUseCase( equipRep : EquipmentRepository) : FilterSearchEquipmentUseCase{
        return FilterSearchEquipmentUseCase(equipRep)
    }
}