package org.tp8.r8t.persistence.elasticsearch.impl;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.tp8.r8t.exc.GenericException;
import org.tp8.r8t.model.impl.Movie;
import org.tp8.r8t.persistence.elasticsearch.custom.MovieCustom;

@Service
public class MovieRepositoryImpl extends AbstractESRepository<Movie> implements
		MovieCustom {

	@Override
	public List<Movie> findExcludingIds(List<String> ids)
			throws GenericException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Movie> queryByExample(Pageable pageable, Movie example) {
		// TODO Auto-generated method stub
		return null;
	}

}
