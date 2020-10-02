package net.wovenmc.woven.api.materials.material;

import net.wovenmc.woven.api.materials.material.settings.WovenMaterialSettings;

public abstract class WovenMaterial {
	public WovenMaterialSettings settings;

	public abstract void register();
}
