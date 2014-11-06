package com.jakehemmerle.letsmod.init;

import com.jakehemmerle.letsmod.item.ItemLM;
import com.jakehemmerle.letsmod.item.ItemMapleLeaf;

import com.jakehemmerle.letsmod.reference.Names;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {
	public static final ItemLM mapleLeaf = new ItemMapleLeaf();
	public static void init() {GameRegistry.registerItem(mapleLeaf, Names.Items.MAPLE_LEAF);}
}
