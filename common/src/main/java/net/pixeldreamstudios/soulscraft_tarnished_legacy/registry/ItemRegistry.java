package net.pixeldreamstudios.soulscraft_tarnished_legacy.registry;

import net.minecraft.world.item.ArmorItem;
import net.pixeldreamstudios.soulscraft.registry.SoulsCraftItemRegistry;
import net.pixeldreamstudios.soulscraft_tarnished_legacy.SoulsCraftTarnishedLegacy;
import net.pixeldreamstudios.soulscraft_tarnished_legacy.item.armor.sets.BlaiddArmorItem;
import net.pixeldreamstudios.soulscraft_tarnished_legacy.item.armor.sets.NightRiderArmorItem;

public class ItemRegistry {
    public static void init() {
        SoulsCraftItemRegistry.registerItem(SoulsCraftTarnishedLegacy.MOD_ID, "night_rider_helmet", () -> new NightRiderArmorItem(ArmorItem.Type.HELMET));
        SoulsCraftItemRegistry.registerItem(SoulsCraftTarnishedLegacy.MOD_ID, "night_rider_chestplate", () -> new NightRiderArmorItem(ArmorItem.Type.CHESTPLATE));
        SoulsCraftItemRegistry.registerItem(SoulsCraftTarnishedLegacy.MOD_ID, "night_rider_leggings", () -> new NightRiderArmorItem(ArmorItem.Type.LEGGINGS));
        SoulsCraftItemRegistry.registerItem(SoulsCraftTarnishedLegacy.MOD_ID, "night_rider_boots", () -> new NightRiderArmorItem(ArmorItem.Type.BOOTS));

        SoulsCraftItemRegistry.registerItem(SoulsCraftTarnishedLegacy.MOD_ID, "blaidd_helmet", () -> new BlaiddArmorItem(ArmorItem.Type.HELMET));
        SoulsCraftItemRegistry.registerItem(SoulsCraftTarnishedLegacy.MOD_ID, "blaidd_chestplate", () -> new BlaiddArmorItem(ArmorItem.Type.CHESTPLATE));
        SoulsCraftItemRegistry.registerItem(SoulsCraftTarnishedLegacy.MOD_ID, "blaidd_leggings", () -> new BlaiddArmorItem(ArmorItem.Type.LEGGINGS));
        SoulsCraftItemRegistry.registerItem(SoulsCraftTarnishedLegacy.MOD_ID, "blaidd_boots", () -> new BlaiddArmorItem(ArmorItem.Type.BOOTS));
    }
}
