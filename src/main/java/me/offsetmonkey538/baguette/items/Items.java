package me.offsetmonkey538.baguette.items;

import me.offsetmonkey538.baguette.items.tools.LongBaguetteSword;
import me.offsetmonkey538.baguette.items.tools.LongBaguetteToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Items {
    public static final Item BAGUETTE = new Baguette(new Item.Settings().group(ItemGroup.FOOD));
    public static final Item LONG_BAGUETTE = new LongBaguette(new Item.Settings().group(ItemGroup.FOOD));
    public static final Item TNT_BAGUETTE = new TntBaguette(new Item.Settings().group(ItemGroup.FOOD));
    public static final Item WATER_BAGUETTE = new WaterBaguette(new Item.Settings().group(ItemGroup.FOOD));
    public static final ToolItem LONG_BAGUETTE_SWORD = new LongBaguetteSword(new LongBaguetteToolMaterial(), 4, -2.4F, new Item.Settings().group(ItemGroup.COMBAT));
    public static void register() {
        Registry.register(Registry.ITEM, new Identifier("baguette", "baguette"), BAGUETTE);
        Registry.register(Registry.ITEM, new Identifier("baguette", "long_baguette"), LONG_BAGUETTE);
        Registry.register(Registry.ITEM, new Identifier("baguette", "tnt_baguette"), TNT_BAGUETTE);
        Registry.register(Registry.ITEM, new Identifier("baguette", "water_baguette"), WATER_BAGUETTE);
        Registry.register(Registry.ITEM, new Identifier("baguette", "long_baguette_sword"), LONG_BAGUETTE_SWORD);
    }
}
