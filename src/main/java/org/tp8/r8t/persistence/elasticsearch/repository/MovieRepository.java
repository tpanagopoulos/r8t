package org.tp8.r8t.persistence.elasticsearch.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.tp8.r8t.model.impl.Movie;
import org.tp8.r8t.persistence.BaseRepository;
import org.tp8.r8t.persistence.elasticsearch.custom.MovieCustom;

public interface MovieRepository extends BaseRepository<Movie>, MovieCustom {

	public List<Movie> findByIdNotIn(List<String> ids, Pageable pageable);

}
