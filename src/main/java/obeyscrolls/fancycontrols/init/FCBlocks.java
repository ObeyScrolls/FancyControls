package obeyscrolls.fancycontrols.init;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import obeyscrolls.fancycontrols.FCConst;

import javax.annotation.ParametersAreNonnullByDefault;

@SuppressWarnings("WeakerAccess")
@ParametersAreNonnullByDefault
@ObjectHolder(FCConst.MODID)
public class FCBlocks
{
    /*=== ObjectHolders ===*/
    //public static final Block blocktest = null;


    @Mod.EventBusSubscriber
    public static class EventHandler
    {
        @SubscribeEvent
        public static void registerBlocks(RegistryEvent.Register<Block> event)
        {
            event.getRegistry().registerAll(
                    /*=== Blocks registration ===*/
                    //new BlockTest("blocktest")
            );
        }

        @SuppressWarnings("ConstantConditions")
        @SubscribeEvent
        public static void registerItems(RegistryEvent.Register<Item> event)
        {
            event.getRegistry().registerAll(
                    /*=== ItemBlocks registration ===*/
                    //new ItemBlock(blocktest).setRegistryName(blocktest.getRegistryName())
            );
        }
    }
}
