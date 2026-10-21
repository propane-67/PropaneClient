package com.github.propane67.propaneclient;

import com.github.propane67.propaneclient.hud.FpsHud;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import org.lwjgl.opengl.Display;

@Mod(modid = "propaneclient", useMetadata = true)
public class ExampleMod {

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        // Troca o título da janela do jogo
        Display.setTitle("Propane Client");

        // Liga os módulos do HUD
        MinecraftForge.EVENT_BUS.register(new FpsHud());
    }
}