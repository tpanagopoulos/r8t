package org.tp8.r8t.persistence.elasticsearch.repository;

import org.tp8.r8t.model.impl.Movie;
import org.tp8.r8t.persistence.elasticsearch.custom.MovieCustom;

public interface MovieRepository extends BaseRepository<Movie>, MovieCustom {

}
