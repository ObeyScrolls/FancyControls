package obeyscrolls.fancycontrols.init;

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
public class FCItems
{
    /*=== ObjectHolders ===*/
    //public static final Item itemtest = null;


    @Mod.EventBusSubscriber
    public static class EventHandler
    {
        @SubscribeEvent
        public static void registerItems(RegistryEvent.Register<Item> event)
        {
            event.getRegistry().registerAll(
                    /*=== Items registration ===*/
                    //new ItemTest("itemtest")
            );
        }
    }
}
