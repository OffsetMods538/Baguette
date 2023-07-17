package com.github.offsetmonkey538.baguette.item;

import com.github.offsetmonkey538.baguette.item.baguettes.Baguecah3dron;
import com.github.offsetmonkey538.baguette.item.baguettes.Baguettagon;
import com.github.offsetmonkey538.baguette.item.baguettes.Baguette;
import com.github.offsetmonkey538.baguette.item.baguettes.BirthdayBaguette;
import com.github.offsetmonkey538.baguette.item.baguettes.ChargedTntBaguette;
import com.github.offsetmonkey538.baguette.item.baguettes.CreditsBaguette;
import com.github.offsetmonkey538.baguette.item.baguettes.DeathBaguette;
import com.github.offsetmonkey538.baguette.item.baguettes.EastereggBaguette;
import com.github.offsetmonkey538.baguette.item.baguettes.EndBaguette;
import com.github.offsetmonkey538.baguette.item.baguettes.FrogBaguette;
import com.github.offsetmonkey538.baguette.item.baguettes.LongBaguette;
import com.github.offsetmonkey538.baguette.item.baguettes.QuestionBaguette;
import com.github.offsetmonkey538.baguette.item.baguettes.SculkBaguette;
import com.github.offsetmonkey538.baguette.item.baguettes.TntBaguette;
import com.github.offsetmonkey538.baguette.item.baguettes.elements.AirBaguette;
import com.github.offsetmonkey538.baguette.item.baguettes.elements.EarthBaguette;
import com.github.offsetmonkey538.baguette.item.baguettes.elements.FireBaguette;
import com.github.offsetmonkey538.baguette.item.baguettes.elements.GoldenBaguette;
import com.github.offsetmonkey538.baguette.item.baguettes.elements.WaterBaguette;
import com.github.offsetmonkey538.baguette.item.tools.BaguetteSword;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static com.github.offsetmonkey538.baguette.BaguetteMain.*;

public final class ModItems {

    public static final Baguette           BAGUETTE             = register(new Baguette(           new FabricItemSettings().food(ModFoodComponents.BAGUETTE)),             "baguette");
    public static final LongBaguette       LONG_BAGUETTE        = register(new LongBaguette(       new FabricItemSettings().food(ModFoodComponents.LONG_BAGUETTE)),        "long_baguette");
    public static final TntBaguette        TNT_BAGUETTE         = register(new TntBaguette(        new FabricItemSettings().food(ModFoodComponents.TNT_BAGUETTE)),         "tnt_baguette");
    public static final WaterBaguette      WATER_BAGUETTE       = register(new WaterBaguette(      new FabricItemSettings().food(ModFoodComponents.WATER_BAGUETTE)),       "water_baguette");
    public static final EastereggBaguette  EASTEREGG_BAGUETTE   = register(new EastereggBaguette(  new FabricItemSettings().food(ModFoodComponents.EASTEREGG_BAGUETTE)),   "easteregg_baguette");
    public static final ChargedTntBaguette CHARGED_TNT_BAGUETTE = register(new ChargedTntBaguette( new FabricItemSettings().food(ModFoodComponents.CHARGED_TNT_BAGUETTE)), "charged_tnt_baguette");
    public static final BirthdayBaguette   BIRTHDAY_BAGUETTE    = register(new BirthdayBaguette(   new FabricItemSettings().food(ModFoodComponents.BIRTHDAY_BAGUETTE)),    "birthday_baguette");
    public static final FireBaguette       FIRE_BAGUETTE        = register(new FireBaguette(       new FabricItemSettings().food(ModFoodComponents.FIRE_BAGUETTE)),        "fire_baguette");
    public static final AirBaguette        AIR_BAGUETTE         = register(new AirBaguette(        new FabricItemSettings().food(ModFoodComponents.AIR_BAGUETTE)),         "air_baguette");
    public static final EarthBaguette      EARTH_BAGUETTE       = register(new EarthBaguette(      new FabricItemSettings().food(ModFoodComponents.EARTH_BAGUETTE)),       "earth_baguette");
    public static final GoldenBaguette     GOLDEN_BAGUETTE      = register(new GoldenBaguette(     new FabricItemSettings().food(ModFoodComponents.GOLDEN_BAGUETTE)),      "golden_baguette");
    public static final DeathBaguette      DEATH_BAGUETTE       = register(new DeathBaguette(      new FabricItemSettings().food(ModFoodComponents.DEATH_BAGUETTE)),       "death_baguette");
    public static final FrogBaguette       FROG_BAGUETTE        = register(new FrogBaguette(       new FabricItemSettings().food(ModFoodComponents.FROG_BAGUETTE)),        "frog_baguette");
    public static final SculkBaguette      SCULK_BAGUETTE       = register(new SculkBaguette(      new FabricItemSettings().food(ModFoodComponents.SCULK_BAGUETTE)),       "sculk_baguette");
    public static final EndBaguette        END_BAGUETTE         = register(new EndBaguette(        new FabricItemSettings().food(ModFoodComponents.END_BAGUETTE)),         "end_baguette");
    public static final Baguettagon        BAGUETTAGON          = register(new Baguettagon(        new FabricItemSettings().food(ModFoodComponents.BAGUETTAGON)),          "baguettagon");
    public static final Baguecah3dron      BAGUECAH3DRON        = register(new Baguecah3dron(      new FabricItemSettings().food(ModFoodComponents.BAGUECAH3DRON)),        "baguecah3dron");
    public static final CreditsBaguette    CREDITS_BAGUETTE     = register(new CreditsBaguette(    new FabricItemSettings().food(ModFoodComponents.CREDITS_BAGUETTE)),     "credits_baguette");
    public static final QuestionBaguette   QUESTION_BAGUETTE    = register(new QuestionBaguette(   new FabricItemSettings().food(ModFoodComponents.QUESTION_BAGUETTE)),    "question_baguette");
    public static final BaguetteSword      BAGUETTE_SWORD       = register(new BaguetteSword(      new FabricItemSettings()),                                              "baguette_sword");

