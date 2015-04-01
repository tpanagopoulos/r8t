package org.tp8.r8t.persistence.dao;

import java.util.List;

import org.tp8.r8t.exc.GenericException;
import org.tp8.r8t.model.impl.Rating;
import org.tp8.r8t.model.impl.Result;

public interface RatingDAO {
	
	public List<Rating> findByUser(String userId) throws GenericException;

	public Result saveAll(List<Rating> ratings) throws GenericException;

}
