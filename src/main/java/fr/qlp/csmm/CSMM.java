package fr.qlp.csmm;

import fr.qlp.csmm.init.ModBlock;
import fr.qlp.csmm.init.ModItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("csmm")
public class CSMM {

    public static final String MODID  ="csmm";

    public CSMM() {


        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);


        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.ITEMS.register(bus);
        ModBlock.BLOCKS.register(bus);
    }
    private void setup(FMLCommonSetupEvent e)
    {


    }


    private void clientSetup (FMLClientSetupEvent e){

    }
}
