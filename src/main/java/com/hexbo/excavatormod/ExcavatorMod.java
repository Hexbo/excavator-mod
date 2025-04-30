
package com.hexbo.excavatormod;

import com.hexbo.excavatormod.enchantment.ModEnchantments;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ExcavatorMod.MODID)
public class ExcavatorMod {
    public static final String MODID = "excavatormod";

    public ExcavatorMod() {
        var modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModEnchantments.ENCHANTMENTS.register(modEventBus);
        modEventBus.addListener(this::setup);
        modEventBus.addListener(this::doClientStuff);
    }

    private void setup(final FMLCommonSetupEvent event) {}
    private void doClientStuff(final FMLClientSetupEvent event) {}
}
