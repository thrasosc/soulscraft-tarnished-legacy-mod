package net.pixeldreamstudios.soulscraft_tarnished_legacy.item.armor.sets;

import net.minecraft.world.item.Item;
import net.pixeldreamstudios.soulscraft.item.armor.client.dispatcher.SoulsCraftArmorDispatcher;
import net.pixeldreamstudios.soulscraft.item.armor.sets.SoulsCraftArmorItem;
import net.pixeldreamstudios.soulscraft_tarnished_legacy.item.armor.TarnishedArmorMaterials;
import net.pixeldreamstudios.soulscraft_tarnished_legacy.item.armor.client.renderer.BlaiddArmorRenderer;
import net.pixeldreamstudios.soulscraft_tarnished_legacy.item.armor.client.renderer.MalikethArmorRenderer;

public class MalikethArmorItem extends SoulsCraftArmorItem {
    // This is your class where you will setup the AzCommands/Animations you wish to play
    public final SoulsCraftArmorDispatcher DISPATCHER;

    public MalikethArmorItem(Type type, Item.Properties properties) {
        super(TarnishedArmorMaterials.MALIKETH_ARMOR, type, MalikethArmorRenderer::new, properties);
        this.DISPATCHER = new SoulsCraftArmorDispatcher();
    }
}
