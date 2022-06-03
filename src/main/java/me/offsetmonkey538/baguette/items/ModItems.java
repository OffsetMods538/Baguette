package me.offsetmonkey538.baguette.items;

import me.offsetmonkey538.baguette.BaguetteMain;
import me.offsetmonkey538.baguette.items.baguettes.*;
import me.offsetmonkey538.baguette.items.tools.LongBaguetteSword;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public enum Items {
        BAGUETTE(new Baguette(new Item.Settings().group(ItemGroup.FOOD).food(ModFoodComponents.BAGUETTE)), "baguette"),

        LONG_BAGUETTE(new LongBaguette(new Item.Settings().group(ItemGroup.FOOD).food(ModFoodComponents.LONG_BAGUETTE)), "long_baguette"),

        TNT_BAGUETTE(new TntBaguette(new Item.Settings().group(ItemGroup.FOOD).food(ModFoodComponents.TNT_BAGUETTE)), "tnt_baguette"),

        WATER_BAGUETTE(new WaterBaguette(new Item.Settings().group(ItemGroup.FOOD).food(ModFoodComponents.WATER_BAGUETTE)), "water_baguette"),

        LONG_BAGUETTE_SWORD(new LongBaguetteSword(new Item.Settings().group(ItemGroup.COMBAT)), "long_baguette_sword"),

        EASTEREGG_BAGUETTE(new EastereggBaguette(new Item.Settings().group(ItemGroup.FOOD)), "easteregg_baguette"),

        CHARGED_TNT_BAGUETTE(new ChargedTntBaguette(new Item.Settings().group(ItemGroup.FOOD).food(ModFoodComponents.CHARGED_TNT_BAGUETTE)), "charged_tnt_baguette"),

        BIRTHDAY_BAGUETTE(new BirthdayBaguette(new Item.Settings().group(ItemGroup.FOOD).food(ModFoodComponents.BIRTHDAY_BAGUETTE)), "birthday_baguette");

        private final Item item;
        private final String name;

        Items(Item item, String name) {
            this.item = item;
            this.name = name;
        }

        public Item asItem() {
            return item;
        }
    }

    public static void register() {
        for (Items item : Items.values()) {
            Registry.register(Registry.ITEM, new Identifier(BaguetteMain.MOD_ID, item.name), item.item);
        }
    }
}
