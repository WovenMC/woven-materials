package net.wovenmc.woven.api.materials.material.settings;

import net.wovenmc.woven.api.materials.material.thing.WovenMaterialThing;

import java.util.ArrayList;
import java.util.List;

public abstract class WovenMaterialSettings {
	public List<WovenMaterialThing> things = new ArrayList<>();
	public String name;

	public WovenMaterialSettings(String name) {
		this.name = name;
	}
}
