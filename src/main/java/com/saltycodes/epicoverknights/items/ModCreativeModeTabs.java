package com.saltycodes.epicoverknights.items;

import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs {
    @SubscribeEvent
    public static void onBuildCreativeTab(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey().location().equals(ResourceLocation.fromNamespaceAndPath("overgeared", "overgeared_tab"))) {
            event.accept(ModItems.COPPER_STYLET_BLADE.get());
            event.accept(ModItems.GOLD_STYLET_BLADE.get());
            event.accept(ModItems.TIN_STYLET_BLADE.get());
            event.accept(ModItems.STONE_STYLET_BLADE.get());
            event.accept(ModItems.SILVER_STYLET_BLADE.get());
            event.accept(ModItems.BRONZE_STYLET_BLADE.get());
            event.accept(ModItems.IRON_STYLET_BLADE.get());
            event.accept(ModItems.STEEL_STYLET_BLADE.get());

            event.accept(ModItems.BRONZE_SHORTSWORD_BLADE.get());
            event.accept(ModItems.COPPER_SHORTSWORD_BLADE.get());
            event.accept(ModItems.GOLD_SHORTSWORD_BLADE.get());
            event.accept(ModItems.IRON_SHORTSWORD_BLADE.get());
            event.accept(ModItems.SILVER_SHORTSWORD_BLADE.get());
            event.accept(ModItems.STEEL_SHORTSWORD_BLADE.get());
            event.accept(ModItems.STONE_SHORTSWORD_BLADE.get());
            event.accept(ModItems.TIN_SHORTSWORD_BLADE.get());
        }
    }
}
