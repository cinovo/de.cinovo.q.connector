// -------------------------------------------------------------------------------
// -------------------------------------------------------------------------------
// Copyright (c) 2011-2012 Cinovo AG
// All rights reserved. This program and the accompanying materials
// are made available under the terms of the Apache License, Version 2.0
// which accompanies this distribution, and is available at
// http://www.apache.org/licenses/LICENSE-2.0.html
// -------------------------------------------------------------------------------

package de.cinovo.q.query;

import java.util.List;

import de.cinovo.q.Builder;
import de.cinovo.q.Q;
import de.cinovo.q.query.value.Value;

/**
 * Select.
 * 
 * @author mwittig
 * 
 */
public interface Function extends Q {
	
	/**
	 * @return Name
	 */
	String getName();
	
	/**
	 * @return Parameters
	 */
	List<Value> getParams();
	
	
	/**
	 * Function builder.
	 * 
	 * @author mwittig
	 * 
	 */
	public interface FunctionBuilder extends Builder<Function> {
		
		/**
		 * @param param Parameter
		 * @return FunctionBuilder
		 */
		FunctionBuilder param(Value value);
		
	}
	
}
