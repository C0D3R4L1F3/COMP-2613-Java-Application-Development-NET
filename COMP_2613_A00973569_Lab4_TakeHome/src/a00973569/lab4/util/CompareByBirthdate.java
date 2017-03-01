/**
 * Project: A00973569Lab4
 * File: CompareByBirthdate.java
 * Date: May 17, 2016
 * Time: 9:41:19 PM
 */
package a00973569.lab4.util;

import java.util.Comparator;

import a00973569.lab4.data.Player;

/**
 * Class to compare birthdates
 * 
 * @author Ronnie Manimtim, A00973569
 * @version 4.0
 */
public class CompareByBirthdate implements Comparator<Player> {

	/**
	 * Constructs a new Compare by birth date object.
	 */
	public CompareByBirthdate() {
	}

	/**
	 * Method to compare two player objects by birthdate
	 * 
	 * @param playerOne
	 *            the first player to compare with player two
	 * @param playerTwo
	 *            the second player to compare with player one
	 */
	@Override
	public int compare(final Player playerOne, final Player playerTwo) {
		return playerOne.getBirthDate().compareTo(playerTwo.getBirthDate());
	}
}