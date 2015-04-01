package org.tp8.r8t.model;

import java.io.Serializable;

/**
 * The Interface BaseModel.
 * 
 * @param <T>
 *            the generic type
 */
public interface BaseModel<T> extends Serializable {

	/**
	 * Gets the id.
	 * 
	 * @return the id
	 */
	public T getId();

	/**
	 * Sets the id.
	 * 
	 * @param id
	 *            the new id
	 */
	public void setId(T id);

}
