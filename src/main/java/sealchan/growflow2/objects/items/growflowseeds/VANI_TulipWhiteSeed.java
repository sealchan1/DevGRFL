package sealchan.growflow2.objects.items.growflowseeds;

import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import sealchan.growflow2.init.BlockInit;
import sealchan.growflow2.objects.items.ItemGrowFlowSeed;

public class VANI_TulipWhiteSeed extends ItemGrowFlowSeed 
{
	public VANI_TulipWhiteSeed(String name, int amount, boolean isWolfFood)
	{
		super(name, amount, isWolfFood);
	}
	
	@Override
	protected IBlockState getPlant() 
	{ 
		return BlockInit.GROWFLOW_TULIPWHITE.getDefaultState(); 
	}
}
