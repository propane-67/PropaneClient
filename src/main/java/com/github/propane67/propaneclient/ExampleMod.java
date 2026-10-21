package com.github.propane67.propaneclient;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import org.lwjgl.opengl.Display;

@Mod(modid = "propaneclient", useMetadata = true)
public class ExampleMod {

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        // Troca o título da janela do jogo
        Display.setTitle("Propane Client");
    }
}