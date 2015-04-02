package org.tp8.r8t.persistence.elasticsearch.impl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.tp8.r8t.model.impl.Movie;
import org.tp8.r8t.persistence.elasticsearch.custom.MovieCustom;

@Service
public class MovieRepositoryImpl extends AbstractESRepository<Movie> implements
		MovieCustom {

	@Override
	public Page<Movie> queryByExample(Pageable pageable, Movie example) {
		// TODO Auto-generated method stub
		return null;
	}

}
