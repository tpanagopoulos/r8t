package org.tp8.r8t.service.intf;

import java.util.List;

import org.springframework.stereotype.Service;
import org.tp8.r8t.exc.GenericException;
import org.tp8.r8t.model.impl.Rating;
import org.tp8.r8t.model.impl.Result;

/**
 * The Interface CountryService.
 */
@Service("MovieService")
public interface RatingService {

	public List<Rating> findByUser(String userId) throws GenericException;

	public Result submit(List<Rating> ratings) throws GenericException;

}
