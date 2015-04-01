package org.tp8.r8t.persistence.elasticsearch.custom;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.tp8.r8t.model.BaseModel;

/**
 * The Interface BaseCustom.
 * 
 * @param <K>
 *            the key type
 * @param <T>
 *            the generic type
 */
public interface BaseCustom<T extends BaseModel<String>> {

	/**
	 * Query by example.
	 * 
	 * @param pageable
	 *            the pageable
	 * @param example
	 *            the example
	 * @return the page
	 */
	Page<T> queryByExample(Pageable pageable, T example);

}
