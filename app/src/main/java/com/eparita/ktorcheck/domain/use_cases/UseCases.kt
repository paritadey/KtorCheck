package com.eparita.ktorcheck.domain.use_cases

import com.eparita.ktorcheck.domain.use_cases.get_all_heroes.GetAllHeroesUseCase
import com.eparita.ktorcheck.domain.use_cases.read_onboarding.ReadOnBoardingUseCase
import com.eparita.ktorcheck.domain.use_cases.save_onboarding.SaveOnBoardingUseCase

data class UseCases(
    val saveOnBoardingUseCase: SaveOnBoardingUseCase,
    val readOnBoardingUseCase: ReadOnBoardingUseCase,
    val getAllHeroesUseCase: GetAllHeroesUseCase
)
