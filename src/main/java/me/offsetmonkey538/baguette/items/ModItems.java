package me.offsetmonkey538.baguette.items;

import me.offsetmonkey538.baguette.BaguetteMain;
import me.offsetmonkey538.baguette.items.tools.LongBaguetteSword;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public enum Items {
        BAGUETTE(new Baguette(new Item.Settings().group(ItemGroup.FOOD)), "baguette"),
        LONG_BAGUETTE(new LongBaguette(new Item.Settings().group(ItemGroup.FOOD)), "long_baguette"),
        TNT_BAGUETTE(new TntBaguette(new Item.Settings().group(ItemGroup.FOOD)), "tnt_baguette"),
        CHARGED_TNT_BAGUETTE(new ChargedTntBaguette(new Item.Settings().group(ItemGroup.FOOD)), "charged_tnt_baguette"),
        WATER_BAGUETTE(new WaterBaguette(new Item.Settings().group(ItemGroup.FOOD)), "water_baguette"),
        LONG_BAGUETTE_SWORD(new LongBaguetteSword(new Item.Settings().group(ItemGroup.COMBAT)), "long_baguette_sword"),
        EASTEREGG_BAGUETTE(new EastereggBaguette(new Item.Settings().group(ItemGroup.FOOD)), "easteregg_baguette");

        private final Item item;
        private final String name;

        Items(Item item, String name) {
            this.item = item;
            this.name = name;
        }

        public Item getItem() {
            return item;
        }
    }

    public static void register() {
        for (Items item : Items.values()) {
            Registry.register(Registry.ITEM, new Identifier(BaguetteMain.MOD_ID, item.name), item.item);
        }
    }
}
