// -------------------------------------------------------------------------------
// Copyright (c) 2011-2012 Cinovo AG
// All rights reserved. This program and the accompanying materials
// are made available under the terms of the Apache License, Version 2.0
// which accompanies this distribution, and is available at
// http://www.apache.org/licenses/LICENSE-2.0.html
// -------------------------------------------------------------------------------

package de.cinovo.q.query.column.impl;

import java.math.BigDecimal;

import de.cinovo.q.query.type.impl.TypeReal;

/**
 * Real column.
 * 
 * @author mwittig
 * 
 */
public class RealColumn extends ASimpleOrdinalColumn<BigDecimal, TypeReal> {
	
	/**
	 * @param name Name
	 */
	public RealColumn(final String name) {
		super(name, TypeReal.get());
	}
	
}