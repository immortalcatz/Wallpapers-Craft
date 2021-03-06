package forcex.mods.wpcraft.blocks.dotted;

import forcex.mods.wpcraft.blockStates.BlockStates;
import forcex.mods.wpcraft.blockStates.BlockTypes2;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import forcex.mods.wpcraft.blocks.IMetaBlock2;


public class DiagonallyDottedCyan extends IMetaBlock2<BlockTypes2> {

	public DiagonallyDottedCyan() {
		super(Material.WOOD, "diagonally_dotted_cyan");
		this.setSoundType(SoundType.WOOD);
	}

	@Override
	protected BlockTypes2 getDefaultStateVariant() {
		return BlockTypes2.Zero;
	}

	@Override
	protected BlockTypes2 fromMeta(int meta) {
		return BlockTypes2.fromMeta(meta);
	}

	@Override
	protected PropertyEnum<BlockTypes2> getVariantEnum() {
		return BlockStates.WPblocks2;
	}
}