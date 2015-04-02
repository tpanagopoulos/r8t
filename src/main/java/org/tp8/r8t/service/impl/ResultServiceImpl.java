package org.tp8.r8t.service.impl;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.tp8.r8t.exc.GenericException;
import org.tp8.r8t.model.enums.Score;
import org.tp8.r8t.model.impl.Rating;
import org.tp8.r8t.model.impl.Result;
import org.tp8.r8t.service.intf.ResultService;

@Service(value = "ResultService")
public class ResultServiceImpl implements ResultService {

	@Override
	public Result constructResult(List<Rating> ratings) throws GenericException {

		if (ratings == null || ratings.isEmpty()) {
			throw new GenericException("Empty value passed");
		}

		String userId = ratings.get(0).getUserId();

		Result result = new Result();

		Map<String, Score> ratingsMap = new LinkedHashMap<String, Score>();
		for (Rating rating : ratings) {
			// TODO: Replace movieId with movie title
			ratingsMap.put(rating.getMovieId(), rating.getScore());
		}

		// TODO: Fetch average ratings
		result.setAverageRatings(ratingsMap);
		result.setUserRatings(ratingsMap);
		result.setUserId(userId);

		// TODO: Persist result

		return result;
	}

}
