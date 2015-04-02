package org.tp8.r8t.view.jsf;

import java.io.IOException;
import java.io.Serializable;
import java.util.Map;
import java.util.ResourceBundle;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.tp8.r8t.service.facade.GameFacade;

/**
 * The Class AbstractBean.
 */
public abstract class AbstractBean implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -6489999685157943466L;

	/**
	 * The teacher facade.
	 */
	@ManagedProperty(value = "#{gameFacade}")
	protected GameFacade gameFacade;

	/** The bundle. */
	private ResourceBundle bundle;

	/**
	 * Gets the game facade.
	 *
	 * @return the game facade
	 */
	public GameFacade getGameFacade() {
		return gameFacade;
	}

	/**
	 * Sets the game facade.
	 *
	 * @param gameFacade
	 *            the new game facade
	 */
	public void setGameFacade(GameFacade gameFacade) {
		this.gameFacade = gameFacade;
	}

	/**
	 * Gets the message.
	 * 
	 * @param key
	 *            the key
	 * @return the message
	 */
	public String getMessage(String key) {
		if (bundle == null) {
			bundle = ResourceBundle.getBundle("messages.messages", FacesContext
					.getCurrentInstance().getViewRoot().getLocale());
		}
		String value = bundle.getString(key);
		return value;
	}

	/**
	 * Gets the external context.
	 * 
	 * @return the external context
	 */
	public ExternalContext getExternalContext() {
		return FacesContext.getCurrentInstance().getExternalContext();
	}

	/**
	 * Gets the session map.
	 * 
	 * @return the session map
	 */
	public Map<String, Object> getSessionMap() {
		return getExternalContext().getSessionMap();
	}

	/**
	 * Gets the request map.
	 * 
	 * @return the request map
	 */
	public Map<String, Object> getRequestMap() {
		return getExternalContext().getRequestMap();
	}

	/**
	 * Gets the request parameter map.
	 * 
	 * @return the request parameter map
	 */
	public Map<String, String> getRequestParameterMap() {
		return getExternalContext().getRequestParameterMap();
	}

	/**
	 * Gets the session.
	 * 
	 * @return the session
	 */
	public HttpSession getSession() {
		return (HttpSession) getExternalContext().getSession(true);
	}

	/**
	 * Gets the request.
	 * 
	 * @return the request
	 */
	public HttpServletRequest getRequest() {
		return (HttpServletRequest) getExternalContext().getRequest();
	}

	/**
	 * Gets the response.
	 * 
	 * @return the response
	 */
	public HttpServletResponse getResponse() {
		return (HttpServletResponse) getExternalContext().getResponse();
	}

	/**
	 * Gets the session param.
	 * 
	 * @param key
	 *            the key
	 * @return the session param
	 */
	public Object getSessionParam(String key) {
		return getSessionMap().get(key);
	}

	/**
	 * Gets the request param.
	 * 
	 * @param key
	 *            the key
	 * @return the request param
	 */
	public Object getRequestParam(String key) {
		return getRequestParameterMap().get(key);
	}

	/**
	 * Redirect.
	 * 
	 * @param url
	 *            the url
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	public void redirect(String url) {
		try {
			getResponse().sendRedirect(url);
		} catch (IOException exc) {
			addError("Could not redirect", exc.getMessage());
		}
	}
	
	public void addError(String summary, String detail) {
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR,
				summary, detail);
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, message);
	}
	
	public void addMessage(String summary, String detail) {
		FacesMessage message = new FacesMessage(summary);
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, message);
	}
	
	public String getUserId() {
		return "1";
	}

}
