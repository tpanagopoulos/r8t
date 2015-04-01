package org.tp8.r8t.persistence.elasticsearch.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchCrudRepository;
import org.tp8.r8t.model.BaseModel;

/**
 * The Interface BaseRepository.
 * 
 * @param <K>
 *            the key type
 * @param <T>
 *            the generic type
 */
public interface BaseRepository<T extends BaseModel<String>> extends
		ElasticsearchCrudRepository<T, String> {

}
