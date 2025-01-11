package com.harleylizard.sisterhood.common

import net.fabricmc.api.ModInitializer
import net.minecraft.resources.ResourceLocation

class Sisterhood : ModInitializer {

    override fun onInitialize() {
        SisterhoodBlocks.register()
        SisterhoodItems.register()
        SisterhoodEntityTypes.register()
        SisterhoodBlockEntityTypes.register()
    }

    companion object {
        private const val MOD_ID = "sisterhood"

        val String.asResourceLocation; get() = ResourceLocation.fromNamespaceAndPath(MOD_ID, this)
    }
}