package lol.l1npengtul.mcoutilities.config

import lol.l1npengtul.mcoutilities.McOUtilitiesMod
import net.minecraft.client.gui.GuiScreen
import net.minecraftforge.fml.client.config.GuiConfig
import lol.l1npengtul.mcoutilities.config.Config
import net.minecraftforge.fml.client.config.IConfigElement


class ConfigGui(
    private val guiScreen: GuiScreen,
    private val configElements: MutableList<IConfigElement>,
    private val modId: String,
    private val requireMcRestart: Boolean,
    private val requireMcReload: Boolean,
    private val configPath: String
): GuiConfig(guiScreen, configElements, modId, requireMcRestart, requireMcReload, configPath) {
}
