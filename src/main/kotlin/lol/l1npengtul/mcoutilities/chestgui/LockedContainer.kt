package lol.l1npengtul.mcoutilities.chestgui

import net.minecraft.entity.player.EntityPlayer
import net.minecraft.inventory.Container
import net.minecraft.inventory.IContainerListener
import net.minecraft.inventory.Slot
import net.minecraft.item.Item

class LockedContainer(val listener: IContainerListener, val sizeX: Int, val sizeY: Int, var items: Array<Item>, val title: String): Container() {
    override fun canInteractWith(playerIn: EntityPlayer): Boolean {
        return false
    }

    override fun canDragIntoSlot(slotIn: Slot): Boolean {
        return false
    }

    override fun getCanCraft(player: EntityPlayer): Boolean {
        return false
    }


}
