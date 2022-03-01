package com.composition.app.domain.repository

import com.composition.app.domain.entity.GameSettings
import com.composition.app.domain.entity.Level
import com.composition.app.domain.entity.Question

interface GameRepository {

    fun generateQuestion(
        maxSumValue: Int,
        countOfOptions: Int
    ): Question

    fun getGameSettings(level: Level): GameSettings
}