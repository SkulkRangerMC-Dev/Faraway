package com.sculkrange.faraway.item;

import com.sculkrange.faraway.Faraway;
import com.sculkrange.faraway.block.ArtifactBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class FarawayCollectionTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Faraway.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("tutorial_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Artifacts.TOPAZ.get()))
                    .title(Component.translatable("farawaytab.collection_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(Artifacts.TOPAZ.get());
                        pOutput.accept(Artifacts.RAW_TOPAZ.get());
                        pOutput.accept(ArtifactBlocks.MOD_PORTAL.get());

                        pOutput.accept(Items.DIAMOND);


                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
