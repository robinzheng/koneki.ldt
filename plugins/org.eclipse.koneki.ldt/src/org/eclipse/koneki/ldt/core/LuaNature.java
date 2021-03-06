/*******************************************************************************
 * Copyright (c) 2009, 2011 Sierra Wireless and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sierra Wireless - initial API and implementation
 *******************************************************************************/

/**
 * @author	Kevin KIN-FOO <kkinfoo@anyware-tech.com>
 * @date $Date: 2009-06-15 17:55:03 +0200 (lun., 15 juin 2009) $
 * $Author: kkinfoo $
 * $Id: LuaNature.java 1841 2009-06-15 15:55:03Z kkinfoo $
 */
package org.eclipse.koneki.ldt.core;

import org.eclipse.dltk.core.ScriptNature;
import org.eclipse.koneki.ldt.Activator;

/**
 * The Class LuaNature gives a common denomination used by several components of the IDE.
 * 
 * @author Kevin KIN-FOO <kkin-foo@sierrawireless.com>
 */
public class LuaNature extends ScriptNature {

	/**
	 * Nature of IDE composed from plug-in ID
	 * 
	 * @return String
	 */
	public static final String LUA_NATURE = Activator.PLUGIN_ID + ".nature"; //$NON-NLS-1$
}
