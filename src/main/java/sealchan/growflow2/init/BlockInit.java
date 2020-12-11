package sealchan.growflow2.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import sealchan.growflow2.objects.blocks.BlockGrowFlow;
import sealchan.growflow2.objects.blocks.growflows.VANI_Allium;
import sealchan.growflow2.objects.blocks.growflows.VANI_AzureBluet;
import sealchan.growflow2.objects.blocks.growflows.VANI_BlueOrchid;
import sealchan.growflow2.objects.blocks.growflows.VANI_Dandelion;
import sealchan.growflow2.objects.blocks.growflows.VANI_OxeyeDaisy;
import sealchan.growflow2.objects.blocks.growflows.VANI_Poppy;

public class BlockInit 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block GROWFLOW_DANDELION = new VANI_Dandelion("growflow_dandelion");
	public static final Block GROWFLOW_POPPY = new VANI_Poppy("growflow_poppy");
	public static final Block GROWFLOW_ALLIUM = new VANI_Allium("growflow_allium");
	public static final Block GROWFLOW_AZUREBLUET = new VANI_AzureBluet("growflow_azurebluet");
	public static final Block GROWFLOW_BLUEORCHID = new VANI_BlueOrchid("growflow_blueorchid");
	public static final Block GROWFLOW_OXEYEDAISY = new VANI_OxeyeDaisy("growflow_oxeyedaisy");
}
