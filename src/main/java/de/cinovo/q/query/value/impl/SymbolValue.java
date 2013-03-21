// -------------------------------------------------------------------------------
// Copyright (c) 2011-2013 Cinovo AG
// All rights reserved. This program and the accompanying materials
// are made available under the terms of the Apache License, Version 2.0
// which accompanies this distribution, and is available at
// http://www.apache.org/licenses/LICENSE-2.0.html
// -------------------------------------------------------------------------------

package de.cinovo.q.query.value.impl;

import de.cinovo.q.query.type.Type;
import de.cinovo.q.query.type.impl.TypeList;
import de.cinovo.q.query.type.impl.TypeSymbol;

/**
 * Symbol value.
 * 
 * @author mwittig
 * 
 */
public final class SymbolValue extends AValue<String, TypeSymbol> {
	
	/** Null. */
	public static final String NULL = "`";
	
	
	/**
	 * @param value Value
	 * @return Symbol
	 */
	public static SymbolValue from(final String value) {
		return new SymbolValue(value, TypeSymbol.get());
	}
	
	/**
	 * @param values Values
	 * @return List of symbols
	 */
	public static ListValue<String, TypeList<String, Type<String>>> froms(final String... values) {
		return new ListValue<String, TypeList<String, Type<String>>>(values, TypeList.getSymbol());
	}
	
	/**
	 * @param value Value
	 * @param type Type
	 */
	private SymbolValue(final String value, final TypeSymbol type) {
		super(value, type);
	}
	
	@Override
	public String toQ() {
		if (this.get() == null) {
			return SymbolValue.NULL;
		}
		return "`" + this.get();
	}
	
}
