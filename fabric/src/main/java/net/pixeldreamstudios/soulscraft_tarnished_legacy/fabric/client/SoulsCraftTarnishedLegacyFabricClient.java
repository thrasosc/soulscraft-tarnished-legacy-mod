package net.pixeldreamstudios.soulscraft_tarnished_legacy.fabric.client;

import net.fabricmc.api.ClientModInitializer;
import net.pixeldreamstudios.soulscraft.registry.SoulsCraftItemRegistry;
import net.pixeldreamstudios.soulscraft_tarnished_legacy.SoulsCraftTarnishedLegacy;

import static net.pixeldreamstudios.soulscraft_tarnished_legacy.SoulsCraftTarnishedLegacy.MOD_ID;

public class SoulsCraftTarnishedLegacyFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        SoulsCraftTarnishedLegacy.initClient();
        SoulsCraftItemRegistry.initClient(MOD_ID);
    }
}
