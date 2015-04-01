package org.tp8.r8t.service.intf;

import java.util.List;

import org.springframework.stereotype.Service;
import org.tp8.r8t.exc.GenericException;
import org.tp8.r8t.model.impl.Movie;

/**
 * The Interface CountryService.
 */
@Service("MovieService")
public interface MovieService {

	public List<Movie> findExcludingIds(List<String> ids) throws GenericException;

}
