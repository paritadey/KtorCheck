package com.eparita.ktorcheck.data.repository

import androidx.paging.ExperimentalPagingApi
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.eparita.ktorcheck.data.local.BorutoDatabase
import com.eparita.ktorcheck.data.paging_source.HeroRemoteMediator
import com.eparita.ktorcheck.data.remote.BorutoApi
import com.eparita.ktorcheck.domain.model.Hero
import com.eparita.ktorcheck.domain.repository.RemoteDataSource
import com.eparita.ktorcheck.util.Constants.ITEMS_PER_PAGE
import kotlinx.coroutines.flow.Flow

@ExperimentalPagingApi
class RemoteDataSourceImpl(
    private val borutoApi: BorutoApi,
    private val borutoDatabase: BorutoDatabase
) : RemoteDataSource {
    private val heroDao = borutoDatabase.heroDao()

    override fun getAllHeroes(): Flow<PagingData<Hero>> {
        val pagingSourceFactory = { heroDao.getAllHeroes() }
        return Pager(
            config = PagingConfig(pageSize = ITEMS_PER_PAGE),
            remoteMediator = HeroRemoteMediator(borutoApi, borutoDatabase),
            pagingSourceFactory = pagingSourceFactory
        ).flow
    }

    override fun searchHeroes(): Flow<PagingData<Hero>> {
        TODO("Not yet implemented")
    }
}