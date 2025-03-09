package net.pixeldreamstudios.soulscraft_tarnished_legacy.item.armor.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.pixeldreamstudios.soulscraft.item.armor.client.renderer.SoulsCraftArmorRenderer;
import net.pixeldreamstudios.soulscraft_tarnished_legacy.SoulsCraftTarnishedLegacy;
import net.pixeldreamstudios.soulscraft_tarnished_legacy.item.armor.client.animator.BlaiddArmorAnimator;
import net.pixeldreamstudios.soulscraft_tarnished_legacy.item.armor.client.animator.CrucibleKnightArmorAnimator;

public class CrucibleKnightArmorRenderer extends SoulsCraftArmorRenderer {

    public CrucibleKnightArmorRenderer() {
        super(
                ResourceLocation.fromNamespaceAndPath(SoulsCraftTarnishedLegacy.MOD_ID, "geo/armor/crucible_knight_armor.geo.json"),
                ResourceLocation.fromNamespaceAndPath(SoulsCraftTarnishedLegacy.MOD_ID, "textures/armor/crucible_knight_armor.png"),
                CrucibleKnightArmorAnimator::new
        );
    }
}