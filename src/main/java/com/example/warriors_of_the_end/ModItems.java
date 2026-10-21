package com.example.warriors_of_the_end;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class ModItems {
    // Armor materials
    public static final ArmorMaterial ENDERITE_ARMOR_MATERIAL = new ArmorMaterial() {
        @Override
        public int getDurability(ArmorItem.Type type) {
            return new int[]{13, 15, 16, 11}[type.ordinal()] * 37;
        }

        @Override
        public int getProtection(ArmorItem.Type type) {
            return new int[]{3, 6, 8, 3}[type.ordinal()];
        }

        @Override
        public int getEnchantability() {
            return 15;
        }

        @Override
        public SoundEvent getEquipSound() {
            return SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return Ingredient.ofItems(Items.ENDER_PEARL);
        }

        @Override
        public String getName() {
            return "enderite";
        }

        @Override
        public float getToughness() {
            return 2.0f;
        }

        @Override
        public float getKnockbackResistance() {
            return 0.1f;
        }
    };

    // Tool materials
    public static final ToolMaterial ENDERITE_TOOL_MATERIAL = new ToolMaterial() {
        @Override
        public int getDurability() {
            return 2031;
        }

        @Override
        public float getMiningSpeedMultiplier() {
            return 8.0f;
        }

        @Override
        public float getAttackDamage() {
            return 3.0f;
        }

        @Override
        public int getMiningLevel() {
            return 4;
        }

        @Override
        public int getEnchantability() {
            return 15;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return Ingredient.ofItems(Items.ENDER_PEARL);
        }
    };

    // Armor items
    public static final Item ENDERITE_HELMET = new ArmorItem(ENDERITE_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings().fireproof());
    public static final Item ENDERITE_CHESTPLATE = new ArmorItem(ENDERITE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings().fireproof());
    public static final Item ENDERITE_LEGGINGS = new ArmorItem(ENDERITE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings().fireproof());
    public static final Item ENDERITE_BOOTS = new ArmorItem(ENDERITE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings().fireproof());

    // Weapon items
    public static final Item ENDERITE_SWORD = new SwordItem(ENDERITE_TOOL_MATERIAL, 3, -2.4f, new Item.Settings().fireproof());
    public static final Item ENDERITE_AXE = new AxeItem(ENDERITE_TOOL_MATERIAL, 5.0f, -3.0f, new Item.Settings().fireproof());
}