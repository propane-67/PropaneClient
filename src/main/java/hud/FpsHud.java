package com.github.propane67.propaneclient.hud;

import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class FpsHud {

    private final Minecraft mc = Minecraft.getMinecraft();

    @SubscribeEvent
    public void onRender(RenderGameOverlayEvent.Text event) {
        // Não mostra quando a tela de F3 estiver aberta
        if (mc.gameSettings.showDebugInfo) return;

        String texto = "FPS: " + Minecraft.getDebugFPS();

        // Escreve o texto na posição x=5, y=5, em branco com sombra
        mc.fontRendererObj.drawStringWithShadow(texto, 5, 5, 0xFFFFFF);
    }
}