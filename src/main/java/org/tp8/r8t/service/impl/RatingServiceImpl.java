package org.tp8.r8t.service.impl;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tp8.r8t.exc.GenericException;
import org.tp8.r8t.model.enums.Score;
import org.tp8.r8t.model.impl.Rating;
import org.tp8.r8t.persistence.elasticsearch.repository.RatingRepository;
import org.tp8.r8t.service.intf.RatingService;

@Service(value = "RatingService")
public class RatingServiceImpl extends AbstractService implements RatingService {

	@Autowired
	private RatingRepository ratingDAO;

	@PostConstruct
	public void initialize() {
		for (int i = 0; i < 10; i++) {
			Rating rating = new Rating();
			rating.setId("" + i);
			rating.setMovieId("" + i);
			rating.setUserId("1");
			rating.setScore(Score.values()[i % Score.values().length]);
			
			ratingDAO.save(rating);
		}
	}
	
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
