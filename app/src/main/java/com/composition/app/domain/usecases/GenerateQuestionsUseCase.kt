package com.composition.app.domain.usecases

import com.composition.app.domain.entity.GameSettings
import com.composition.app.domain.entity.Question
import com.composition.app.domain.repository.GameRepository

class GenerateQuestionsUseCase(
    private val repository: GameRepository
) {

    operator fun invoke(maxSumValue: Int): Question {
        return repository.generateQuestion(maxSumValue, COUNT_OF_OPTIONS)
    }

    private companion object {
        private const val COUNT_OF_OPTIONS = 6
    }
}