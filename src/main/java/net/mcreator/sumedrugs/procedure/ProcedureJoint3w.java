package net.mcreator.sumedrugs.procedure;

import net.minecraft.world.WorldServer;
import net.minecraft.world.World;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.potion.PotionEffect;
import net.minecraft.item.ItemStack;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.sumedrugs.item.ItemJoint3;
import net.mcreator.sumedrugs.ElementsSUMEDrugs;

@ElementsSUMEDrugs.ModElement.Tag
public class ProcedureJoint3w extends ElementsSUMEDrugs.ModElement {
	public ProcedureJoint3w(ElementsSUMEDrugs instance) {
		super(instance, 29);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure Joint3w!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure Joint3w!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure Joint3w!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int y = (int) dependencies.get("y");
		World world = (World) dependencies.get("world");
		if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemJoint3.block, (int) (1)).getItem())) {
			for (int index0 = 0; index0 < (int) (5); index0++) {
				if (world instanceof WorldServer)
					((WorldServer) world).spawnParticle(EnumParticleTypes.SPIT, (entity.posX), (y + 1.3), (entity.posZ), (int) 1, 0, 0, 0, 0.1,
							new int[0]);
			}
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.NAUSEA, (int) 300, (int) 1, (false), (false)));
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.HUNGER, (int) 600, (int) 2, (false), (false)));
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.INSTANT_HEALTH, (int) 20, (int) 5, (false), (false)));
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.REGENERATION, (int) 600, (int) 3, (false), (false)));
			if ((!((entity instanceof EntityPlayer) ? ((EntityPlayer) entity).capabilities.isCreativeMode : false))) {
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemJoint3.block, (int) (1)).getItem(), -1, (int) 1, null);
			}
		}
	}
}
