// -------------------------------------------------------------------------------
// Copyright (c) 2011-2013 Cinovo AG
// All rights reserved. This program and the accompanying materials
// are made available under the terms of the Apache License, Version 2.0
// which accompanies this distribution, and is available at
// http://www.apache.org/licenses/LICENSE-2.0.html
// -------------------------------------------------------------------------------

package de.cinovo.q.query.column.impl;

import java.sql.Time;

import de.cinovo.q.query.type.impl.TypeTime;

/**
 * Time column.
 * 
 * @author mwittig
 * 
 */
public class TimeColumn extends ASimpleOrdinalColumn<Time, TypeTime> {
	
	/**
	 * @param name Name
	 */
	public TimeColumn(final String name) {
		super(name, TypeTime.get());
	}
	
}
