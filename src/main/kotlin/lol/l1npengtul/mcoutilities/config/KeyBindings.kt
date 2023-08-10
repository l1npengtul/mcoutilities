package lol.l1npengtul.mcoutilities.config

import lol.l1npengtul.mcoutilities.McOUtilitiesMod
import net.minecraft.client.settings.KeyBinding
import net.minecraftforge.client.settings.KeyConflictContext
import net.minecraftforge.client.settings.KeyModifier
import net.minecraftforge.fml.client.registry.ClientRegistry
import org.lwjgl.input.Keyboard
import kotlin.reflect.KProperty1
import kotlin.reflect.full.declaredMemberProperties

class KeyBindings {
    val categoryName = McOUtilitiesMod.MOD_ID + "(" + McOUtilitiesMod.MOD_NAME + ")"

    // for opening the configuration click GUI
    val toggleMcOUtilConfig: KeyBinding = KeyBinding("key.mcoutilities.toggleMcOUtilConfig", KeyConflictContext.GUI, KeyModifier.ALT, Keyboard.KEY_S, categoryName)

    // commands for everyone!
    val doMcoCommandGoodNight: KeyBinding = KeyBinding("key.mcoutilities.doMcoCommandGoodNight", KeyConflictContext.IN_GAME, KeyModifier.NONE, Keyboard.KEY_NONE, categoryName)
    val doMcoCommandSpawn: KeyBinding = KeyBinding("key.mcoutilities.doMcoCommandSpawn", KeyConflictContext.IN_GAME, KeyModifier.NONE, Keyboard.KEY_NONE, categoryName)
    val doMcoCommandHome: KeyBinding = KeyBinding("key.mcoutilities.doMcoCommandHome", KeyConflictContext.IN_GAME, KeyModifier.NONE, Keyboard.KEY_NONE, categoryName)

