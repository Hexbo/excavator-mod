
package com.hexbo.excavatormod.enchantment;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.entity.EquipmentSlot;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.RegistryObject;
import com.hexbo.excavatormod.ExcavatorMod;

public class ModEnchantments {
    public static final DeferredRegister<Enchantment> ENCHANTMENTS =
        DeferredRegister.create(Registries.ENCHANTMENT, ExcavatorMod.MODID);

    public static final RegistryObject<Enchantment> EXCAVATOR = ENCHANTMENTS.register(
        "excavator", () -> new ExcavatorEnchantment()
    );
}
