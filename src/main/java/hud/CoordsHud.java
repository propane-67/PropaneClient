package com.github.propane67.propaneclient.hud;

import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class CoordsHud {

    private final Minecraft mc = Minecraft.getMinecraft();

    @SubscribeEvent
    public void onRender(RenderGameOverlayEvent.Text event) {
        if (mc.gameSettings.showDebugInfo) return;
        if (mc.thePlayer == null) return;

        // Pega a posição do jogador, arredondando pra baixo
        int x = (int) Math.floor(mc.thePlayer.posX);
        int y = (int) Math.floor(mc.thePlayer.posY);
        int z = (int) Math.floor(mc.thePlayer.posZ);

        String texto = "XYZ: " + x + " " + y + " " + z;

        // Desenha logo abaixo do FPS (y = 17)
        mc.fontRendererObj.drawStringWithShadow(texto, 5, 17, 0xFFFFFF);
    }
}