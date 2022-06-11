package com.github.offsetmonkey538.baguette.item;

import com.github.offsetmonkey538.baguette.item.baguettes.*;
import com.github.offsetmonkey538.baguette.item.baguettes.elements.*;
import com.github.offsetmonkey538.baguette.item.tools.LongBaguetteSword;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.github.offsetmonkey538.baguette.BaguetteMain.MOD_ID;

public final class ModItems {

    public static final Item BAGUETTE             = registerItem(new Baguette(           new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.BAGUETTE)),             "baguette");
    public static final Item LONG_BAGUETTE        = registerItem(new LongBaguette(       new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.LONG_BAGUETTE)),        "long_baguette");
    public static final Item TNT_BAGUETTE         = registerItem(new TntBaguette(        new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.TNT_BAGUETTE)),         "tnt_baguette");
    public static final Item WATER_BAGUETTE       = registerItem(new WaterBaguette(      new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.WATER_BAGUETTE)),       "water_baguette");
    public static final Item EASTEREGG_BAGUETTE   = registerItem(new EastereggBaguette(  new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.EASTEREGG_BAGUETTE)),   "easteregg_baguette");
    public static final Item CHARGED_TNT_BAGUETTE = registerItem(new ChargedTntBaguette( new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.CHARGED_TNT_BAGUETTE)), "charged_tnt_baguette");
    public static final Item BIRTHDAY_BAGUETTE    = registerItem(new BirthdayBaguette(   new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.BIRTHDAY_BAGUETTE)),    "birthday_baguette");
    public static final Item FIRE_BAGUETTE        = registerItem(new FireBaguette(       new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.FIRE_BAGUETTE)),        "fire_baguette");
    public static final Item AIR_BAGUETTE         = registerItem(new AirBaguette(        new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.AIR_BAGUETTE)),         "air_baguette");
    public static final Item EARTH_BAGUETTE       = registerItem(new EarthBaguette(      new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.EARTH_BAGUETTE)),       "earth_baguette");
    public static final Item GOLDEN_BAGUETTE      = registerItem(new GoldenBaguette(     new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.GOLDEN_BAGUETTE)),      "golden_baguette");
    public static final Item DEATH_BAGUETTE       = registerItem(new DeathBaguette(      new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.DEATH_BAGUETTE)),       "death_baguette");
    public static final Item FROG_BAGUETTE        = registerItem(new FrogBaguette(       new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.FROG_BAGUETTE)),        "frog_baguette");
    public static final Item LONG_BAGUETTE_SWORD  = registerItem(new LongBaguetteSword(  new FabricItemSettings().group(ItemGroup.COMBAT)),                                            "long_baguette_sword");

    public static final Item FOR_ALL_ELEMENTAL_BAGUETTE_ADVANCEMENT = registerItem(new Item(new FabricItemSettings()), "all_elemental_baguettes_advancement");

    private ModItems() {

    }

    private static Item registerItem(Item item, String name) {
        return Registry.register(Registry.ITEM, new Identifier(MOD_ID, name), item);
    }

    public static void register() {
        // Registers all items because this class is now loaded
    }
}
