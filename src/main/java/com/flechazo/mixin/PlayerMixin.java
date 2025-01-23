package com.flechazo.mixin;

import com.flechazo.LinearXpConfig;
import me.shedaniel.autoconfig.AutoConfig;
import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

/**
 * 玩家类Mixin
 * 用于修改玩家升级所需经验值的计算逻辑
 *
 * @author Flechazo
 */
@Mixin(PlayerEntity.class)
public abstract class PlayerMixin {

    /**
     * 修改getExperienceNeededForNextLevel方法
     * 将原本的经验值计算逻辑改为固定值
     *
     * @param cir 回调信息
     */
    @Inject(method = "getNextLevelExperience", at = @At("HEAD"), cancellable = true)
    public void modifyXpNeededForNextLevel(CallbackInfoReturnable<Integer> cir) {
        LinearXpConfig config = AutoConfig.getConfigHolder(LinearXpConfig.class).getConfig();
        cir.setReturnValue(config.xpPerLevel);
    }
} 