/**
 * Project: A00973569Lab7
 * File: Validator.java
 * Date: June 5, 2015
 * Time: 7:00:38 PM
 */
package a00973569.lab7.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Validate data.
 * 
 * @author Ronnie Manimtim, A00973569
 * @version 7.0
 */
public class Validator {

	private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	private static Pattern pattern;
	private static Matcher matcher;

	private Validator() {
	}

	/**
	 * Validate an email string.
	 * 
	 * @param email
	 *            the email string.
	 * @return true if the email address is valid, false otherwise.
	 */
	public static boolean validateEmail(final String email) {
		if (pattern == null) {
			pattern = Pattern.compile(EMAIL_PATTERN);
		}

		matcher = pattern.matcher(email);
		return matcher.matches();
	}

}
