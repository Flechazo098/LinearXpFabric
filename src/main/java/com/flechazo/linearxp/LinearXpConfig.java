package com.flechazo.linearxp;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
@Config(name = LinearXp.MOD_ID)
public class LinearXpConfig implements ConfigData {

    @ConfigEntry.Gui.Tooltip
    public int xpPerLevel = 50;
    @Override
    public void validatePostLoad() throws ValidationException {
        if (xpPerLevel < 1) {
            xpPerLevel = 1;
        }
    }
} 