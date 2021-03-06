package org.tp8.r8t.service.facade;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.tp8.r8t.exc.GenericException;
import org.tp8.r8t.model.impl.Movie;
import org.tp8.r8t.model.impl.Rating;
import org.tp8.r8t.model.impl.Result;
import org.tp8.r8t.service.intf.MovieService;
import org.tp8.r8t.service.intf.RatingService;
import org.tp8.r8t.service.intf.ResultService;

@Component("gameFacade")
public class GameFacade {

	@Autowired
	private MovieService movieService;

	@Autowired
	private RatingService ratingService;

	@Autowired
	private ResultService resultService;

	public List<Movie> start(String userId) throws GenericException {

		List<Rating> ratings = ratingService.findByUser(userId);

		Set<String> idSet = new HashSet<String>();
		for (Rating rating : ratings) {
			idSet.add(rating.getMovieId());
		}
		if (idSet.isEmpty()) {
			idSet.add("-1");
		}
		
		List<Movie> movies = movieService
				.findExcludingIds(new LinkedList<String>(idSet));

		return movies;
	}

	public Result finish(List<Rating> ratings) throws GenericException {
		ratingService.submit(ratings);

		return resultService.constructResult(ratings);
	}

}
