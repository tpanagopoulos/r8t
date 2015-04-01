package org.tp8.r8t.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tp8.r8t.exc.GenericException;
import org.tp8.r8t.model.impl.Rating;
import org.tp8.r8t.model.impl.Result;
import org.tp8.r8t.persistence.elasticsearch.repository.RatingRepository;
import org.tp8.r8t.service.intf.RatingService;

@Service(value = "RatingService")
public class RatingServiceImpl implements RatingService {

	@Autowired
	private RatingRepository ratingDAO;

	@Override
	public List<Rating> findByUser(String userId) throws GenericException {
		return ratingDAO.findByUser(userId);
	}

	@Override
	public Result submit(List<Rating> ratings) throws GenericException {
		return ratingDAO.saveAll(ratings);
	}

}
