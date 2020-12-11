package sealchan.growflow2.objects.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import sealchan.growflow2.Main;
import sealchan.growflow2.init.ItemInit;
import sealchan.growflow2.util.interfaces.IHasModel;

public class ItemBase extends Item implements IHasModel
{
	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);  // Create special tab?
		
		ItemInit.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}

}
