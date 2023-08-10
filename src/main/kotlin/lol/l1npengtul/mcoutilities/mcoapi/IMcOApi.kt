package lol.l1npengtul.mcoutilities.mcoapi

import com.github.michaelbull.result.Result
import java.util.UUID

interface IMcOApi {
    suspend fun inGamePlayerList(): Result<List<String>, McOApiError>

    suspend fun isPlayerBanned(player: UUID): Result<Boolean, McOApiError>

    suspend fun firstSeen(player: UUID): Result<Date>

}
