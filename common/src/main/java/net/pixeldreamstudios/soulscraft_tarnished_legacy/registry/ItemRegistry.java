package net.pixeldreamstudios.soulscraft_tarnished_legacy.registry;

import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.pixeldreamstudios.soulscraft.registry.SoulsCraftItemRegistry;
import net.pixeldreamstudios.soulscraft_tarnished_legacy.SoulsCraftTarnishedLegacy;
import net.pixeldreamstudios.soulscraft_tarnished_legacy.item.armor.sets.*;

public class ItemRegistry {
    public static void init() {

        Item.Properties defaultProps = new Item.Properties().durability(390).stacksTo(1).arch$tab(TabRegistry.SOULS_CRAFT_TAB);
        Item.Properties RareProps = new Item.Properties().durability(434).stacksTo(1).rarity(Rarity.RARE).arch$tab(TabRegistry.SOULS_CRAFT_TAB);
        Item.Properties EpicProps = new Item.Properties().durability(500).stacksTo(1).rarity(Rarity.EPIC).arch$tab(TabRegistry.SOULS_CRAFT_TAB);

        SoulsCraftItemRegistry.registerItem(SoulsCraftTarnishedLegacy.MOD_ID, "night_rider_helmet", () -> new NightRiderArmorItem(ArmorItem.Type.HELMET, defaultProps));
        SoulsCraftItemRegistry.registerItem(SoulsCraftTarnishedLegacy.MOD_ID, "night_rider_chestplate", () -> new NightRiderArmorItem(ArmorItem.Type.CHESTPLATE, defaultProps));
        SoulsCraftItemRegistry.registerItem(SoulsCraftTarnishedLegacy.MOD_ID, "night_rider_leggings", () -> new NightRiderArmorItem(ArmorItem.Type.LEGGINGS, defaultProps));
        SoulsCraftItemRegistry.registerItem(SoulsCraftTarnishedLegacy.MOD_ID, "night_rider_boots", () -> new NightRiderArmorItem(ArmorItem.Type.BOOTS, defaultProps));

        SoulsCraftItemRegistry.registerItem(SoulsCraftTarnishedLegacy.MOD_ID, "blaidd_helmet", () -> new BlaiddArmorItem(ArmorItem.Type.HELMET, defaultProps));
        SoulsCraftItemRegistry.registerItem(SoulsCraftTarnishedLegacy.MOD_ID, "blaidd_chestplate", () -> new BlaiddArmorItem(ArmorItem.Type.CHESTPLATE, defaultProps));
        SoulsCraftItemRegistry.registerItem(SoulsCraftTarnishedLegacy.MOD_ID, "blaidd_leggings", () -> new BlaiddArmorItem(ArmorItem.Type.LEGGINGS, defaultProps));
        SoulsCraftItemRegistry.registerItem(SoulsCraftTarnishedLegacy.MOD_ID, "blaidd_boots", () -> new BlaiddArmorItem(ArmorItem.Type.BOOTS, defaultProps));

        SoulsCraftItemRegistry.registerItem(SoulsCraftTarnishedLegacy.MOD_ID, "crucible_knight_helmet", () -> new CrucibleKnightArmorItem(ArmorItem.Type.HELMET, defaultProps));
        SoulsCraftItemRegistry.registerItem(SoulsCraftTarnishedLegacy.MOD_ID, "crucible_knight_chestplate", () -> new CrucibleKnightArmorItem(ArmorItem.Type.CHESTPLATE, defaultProps));
        SoulsCraftItemRegistry.registerItem(SoulsCraftTarnishedLegacy.MOD_ID, "crucible_knight_leggings", () -> new CrucibleKnightArmorItem(ArmorItem.Type.LEGGINGS, defaultProps));
        SoulsCraftItemRegistry.registerItem(SoulsCraftTarnishedLegacy.MOD_ID, "crucible_knight_boots", () -> new CrucibleKnightArmorItem(ArmorItem.Type.BOOTS, defaultProps));

        SoulsCraftItemRegistry.registerItem(SoulsCraftTarnishedLegacy.MOD_ID, "crucible_knight_variant_helmet", () -> new CrucibleKnightVariantArmorItem(ArmorItem.Type.HELMET, defaultProps));
        SoulsCraftItemRegistry.registerItem(SoulsCraftTarnishedLegacy.MOD_ID, "crucible_knight_variant_chestplate", () -> new CrucibleKnightVariantArmorItem(ArmorItem.Type.CHESTPLATE, defaultProps));
        SoulsCraftItemRegistry.registerItem(SoulsCraftTarnishedLegacy.MOD_ID, "crucible_knight_variant_leggings", () -> new CrucibleKnightVariantArmorItem(ArmorItem.Type.LEGGINGS, defaultProps));
        SoulsCraftItemRegistry.registerItem(SoulsCraftTarnishedLegacy.MOD_ID, "crucible_knight_variant_boots", () -> new CrucibleKnightVariantArmorItem(ArmorItem.Type.BOOTS, defaultProps));

        SoulsCraftItemRegistry.registerItem(SoulsCraftTarnishedLegacy.MOD_ID, "tree_sentinel_helmet", () -> new TreeSentinelArmorItem(ArmorItem.Type.HELMET, defaultProps));
        SoulsCraftItemRegistry.registerItem(SoulsCraftTarnishedLegacy.MOD_ID, "tree_sentinel_chestplate", () -> new TreeSentinelArmorItem(ArmorItem.Type.CHESTPLATE, defaultProps));
        SoulsCraftItemRegistry.registerItem(SoulsCraftTarnishedLegacy.MOD_ID, "tree_sentinel_leggings", () -> new TreeSentinelArmorItem(ArmorItem.Type.LEGGINGS, defaultProps));
        SoulsCraftItemRegistry.registerItem(SoulsCraftTarnishedLegacy.MOD_ID, "tree_sentinel_boots", () -> new TreeSentinelArmorItem(ArmorItem.Type.BOOTS, defaultProps));

        SoulsCraftItemRegistry.registerItem(SoulsCraftTarnishedLegacy.MOD_ID, "maliketh_helmet", () -> new MalikethArmorItem(ArmorItem.Type.HELMET, defaultProps));
        SoulsCraftItemRegistry.registerItem(SoulsCraftTarnishedLegacy.MOD_ID, "maliketh_chestplate", () -> new MalikethArmorItem(ArmorItem.Type.CHESTPLATE, defaultProps));
        SoulsCraftItemRegistry.registerItem(SoulsCraftTarnishedLegacy.MOD_ID, "maliketh_leggings", () -> new MalikethArmorItem(ArmorItem.Type.LEGGINGS, defaultProps));
        SoulsCraftItemRegistry.registerItem(SoulsCraftTarnishedLegacy.MOD_ID, "maliketh_boots", () -> new MalikethArmorItem(ArmorItem.Type.BOOTS, defaultProps));
    }
}
