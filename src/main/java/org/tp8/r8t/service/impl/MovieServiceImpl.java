package org.tp8.r8t.service.impl;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tp8.r8t.exc.GenericException;
import org.tp8.r8t.model.impl.Movie;
import org.tp8.r8t.persistence.elasticsearch.repository.MovieRepository;
import org.tp8.r8t.service.intf.MovieService;

@Service(value = "MovieService")
public class MovieServiceImpl extends AbstractService implements MovieService {

	@Autowired
	private MovieRepository movieDAO;

	@PostConstruct
	public void initialize() {
		for (int i = 0; i < 10; i++) {
			Movie movie = new Movie();
			movie.setId("" + i);
			movie.setTitle("title" + i);
			
			movieDAO.save(movie);
		}
	}
	
	@Override
	public List<Movie> findExcludingIds(List<String> ids)
			throws GenericException {
		return movieDAO.findByIdNotIn(ids, getDefaultPageable());
	}

}
