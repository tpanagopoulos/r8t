package org.tp8.r8t.persistence.elasticsearch;

import java.util.List;

import org.springframework.stereotype.Service;
import org.tp8.r8t.exc.GenericException;
import org.tp8.r8t.model.impl.Rating;
import org.tp8.r8t.model.impl.Result;
import org.tp8.r8t.persistence.dao.RatingDAO;

@Service("RatingDAO")
public class RatingDAOESImpl implements RatingDAO {

	@Override
	public List<Rating> findByUser(String userId) throws GenericException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result saveAll(List<Rating> ratings) throws GenericException {
		// TODO Auto-generated method stub
		return null;
	}

}
