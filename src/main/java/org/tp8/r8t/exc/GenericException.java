package org.tp8.r8t.exc;

/**
 * The Class SampleAppException.
 */
public class GenericException extends Exception {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -8370630868735433977L;

	/**
	 * Instantiates a new sample app exception.
	 * 
	 * @param message
	 *            the message
	 */
	public GenericException(final String message) {
		super(message);
	}

	/**
	 * Instantiates a new sample app exception.
	 * 
	 * @param message
	 *            the message
	 * @param throwable
	 *            the throwable
	 */
	public GenericException(final String message, final Throwable throwable) {
		super(message, throwable);
	}

	/**
	 * Instantiates a new sample app exception.
	 * 
	 * @param throwable
	 *            the throwable
	 */
	public GenericException(final Throwable throwable) {
		super(throwable);
	}

}
