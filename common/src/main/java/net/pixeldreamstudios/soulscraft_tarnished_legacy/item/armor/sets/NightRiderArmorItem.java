package net.pixeldreamstudios.soulscraft_tarnished_legacy.item.armor.sets;

import net.minecraft.world.item.Item;
import net.pixeldreamstudios.soulscraft.item.armor.client.dispatcher.SoulsCraftArmorDispatcher;
import net.pixeldreamstudios.soulscraft.item.armor.sets.SoulsCraftArmorItem;
import net.pixeldreamstudios.soulscraft.registry.SoulsCraftItemRegistry;
import net.pixeldreamstudios.soulscraft_tarnished_legacy.item.armor.TarnishedArmorMaterials;
import net.pixeldreamstudios.soulscraft_tarnished_legacy.item.armor.client.renderer.NightRiderArmorRenderer;

public class NightRiderArmorItem extends SoulsCraftArmorItem {
    // This is your class where you will setup the AzCommands/Animations you wish to play
    public final SoulsCraftArmorDispatcher DISPATCHER;

    public NightRiderArmorItem(Type type) {
        super(TarnishedArmorMaterials.NIGHT_RIDER, type, NightRiderArmorRenderer::new, new Item.Properties().arch$tab(SoulsCraftItemRegistry.SOULSCRAFT_TARNISHED_LEGACY_TAB));
        this.DISPATCHER = new SoulsCraftArmorDispatcher();
    }
}
