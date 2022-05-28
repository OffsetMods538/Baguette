package me.offsetmonkey538.baguette.items.tools;

import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class LongBaguetteSword extends SwordItem {

    public LongBaguetteSword(Settings settings) {
        super(new LongBaguetteToolMaterial(), 4, -3.1F, settings);
    }
}
