package net.tslat.aoa3.worldgen.structures.gardencia;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.tslat.aoa3.common.registration.AoABlocks;
import net.tslat.aoa3.common.registration.AoAEntities;
import net.tslat.aoa3.worldgen.structures.AoAStructure;

import java.util.Random;

public class DayseeFlower extends AoAStructure { //StructureSize: 14x13x14
	private static final BlockState yellowPetals = AoABlocks.YELLOW_PETALS.get().getDefaultState();
	private static final BlockState stem = AoABlocks.GIANT_PLANT_STEM.get().getDefaultState();
	private static final BlockState dayseeSpawner = Blocks.SPAWNER.getDefaultState();

	public DayseeFlower() {
		super("DayseeFlower");
	}

	@Override
	protected boolean replacesBlocks() {
		return true;
	}

	@Override
	protected void build(IWorld world, Random rand, BlockPos basePos) {
		addBlock(world, basePos, 6, 0, 6, stem);
		addBlock(world, basePos, 6, 0, 7, stem);
		addBlock(world, basePos, 7, 0, 6, stem);
		addBlock(world, basePos, 7, 0, 7, stem);
		addBlock(world, basePos, 6, 1, 6, dayseeSpawner);
		addBlock(world, basePos, 6, 1, 7, dayseeSpawner);
		addBlock(world, basePos, 7, 1, 6, dayseeSpawner);
		addBlock(world, basePos, 7, 1, 7, dayseeSpawner);
		addBlock(world, basePos, 6, 2, 6, stem);
		addBlock(world, basePos, 6, 2, 7, stem);
		addBlock(world, basePos, 7, 2, 6, stem);
		addBlock(world, basePos, 7, 2, 7, stem);
		addBlock(world, basePos, 0, 3, 6, yellowPetals);
		addBlock(world, basePos, 0, 3, 7, yellowPetals);
		addBlock(world, basePos, 1, 3, 6, yellowPetals);
		addBlock(world, basePos, 1, 3, 7, yellowPetals);
		addBlock(world, basePos, 6, 3, 0, yellowPetals);
		addBlock(world, basePos, 6, 3, 1, yellowPetals);
		addBlock(world, basePos, 6, 3, 6, yellowPetals);
		addBlock(world, basePos, 6, 3, 7, yellowPetals);
		addBlock(world, basePos, 6, 3, 12, yellowPetals);
		addBlock(world, basePos, 6, 3, 13, yellowPetals);
		addBlock(world, basePos, 7, 3, 0, yellowPetals);
		addBlock(world, basePos, 7, 3, 1, yellowPetals);
		addBlock(world, basePos, 7, 3, 6, yellowPetals);
		addBlock(world, basePos, 7, 3, 7, yellowPetals);
		addBlock(world, basePos, 7, 3, 12, yellowPetals);
		addBlock(world, basePos, 7, 3, 13, yellowPetals);
		addBlock(world, basePos, 12, 3, 6, yellowPetals);
		addBlock(world, basePos, 12, 3, 7, yellowPetals);
		addBlock(world, basePos, 13, 3, 6, yellowPetals);
		addBlock(world, basePos, 13, 3, 7, yellowPetals);
		addBlock(world, basePos, 0, 4, 6, yellowPetals);
		addBlock(world, basePos, 0, 4, 7, yellowPetals);
		addBlock(world, basePos, 1, 4, 6, yellowPetals);
		addBlock(world, basePos, 1, 4, 7, yellowPetals);
		addBlock(world, basePos, 6, 4, 0, yellowPetals);
		addBlock(world, basePos, 6, 4, 1, yellowPetals);
		addBlock(world, basePos, 6, 4, 6, stem);
		addBlock(world, basePos, 6, 4, 7, stem);
		addBlock(world, basePos, 6, 4, 12, yellowPetals);
		addBlock(world, basePos, 6, 4, 13, yellowPetals);
		addBlock(world, basePos, 7, 4, 0, yellowPetals);
		addBlock(world, basePos, 7, 4, 1, yellowPetals);
		addBlock(world, basePos, 7, 4, 6, stem);
		addBlock(world, basePos, 7, 4, 7, stem);
		addBlock(world, basePos, 7, 4, 12, yellowPetals);
		addBlock(world, basePos, 7, 4, 13, yellowPetals);
		addBlock(world, basePos, 12, 4, 6, yellowPetals);
		addBlock(world, basePos, 12, 4, 7, yellowPetals);
		addBlock(world, basePos, 13, 4, 6, yellowPetals);
		addBlock(world, basePos, 13, 4, 7, yellowPetals);
		addBlock(world, basePos, 1, 5, 6, stem);
		addBlock(world, basePos, 1, 5, 7, stem);
		addBlock(world, basePos, 5, 5, 6, stem);
		addBlock(world, basePos, 5, 5, 7, stem);
		addBlock(world, basePos, 6, 5, 1, stem);
		addBlock(world, basePos, 6, 5, 5, stem);
		addBlock(world, basePos, 6, 5, 6, stem);
		addBlock(world, basePos, 6, 5, 7, stem);
		addBlock(world, basePos, 6, 5, 8, stem);
		addBlock(world, basePos, 6, 5, 12, stem);
		addBlock(world, basePos, 7, 5, 1, stem);
		addBlock(world, basePos, 7, 5, 5, stem);
		addBlock(world, basePos, 7, 5, 6, stem);
		addBlock(world, basePos, 7, 5, 7, stem);
		addBlock(world, basePos, 7, 5, 8, stem);
		addBlock(world, basePos, 7, 5, 12, stem);
		addBlock(world, basePos, 8, 5, 6, stem);
		addBlock(world, basePos, 8, 5, 7, stem);
		addBlock(world, basePos, 12, 5, 6, stem);
		addBlock(world, basePos, 12, 5, 7, stem);
		addBlock(world, basePos, 2, 6, 6, stem);
		addBlock(world, basePos, 2, 6, 7, stem);
		addBlock(world, basePos, 3, 6, 6, stem);
		addBlock(world, basePos, 3, 6, 7, stem);
		addBlock(world, basePos, 4, 6, 6, stem);
		addBlock(world, basePos, 4, 6, 7, stem);
		addBlock(world, basePos, 6, 6, 2, stem);
		addBlock(world, basePos, 6, 6, 3, stem);
		addBlock(world, basePos, 6, 6, 4, stem);
		addBlock(world, basePos, 6, 6, 6, stem);
		addBlock(world, basePos, 6, 6, 7, stem);
		addBlock(world, basePos, 6, 6, 9, stem);
		addBlock(world, basePos, 6, 6, 10, stem);
		addBlock(world, basePos, 6, 6, 11, stem);
		addBlock(world, basePos, 7, 6, 2, stem);
		addBlock(world, basePos, 7, 6, 3, stem);
		addBlock(world, basePos, 7, 6, 4, stem);
		addBlock(world, basePos, 7, 6, 6, stem);
		addBlock(world, basePos, 7, 6, 7, stem);
		addBlock(world, basePos, 7, 6, 9, stem);
		addBlock(world, basePos, 7, 6, 10, stem);
		addBlock(world, basePos, 7, 6, 11, stem);
		addBlock(world, basePos, 9, 6, 6, stem);
		addBlock(world, basePos, 9, 6, 7, stem);
		addBlock(world, basePos, 10, 6, 6, stem);
		addBlock(world, basePos, 10, 6, 7, stem);
		addBlock(world, basePos, 11, 6, 6, stem);
		addBlock(world, basePos, 11, 6, 7, stem);
		addBlock(world, basePos, 6, 7, 6, stem);
		addBlock(world, basePos, 6, 7, 7, stem);
		addBlock(world, basePos, 7, 7, 6, stem);
		addBlock(world, basePos, 7, 7, 7, stem);
		addBlock(world, basePos, 6, 8, 6, stem);
		addBlock(world, basePos, 6, 8, 7, stem);
		addBlock(world, basePos, 7, 8, 6, stem);
		addBlock(world, basePos, 7, 8, 7, stem);
		addBlock(world, basePos, 5, 9, 5, yellowPetals);
		addBlock(world, basePos, 5, 9, 6, yellowPetals);
		addBlock(world, basePos, 5, 9, 7, yellowPetals);
		addBlock(world, basePos, 5, 9, 8, yellowPetals);
		addBlock(world, basePos, 6, 9, 5, yellowPetals);
		addBlock(world, basePos, 6, 9, 6, yellowPetals);
		addBlock(world, basePos, 6, 9, 7, yellowPetals);
		addBlock(world, basePos, 6, 9, 8, yellowPetals);
		addBlock(world, basePos, 7, 9, 5, yellowPetals);
		addBlock(world, basePos, 7, 9, 6, yellowPetals);
		addBlock(world, basePos, 7, 9, 7, yellowPetals);
		addBlock(world, basePos, 7, 9, 8, yellowPetals);
		addBlock(world, basePos, 8, 9, 5, yellowPetals);
		addBlock(world, basePos, 8, 9, 6, yellowPetals);
		addBlock(world, basePos, 8, 9, 7, yellowPetals);
		addBlock(world, basePos, 8, 9, 8, yellowPetals);
		addBlock(world, basePos, 5, 10, 5, yellowPetals);
		addBlock(world, basePos, 5, 10, 6, yellowPetals);
		addBlock(world, basePos, 5, 10, 7, yellowPetals);
		addBlock(world, basePos, 5, 10, 8, yellowPetals);
		addBlock(world, basePos, 6, 10, 5, yellowPetals);
		addBlock(world, basePos, 6, 10, 8, yellowPetals);
		addBlock(world, basePos, 7, 10, 5, yellowPetals);
		addBlock(world, basePos, 7, 10, 8, yellowPetals);
		addBlock(world, basePos, 8, 10, 5, yellowPetals);
		addBlock(world, basePos, 8, 10, 6, yellowPetals);
		addBlock(world, basePos, 8, 10, 7, yellowPetals);
		addBlock(world, basePos, 8, 10, 8, yellowPetals);
		addBlock(world, basePos, 5, 11, 5, yellowPetals);
		addBlock(world, basePos, 5, 11, 8, yellowPetals);
		addBlock(world, basePos, 8, 11, 5, yellowPetals);
		addBlock(world, basePos, 8, 11, 8, yellowPetals);
		addBlock(world, basePos, 5, 12, 5, yellowPetals);
		addBlock(world, basePos, 5, 12, 8, yellowPetals);
		addBlock(world, basePos, 8, 12, 5, yellowPetals);
		addBlock(world, basePos, 8, 12, 8, yellowPetals);
	}

	@Override
	protected void doPostBuildOps(IWorld world, Random rand, BlockPos basePos) {
		initSpawner(world, basePos.add(6, 1, 6), AoAEntities.Mobs.DAYSEE.get());
		initSpawner(world, basePos.add(6, 1, 7), AoAEntities.Mobs.DAYSEE.get());
		initSpawner(world, basePos.add(7, 1, 6), AoAEntities.Mobs.DAYSEE.get());
		initSpawner(world, basePos.add(7, 1, 7), AoAEntities.Mobs.DAYSEE.get());
	}
}