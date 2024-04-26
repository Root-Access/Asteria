package com.github.ninjakid.asteriamod.item;

import com.github.ninjakid.asteriamod.AsteriaMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.awt.*;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AsteriaMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ASTERIA_TAB = CREATIVE_MODE_TABS.register("asteria_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CRITBRINGER.get()))
                    .title(Component.translatable("creativetab.asteria_tab"))
                    .displayItems(((itemDisplayParameters, output) -> {
                        output.accept(ModItems.STORMBERRY.get());
                        output.accept(ModItems.CRITBRINGER.get());
                        output.accept(ModItems.HANDLE.get());
                        output.accept(ModItems.SHARD.get());
                    }))
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
