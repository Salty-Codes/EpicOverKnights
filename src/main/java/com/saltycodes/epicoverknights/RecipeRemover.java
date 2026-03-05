package com.saltycodes.epicoverknights;

import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.event.AddReloadListenerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.item.crafting.RecipeManager;
import net.minecraft.world.item.crafting.Recipe;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Mod.EventBusSubscriber(modid = EpicOverKnights.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class RecipeRemover {

    private static final Set<ResourceLocation> RECIPES_TO_REMOVE = Set.of(
        ResourceLocation.fromNamespaceAndPath("magistuarmory", "copper_stylet"),
        ResourceLocation.fromNamespaceAndPath("magistuarmory", "diamond_stylet"),
        ResourceLocation.fromNamespaceAndPath("magistuarmory", "netherite_stylet"),
        ResourceLocation.fromNamespaceAndPath("magistuarmory", "jousting_boots"),
        ResourceLocation.fromNamespaceAndPath("magistuarmory", "jousting_leggings"),
        ResourceLocation.fromNamespaceAndPath("magistuarmory", "jousting_chestplate"),
        ResourceLocation.fromNamespaceAndPath("magistuarmory", "stechhelm"),
        ResourceLocation.fromNamespaceAndPath("magistuarmory", "steel_plate"),
        ResourceLocation.fromNamespaceAndPath("magistuarmory", "small_steel_plate"),
        ResourceLocation.fromNamespaceAndPath("magistuarmory", "steel_ingot_blasting"),
        ResourceLocation.fromNamespaceAndPath("magistuarmory", "steel_ingot_to_steel_nuggets"),
        ResourceLocation.fromNamespaceAndPath("magistuarmory", "steel_nuggets_to_steel_ingot"),
        ResourceLocation.fromNamespaceAndPath("magistuarmory", "furnace/steel_ingot_blasting"),
        ResourceLocation.fromNamespaceAndPath("magistuarmory", "furnace/steel_nugget_blasting")
    );

    @SubscribeEvent
    public static void onServerStarting(ServerStartingEvent event) {
        RecipeManager recipeManager = event.getServer().getRecipeManager();
        Map<ResourceLocation, Recipe<?>> recipes = new HashMap<>();

        // Collect all recipes except the ones we want to remove
        recipeManager.getRecipes().forEach(recipe -> {
            if (!RECIPES_TO_REMOVE.contains(recipe.getId())) {
                recipes.put(recipe.getId(), recipe);
            }
        });

        recipeManager.replaceRecipes(recipes.values());
    }
}

