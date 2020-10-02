package net.wovenmc.woven.api.materials.material.thing;

import net.wovenmc.woven.api.materials.material.settings.WovenMaterialSettings;

public abstract class WovenMaterialThing<T extends WovenMaterialSettings> {
	public abstract void register(T settings);
}
