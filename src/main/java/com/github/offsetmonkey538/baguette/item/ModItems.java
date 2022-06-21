package com.github.offsetmonkey538.baguette.item;

import com.github.offsetmonkey538.baguette.item.baguettes.*;
import com.github.offsetmonkey538.baguette.item.baguettes.elements.*;
import com.github.offsetmonkey538.baguette.item.tools.BaguetteSword;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.github.offsetmonkey538.baguette.BaguetteMain.MOD_ID;

public final class ModItems {

    public static final Baguette           BAGUETTE             = register(new Baguette(           new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.BAGUETTE)),             "baguette");
    public static final LongBaguette       LONG_BAGUETTE        = register(new LongBaguette(       new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.LONG_BAGUETTE)),        "long_baguette");
    public static final TntBaguette        TNT_BAGUETTE         = register(new TntBaguette(        new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.TNT_BAGUETTE)),         "tnt_baguette");
    public static final WaterBaguette      WATER_BAGUETTE       = register(new WaterBaguette(      new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.WATER_BAGUETTE)),       "water_baguette");
    public static final EastereggBaguette  EASTEREGG_BAGUETTE   = register(new EastereggBaguette(  new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.EASTEREGG_BAGUETTE)),   "easteregg_baguette");
    public static final ChargedTntBaguette CHARGED_TNT_BAGUETTE = register(new ChargedTntBaguette( new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.CHARGED_TNT_BAGUETTE)), "charged_tnt_baguette");
    public static final BirthdayBaguette   BIRTHDAY_BAGUETTE    = register(new BirthdayBaguette(   new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.BIRTHDAY_BAGUETTE)),    "birthday_baguette");
    public static final FireBaguette       FIRE_BAGUETTE        = register(new FireBaguette(       new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.FIRE_BAGUETTE)),        "fire_baguette");
    public static final AirBaguette        AIR_BAGUETTE         = register(new AirBaguette(        new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.AIR_BAGUETTE)),         "air_baguette");
    public static final EarthBaguette      EARTH_BAGUETTE       = register(new EarthBaguette(      new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.EARTH_BAGUETTE)),       "earth_baguette");
    public static final GoldenBaguette     GOLDEN_BAGUETTE      = register(new GoldenBaguette(     new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.GOLDEN_BAGUETTE)),      "golden_baguette");
    public static final DeathBaguette      DEATH_BAGUETTE       = register(new DeathBaguette(      new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.DEATH_BAGUETTE)),       "death_baguette");
    public static final FrogBaguette       FROG_BAGUETTE        = register(new FrogBaguette(       new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.FROG_BAGUETTE)),        "frog_baguette");
    public static final SculkBaguette      SCULK_BAGUETTE       = register(new SculkBaguette(      new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.SCULK_BAGUETTE)),       "sculk_baguette");
    public static final EndBaguette        END_BAGUETTE         = register(new EndBaguette(        new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.END_BAGUETTE)),         "end_baguette");
    public static final Baguettagon        BAGUETTAGON          = register(new Baguettagon(        new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.BAGUETTAGON)),          "baguettagon");
    public static final Baguecah3dron      BAGUECAH3DRON        = register(new Baguecah3dron(      new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.BAGUECAH3DRON)),        "baguecah3dron");
    public static final CreditsBaguette    CREDITS_BAGUETTE     = register(new CreditsBaguette(    new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.CREDITS_BAGUETTE)),     "credits_baguette");
    public static final QuestionBaguette   QUESTION_BAGUETTE    = register(new QuestionBaguette(   new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.QUESTION_BAGUETTE)),    "question_baguette");
    public static final BaguetteSword      BAGUETTE_SWORD       = register(new BaguetteSword(      new FabricItemSettings().group(ItemGroup.COMBAT)),                                            "baguette_sword");

    public static final Item ALL_ELEMENTAL_BAGUETTES            = register(new Item(               new FabricItemSettings()),                                                                    "all_elemental_baguettes");
    public static final Item GLOWING_BAGUETTE_SWORD             = register(new Item(               new FabricItemSettings()),                                                                    "glowing_baguette_sword");

    private ModItems() {

    }

    private static <T extends Item> T register(T item, String name) {
        return Registry.register(Registry.ITEM, new Identifier(MOD_ID, name), item);
    }

    public static void register() {
        // Registers all items because this class is now loaded
    }
}
