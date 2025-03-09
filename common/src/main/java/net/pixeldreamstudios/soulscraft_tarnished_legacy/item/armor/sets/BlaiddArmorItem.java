package net.pixeldreamstudios.soulscraft_tarnished_legacy.item.armor.sets;

import net.pixeldreamstudios.soulscraft.item.armor.client.dispatcher.SoulsCraftArmorDispatcher;
import net.pixeldreamstudios.soulscraft.item.armor.sets.SoulsCraftArmorItem;
import net.pixeldreamstudios.soulscraft_tarnished_legacy.item.armor.TarnishedArmorMaterials;
import net.pixeldreamstudios.soulscraft_tarnished_legacy.item.armor.client.renderer.BlaiddArmorRenderer;

public class BlaiddArmorItem extends SoulsCraftArmorItem {
    // This is your class where you will setup the AzCommands/Animations you wish to play
    public final SoulsCraftArmorDispatcher DISPATCHER;

    public BlaiddArmorItem(Type type) {
        super(TarnishedArmorMaterials.BLAIDD_ARMOR, type, BlaiddArmorRenderer::new);
        this.DISPATCHER = new SoulsCraftArmorDispatcher();
    }
}
