package net.vbma.hombrewfuture.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.vbma.hombrewfuture.HombrewFuture;

public class ModItems
{
    // Mod Items Registry
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(HombrewFuture.MODID);


    // Register an Modded Item
    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
