package org.tp8.r8t.persistence.dao;

import java.util.List;

import org.tp8.r8t.exc.GenericException;
import org.tp8.r8t.model.impl.Movie;

public interface MovieDAO {

	public List<Movie> findExcludingIds(List<String> ids) throws GenericException;

}
