/*
 * GNU General Public License version 2
 *
 * Copyright (C) 2019-2020 JetBrains s.r.o.
 *
 * This program is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, write to the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 */
@file:Suppress("JAVA_MODULE_DOES_NOT_EXPORT_PACKAGE")

package org.jetbrains.projector.awt.peer

import java.awt.Desktop.Action
import java.awt.peer.DesktopPeer
import java.io.File
import java.net.URI

class PDesktopPeer : DesktopPeer {

  override fun isSupported(action: Action): Boolean {
    return false
  }

  override fun open(file: File) {}

  override fun edit(file: File) {}

  override fun print(file: File) {}

  override fun mail(mailtoURL: URI) {}

  override fun browse(url: URI) {}
}
