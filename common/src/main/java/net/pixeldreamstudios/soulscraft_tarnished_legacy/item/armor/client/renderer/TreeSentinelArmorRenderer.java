package net.pixeldreamstudios.soulscraft_tarnished_legacy.item.armor.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.pixeldreamstudios.soulscraft.item.armor.client.renderer.SoulsCraftArmorRenderer;
import net.pixeldreamstudios.soulscraft_tarnished_legacy.SoulsCraftTarnishedLegacy;
import net.pixeldreamstudios.soulscraft_tarnished_legacy.item.armor.client.animator.BlaiddArmorAnimator;
import net.pixeldreamstudios.soulscraft_tarnished_legacy.item.armor.client.animator.TreeSentinelArmorAnimator;

public class TreeSentinelArmorRenderer extends SoulsCraftArmorRenderer {

    public TreeSentinelArmorRenderer() {
        super(
                ResourceLocation.fromNamespaceAndPath(SoulsCraftTarnishedLegacy.MOD_ID, "geo/armor/tree_sentinel_armor.geo.json"),
                ResourceLocation.fromNamespaceAndPath(SoulsCraftTarnishedLegacy.MOD_ID, "textures/armor/tree_sentinel.png"),
                TreeSentinelArmorAnimator::new
        );
    }
}