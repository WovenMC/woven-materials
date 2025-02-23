/*
 * Copyright (c) 2020 WovenMC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.wovenmc.woven.api.materials;

import net.fabricmc.fabric.api.event.registry.FabricRegistryBuilder;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.SimpleRegistry;
import net.wovenmc.woven.impl.materials.WovenMaterialsImpl;
import net.wovenmc.woven.impl.materials.material.SimpleWovenMaterial;

public interface WovenMaterials {
	WovenMaterials INSTANCE = WovenMaterialsImpl.INSTANCE;
	SimpleRegistry MATERIALS = FabricRegistryBuilder.createSimple(SimpleWovenMaterial.class, new Identifier("woven_materials", "materials")).buildAndRegister();
}
