// -------------------------------------------------------------------------------
// Copyright (c) 2011-2012 Cinovo AG
// All rights reserved. This program and the accompanying materials
// are made available under the terms of the Eclipse Public License v1.0
// which accompanies this distribution, and is available at
// http://www.eclipse.org/legal/epl-v10.html
// -------------------------------------------------------------------------------

package de.cinovo.q.query.column.impl;

import de.cinovo.q.query.type.impl.TypeInteger;

/**
 * Integer column.
 *
 * @author mwittig
 *
 */
public class IntegerColumn extends ASimpleOrdinalColumn<TypeInteger> {

	/**
	 * @param name Name
	 */
	public IntegerColumn(final String name) {
		super(name, TypeInteger.class);
	}

}