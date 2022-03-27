package toma400.phantasm.core;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStone;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.RegistryBuilder;

public class PhantasmBlocks {

    public static final Block VIVID_NIHILIUM = new Block (Material.ROCK);

    @SubscribeEvent
    public void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().register(VIVID_NIHILIUM.setRegistryName("vivid_nihilium").setHardness(2.2f).setResistance(9f).setCreativeTab(CreativeTabs.BUILDING_BLOCKS));
    }
}
