package sirjain.extensivediamonds;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sirjain.extensivediamonds.items.*;
import sirjain.extensivediamonds.painting.ModPaintings;
import sirjain.extensivediamonds.world.feature.ModConfiguredFeatures;
import sirjain.extensivediamonds.world.gen.ModOreGeneration;

public class ExtensiveDiamonds implements ModInitializer {
	public static final String MOD_ID = "extensivediamonds";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static final ItemGroup EXTENSIVEDIAMONDS_ITEM_GROUP = FabricItemGroupBuilder.build(new Identifier(MOD_ID, MOD_ID), () -> new ItemStack(Items.BEDROCK));

	// ORE BLOCKS

	public static final Block RED_DIAMOND_ORE = Registry.register(
			Registry.BLOCK,
			new Identifier(ExtensiveDiamonds.MOD_ID, "red_diamond_ore"),
			new OreBlock(FabricBlockSettings.of(Material.STONE).requiresTool().strength(3.0f, 3.0f), UniformIntProvider.create(0, 2))
	);

	public static final Item BLOCK_RED_DIAMOND_ORE = Registry.register(
			Registry.ITEM,
			new Identifier(ExtensiveDiamonds.MOD_ID, "red_diamond_ore"),
			new BlockItem(RED_DIAMOND_ORE, new Item.Settings().group(ExtensiveDiamonds.EXTENSIVEDIAMONDS_ITEM_GROUP))
	);

	public static final Block GREEN_DIAMOND_ORE = Registry.register(
			Registry.BLOCK,
			new Identifier(ExtensiveDiamonds.MOD_ID, "green_diamond_ore"),
			new OreBlock(FabricBlockSettings.of(Material.STONE).requiresTool().strength(3.0f, 3.0f), UniformIntProvider.create(0, 2))
	);

	public static final Item BLOCK_GREEN_DIAMOND_ORE = Registry.register(
			Registry.ITEM,
			new Identifier(ExtensiveDiamonds.MOD_ID, "green_diamond_ore"),
			new BlockItem(GREEN_DIAMOND_ORE, new Item.Settings().group(ExtensiveDiamonds.EXTENSIVEDIAMONDS_ITEM_GROUP))
	);

	public static final Block DARK_DIAMOND_ORE = Registry.register(
			Registry.BLOCK,
			new Identifier(ExtensiveDiamonds.MOD_ID, "dark_diamond_ore"),
			new OreBlock(FabricBlockSettings.of(Material.STONE).requiresTool().strength(3.0f, 3.0f), UniformIntProvider.create(0, 2))
	);

	public static final Item BLOCK_DARK_DIAMOND_ORE = Registry.register(
			Registry.ITEM,
			new Identifier(ExtensiveDiamonds.MOD_ID, "dark_diamond_ore"),
			new BlockItem(DARK_DIAMOND_ORE, new Item.Settings().group(ExtensiveDiamonds.EXTENSIVEDIAMONDS_ITEM_GROUP))
	);

	// DEEPSLATE ORE

	public static final Block DEEPSLATE_RED_DIAMOND_ORE = Registry.register(
			Registry.BLOCK,
			new Identifier(ExtensiveDiamonds.MOD_ID, "deepslate_red_diamond_ore"),
			new OreBlock(AbstractBlock.Settings.of(Material.STONE).requiresTool().strength(3.0f, 3.0f), UniformIntProvider.create(0, 2))
	);

	public static final Item BLOCK_DEEPSLATE_RED_DIAMOND_ORE = Registry.register(
			Registry.ITEM,
			new Identifier(ExtensiveDiamonds.MOD_ID, "deepslate_red_diamond_ore"),
			new BlockItem(DEEPSLATE_RED_DIAMOND_ORE, new Item.Settings().group(ExtensiveDiamonds.EXTENSIVEDIAMONDS_ITEM_GROUP))
	);

	// deepslate ore blocks

	public static final Block DEEPSLATE_GREEN_DIAMOND_ORE = Registry.register(
			Registry.BLOCK,
			new Identifier(ExtensiveDiamonds.MOD_ID, "deepslate_green_diamond_ore"),
			new OreBlock(AbstractBlock.Settings.of(Material.STONE).requiresTool().strength(3.0f, 3.0f), UniformIntProvider.create(0, 2))
	);

	public static final Item BLOCK_DEEPSLATE_GREEN_DIAMOND_ORE = Registry.register(
			Registry.ITEM,
			new Identifier(ExtensiveDiamonds.MOD_ID, "deepslate_green_diamond_ore"),
			new BlockItem(DEEPSLATE_GREEN_DIAMOND_ORE, new Item.Settings().group(ExtensiveDiamonds.EXTENSIVEDIAMONDS_ITEM_GROUP))
	);

	public static final Block DEEPSLATE_DARK_DIAMOND_ORE = Registry.register(
			Registry.BLOCK,
			new Identifier(ExtensiveDiamonds.MOD_ID, "deepslate_dark_diamond_ore"),
			new OreBlock(AbstractBlock.Settings.of(Material.STONE).requiresTool().strength(3.0f, 3.0f), UniformIntProvider.create(0, 2))
	);

