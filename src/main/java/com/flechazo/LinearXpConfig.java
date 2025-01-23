package com.flechazo;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;

/**
 * LinearXpFabric模组配置类
 * 用于管理模组的配置项
 *
 * @author Flechazo
 */
@Config(name = LinearXpFabric.MOD_ID)
public class LinearXpConfig implements ConfigData {
    
    /**
     * 每级升级所需的经验值
     * 默认值为50，最小值为1
     */
    @ConfigEntry.Gui.Tooltip
    public int xpPerLevel = 50;

    /**
     * 验证配置值是否合法
     * 确保xpPerLevel不小于1
     *
     */
    @Override
    public void validatePostLoad() throws ValidationException {
        if (xpPerLevel < 1) {
            xpPerLevel = 1;
        }
    }
} 