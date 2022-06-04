package net.mcreator.sumedrugs.procedure;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.event.entity.player.BonemealEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.WorldServer;
import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.properties.IProperty;

import net.mcreator.sumedrugs.block.BlockWeedJson;
import net.mcreator.sumedrugs.block.BlockStage5;
import net.mcreator.sumedrugs.block.BlockStage4;
import net.mcreator.sumedrugs.block.BlockStage3;
import net.mcreator.sumedrugs.block.BlockStage2;
import net.mcreator.sumedrugs.block.BlockStage1;
import net.mcreator.sumedrugs.ElementsSUMEDrugs;

import java.util.Map;

@ElementsSUMEDrugs.ModElement.Tag
public class ProcedureBonemeal extends ElementsSUMEDrugs.ModElement {
	public ProcedureBonemeal(ElementsSUMEDrugs instance) {
		super(instance, 13);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure Bonemeal!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure Bonemeal!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure Bonemeal!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure Bonemeal!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure Bonemeal!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(Items.DYE, (int) (1), 15).getItem())) {
			if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == BlockWeedJson.block.getDefaultState().getBlock())) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					IBlockState _bs = BlockStage1.block.getDefaultState();
					IBlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getProperties().entrySet()) {
						IProperty _property = entry.getKey();
						if (_bs.getPropertyKeys().contains(_property))
							_bs = _bs.withProperty(_property, (Comparable) entry.getValue());
					}
					world.setBlockState(_bp, _bs, 3);
				}
			} else {
				if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == BlockStage1.block.getDefaultState().getBlock())) {
					{
						BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
						IBlockState _bs = BlockStage2.block.getDefaultState();
						IBlockState _bso = world.getBlockState(_bp);
						for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getProperties().entrySet()) {
							IProperty _property = entry.getKey();
							if (_bs.getPropertyKeys().contains(_property))
								_bs = _bs.withProperty(_property, (Comparable) entry.getValue());
						}
						world.setBlockState(_bp, _bs, 3);
					}
				} else {
					if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == BlockStage2.block.getDefaultState()
							.getBlock())) {
						{
							BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
							IBlockState _bs = BlockStage3.block.getDefaultState();
							IBlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getProperties().entrySet()) {
								IProperty _property = entry.getKey();
								if (_bs.getPropertyKeys().contains(_property))
									_bs = _bs.withProperty(_property, (Comparable) entry.getValue());
							}
							world.setBlockState(_bp, _bs, 3);
						}
					} else {
						if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == BlockStage3.block.getDefaultState()
								.getBlock())) {
							{
								BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
								IBlockState _bs = BlockStage4.block.getDefaultState();
								IBlockState _bso = world.getBlockState(_bp);
								for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getProperties().entrySet()) {
									IProperty _property = entry.getKey();
									if (_bs.getPropertyKeys().contains(_property))
										_bs = _bs.withProperty(_property, (Comparable) entry.getValue());
								}
								world.setBlockState(_bp, _bs, 3);
							}
						} else {
							if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == BlockStage4.block.getDefaultState()
									.getBlock())) {
								{
									BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
									IBlockState _bs = BlockStage5.block.getDefaultState();
									IBlockState _bso = world.getBlockState(_bp);
									for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getProperties().entrySet()) {
										IProperty _property = entry.getKey();
										if (_bs.getPropertyKeys().contains(_property))
											_bs = _bs.withProperty(_property, (Comparable) entry.getValue());
									}
									world.setBlockState(_bp, _bs, 3);
								}
							}
						}
					}
				}
			}
			if (world instanceof WorldServer)
				((WorldServer) world).spawnParticle(EnumParticleTypes.CRIT, x, (y + 1.5), z, (int) 5, 3, 3, 3, 0.1, new int[0]);
			if ((!((entity instanceof EntityPlayer) ? ((EntityPlayer) entity).capabilities.isCreativeMode : false))) {
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(Items.DYE, (int) (1), 15).getItem(), 15, (int) 1, null);
			}
		}
	}

	@SubscribeEvent
	public void onBonemeal(BonemealEvent event) {
		EntityPlayer entity = event.getEntityPlayer();
		int i = event.getPos().getX();
		int j = event.getPos().getY();
		int k = event.getPos().getZ();
		World world = event.getWorld();
		ItemStack itemstack = event.getStack();
		java.util.HashMap<String, Object> dependencies = new java.util.HashMap<>();
		dependencies.put("x", i);
		dependencies.put("y", j);
		dependencies.put("z", k);
		dependencies.put("world", world);
		dependencies.put("itemstack", itemstack);
		dependencies.put("entity", entity);
		dependencies.put("event", event);
		this.executeProcedure(dependencies);
	}

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		MinecraftForge.EVENT_BUS.register(this);
	}
}
