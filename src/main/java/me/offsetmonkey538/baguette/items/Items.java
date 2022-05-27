package me.offsetmonkey538.baguette.items;

import me.offsetmonkey538.baguette.items.tools.LongBaguetteSword;
import me.offsetmonkey538.baguette.items.tools.LongBaguetteToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Items {
    public static final Item BAGUETTE = register(new Baguette(new Item.Settings().group(ItemGroup.FOOD)), "baguette");
    public static final Item LONG_BAGUETTE = register(new LongBaguette(new Item.Settings().group(ItemGroup.FOOD)), "long_baguette");
    public static final Item TNT_BAGUETTE = register(new TntBaguette(new Item.Settings().group(ItemGroup.FOOD)), "tnt_baguette");
    public static final Item WATER_BAGUETTE = register(new WaterBaguette(new Item.Settings().group(ItemGroup.FOOD)), "water_baguette");
    public static final ToolItem LONG_BAGUETTE_SWORD = (ToolItem) register(new LongBaguetteSword(new LongBaguetteToolMaterial(), 4, -2.4F, new Item.Settings().group(ItemGroup.COMBAT)), "long_baguette_sword");

    private static Item register(Item item, String name) {
        Registry.register(Registry.ITEM, new Identifier("baguette", name), item);
        return item;
    }
}
