package org.tp8.r8t.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tp8.r8t.exc.GenericException;
import org.tp8.r8t.model.impl.Rating;
import org.tp8.r8t.persistence.elasticsearch.repository.RatingRepository;
import org.tp8.r8t.service.intf.RatingService;

@Service(value = "RatingService")
public class RatingServiceImpl extends AbstractService implements RatingService {

	@Autowired
	private RatingRepository ratingDAO;

	@Override
	public List<Rating> findByUser(String userId) throws GenericException {
		return ratingDAO.findByUserId(userId, getDefaultPageable());
	}

	@Override
	public void submit(List<Rating> ratings) throws GenericException {

		if (ratings == null) {
			throw new GenericException("Null value passed");
		}

		ratingDAO.save(ratings);
	}

}
