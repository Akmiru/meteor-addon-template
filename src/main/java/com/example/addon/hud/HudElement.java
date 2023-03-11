package com.example.addon.hud;

import com.example.addon.Addon;
import meteordevelopment.meteorclient.systems.hud.HudElementInfo;
import meteordevelopment.meteorclient.systems.hud.HudRenderer;
import meteordevelopment.meteorclient.utils.render.color.Color;

public class HudElement extends meteordevelopment.meteorclient.systems.hud.HudElement {
    public static final HudElementInfo<HudElement> INFO = new HudElementInfo<>(Addon.HUD_GROUP, "First", "HUD element example.", HudElement::new);

    public HudElement() {
        super(INFO);
    }

    @Override
    public void render(HudRenderer renderer) {
        setSize(renderer.textWidth("Example element", true), renderer.textHeight(true));

        renderer.text("Example element", x, y, Color.WHITE, true);
    }
}
