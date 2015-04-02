package org.tp8.r8t.persistence.elasticsearch.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.tp8.r8t.exc.GenericException;
import org.tp8.r8t.model.impl.Rating;
import org.tp8.r8t.persistence.BaseRepository;
import org.tp8.r8t.persistence.elasticsearch.custom.RatingCustom;

public interface RatingRepository extends BaseRepository<Rating>, RatingCustom {

	public List<Rating> findByUserId(String userId, Pageable pageable)
			throws GenericException;

}
