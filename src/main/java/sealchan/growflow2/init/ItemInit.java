package sealchan.growflow2.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.item.Item;
import sealchan.growflow2.objects.items.growflowseeds.VANI_AlliumSeed;
import sealchan.growflow2.objects.items.growflowseeds.VANI_AzureBluetSeed;
import sealchan.growflow2.objects.items.growflowseeds.VANI_BlueOrchidSeed;
import sealchan.growflow2.objects.items.growflowseeds.VANI_DandelionSeed;
import sealchan.growflow2.objects.items.growflowseeds.VANI_OxeyeDaisySeed;
import sealchan.growflow2.objects.items.growflowseeds.VANI_PoppySeed;

public class ItemInit 
{
	public static List<Item> ITEMS = new ArrayList<Item>();
	
	public static final Item SEED_DANDELION = new VANI_DandelionSeed("seed_dandelion", 1, false);
	public static final Item SEED_POPPY = new VANI_PoppySeed("seed_poppy", 1, false);
	public static final Item SEED_ALLIUM = new VANI_AlliumSeed("seed_allium", 1, false);
	public static final Item SEED_AZUREBLUET = new VANI_AzureBluetSeed("seed_azurebluet", 1, false);
	public static final Item SEED_BLUEORCHID = new VANI_BlueOrchidSeed("seed_blueorchid", 1, false);
	public static final Item SEED_OXEYEDAISY = new VANI_OxeyeDaisySeed("seed_oxeyedaisy", 1, false);
}
