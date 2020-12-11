package sealchan.growflow2.objects.blocks.growflows;

import net.minecraft.block.BlockFlower;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import sealchan.growflow2.init.ItemInit;
import sealchan.growflow2.objects.blocks.BlockGrowFlow;

public class VANI_Allium extends BlockGrowFlow
{
	public VANI_Allium(String name) { super(name); }
	
	@Override
	protected Item getSeed() { return ItemInit.SEED_ALLIUM; }
	
	@Override
	protected Item getCrop() { return new ItemStack(Blocks.RED_FLOWER, 1, BlockFlower.EnumFlowerType.ALLIUM.getMeta()).getItem(); }
	
	@Override
	protected ItemStack getCropasItemStack() { return new ItemStack(Blocks.RED_FLOWER, 1, BlockFlower.EnumFlowerType.ALLIUM.getMeta()); }

	@Override
    public int damageDropped(IBlockState state) { return BlockFlower.EnumFlowerType.ALLIUM.getMeta(); }
    
}


