package com.eparita.ktorcheck.domain.use_cases.get_all_heroes

import androidx.paging.PagingData
import com.eparita.ktorcheck.data.repository.Repository
import com.eparita.ktorcheck.domain.model.Hero
import kotlinx.coroutines.flow.Flow

class GetAllHeroesUseCase(private val repository: Repository) {
    operator fun invoke():Flow<PagingData<Hero>>{
        return repository.getAllHeroes()
    }
}