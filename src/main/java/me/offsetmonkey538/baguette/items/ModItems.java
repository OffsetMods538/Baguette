package me.offsetmonkey538.baguette.items;

import me.offsetmonkey538.baguette.BaguetteMain;
import me.offsetmonkey538.baguette.items.baguettes.*;
import me.offsetmonkey538.baguette.items.tools.LongBaguetteSword;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.HashMap;
import java.util.Map;

public class ModItems {
    private static final Map<String, Item> items = new HashMap<>();


    public static final Item BAGUETTE             = addItem(new Baguette(           new Item.Settings().group(ItemGroup.FOOD)),   "baguette");
    public static final Item LONG_BAGUETTE        = addItem(new LongBaguette(       new Item.Settings().group(ItemGroup.FOOD)),   "long_baguette");
    public static final Item TNT_BAGUETTE         = addItem(new TntBaguette(        new Item.Settings().group(ItemGroup.FOOD)),   "tnt_baguette");
    public static final Item CHARGED_TNT_BAGUETTE = addItem(new ChargedTntBaguette( new Item.Settings().group(ItemGroup.FOOD)),   "charged_tnt_baguette");
    public static final Item WATER_BAGUETTE       = addItem(new WaterBaguette(      new Item.Settings().group(ItemGroup.FOOD)),   "water_baguette");
    public static final Item LONG_BAGUETTE_SWORD  = addItem(new LongBaguetteSword(  new Item.Settings().group(ItemGroup.COMBAT)), "long_baguette_sword");
    public static final Item EASTEREGG_BAGUETTE   = addItem(new EastereggBaguette(  new Item.Settings().group(ItemGroup.MISC)),   "easteregg_baguette");
    public static final Item BIRTHDAY_BAGUETTE    = addItem(new BirthdayBaguette(   new Item.Settings().group(ItemGroup.FOOD)),   "birthday_baguette");


    private static Item addItem(Item item, String name) {
        items.put(name, item);
        return item;
    }

    public static void register() {
        for (Map.Entry<String, Item> entry : items.entrySet()) {
            Registry.register(Registry.ITEM, new Identifier(BaguetteMain.MOD_ID, entry.getKey()), entry.getValue());
        }
    }
}
