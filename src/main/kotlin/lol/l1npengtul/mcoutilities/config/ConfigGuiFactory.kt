package lol.l1npengtul.mcoutilities.config

import lol.l1npengtul.mcoutilities.McOUtilitiesMod
import lol.l1npengtul.mcoutilities.config.Config
import net.minecraft.client.Minecraft
import net.minecraft.client.gui.GuiScreen
import net.minecraftforge.fml.client.IModGuiFactory
import net.minecraftforge.fml.client.config.GuiConfig


class ConfigGuiFactory: IModGuiFactory{
    override fun initialize(minecraftInstance: Minecraft?) {
    }

    override fun hasConfigGui(): Boolean {
        return true
    }

    override fun createConfigGui(parentScreen: GuiScreen): GuiScreen {
        return ConfigGui(
            parentScreen,
            mutableListOf(),
            McOUtilitiesMod.MOD_ID,
            false,
            false,
            GuiConfig::getAbridgedConfigPath.call(Config::config.toString())
        )
    }

    override fun runtimeGuiCategories(): MutableSet<IModGuiFactory.RuntimeOptionCategoryElement> {
        return mutableSetOf()
    }
}
