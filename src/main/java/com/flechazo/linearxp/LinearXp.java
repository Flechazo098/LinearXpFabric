package com.flechazo.linearxp;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LinearXp implements ModInitializer {
	public static final String MOD_ID = "linearxp";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		AutoConfig.register(LinearXpConfig.class, GsonConfigSerializer::new);
	}
}