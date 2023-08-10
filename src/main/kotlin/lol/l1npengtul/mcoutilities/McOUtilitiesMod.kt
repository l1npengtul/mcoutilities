package lol.l1npengtul.mcoutilities

import com.google.gson.GsonBuilder
import com.google.gson.InstanceCreator
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.event.FMLInitializationEvent
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent
import java.lang.reflect.ParameterizedType
import java.lang.reflect.Type
import java.util.*


@Mod(
    modid = McOUtilitiesMod.MOD_ID,
    name = McOUtilitiesMod.MOD_NAME,
    version = McOUtilitiesMod.VERSION,
    modLanguageAdapter = "net.shadowfacts.forgelin.KotlinAdapter"
)
object McOUtilitiesMod {
    const val MOD_ID = "mcoutilities"
    const val MOD_NAME = "MinecraftOnline Utilities"
    const val VERSION = "0.0.1"

    /**
     * This is the first initialization event. Register tile entities here.
     * The registry events below will have fired prior to entry to this method.
     */
    @Mod.EventHandler
    fun preinit(event: FMLPreInitializationEvent) {
        event.suggestedConfigurationFile
    }

    /**
     * This is the second initialization event. Register custom recipes
     */
    @Mod.EventHandler
    fun init(event: FMLInitializationEvent) {

    }

    /**
     * This is the final initialization event. Register actions from other mods here
     */
    @Mod.EventHandler
    fun postinit(event: FMLPostInitializationEvent) {

    }
}
