package org.tp8.r8t.persistence.elasticsearch.impl;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.tp8.r8t.exc.GenericException;
import org.tp8.r8t.model.impl.Rating;
import org.tp8.r8t.model.impl.Result;
import org.tp8.r8t.persistence.elasticsearch.custom.RatingCustom;

@Service
public class RatingRepositoryImpl extends AbstractESRepository<Rating>
		implements RatingCustom {

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

	@Override
	public Page<Rating> queryByExample(Pageable pageable, Rating example) {
		// TODO Auto-generated method stub
		return null;
	}

}
