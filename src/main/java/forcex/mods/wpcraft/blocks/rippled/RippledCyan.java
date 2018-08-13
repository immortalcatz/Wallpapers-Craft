package forcex.mods.wpcraft.blocks.rippled;

import forcex.mods.wpcraft.blockstates.BlockStates;
import forcex.mods.wpcraft.blockstates.BlockTypes2;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import forcex.mods.wpcraft.blocks.IMetaBlock2;


public class RippledCyan extends IMetaBlock2<BlockTypes2> {

	public RippledCyan() {
		super(Material.WOOD, "rippled_cyan");
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