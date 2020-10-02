package net.wovenmc.woven.impl.materials.material.settings;

import net.wovenmc.woven.api.materials.material.settings.WovenMaterialSettings;

public class WovenToolMaterialSettings extends WovenMaterialSettings {
	public final int MAX_DURABILITY;

	public WovenToolMaterialSettings(String name, int durability) {
		super(name);
		this.MAX_DURABILITY = durability;
	}
}
