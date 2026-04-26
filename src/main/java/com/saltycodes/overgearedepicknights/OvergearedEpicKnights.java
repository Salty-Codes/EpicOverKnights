package com.saltycodes.overgearedepicknights;

import com.saltycodes.overgearedepicknights.items.ModItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(OvergearedEpicKnights.MODID)
public class OvergearedEpicKnights {
    public static final String MODID = "overgeared_epic_knights";

    public OvergearedEpicKnights() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }
}
