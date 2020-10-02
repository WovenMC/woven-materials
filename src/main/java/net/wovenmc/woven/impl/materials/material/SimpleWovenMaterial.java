package net.wovenmc.woven.impl.materials.material;

import net.wovenmc.woven.api.materials.material.WovenMaterial;
import net.wovenmc.woven.api.materials.material.settings.WovenMaterialSettings;
import net.wovenmc.woven.api.materials.material.thing.WovenMaterialThing;

public class SimpleWovenMaterial extends WovenMaterial {
	public WovenMaterialSettings settings;

	public SimpleWovenMaterial() {

	}

	@Override
	public void register() {
		for(WovenMaterialThing thing : settings.things) {
			thing.register();
		}
	}
}
