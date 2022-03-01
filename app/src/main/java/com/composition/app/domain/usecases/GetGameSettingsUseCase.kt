package com.composition.app.domain.usecases

import com.composition.app.domain.entity.GameSettings
import com.composition.app.domain.entity.Level
import com.composition.app.domain.repository.GameRepository

class GetGameSettingsUseCase(
    private val repository: GameRepository
) {

    operator fun invoke(level: Level): GameSettings {
        return repository.getGameSettings(level)
    }
}