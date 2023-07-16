package com.eparita.ktorcheck.domain.repository

import androidx.paging.PagingData
import com.eparita.ktorcheck.domain.model.Hero
import kotlinx.coroutines.flow.Flow

interface RemoteDataSource {
    fun getAllHeroes(): Flow<PagingData<Hero>>
    fun searchHeroes(): Flow<PagingData<Hero>>
}