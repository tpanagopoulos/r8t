package org.tp8.r8t.persistence.elasticsearch.impl;

import javax.annotation.PostConstruct;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.tp8.r8t.model.impl.Rating;
import org.tp8.r8t.persistence.elasticsearch.custom.RatingCustom;

@Service
public class RatingRepositoryImpl extends AbstractESRepository<Rating>
		implements RatingCustom {

	@PostConstruct
	public void initialize() {
		if (!elasticsearchTemplate.indexExists("rating")) {
			elasticsearchTemplate.createIndex("rating");
		}
	}
	
	@Override
	public Page<Rating> queryByExample(Pageable pageable, Rating example) {
		// TODO Auto-generated method stub
		return null;
	}

}
