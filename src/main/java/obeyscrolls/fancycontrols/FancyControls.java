package obeyscrolls.fancycontrols;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import static obeyscrolls.fancycontrols.FCConst.*;

@Mod(modid = MODID, name = NAME, version = VERSION,
     acceptedMinecraftVersions = MCVERSION, dependencies = DEPENDENCIES)
public class FancyControls
{
    @Mod.Instance
    public static FancyControls instance;

    @Mod.EventHandler
    public static void preInit(FMLPreInitializationEvent event)
    {
    }
}
