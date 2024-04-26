package com.github.ninjakid.asteriamod.item;

import com.github.ninjakid.asteriamod.AsteriaMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, AsteriaMod.MOD_ID);

public static final RegistryObject<Item> STORMBERRY = ITEMS.register("stormberry",
        () -> new Item(new Item.Properties()));
public static final RegistryObject<Item> SHARD = ITEMS.register("shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HANDLE = ITEMS.register("handle",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CRITBRINGER = ITEMS.register("critbringer",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
