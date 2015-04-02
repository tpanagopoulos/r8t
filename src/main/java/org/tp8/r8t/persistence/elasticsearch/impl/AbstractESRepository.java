package org.tp8.r8t.persistence.elasticsearch.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.tp8.r8t.model.BaseModel;
import org.tp8.r8t.persistence.elasticsearch.custom.BaseCustom;

public abstract class AbstractESRepository<T extends BaseModel<String>>
		implements BaseCustom<T> {

	@Autowired
	protected ElasticsearchTemplate elasticsearchTemplate;

}
