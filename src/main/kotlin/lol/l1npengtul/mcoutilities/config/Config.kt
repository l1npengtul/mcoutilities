package lol.l1npengtul.mcoutilities.config

import net.minecraftforge.common.config.Configuration
import java.io.File

class Config(private val configFile: File) {
    val config: Configuration = Configuration(configFile)

    init {
        config.load()
    }

    fun syncConfig() {
    }
}
