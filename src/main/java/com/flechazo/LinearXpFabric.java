package com.flechazo;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * LinearXpFabric Mod主类
 * 实现线性经验值系统，使每级升级所需经验值固定
 *
 * @author Flechazo
 */
public class LinearXpFabric implements ModInitializer {
	public static final String MOD_ID = "linearxpfabric";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	/**
	 * Mod初始化方法
	 * 注册配置系统并进行必要的初始化
	 */
	@Override
	public void onInitialize() {
		// 注册配置
		AutoConfig.register(LinearXpConfig.class, GsonConfigSerializer::new);
		LOGGER.info("LinearXpFabric initialized!");
	}
}