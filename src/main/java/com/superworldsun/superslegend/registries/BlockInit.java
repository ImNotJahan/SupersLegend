package com.superworldsun.superslegend.registries;

import com.superworldsun.superslegend.SupersLegendMain;
import com.superworldsun.superslegend.blocks.*;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.AbstractRailBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit
{
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, SupersLegendMain.MOD_ID);
	
	public static final RegistryObject<Block> RUST = BLOCKS.register("rust", () -> new Block(PropertiesInit.WRECKAGE));
	public static final RegistryObject<Block> RUPEE_BLOCK = BLOCKS.register("rupee_block", () -> new Block(PropertiesInit.WRECKAGE));
	public static final RegistryObject<Block> BLUE_RUPEE_BLOCK = BLOCKS.register("blue_rupee_block", () -> new Block(PropertiesInit.WRECKAGE));
	public static final RegistryObject<Block> RED_RUPEE_BLOCK = BLOCKS.register("red_rupee_block", () -> new Block(PropertiesInit.WRECKAGE));
	public static final RegistryObject<Block> SILVER_RUPEE_BLOCK = BLOCKS.register("silver_rupee_block", () -> new Block(PropertiesInit.WRECKAGE));
	public static final RegistryObject<Block> GOLD_RUPEE_BLOCK = BLOCKS.register("gold_rupee_block", () -> new Block(PropertiesInit.WRECKAGE));
	public static final RegistryObject<Block> SPIKES_BLOCK = BLOCKS.register("spikes_block", () -> new SpikesBlock(PropertiesInit.WRECKAGE));
	public static final RegistryObject<Block> ANCIENT_TABLET = BLOCKS.register("ancient_tablet", () -> new AncientTablet(PropertiesInit.WRECKAGE));
	public static final RegistryObject<Block> ANCIENT_TABLET_RUBBLE = BLOCKS.register("ancient_tablet_rubble", () -> new Block(PropertiesInit.WRECKAGE));
	public static final RegistryObject<Block> ANCIENT_TABLET_BOMBOS = BLOCKS.register("ancient_tablet_bombos", () -> new AncientTablet(PropertiesInit.WRECKAGE));
	public static final RegistryObject<Block> ANCIENT_TABLET_ETHER = BLOCKS.register("ancient_tablet_ether", () -> new AncientTablet(PropertiesInit.WRECKAGE));
	public static final RegistryObject<Block> ANCIENT_TABLET_QUAKE = BLOCKS.register("ancient_tablet_quake", () -> new AncientTablet(PropertiesInit.WRECKAGE));
	public static final RegistryObject<Block> GOSSIP_STONE_BLOCK = BLOCKS.register("gossip_stone_block", () -> new GossipStoneBlock(PropertiesInit.WRECKAGE));
	public static final RegistryObject<Block> GOSSIP_STONE_TOP = BLOCKS.register("gossip_stone_top", GossipStoneTopBlock::new);
	public static final RegistryObject<Block> BUSH_BLOCK = BLOCKS.register("bush_block", () -> new BushBlock(PropertiesInit.WRECKAGE));
	public static final RegistryObject<Block> CHAIN_LINK_FENCE_BLOCK = BLOCKS.register("chain_link_fence_block", () -> new ChainLinkFenceBlock(PropertiesInit.WRECKAGE));
	public static final RegistryObject<Block> GRAPPLE_BLOCK = BLOCKS.register("grapple_block", () -> new Block(PropertiesInit.WRECKAGE));
	public static final RegistryObject<Block> DEKU_FLOWER_BLOCK = BLOCKS.register("deku_flower_block", () -> new DekuFlowerBlock(PropertiesInit.WRECKAGE));
	public static final RegistryObject<Block> YELLOW_DEKU_FLOWER_BLOCK = BLOCKS.register("yellow_deku_flower_block", () -> new DekuFlowerBlock(PropertiesInit.WRECKAGE));
	public static final RegistryObject<Block> POT_BLOCK = BLOCKS.register("pot_block", () -> new PotBlock(PropertiesInit.WRECKAGE));
	public static final RegistryObject<Block> JAR_BLOCK = BLOCKS.register("jar_block", () -> new JarBlock(PropertiesInit.WRECKAGE));
	public static final RegistryObject<Block> POSTBOX_BLOCK = BLOCKS.register("postbox_block", () -> new PostboxBlock(PropertiesInit.WRECKAGE));
	public static final RegistryObject<Block> POSTBOX_TOP = BLOCKS.register("postbox_top", PostboxTopBlock::new);
	public static final RegistryObject<Block> GRATE_BLOCK = BLOCKS.register("grate_block", () -> new GrateBlock(PropertiesInit.WRECKAGE));
	public static final RegistryObject<Block> GRASS_PATCH_BLOCK = BLOCKS.register("grass_patch_block", () -> new GrassPatch(PropertiesInit.WRECKAGE));
	public static final RegistryObject<Block> ODD_MUSHROOM = BLOCKS.register("odd_mushroom", () -> new OddMushroomBlock(PropertiesInit.WRECKAGE));
	public static final RegistryObject<Block> MAGIC_MUSHROOM = BLOCKS.register("magic_mushroom", () -> new MagicMushroomBlock(PropertiesInit.WRECKAGE));
	public static final RegistryObject<Block> TORCH_TOWER = BLOCKS.register("torch_tower", () -> new Block(PropertiesInit.WRECKAGE));
	public static final RegistryObject<Block> MASTER_ORE_BLOCK = BLOCKS.register("master_ore_block", () -> new Block(PropertiesInit.WRECKAGE));
	public static final RegistryObject<Block> WOODEN_PEG_BLOCK = BLOCKS.register("wooden_peg_block", () -> new WoodenPegBlock(PropertiesInit.WRECKAGE));
	public static final RegistryObject<Block> RUSTED_PEG_BLOCK = BLOCKS.register("rusted_peg_block", () -> new RustedPegBlock(PropertiesInit.WRECKAGE));
	public static final RegistryObject<Block> HAMMERED_WOODEN_PEG_BLOCK = BLOCKS.register("hammered_wooden_peg_block", () -> new HammeredWoodenPegBlock(PropertiesInit.HAMMERED_WOODEN_PEG));
	public static final RegistryObject<Block> HAMMERED_RUSTED_PEG_BLOCK = BLOCKS.register("hammered_rusted_peg_block", () -> new HammeredRustedPegBlock(PropertiesInit.WRECKAGE));
	public static final RegistryObject<Block> SHADOW_BLOCK = BLOCKS.register("shadow_block", () -> new Block(PropertiesInit.WRECKAGE));
	public static final RegistryObject<Block> FALSE_SHADOW_BLOCK = BLOCKS.register("false_shadow_block", FalseShadowBlock::new);
	public static final RegistryObject<Block> HIDDEN_SHADOW_BLOCK = BLOCKS.register("hidden_shadow_block", HiddenShadowBlock::new);
	public static final RegistryObject<Block> TOMBSTONE_BLOCK = BLOCKS.register("tombstone_block", () -> new TombstoneBlock(PropertiesInit.WRECKAGE));
	public static final RegistryObject<Block> STONE_PATH_BLOCK = BLOCKS.register("stone_path_block", () -> new StonePathBlock(PropertiesInit.WRECKAGE));
	public static final RegistryObject<Block> STONE_TILE_BLOCK = BLOCKS.register("stone_tile_block", () -> new StoneTileBlock(PropertiesInit.WRECKAGE));
	public static final RegistryObject<Block> DINS_FLAME = BLOCKS.register("dins_flame", () -> new DinsFlame(PropertiesInit.WRECKAGE));
	public static final RegistryObject<Block> FARORES_FLAME = BLOCKS.register("farores_flame", () -> new FaroresFlame(PropertiesInit.WRECKAGE));
	public static final RegistryObject<Block> NAYRUS_FLAME = BLOCKS.register("nayrus_flame", () -> new NayrusFlame(PropertiesInit.WRECKAGE));
	public static final RegistryObject<Block> POINTER_BLOCK = BLOCKS.register("pointer_block", () -> new PointerBlock(PropertiesInit.WRECKAGE));
	public static final RegistryObject<Block> RUST_PLATE = BLOCKS.register("rust_plate", () -> new RustPlateBlock(PropertiesInit.RUST_PLATE));
	public static final RegistryObject<Block> RUST_BUTTON = BLOCKS.register("rust_button", () -> new RustButtonBlock(PropertiesInit.WRECKAGE));
	public static final RegistryObject<Block> RUST_STAIRS = BLOCKS.register("rust_stairs", () -> new RustStairsBlock(RUST.get().defaultBlockState(), PropertiesInit.WRECKAGE));
	public static final RegistryObject<Block> RUST_WALL = BLOCKS.register("rust_wall", () -> new RustWallBlock(PropertiesInit.WRECKAGE));
	public static final RegistryObject<Block> RUST_SLAB = BLOCKS.register("rust_slab", () -> new RustSlabBlock(PropertiesInit.WRECKAGE));
	public static final RegistryObject<Block> PEDESTAL = BLOCKS.register("pedestal", PedestalBlock::new);
	public static final RegistryObject<Block> FAN = BLOCKS.register("fan", FanBlock::new);
	public static final RegistryObject<Block> SWITCHABLE_FAN = BLOCKS.register("switchable_fan", SwitchableFanBlock::new);
	public static final RegistryObject<FluidBlock> LIQUID_POISON = BLOCKS.register("liquid_poison", () -> new FluidBlock(FluidInit.POISON_SOURCE));
	public static final RegistryObject<FluidBlock> LIQUID_MUD = BLOCKS.register("liquid_mud", () -> new FluidBlock(FluidInit.MUD_SOURCE));
	public static final RegistryObject<Block> LIGHT_EMITTER = BLOCKS.register("light_emitter", LightEmitterBlock::new);
	public static final RegistryObject<Block> LIGHT_PRISM = BLOCKS.register("light_prism", LightPrismBlock::new);
	public static final RegistryObject<Block> RIDGED_WALL_RAIL = BLOCKS.register("ridged_wall_rail", () -> new RidgedWallRail(AbstractBlock.Properties.of(Material.DECORATION).noCollission().strength(0.7F).sound(SoundType.METAL)));
}