	public static final Item BLOCK_DEEPSLATE_DARK_DIAMOND_ORE = Registry.register(
			Registry.ITEM,
			new Identifier(ExtensiveDiamonds.MOD_ID, "deepslate_dark_diamond_ore"),
			new BlockItem(DEEPSLATE_DARK_DIAMOND_ORE, new Item.Settings().group(ExtensiveDiamonds.EXTENSIVEDIAMONDS_ITEM_GROUP))
	);

	// ORE BLOCKS

	public static final Block BLOCK_OF_GREEN_DIAMOND = Registry.register(
			Registry.BLOCK,
			new Identifier(ExtensiveDiamonds.MOD_ID, "block_of_green_diamond"),
			new OreBlock(AbstractBlock.Settings.of(Material.STONE).requiresTool().strength(3.0f, 3.0f), UniformIntProvider.create(0, 2))
	);

	public static final Item BLOCK_OF_GREEN_DIAMOND_BLOCK = Registry.register(
			Registry.ITEM,
			new Identifier(ExtensiveDiamonds.MOD_ID, "block_of_green_diamond"),
			new BlockItem(BLOCK_OF_GREEN_DIAMOND, new Item.Settings().group(ExtensiveDiamonds.EXTENSIVEDIAMONDS_ITEM_GROUP))
	);

	public static final Block BLOCK_OF_RED_DIAMOND = Registry.register(
			Registry.BLOCK,
			new Identifier(ExtensiveDiamonds.MOD_ID, "block_of_red_diamond"),
			new OreBlock(AbstractBlock.Settings.of(Material.STONE).requiresTool().strength(3.0f, 3.0f), UniformIntProvider.create(0, 2))
	);

	public static final Item BLOCK_OF_RED_DIAMOND_BLOCK = Registry.register(
			Registry.ITEM,
			new Identifier(ExtensiveDiamonds.MOD_ID, "block_of_red_diamond"),
			new BlockItem(BLOCK_OF_RED_DIAMOND, new Item.Settings().group(ExtensiveDiamonds.EXTENSIVEDIAMONDS_ITEM_GROUP))
	);

	public static final Block BLOCK_OF_DARK_DIAMOND = Registry.register(
			Registry.BLOCK,
			new Identifier(ExtensiveDiamonds.MOD_ID, "block_of_dark_diamond"),
			new OreBlock(AbstractBlock.Settings.of(Material.STONE).requiresTool().strength(3.0f, 3.0f), UniformIntProvider.create(0, 2))
	);

	public static final Item BLOCK_OF_DARK_DIAMOND_BLOCK = Registry.register(
			Registry.ITEM,
			new Identifier(ExtensiveDiamonds.MOD_ID, "block_of_dark_diamond"),
			new BlockItem(BLOCK_OF_DARK_DIAMOND, new Item.Settings().group(ExtensiveDiamonds.EXTENSIVEDIAMONDS_ITEM_GROUP))
	);

	public static final Item FUSED_DIAMOND = Registry.register(
			Registry.ITEM,
			new Identifier(ExtensiveDiamonds.MOD_ID, "fused_diamond"),
			new DiamondItem(true)
	);

	public static final Item RED_DIAMOND = Registry.register(
			Registry.ITEM,
			new Identifier(ExtensiveDiamonds.MOD_ID, "red_diamond"),
			new DiamondItem(false)
	);

	public static final Item GREEN_DIAMOND = Registry.register(
			Registry.ITEM,
			new Identifier(ExtensiveDiamonds.MOD_ID, "green_diamond"),
			new DiamondItem(false)
	);

	public static final Item DARK_DIAMOND = Registry.register(
			Registry.ITEM,
			new Identifier(ExtensiveDiamonds.MOD_ID, "dark_diamond"),
			new DiamondItem(false)
	);

	// SWORDS

	public static final Item RED_DIAMOND_SWORD = Registry.register(
			Registry.ITEM,
			new Identifier(ExtensiveDiamonds.MOD_ID, "red_diamond_sword"),
			new DarkDiamondSwordItem(ModToolMaterials.RED_DIAMOND, 5, 2f, new Item.Settings().group(ExtensiveDiamonds.EXTENSIVEDIAMONDS_ITEM_GROUP))
	);

	public static final Item GREEN_DIAMOND_SWORD = Registry.register(
			Registry.ITEM,
			new Identifier(ExtensiveDiamonds.MOD_ID, "green_diamond_sword"),
			new RedDiamondSwordItem(ModToolMaterials.GREEN_DIAMOND, 6, 2f, new Item.Settings().group(ExtensiveDiamonds.EXTENSIVEDIAMONDS_ITEM_GROUP))
	);

	public static final Item DARK_DIAMOND_SWORD = Registry.register(
			Registry.ITEM,
			new Identifier(ExtensiveDiamonds.MOD_ID, "dark_diamond_sword"),
			new DarkDiamondSwordItem(ModToolMaterials.DARK_DIAMOND, 8, 2f, new Item.Settings().group(ExtensiveDiamonds.EXTENSIVEDIAMONDS_ITEM_GROUP))
	);

	@Override
	public void onInitialize() {
		ModConfiguredFeatures.registerConfiguredFeatures();
		ModOreGeneration.generateOres();
		ModPaintings.registerPaintings();
	}
}
