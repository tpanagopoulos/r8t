package org.tp8.r8t.view.jsf;

import java.util.LinkedList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.tp8.r8t.exc.GenericException;
import org.tp8.r8t.model.enums.Score;
import org.tp8.r8t.model.impl.Game;
import org.tp8.r8t.model.impl.Movie;
import org.tp8.r8t.model.impl.Rating;
import org.tp8.r8t.model.impl.Result;

@ManagedBean(name = "gameBean")
@SessionScoped
public class GameBean extends AbstractBean {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -5905217809579678523L;

	private Game game;

	private short curItem;

	public short getCurItem() {
		return curItem;
	}

	public Game getGame() {
		return game;
	}

	public String startNew() {
		// TODO: Determine userId from logged in user
		String userId = getUserId();

		List<Movie> movies = null;
		try {
			movies = getGameFacade().start(userId);
		} catch (GenericException exc) {
			addError("Could not start game", exc.getMessage());
		}

		game = new Game();
		// TODO: game.setId();
		game.setUserId(userId);
		game.setDuration(0L);
		game.setSelectedMovies(movies);
		game.setRatings(new LinkedList<Rating>());
		
		curItem = 0;

		return "play";
	}

	public List<String> getAvailableAnswers() {
		List<String> availableAnswers = new LinkedList<String>();
		for (Score score : Score.values()) {
			availableAnswers.add(score.name());
		}
		return availableAnswers;
	}
	
	public Movie getNextItem() {
		return game.getSelectedMovies().get(curItem);
	}

	public String submitAnswer(String scoreName) {
		Score score = Score.valueOf(scoreName);

		Rating rating = new Rating();
		rating.setId("" + curItem); // TODO: User proper UUID generator
		rating.setMovieId(game.getSelectedMovies().get(curItem).getId());
		rating.setUserId(getUserId());
		rating.setScore(score);

		List<Rating> ratings = game.getRatings();
		ratings.add(rating);

		curItem++;

		String result = "play";
		if (curItem == (game.getSelectedMovies().size()) ) {
			result = finish();
		}
		
		return result;
	}

	public String finish() {
		try {
			addMessage("Successfully finished", null);
			Result result = getGameFacade().finish(game.getRatings());
			game.setResult(result);
		} catch (GenericException exc) {
			addError("Could not finish game", exc.getMessage());
		}

		return "finish";
	}

}