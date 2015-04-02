package org.tp8.r8t.view.jsf;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.tp8.r8t.exc.GenericException;
import org.tp8.r8t.model.enums.Score;
import org.tp8.r8t.model.impl.Game;
import org.tp8.r8t.model.impl.Rating;

@ManagedBean(name = "gameBean")
@SessionScoped
public class GameBean extends AbstractBean {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -5905217809579678523L;

	private Game game;

	private short curItem;

	public void startNew() {
		// TODO: Determine userId from logged in user
		String userId = getUserId();

		try {
			getGameFacade().start(userId);
		} catch (GenericException exc) {
			addError("Could not start game", exc.getMessage());
		}

		game = new Game();
		// TODO: game.setId();
		game.setUserId(userId);
		game.setDuration(0L);

		curItem = 0;

		redirect("play");
	}

	public Score[] getAvailableAnswers() {
		return Score.values();
	}

	public void submitAnswer(String scoreName) {
		Score score = Score.valueOf(scoreName);

		Rating rating = new Rating();
		rating.setId("" + curItem); // TODO: User proper UUID generator
		rating.setMovieId(game.getSelectedMovies().get(curItem).getId());
		rating.setUserId(getUserId());
		rating.setScore(score);

		List<Rating> ratings = game.getRatings();
		ratings.add(rating);

		curItem++;

		if (curItem >= game.getSelectedMovies().size()) {
			finish();
		}
	}

	public void finish() {
		try {
			addMessage("Successfully finished", null);
			getGameFacade().finish(game.getRatings());
		} catch (GenericException exc) {
			addError("Could not finish game", exc.getMessage());
		}

		redirect("finished");
	}

}