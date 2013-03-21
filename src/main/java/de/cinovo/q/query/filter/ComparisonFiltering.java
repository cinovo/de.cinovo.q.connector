// -------------------------------------------------------------------------------
// Copyright (c) 2011-2013 Cinovo AG
// All rights reserved. This program and the accompanying materials
// are made available under the terms of the Apache License, Version 2.0
// which accompanies this distribution, and is available at
// http://www.apache.org/licenses/LICENSE-2.0.html
// -------------------------------------------------------------------------------

package de.cinovo.q.query.filter;

import de.cinovo.q.query.column.Column;
import de.cinovo.q.query.type.OrdinalType;
import de.cinovo.q.query.value.Value;

/**
 * Filter for comparison.
 * 
 * @author mwittig
 * 
 * @param <J> Java type
 * @param <T> Type
 */
public interface ComparisonFiltering<J, T extends OrdinalType<J>> {
	
	/**
	 * @param value Value
	 * @return Filter(> value)
	 */
	Filter filterGreaterThan(final Value<J, T> value);
	
	/**
	 * @param value Value
	 * @return Filter(>= value)
	 */
	Filter filterGreaterOrEqualThan(final Value<J, T> value);
	
	/**
	 * @param value Value
	 * @return Filter(< value)
	 */
	Filter filterSmallerThan(final Value<J, T> value);
	
	/**
	 * @param value Value
	 * @return Filter(<= value)
	 */
	Filter filterSmallerOrEqualThan(final Value<J, T> value);
	
	/**
	 * @param column Column
	 * @return Filter(> column)
	 */
	Filter filterGreaterThan(final Column<T> column);
	
	/**
	 * @param column Column
	 * @return Filter(>= column)
	 */
	Filter filterGreaterOrEqualThan(final Column<T> column);
	
	/**
	 * @param column Column
	 * @return Filter(< column)
	 */
	Filter filterSmallerThan(final Column<T> column);
	
	/**
	 * @param column Column
	 * @return Filter(<= column)
	 */
	Filter filterSmallerOrEqualThan(final Column<T> column);
	
}
