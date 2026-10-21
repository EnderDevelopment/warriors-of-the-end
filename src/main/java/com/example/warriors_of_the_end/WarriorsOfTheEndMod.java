package com.example.warriors_of_the_end;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class WarriorsOfTheEndMod implements ModInitializer {
    public static final String MOD_ID = "warriors_of_the_end";

    @Override
    public void onInitialize() {
        // Register items
        registerItems();

        // Add items to the combat tab
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(content -> {
            content.add(ModItems.ENDERITE_HELMET);
            content.add(ModItems.ENDERITE_CHESTPLATE);
            content.add(ModItems.ENDERITE_LEGGINGS);
            content.add(ModItems.ENDERITE_BOOTS);
            content.add(ModItems.ENDERITE_SWORD);
            content.add(ModItems.ENDERITE_AXE);
        });
    }

    private void registerItems() {
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "enderite_helmet"), ModItems.ENDERITE_HELMET);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "enderite_chestplate"), ModItems.ENDERITE_CHESTPLATE);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "enderite_leggings"), ModItems.ENDERITE_LEGGINGS);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "enderite_boots"), ModItems.ENDERITE_BOOTS);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "enderite_sword"), ModItems.ENDERITE_SWORD);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "enderite_axe"), ModItems.ENDERITE_AXE);
    }
}