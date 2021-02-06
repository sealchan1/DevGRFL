package sealchan.growflow2.objects.blocks.growflows;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import sealchan.growflow2.init.ItemInit;
import sealchan.growflow2.objects.blocks.BlockGrowFlow;

public class VANI_TulipRed extends BlockGrowFlow 
{
	public VANI_TulipRed(String name) { super(name); }
	
	private int redFlowerType = BlockFlower.EnumFlowerType.RED_TULIP.getMeta();
	
	@Override
	protected Item getSeed() { return ItemInit.BULB_TULIPRED; }
	
	@Override
	protected Item getCrop() { return new ItemStack(Blocks.RED_FLOWER, 1, redFlowerType).getItem(); }
	
	@Override
	protected ItemStack getCropasItemStack() { return new ItemStack(Blocks.RED_FLOWER, 1, redFlowerType); }

	@Override
    public int damageDropped(IBlockState state) { return redFlowerType; }
}
