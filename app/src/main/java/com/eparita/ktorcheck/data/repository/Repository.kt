package com.eparita.ktorcheck.data.repository

import com.eparita.ktorcheck.domain.repository.DataStoreOperation
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class Repository @Inject constructor(
    private val dataStoreOperation: DataStoreOperation
) {
    suspend fun saveOnBoardingState(completed: Boolean) {
        dataStoreOperation.saveOnBoardingState(completed)
    }

    fun readOnBoardingState(): Flow<Boolean> {
        return dataStoreOperation.readOnBoardingState()
    }
}