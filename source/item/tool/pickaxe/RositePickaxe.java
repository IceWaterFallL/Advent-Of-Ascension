package net.tslat.aoa3.item.tool.pickaxe;

import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.tslat.aoa3.common.registration.CreativeTabsRegister;
import net.tslat.aoa3.common.registration.ItemRegister;

public class RositePickaxe extends ItemPickaxe {
	public RositePickaxe(ToolMaterial material) {
		super(material);
		setUnlocalizedName("RositePickaxe");
		setRegistryName("aoa3:rosite_pickaxe");
		setCreativeTab(CreativeTabsRegister.toolsTab);
	}

	@Override
	public boolean getIsRepairable(ItemStack stack, ItemStack repairMaterial) {
		return OreDictionary.itemMatches(repairMaterial, new ItemStack(ItemRegister.ingotRosite), false) || super.getIsRepairable(stack, repairMaterial);
	}
}
