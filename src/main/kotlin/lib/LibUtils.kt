package com.dannbrown.databox.lib

import com.dannbrown.databox.DataboxMod
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.item.Item
import net.minecraftforge.versions.forge.ForgeVersion

object LibUtils {
  fun resourceLocation(path: String): ResourceLocation {
    return ResourceLocation(DataboxMod.MOD_ID, path)
  }
  
  fun forgeResourceLocation(path: String): ResourceLocation {
    return ResourceLocation(ForgeVersion.MOD_ID, path)
  }

  fun defaultItemProps(): Item.Properties {
    return Item.Properties()
  }
}