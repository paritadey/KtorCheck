package com.eparita.ktorcheck.domain.use_cases.save_onboarding

import com.eparita.ktorcheck.data.repository.Repository

class SaveOnBoardingUseCase(private val repository: Repository) {
    suspend operator fun invoke(completed: Boolean){
        repository.saveOnBoardingState(completed)
    }
}