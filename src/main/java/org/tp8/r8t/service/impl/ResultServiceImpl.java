package org.tp8.r8t.service.impl;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.tp8.r8t.exc.GenericException;
import org.tp8.r8t.model.impl.Rating;
import org.tp8.r8t.model.impl.Result;
import org.tp8.r8t.model.impl.ResultEntry;
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

		List<ResultEntry> resultEntries = new LinkedList<ResultEntry>();
		for (Rating rating : ratings) {
			ResultEntry entry = new ResultEntry();
			// TODO: Replace movieId with movie title
			entry.setMovie(rating.getMovieId());
			// TODO: Calculate average ratings
			entry.setAverage("" + rating.getScore().ordinal());
			entry.setCurrent("" + rating.getScore().ordinal());
			resultEntries.add(entry);
		}

		result.setResultEntries(resultEntries);
		result.setUserId(userId);

		// TODO: Persist result

		return result;
	}

}
