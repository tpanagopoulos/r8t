package org.tp8.r8t.persistence.elasticsearch.custom;

import java.util.List;

import org.tp8.r8t.exc.GenericException;
import org.tp8.r8t.model.impl.Movie;

public interface MovieCustom extends BaseCustom<Movie> {

	public List<Movie> findExcludingIds(List<String> ids)
			throws GenericException;

}
