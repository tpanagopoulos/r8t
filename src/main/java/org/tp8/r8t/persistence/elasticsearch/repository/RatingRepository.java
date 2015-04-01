package org.tp8.r8t.persistence.elasticsearch.repository;

import org.tp8.r8t.model.impl.Movie;
import org.tp8.r8t.persistence.elasticsearch.custom.RatingCustom;

public interface RatingRepository extends BaseRepository<Movie>, RatingCustom {

}
