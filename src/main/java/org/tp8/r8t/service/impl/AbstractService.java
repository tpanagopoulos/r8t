package org.tp8.r8t.service.impl;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

public class AbstractService {

	private int page = 0;

	private int items = 10;

	public Pageable getDefaultPageable() {
		return new PageRequest(page, items);
	}

}
