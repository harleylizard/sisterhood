package com.harleylizard.sisterhood.common

import com.harleylizard.sisterhood.common.Sisterhood.Companion.asResourceLocation
import com.harleylizard.sisterhood.common.block.MortarBlock
import net.minecraft.core.Registry
import net.minecraft.core.registries.BuiltInRegistries
import net.minecraft.world.level.block.Block
import net.minecraft.world.level.block.state.BlockBehaviour.Properties

object SisterhoodBlocks {
    val mortar = MortarBlock(Properties.of())

    fun register() {
        mortar.register("mortar")
    }

    private fun Block.register(name: String) {
        Registry.register(BuiltInRegistries.BLOCK, name.asResourceLocation, this)
    }
}