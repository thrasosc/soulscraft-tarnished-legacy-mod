package net.pixeldreamstudios.soulscraft_tarnished_legacy.item.armor.client.animator;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.pixeldreamstudios.soulscraft.item.armor.client.animator.SoulsCraftArmorAnimator;
import net.pixeldreamstudios.soulscraft_tarnished_legacy.SoulsCraftTarnishedLegacy;
import org.jetbrains.annotations.NotNull;

public class MalikethArmorrAnimator extends SoulsCraftArmorAnimator {
    @Override
    public @NotNull ResourceLocation getAnimationLocation(ItemStack itemStack) {
        return ResourceLocation.fromNamespaceAndPath(SoulsCraftTarnishedLegacy.MOD_ID, "animations/armor/maliketh_armor.animation.json");
    }
}
