package lol.l1npengtul.mcoutilities.module

import net.minecraftforge.fml.common.event.FMLInitializationEvent
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent

interface IModule<Config> {
    fun preInitialization(event: FMLPreInitializationEvent) {}
    fun initialization(event: FMLInitializationEvent) {}
    fun postInitialization(event: FMLPostInitializationEvent) {}

    val moduleName: String
    val moduleDescription: String
    var moduleConfiguration: Config
}
