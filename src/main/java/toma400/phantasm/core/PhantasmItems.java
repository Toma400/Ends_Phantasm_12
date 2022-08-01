package toma400.phantasm.core;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.ArrayList;
import java.util.List;

public class PhantasmItems {

    public static final List<Item> ITEMS = new ArrayList<Item>();

    public static final Item VIVID_NIHILIUM = new Item();

    @SubscribeEvent
    public void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(VIVID_NIHILIUM.setRegistryName("vivid_nihilium").setCreativeTab(CreativeTabs.BUILDING_BLOCKS));
    }

}
