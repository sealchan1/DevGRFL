package sealchan.growflow2.objects.blocks.growflows;

import net.minecraft.block.BlockFlower;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import sealchan.growflow2.init.ItemInit;
import sealchan.growflow2.objects.blocks.BlockGrowFlow;

public class VANI_Dandelion extends BlockGrowFlow 
{
	public VANI_Dandelion(String name) { super(name); }

	@Override
	protected Item getSeed() { return ItemInit.SEED_DANDELION; }
	
	protected Item getCrop() { return new ItemStack(Blocks.YELLOW_FLOWER).getItem(); }
	
	@Override
	protected ItemStack getCropasItemStack() { return new ItemStack(Blocks.YELLOW_FLOWER); }
}
