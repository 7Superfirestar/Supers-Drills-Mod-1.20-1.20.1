package net.superfirestar.supersdrills.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.superfirestar.supersdrills.SupersDrills;
import net.superfirestar.supersdrills.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SupersDrills.MOD_ID);

    public static final RegistryObject<CreativeModeTab> SUPERSDRILLS_TAB = CREATIVE_MODE_TABS.register("supersdrills_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.Ingot_Steel.get()))
                    .title(Component.translatable("creativetab.supersdrills.tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.Steel.get());
                        output.accept(ModBlocks.Steel_Block.get());
                        output.accept(ModItems.Ingot_Steel.get());
                        output.accept(ModItems.Raw_Titanium.get());
                        output.accept(ModItems.Ingot_Titanium.get());

                    })
                    .build());



    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
