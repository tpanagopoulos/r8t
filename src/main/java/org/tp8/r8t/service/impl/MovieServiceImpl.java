package org.tp8.r8t.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tp8.r8t.exc.GenericException;
import org.tp8.r8t.model.impl.Movie;
import org.tp8.r8t.persistence.dao.MovieDAO;
import org.tp8.r8t.service.intf.MovieService;

@Service(value = "MovieService")
public class MovieServiceImpl implements MovieService {

	@Autowired
	private MovieDAO movieDAO;

	@Override
	public List<Movie> findExcludingIds(List<String> ids)
			throws GenericException {
		return movieDAO.findExcludingIds(ids);
	}

}
