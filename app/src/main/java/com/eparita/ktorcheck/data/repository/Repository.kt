package com.eparita.ktorcheck.data.repository

import androidx.paging.PagingData
import com.eparita.ktorcheck.domain.model.Hero
import com.eparita.ktorcheck.domain.repository.DataStoreOperation
import com.eparita.ktorcheck.domain.repository.RemoteDataSource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class Repository @Inject constructor(
    private val remote: RemoteDataSource,
    private val dataStoreOperation: DataStoreOperation
) {

    fun getAllHeroes(): Flow<PagingData<Hero>> {
        return remote.getAllHeroes()
    }

    suspend fun saveOnBoardingState(completed: Boolean) {
        dataStoreOperation.saveOnBoardingState(completed)
    }

    fun readOnBoardingState(): Flow<Boolean> {
        return dataStoreOperation.readOnBoardingState()
    }
}