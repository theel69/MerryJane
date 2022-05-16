package net.mcreator.sumedrugs.procedure;

import net.minecraft.world.WorldServer;
import net.minecraft.world.World;
import net.minecraft.util.EnumParticleTypes;
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
		if (world instanceof WorldServer)
			((WorldServer) world)
					.spawnParticle(EnumParticleTypes.SPIT,
							(entity.world.rayTraceBlocks(entity.getPositionEyes(1f),
									entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 1, entity.getLook(1f).y * 1,
											entity.getLook(1f).z * 1),
									false, false, true).getBlockPos().getX()),
							y,
							(entity.world
									.rayTraceBlocks(entity.getPositionEyes(1f),
											entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 1, entity.getLook(1f).y * 1,
													entity.getLook(1f).z * 1),
											false, false, true)
									.getBlockPos().getZ()),
							(int) 5, 0, 0, 0, 0.5, new int[0]);
	}
}
