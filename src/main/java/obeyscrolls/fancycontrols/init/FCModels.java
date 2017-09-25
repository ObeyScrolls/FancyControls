package obeyscrolls.fancycontrols.init;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class FCModels
{
    @SuppressWarnings("ConstantConditions")
    private static void registerItemModel(Item item)
    {
        ModelResourceLocation resourceLocation =
                new ModelResourceLocation(item.getRegistryName(), "inventory");
        ModelLoader.setCustomModelResourceLocation(item, 0, resourceLocation);
    }

    private static void registerBlockModel(Block block)
    {
        registerItemModel(Item.getItemFromBlock(block));
    }


    @Mod.EventBusSubscriber
    public static class EventHandler
    {
        @SubscribeEvent
        public static void registerModels(ModelRegistryEvent event)
        {
            /*=== Item models registration ===*/
            //registerItemModel(FCItems.itemtest);

            /*=== Block models registration ===*/
            //registerBlockModel(FCBlocks.blocktest);
        }
    }
}
