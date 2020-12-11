package sealchan.growflow2.objects.items.growflowseeds;

import net.minecraft.block.state.IBlockState;
import sealchan.growflow2.init.BlockInit;
import sealchan.growflow2.objects.items.ItemGrowFlowSeed;

public class VANI_AlliumSeed extends ItemGrowFlowSeed
{
	public VANI_AlliumSeed(String name, int amount, boolean isWolfFood) 
	{
		super(name, amount, isWolfFood);
	}

	@Override
	protected IBlockState getPlant() { return BlockInit.GROWFLOW_ALLIUM.getDefaultState(); }
}

