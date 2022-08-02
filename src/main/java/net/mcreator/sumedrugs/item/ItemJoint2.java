
package net.mcreator.sumedrugs.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ActionResult;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemFood;
import net.minecraft.item.Item;
import net.minecraft.item.EnumAction;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.sumedrugs.procedure.ProcedureJoint2w;
import net.mcreator.sumedrugs.creativetab.TabTab;
import net.mcreator.sumedrugs.ElementsSUMEDrugs;

@ElementsSUMEDrugs.ModElement.Tag
public class ItemJoint2 extends ElementsSUMEDrugs.ModElement {
	@GameRegistry.ObjectHolder("sumedrugs:joint2")
	public static final Item block = null;
	public ItemJoint2(ElementsSUMEDrugs instance) {
		super(instance, 27);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemFoodCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("sumedrugs:joint2", "inventory"));
	}
	public static class ItemFoodCustom extends ItemFood {
		public ItemFoodCustom() {
			super(0, 0f, false);
			setUnlocalizedName("joint2");
			setRegistryName("joint2");
			setCreativeTab(TabTab.tab);
			setMaxStackSize(16);
		}

		@Override
		public int getMaxItemUseDuration(ItemStack stack) {
			return 2;
		}

		@Override
		public EnumAction getItemUseAction(ItemStack par1ItemStack) {
			return EnumAction.DRINK;
		}

		@Override
		public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer entity, EnumHand hand) {
			ActionResult<ItemStack> ar = super.onItemRightClick(world, entity, hand);
			ItemStack itemstack = ar.getResult();
			int x = (int) entity.posX;
			int y = (int) entity.posY;
			int z = (int) entity.posZ;
			{
				java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("y", y);
				$_dependencies.put("world", world);
				ProcedureJoint2w.executeProcedure($_dependencies);
			}
			return ar;
		}

		@Override
		protected void onFoodEaten(ItemStack itemStack, World world, EntityPlayer entity) {
			super.onFoodEaten(itemStack, world, entity);
			int x = (int) entity.posX;
			int y = (int) entity.posY;
			int z = (int) entity.posZ;
			{
				java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("y", y);
				$_dependencies.put("world", world);
				ProcedureJoint2w.executeProcedure($_dependencies);
			}
		}
	}
}
