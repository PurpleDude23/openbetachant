package io.github.PurpleDude23.betachantmod.events.init;


import io.github.PurpleDude23.betachantmod.items.BetaSharpness;
import net.mine_diver.unsafeevents.listener.EventListener;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;
import net.modificationstation.stationapi.api.event.registry.ItemRegistryEvent;

public class ItemListener {
    public static Item[] items;
    public static Item BETASHARPNESS;

    @EventListener
    public void registerItems(ItemRegistryEvent event) {
        BETASHARPNESS = new BetaSharpness(InitListener.NAMESPACE.id("betasharpness"), ToolMaterial.DIAMOND).setTranslationKey(InitListener.NAMESPACE, "betasharpness");

        items = new Item[]{
                BETASHARPNESS
        };
    }
}