    // kit commands
    val doMcoCommandDescend: KeyBinding = KeyBinding("key.mcoutilities.doMcoCommandDescend", KeyConflictContext.IN_GAME, KeyModifier.NONE, Keyboard.KEY_NONE, categoryName)
    val doMcoCommandThru: KeyBinding = KeyBinding("key.mcoutilities.doMcoCommandThru", KeyConflictContext.IN_GAME, KeyModifier.NONE, Keyboard.KEY_NONE, categoryName)
    val doMcoCommandJumpTo: KeyBinding = KeyBinding("key.mcoutilities.doMcoCommandJumpTo", KeyConflictContext.IN_GAME, KeyModifier.NONE, Keyboard.KEY_NONE, categoryName)
    val doMcoCommandHeal: KeyBinding = KeyBinding("key.mcoutilities.doMcoCommandHeal", KeyConflictContext.IN_GAME, KeyModifier.NONE, Keyboard.KEY_NONE, categoryName)
    val doMcoCommandFeed: KeyBinding = KeyBinding("key.mcoutilities.doMcoCommandFeed", KeyConflictContext.IN_GAME, KeyModifier.NONE, Keyboard.KEY_NONE, categoryName)
    val doMcoCommandUnstuck: KeyBinding = KeyBinding("key.mcoutilities.doMcoCommandUnstuck", KeyConflictContext.IN_GAME, KeyModifier.NONE, Keyboard.KEY_NONE, categoryName)
    val doMcoCommandHeatwave: KeyBinding = KeyBinding("key.mcoutilities.doMcoCommandHeatwave", KeyConflictContext.IN_GAME, KeyModifier.NONE, Keyboard.KEY_NONE, categoryName)
    val doMcoCommandChill: KeyBinding = KeyBinding("key.mcoutilities.doMcoCommandChill", KeyConflictContext.IN_GAME, KeyModifier.NONE, Keyboard.KEY_NONE, categoryName)
    val doMcoCommandDrought: KeyBinding = KeyBinding("key.mcoutilities.doMcoCommandDrought", KeyConflictContext.IN_GAME, KeyModifier.NONE, Keyboard.KEY_NONE, categoryName)
    val doMcoCommandSmoothWater: KeyBinding = KeyBinding("key.mcoutilities.doMcoCommandSmoothWater", KeyConflictContext.IN_GAME, KeyModifier.NONE, Keyboard.KEY_NONE, categoryName)
    val doMcoCommandSlaughter: KeyBinding = KeyBinding("key.mcoutilities.doMcoCommandSlaughter", KeyConflictContext.IN_GAME, KeyModifier.NONE, Keyboard.KEY_NONE, categoryName)
    val doMcoCommandGrassify: KeyBinding = KeyBinding("key.mcoutilities.doMcoCommandGrassify", KeyConflictContext.IN_GAME, KeyModifier.NONE, Keyboard.KEY_NONE, categoryName)
    val doMcoCommandSmoothLava: KeyBinding = KeyBinding("key.mcoutilities.doMcoCommandSmoothLava", KeyConflictContext.IN_GAME, KeyModifier.NONE, Keyboard.KEY_NONE, categoryName)
    val doMcoCommandMycelify: KeyBinding = KeyBinding("key.mcoutilities.doMcoCommandMycelify", KeyConflictContext.IN_GAME, KeyModifier.NONE, Keyboard.KEY_NONE, categoryName)
    val doMcoCommandRandomGift: KeyBinding = KeyBinding("key.mcoutilities.doMcoCommandRandomGift", KeyConflictContext.IN_GAME, KeyModifier.NONE, Keyboard.KEY_NONE, categoryName)
    val doMcoCommandPotions: KeyBinding = KeyBinding("key.mcoutilities.doMcoCommandPotions", KeyConflictContext.IN_GAME, KeyModifier.NONE, Keyboard.KEY_NONE, categoryName)
    val doMcoCommandMilk: KeyBinding = KeyBinding("key.mcoutilities.doMcoCommandMilk", KeyConflictContext.IN_GAME, KeyModifier.NONE, Keyboard.KEY_NONE, categoryName)
    val doMcoCommandDemiGod: KeyBinding = KeyBinding("key.mcoutilities.doMcoCommandDemiGod", KeyConflictContext.IN_GAME, KeyModifier.NONE, Keyboard.KEY_NONE, categoryName)
    val doMcoCommandCraft: KeyBinding = KeyBinding("key.mcoutilities.doMcoCommandCraft", KeyConflictContext.IN_GAME, KeyModifier.NONE, Keyboard.KEY_NONE, categoryName)
    val doMcoCommandAnvil: KeyBinding = KeyBinding("key.mcoutilities.doMcoCommandAnvil", KeyConflictContext.IN_GAME, KeyModifier.NONE, Keyboard.KEY_NONE, categoryName)
    val doMcoCommandToggleGod: KeyBinding = KeyBinding("key.mcoutilities.doMcoCommandToggleGod", KeyConflictContext.IN_GAME, KeyModifier.NONE, Keyboard.KEY_NONE, categoryName)
    val doMcoCommandClearInventory: KeyBinding = KeyBinding("key.mcoutilities.doMcoCommandClearInventory", KeyConflictContext.IN_GAME, KeyModifier.NONE, Keyboard.KEY_NONE, categoryName)
    val doMcoCommandToggleSuperPickaxe: KeyBinding = KeyBinding("key.mcoutilities.doMcoCommandToggleSuperPickaxe", KeyConflictContext.IN_GAME, KeyModifier.NONE, Keyboard.KEY_NONE, categoryName)

    init {
        val allOfOurFields = KeyBindings::class.declaredMemberProperties

        // what we are doing here is some hijinks so i can be a lazy POS evil transgender i am
        // basically, we do some :sparkle: reflection magik :sparkle: in order to get all of our fields
        // and we are casting them back and feeding them to the register like a noob who broke a torch on McO frfr
        allOfOurFields.forEach { field ->
            if (field.name.startsWith("doMcoCommand") || field.name.startsWith("toggleMcOUtilConfig")) {
                val key = field.get(this) as KeyBinding
                ClientRegistry.registerKeyBinding(key)
            }
        }
    }
}
