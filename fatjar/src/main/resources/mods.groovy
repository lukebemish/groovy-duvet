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

ModsDotGroovy.make {
    issueTrackerUrl = 'https://github.com/lukebemish/groovy-duvet/issues'
    license = 'LGPL-3.0-or-later'
    mod {
        modId = 'groovyduvet'
        version = this.version
        group = this.group
        displayName = 'GroovyDuvet'
        description = 'Language adapter and wrapper libraries for Groovy mods on Quilt'
        author 'Luke Bemish'
        intermediate_mappings = "net.fabricmc:intermediary"
        dependencies {
            quiltLoader = ">=${this.quiltLoaderVersion}"
            // See https://github.com/QuiltMC/quilt-loader/issues/110
            minecraft = ">=${this.minecraftVersion}"
            minecraft = "<1.${this.minecraftVersion.split(/\./)[1] as int+1}.0"
            groovyduvet_core = ">=${this.version}"
            groovyduvet_wrapper_minecraft = ">=${this.version}"
        }
        displayUrl = 'https://github.com/lukebemish/groovy-duvet'
        logoFile = 'assets/groovyduvet/icon.png'
    }
    modmenu = ['badges':['library']]
}