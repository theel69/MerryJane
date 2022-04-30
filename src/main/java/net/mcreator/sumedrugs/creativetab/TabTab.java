
package net.mcreator.sumedrugs.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.sumedrugs.item.ItemMJ;
import net.mcreator.sumedrugs.ElementsSUMEDrugs;

@ElementsSUMEDrugs.ModElement.Tag
public class TabTab extends ElementsSUMEDrugs.ModElement {
	public TabTab(ElementsSUMEDrugs instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabtab") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemMJ.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
