package com.eparita.ktorcheck.di

import android.content.Context
import com.eparita.ktorcheck.data.repository.DataStoreOperationImpl
import com.eparita.ktorcheck.data.repository.Repository
import com.eparita.ktorcheck.domain.repository.DataStoreOperation
import com.eparita.ktorcheck.domain.use_cases.UseCases
import com.eparita.ktorcheck.domain.use_cases.get_all_heroes.GetAllHeroesUseCase
import com.eparita.ktorcheck.domain.use_cases.read_onboarding.ReadOnBoardingUseCase
import com.eparita.ktorcheck.domain.use_cases.save_onboarding.SaveOnBoardingUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {
    @Provides
    @Singleton
    fun provideDataStoreOperation(
        @ApplicationContext context: Context
    ): DataStoreOperation {
        return DataStoreOperationImpl(context = context)
    }

    @Provides
    @Singleton
    fun provideUseCases(repository: Repository): UseCases {
        return UseCases(
            saveOnBoardingUseCase = SaveOnBoardingUseCase(repository),
            readOnBoardingUseCase = ReadOnBoardingUseCase(repository),
            getAllHeroesUseCase = GetAllHeroesUseCase(repository)
        )
    }
}