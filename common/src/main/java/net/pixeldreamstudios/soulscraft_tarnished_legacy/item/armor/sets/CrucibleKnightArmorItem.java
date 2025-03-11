package net.pixeldreamstudios.soulscraft_tarnished_legacy.item.armor.sets;

import net.minecraft.world.item.Item;
import net.pixeldreamstudios.soulscraft.item.armor.client.dispatcher.SoulsCraftArmorDispatcher;
import net.pixeldreamstudios.soulscraft.item.armor.sets.SoulsCraftArmorItem;
import net.pixeldreamstudios.soulscraft_tarnished_legacy.item.armor.TarnishedArmorMaterials;
import net.pixeldreamstudios.soulscraft_tarnished_legacy.item.armor.client.renderer.CrucibleKnightArmorRenderer;

public class CrucibleKnightArmorItem extends SoulsCraftArmorItem {
    // This is your class where you will setup the AzCommands/Animations you wish to play
    public final SoulsCraftArmorDispatcher DISPATCHER;

    public CrucibleKnightArmorItem(Type type, Item.Properties properties) {
        super(TarnishedArmorMaterials.CRUCIBLE_KNIGHT, type, CrucibleKnightArmorRenderer::new, properties);
        this.DISPATCHER = new SoulsCraftArmorDispatcher();
    }
}
