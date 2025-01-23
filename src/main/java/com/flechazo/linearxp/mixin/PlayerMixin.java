package com.flechazo.linearxp.mixin;

import com.flechazo.linearxp.LinearXpConfig;
import me.shedaniel.autoconfig.AutoConfig;
import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PlayerEntity.class)
public abstract class PlayerMixin {
    @Inject(method = "getNextLevelExperience", at = @At("HEAD"), cancellable = true)
    public void modifyXpNeededForNextLevel(CallbackInfoReturnable<Integer> cir) {
        LinearXpConfig config = AutoConfig.getConfigHolder(LinearXpConfig.class).getConfig();
        cir.setReturnValue(config.xpPerLevel);
    }
} 