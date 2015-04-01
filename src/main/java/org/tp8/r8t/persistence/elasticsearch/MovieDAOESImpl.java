package org.tp8.r8t.persistence.elasticsearch;

import java.util.List;

import org.springframework.stereotype.Service;
import org.tp8.r8t.exc.GenericException;
import org.tp8.r8t.model.impl.Movie;
import org.tp8.r8t.persistence.dao.MovieDAO;

@Service("MovieDAO")
public class MovieDAOESImpl implements MovieDAO {

	@Override
	public List<Movie> findExcludingIds(List<String> ids)
			throws GenericException {
		// TODO Auto-generated method stub
		return null;
	}


}
