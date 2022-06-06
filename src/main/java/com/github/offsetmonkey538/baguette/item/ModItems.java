package com.github.offsetmonkey538.baguette.item;

import com.github.offsetmonkey538.baguette.BaguetteMain;
import com.github.offsetmonkey538.baguette.item.baguettes.*;
import com.github.offsetmonkey538.baguette.item.baguettes.elements.AirBaguette;
import com.github.offsetmonkey538.baguette.item.baguettes.elements.FireBaguette;
import com.github.offsetmonkey538.baguette.item.baguettes.elements.WaterBaguette;
import com.github.offsetmonkey538.baguette.item.tools.LongBaguetteSword;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.HashMap;
import java.util.Map;

public final class ModItems {
    private static final Map<String, Item> ITEMS = new HashMap<>();


    public static final Item BAGUETTE             = addItem(new Baguette(           new Item.Settings().group(ItemGroup.FOOD).food(ModFoodComponents.BAGUETTE)),             "baguette");
    public static final Item LONG_BAGUETTE        = addItem(new LongBaguette(       new Item.Settings().group(ItemGroup.FOOD).food(ModFoodComponents.LONG_BAGUETTE)),        "long_baguette");
    public static final Item TNT_BAGUETTE         = addItem(new TntBaguette(        new Item.Settings().group(ItemGroup.FOOD).food(ModFoodComponents.TNT_BAGUETTE)),         "tnt_baguette");
    public static final Item CHARGED_TNT_BAGUETTE = addItem(new ChargedTntBaguette( new Item.Settings().group(ItemGroup.FOOD).food(ModFoodComponents.CHARGED_TNT_BAGUETTE)), "charged_tnt_baguette");
    public static final Item WATER_BAGUETTE       = addItem(new WaterBaguette(      new Item.Settings().group(ItemGroup.FOOD).food(ModFoodComponents.WATER_BAGUETTE)),       "water_baguette");
    public static final Item BIRTHDAY_BAGUETTE    = addItem(new BirthdayBaguette(   new Item.Settings().group(ItemGroup.FOOD).food(ModFoodComponents.BIRTHDAY_BAGUETTE)),    "birthday_baguette");
    public static final Item FIRE_BAGUETTE        = addItem(new FireBaguette(       new Item.Settings().group(ItemGroup.FOOD).food(ModFoodComponents.FIRE_BAGUETTE)),        "fire_baguette");
    public static final Item AIR_BAGUETTE         = addItem(new AirBaguette(        new Item.Settings().group(ItemGroup.FOOD).food(ModFoodComponents.AIR_BAGUETTE)),         "air_baguette");
    public static final Item LONG_BAGUETTE_SWORD  = addItem(new LongBaguetteSword(  new Item.Settings().group(ItemGroup.COMBAT)),                                            "long_baguette_sword");
    public static final Item EASTEREGG_BAGUETTE   = addItem(new EastereggBaguette(  new Item.Settings().group(ItemGroup.MISC)),                                              "easteregg_baguette");


    private ModItems() {

    }

    private static Item addItem(Item item, String name) {
        ITEMS.put(name, item);
        return item;
    }

    public static void register() {
        for (Map.Entry<String, Item> entry : ITEMS.entrySet()) {
            Registry.register(Registry.ITEM, new Identifier(BaguetteMain.MOD_ID, entry.getKey()), entry.getValue());
        }
    }
}
