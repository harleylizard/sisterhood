package com.harleylizard.sisterhood.common

import com.harleylizard.sisterhood.common.Sisterhood.Companion.asResourceLocation
import net.minecraft.core.Registry
import net.minecraft.core.registries.BuiltInRegistries
import net.minecraft.world.item.BlockItem
import net.minecraft.world.item.Item
import net.minecraft.world.level.block.Block

object SisterhoodItems {
    val mortar = SisterhoodBlocks.mortar.asBlockItem
    val pestle = Item(Item.Properties().stacksTo(1))

    fun register() {
        mortar.register("mortar")
        pestle.register("pestle")
    }

    private fun Item.register(name: String) {
        Registry.register(BuiltInRegistries.ITEM, name.asResourceLocation, this)
    }

    private inline val Block.asBlockItem; get() = BlockItem(this, Item.Properties())
}