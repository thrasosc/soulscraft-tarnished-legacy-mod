package net.pixeldreamstudios.soulscraft_tarnished_legacy.item.armor.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.pixeldreamstudios.soulscraft.item.armor.client.renderer.SoulsCraftArmorRenderer;
import net.pixeldreamstudios.soulscraft_tarnished_legacy.SoulsCraftTarnishedLegacy;
import net.pixeldreamstudios.soulscraft_tarnished_legacy.item.armor.client.animator.BlaiddArmorAnimator;
import net.pixeldreamstudios.soulscraft_tarnished_legacy.item.armor.client.animator.NightRiderArmorAnimator;

public class BlaiddArmorRenderer extends SoulsCraftArmorRenderer {

    public BlaiddArmorRenderer() {
        super(
                ResourceLocation.fromNamespaceAndPath(SoulsCraftTarnishedLegacy.MOD_ID, "geo/armor/blaidd_armor.geo.json"),
                ResourceLocation.fromNamespaceAndPath(SoulsCraftTarnishedLegacy.MOD_ID, "textures/armor/blaidd_armor.png"),
                BlaiddArmorAnimator::new
        );
    }
}