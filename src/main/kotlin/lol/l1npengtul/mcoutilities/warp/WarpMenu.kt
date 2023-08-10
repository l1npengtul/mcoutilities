package lol.l1npengtul.mcoutilities.warp

import net.minecraftforge.event.CommandEvent
import net.minecraftforge.fml.common.eventhandler.Event
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent

class WarpMenu {

    @SubscribeEvent
    fun onCommand(event: CommandEvent) {
        if (event.command.name == "warp") {
            // cancel our event
            event.result = Event.Result.DENY

        }
    }
}
