package com.saltycodes.epicoverknights.items;

import com.saltycodes.epicoverknights.EpicOverKnights;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
            EpicOverKnights.MODID);

    public static final RegistryObject<Item> COPPER_STYLET_BLADE = ITEMS.register("copper_stylet_blade", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GOLD_STYLET_BLADE = ITEMS.register("gold_stylet_blade", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TIN_STYLET_BLADE = ITEMS.register("tin_stylet_blade", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STONE_STYLET_BLADE = ITEMS.register("stone_stylet_blade", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILVER_STYLET_BLADE = ITEMS.register("silver_stylet_blade", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_STYLET_BLADE = ITEMS.register("bronze_stylet_blade", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> IRON_STYLET_BLADE = ITEMS.register("iron_stylet_blade", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STEEL_STYLET_BLADE = ITEMS.register("steel_stylet_blade", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BRONZE_SHORTSWORD_BLADE = ITEMS.register("bronze_shortsword_blade", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COPPER_SHORTSWORD_BLADE = ITEMS.register("copper_shortsword_blade", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GOLD_SHORTSWORD_BLADE = ITEMS.register("gold_shortsword_blade", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> IRON_SHORTSWORD_BLADE = ITEMS.register("iron_shortsword_blade", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILVER_SHORTSWORD_BLADE = ITEMS.register("silver_shortsword_blade", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STEEL_SHORTSWORD_BLADE = ITEMS.register("steel_shortsword_blade", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STONE_SHORTSWORD_BLADE = ITEMS.register("stone_shortsword_blade", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TIN_SHORTSWORD_BLADE = ITEMS.register("tin_shortsword_blade", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BRONZE_KATZBALGER_BLADE = ITEMS.register("bronze_katzbalger_blade", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COPPER_KATZBALGER_BLADE = ITEMS.register("copper_katzbalger_blade", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GOLD_KATZBALGER_BLADE = ITEMS.register("gold_katzbalger_blade", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> IRON_KATZBALGER_BLADE = ITEMS.register("iron_katzbalger_blade", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILVER_KATZBALGER_BLADE = ITEMS.register("silver_katzbalger_blade", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STEEL_KATZBALGER_BLADE = ITEMS.register("steel_katzbalger_blade", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STONE_KATZBALGER_BLADE = ITEMS.register("stone_katzbalger_blade", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TIN_KATZBALGER_BLADE = ITEMS.register("tin_katzbalger_blade", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BRONZE_PIKE_BLADE = ITEMS.register("bronze_pike_blade", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COPPER_PIKE_BLADE = ITEMS.register("copper_pike_blade", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GOLD_PIKE_BLADE = ITEMS.register("gold_pike_blade", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> IRON_PIKE_BLADE = ITEMS.register("iron_pike_blade", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILVER_PIKE_BLADE = ITEMS.register("silver_pike_blade", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STEEL_PIKE_BLADE = ITEMS.register("steel_pike_blade", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STONE_PIKE_BLADE = ITEMS.register("stone_pike_blade", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TIN_PIKE_BLADE = ITEMS.register("tin_pike_blade", () -> new Item(new Item.Properties()));

    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }
}
