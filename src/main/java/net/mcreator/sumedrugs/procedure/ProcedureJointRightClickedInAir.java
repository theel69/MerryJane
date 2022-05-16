package net.mcreator.sumedrugs.procedure;

import net.minecraft.world.WorldServer;
import net.minecraft.world.World;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.mcreator.sumedrugs.ElementsSUMEDrugs;

@ElementsSUMEDrugs.ModElement.Tag
public class ProcedureJointRightClickedInAir extends ElementsSUMEDrugs.ModElement {
	public ProcedureJointRightClickedInAir(ElementsSUMEDrugs instance) {
		super(instance, 6);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure JointRightClickedInAir!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure JointRightClickedInAir!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure JointRightClickedInAir!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int y = (int) dependencies.get("y");
		World world = (World) dependencies.get("world");
		world.playSound((EntityPlayer) null, (entity.posX), (y + 1.5), (entity.posZ),
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("sumedrugs:joint")),
				SoundCategory.NEUTRAL, (float) 1, (float) 1);
		for (int index0 = 0; index0 < (int) (5); index0++) {
			if (world instanceof WorldServer)
				((WorldServer) world).spawnParticle(EnumParticleTypes.SPIT, (entity.posX), (y + 1.3), (entity.posZ), (int) 1, 0, 0, 0, 0.1,
						new int[0]);
		}
	}
}
