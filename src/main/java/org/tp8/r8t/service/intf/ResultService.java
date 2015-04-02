package org.tp8.r8t.service.intf;

import java.util.List;

import org.springframework.stereotype.Service;
import org.tp8.r8t.exc.GenericException;
import org.tp8.r8t.model.impl.Rating;
import org.tp8.r8t.model.impl.Result;

/**
 * The Interface CountryService.
 */
@Service("ResultService")
public interface ResultService {

	public Result constructResult(List<Rating> ratings) throws GenericException;

}
