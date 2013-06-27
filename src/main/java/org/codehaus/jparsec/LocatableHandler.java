/*****************************************************************************
 * Copyright (C) Codehaus.org                                                *
 * ------------------------------------------------------------------------- *
 * Licensed under the Apache License, Version 2.0 (the "License");           *
 * you may not use this file except in compliance with the License.          *
 * You may obtain a copy of the License at                                   *
 *                                                                           *
 * http://www.apache.org/licenses/LICENSE-2.0                                *
 *                                                                           *
 * Unless required by applicable law or agreed to in writing, software       *
 * distributed under the License is distributed on an "AS IS" BASIS,         *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  *
 * See the License for the specific language governing permissions and       *
 * limitations under the License.                                            *
 *****************************************************************************/

package org.codehaus.jparsec;

public interface LocatableHandler<T> {
	/**
	 * Callback method.
	 * @param obj the parsing result object.
	 * @param source the parsed String.
	 * @param beginIndex beginning index of the source in the parsed input.
	 * @param endIndex ending index of the source in the parsed input.
	 */
	public void handle(T obj, String source, String module, int beginIndex, int endIndex);
}