    public static final Item ALL_ELEMENTAL_BAGUETTES            = register(new Item(               new FabricItemSettings()),                                              "all_elemental_baguettes");
    public static final Item GLOWING_BAGUETTE_SWORD             = register(new Item(               new FabricItemSettings()),                                              "glowing_baguette_sword");

    private ModItems() {

    }

    private static <T extends Item> T register(T item, String name) {
        return Registry.register(Registries.ITEM, new Identifier(MOD_ID, name), item);
    }

    public static void register() {
        // Registers all items because this class is now loaded

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
            entries.addAfter(Items.BREAD,          BAGUETTE);
            entries.addAfter(BAGUETTE,             LONG_BAGUETTE);
            entries.addAfter(LONG_BAGUETTE,        TNT_BAGUETTE);
            entries.addAfter(TNT_BAGUETTE,         WATER_BAGUETTE);
            entries.addAfter(WATER_BAGUETTE,       EASTEREGG_BAGUETTE);
            entries.addAfter(EASTEREGG_BAGUETTE,   CHARGED_TNT_BAGUETTE);
            entries.addAfter(CHARGED_TNT_BAGUETTE, BIRTHDAY_BAGUETTE);
            entries.addAfter(BIRTHDAY_BAGUETTE,    FIRE_BAGUETTE);
            entries.addAfter(FIRE_BAGUETTE,        AIR_BAGUETTE);
            entries.addAfter(AIR_BAGUETTE,         EARTH_BAGUETTE);
            entries.addAfter(EARTH_BAGUETTE,       GOLDEN_BAGUETTE);
            entries.addAfter(GOLDEN_BAGUETTE,      DEATH_BAGUETTE);
            entries.addAfter(DEATH_BAGUETTE,       FROG_BAGUETTE);
            entries.addAfter(FROG_BAGUETTE,        SCULK_BAGUETTE);
            entries.addAfter(SCULK_BAGUETTE,       END_BAGUETTE);
            entries.addAfter(END_BAGUETTE,         BAGUETTAGON);
            entries.addAfter(BAGUETTAGON,          BAGUECAH3DRON);
            entries.addAfter(BAGUECAH3DRON,        CREDITS_BAGUETTE);
            entries.addAfter(CREDITS_BAGUETTE,     QUESTION_BAGUETTE);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
            entries.addBefore(Items.WOODEN_SWORD, BAGUETTE_SWORD);
        });
    }
}
