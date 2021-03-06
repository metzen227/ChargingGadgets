package com.direwolf20.charginggadgets.common.data;

import com.direwolf20.charginggadgets.common.blocks.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.data.ShapedRecipeBuilder;
import net.minecraftforge.common.Tags;

import java.util.function.Consumer;

public final class GeneratorRecipes extends RecipeProvider {
    public GeneratorRecipes(DataGenerator generator) {
        super(generator);
    }

    @Override
    protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
        Block block = ModBlocks.CHARGING_STATION.get();
        ShapedRecipeBuilder
                .shapedRecipe(block)
                .key('i', Tags.Items.INGOTS_IRON)
                .key('r', Tags.Items.DUSTS_REDSTONE)
                .key('l', Tags.Items.STORAGE_BLOCKS_COAL)
                .key('d', Tags.Items.GEMS_LAPIS)
                .patternLine("iri")
                .patternLine("drd")
                .patternLine("ili")
                .addCriterion("has_diamonds", hasItem(Tags.Items.GEMS_DIAMOND))
                .build(consumer);
    }
}
