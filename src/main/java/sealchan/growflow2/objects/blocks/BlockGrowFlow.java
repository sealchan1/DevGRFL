package sealchan.growflow2.objects.blocks;

import java.util.Iterator;
import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.NonNullList;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import sealchan.growflow2.init.BlockInit;
import sealchan.growflow2.init.ItemInit;

public abstract class BlockGrowFlow extends BlockCrops 
{
	private static final AxisAlignedBB[] GROWFLOW_AABB = new AxisAlignedBB[] 
	{
			new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.125D, 1.0D), 
			new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.25D, 1.0D), 
			new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.375D, 1.0D), 
			new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.5D, 1.0D), 
			new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.625D, 1.0D), 
			new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.75D, 1.0D), 
			new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.875D, 1.0D), 
			new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D)
	};

	public BlockGrowFlow(String name)
	{
		super();
		
		setUnlocalizedName(name);
		setRegistryName(name);
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(getRegistryName()));
	}
	
	protected abstract ItemStack getCropasItemStack();
	
	// Right-click crop drops
	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, 
			EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
	{
		if(!worldIn.isRemote)
		{
			if(this.isMaxAge(state))
			{
				dropBlockAsItemWithChance(worldIn, pos, state, 0, 0);
				
				worldIn.setBlockState(pos, this.withAge(0));
				return true;
			}
		}
		
		return false;
	}
	
	@Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return this.getSeed();
    }
    
    @Override
    public void onBlockDestroyedByPlayer(World worldIn, BlockPos pos, IBlockState state)
    {
    	this.spawnAsEntity(worldIn, pos, new ItemStack(this.getSeed()));
    }
    
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
	{
		return GROWFLOW_AABB[((Integer)state.getValue(this.getAgeProperty())).intValue()];
	}
	
    // Left-Click Block Drops
    @Override
    public void dropBlockAsItemWithChance(World worldIn, BlockPos pos, IBlockState state, float chance, int fortune)
    {
        if (!worldIn.isRemote)
        {
            int i = this.getAge(state);

            if (i >= this.getMaxAge())
            {
            	// Seeds
                int j = 3 + fortune;

                for (int k = 0; k < j; ++k)
                {
                    if (worldIn.rand.nextInt(2 * this.getMaxAge()) <= i)
                    {
                        spawnAsEntity(worldIn, pos, new ItemStack(this.getSeed()));
                    }
                }
                
                // Flower
                // if not remote and if >= maxAge and...
                if(!worldIn.restoringBlockSnapshots)
                {
                	spawnAsEntity(worldIn, pos, getCropasItemStack());
                }
            }
        }
    }

}
