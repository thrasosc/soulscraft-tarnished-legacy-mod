package net.pixeldreamstudios.soulscraft_tarnished_legacy.item.armor.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.pixeldreamstudios.soulscraft.item.armor.client.renderer.SoulsCraftArmorRenderer;
import net.pixeldreamstudios.soulscraft_tarnished_legacy.SoulsCraftTarnishedLegacy;
import net.pixeldreamstudios.soulscraft_tarnished_legacy.item.armor.client.animator.BlaiddArmorAnimator;
import net.pixeldreamstudios.soulscraft_tarnished_legacy.item.armor.client.animator.MalikethArmorrAnimator;

public class MalikethArmorRenderer extends SoulsCraftArmorRenderer {

    public MalikethArmorRenderer() {
        super(
                ResourceLocation.fromNamespaceAndPath(SoulsCraftTarnishedLegacy.MOD_ID, "geo/armor/maliketh_armor.geo.json"),
                ResourceLocation.fromNamespaceAndPath(SoulsCraftTarnishedLegacy.MOD_ID, "textures/armor/maliketh_armor.png"),
                MalikethArmorrAnimator::new
        );
    }
}