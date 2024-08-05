package net.progress.bleachersmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.progress.bleachersmod.BleachersMod;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BleachersMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ZANPAKUTO_WEAPONS = CREATIVE_MODE_TABS.register("zanpakuto_weapons",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ZANPAKUTO.get()))
                    .title(Component.translatable("creativetab.zanpakuto_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.ZANPAKUTO.get());
                        output.accept(Items.NETHERITE_SWORD);
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
