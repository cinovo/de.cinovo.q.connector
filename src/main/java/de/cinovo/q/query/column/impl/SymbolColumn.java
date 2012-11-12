// -------------------------------------------------------------------------------
// Copyright (c) 2011-2012 Cinovo AG
// All rights reserved. This program and the accompanying materials
// are made available under the terms of the Apache License, Version 2.0
// which accompanies this distribution, and is available at
// http://www.apache.org/licenses/LICENSE-2.0.html
// -------------------------------------------------------------------------------

package de.cinovo.q.query.column.impl;

import de.cinovo.q.query.type.impl.TypeSymbol;

/**
 * Symbol column.
 * 
 * @author mwittig
 * 
 */
public class SymbolColumn extends ASimpleNominalColumn<String, TypeSymbol> {
	
	/**
	 * @param name Name
	 */
	public SymbolColumn(final String name) {
		super(name, TypeSymbol.get());
	}
	
}