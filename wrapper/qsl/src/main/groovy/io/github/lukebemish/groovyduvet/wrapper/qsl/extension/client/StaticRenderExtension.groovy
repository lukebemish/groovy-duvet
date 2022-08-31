/*
 * Copyright (C) 2022 Luke Bemish
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, see <https://www.gnu.org/licenses/>.
 */

package io.github.lukebemish.groovyduvet.wrapper.qsl.extension.client

import net.fabricmc.api.EnvType
import net.fabricmc.api.Environment
import net.minecraft.client.renderer.ItemBlockRenderTypes
import net.minecraft.client.renderer.RenderType
import net.minecraft.world.level.block.Block
import net.minecraft.world.level.material.Fluid
import org.quiltmc.qsl.block.extensions.api.client.BlockRenderLayerMap

@Environment(EnvType.CLIENT)
class StaticRenderExtension {
    static void putAt(ItemBlockRenderTypes type, Block block, RenderType layer) {
        BlockRenderLayerMap.put(layer, block)
    }

    static void putAt(ItemBlockRenderTypes type, Fluid fluid, RenderType layer) {
        BlockRenderLayerMap.put(layer, fluid)
    }

    static void putAt(ItemBlockRenderTypes type, Block block, RenderType layer) {
        BlockRenderLayerMap.put(layer, block)
    }

    static void putAt(ItemBlockRenderTypes type, Fluid fluid, RenderType layer) {
        BlockRenderLayerMap.put(layer, fluid)
    }
}
