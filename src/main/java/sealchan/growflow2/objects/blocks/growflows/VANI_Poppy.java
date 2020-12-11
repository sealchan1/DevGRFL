package sealchan.growflow2.objects.blocks.growflows;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.BlockFlower.EnumFlowerType;
import net.minecraft.block.BlockRedFlower;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import sealchan.growflow2.init.BlockInit;
import sealchan.growflow2.init.ItemInit;
import sealchan.growflow2.objects.blocks.BlockGrowFlow;

public class VANI_Poppy extends BlockGrowFlow 
{
	public VANI_Poppy(String name) { super(name); }

	@Override
	protected Item getSeed() { return ItemInit.SEED_POPPY; }
	
	@Override
	protected Item getCrop() { return new ItemStack(Blocks.RED_FLOWER, 1, BlockFlower.EnumFlowerType.POPPY.getMeta()).getItem(); }
	
	@Override
	protected ItemStack getCropasItemStack() { return new ItemStack(Blocks.RED_FLOWER); }
}
