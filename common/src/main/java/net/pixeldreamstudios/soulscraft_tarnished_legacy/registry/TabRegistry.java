package net.pixeldreamstudios.soulscraft_tarnished_legacy.registry;

import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.pixeldreamstudios.soulscraft_tarnished_legacy.SoulsCraftTarnishedLegacy;

public class TabRegistry {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(SoulsCraftTarnishedLegacy.MOD_ID, Registries.CREATIVE_MODE_TAB);
    public static final RegistrySupplier<CreativeModeTab> SOULS_CRAFT_TAB = TABS.register(
            SoulsCraftTarnishedLegacy.MOD_ID + "_tab",
            () -> CreativeTabRegistry.create(
                    Component.translatable("category." + SoulsCraftTarnishedLegacy.MOD_ID),
                    () -> new ItemStack(Items.DIAMOND_SWORD)
            )
    );

    public static void init() {
        TABS.register();
    }
}
