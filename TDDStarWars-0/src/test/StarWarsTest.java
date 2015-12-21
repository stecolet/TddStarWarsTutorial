package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class StarWarsTest {

	/**




	/**
	 * Preconditions:
	 *  1) Each battlestar must refers one RebelTeam and one EmperialTeam before play the battle.
	 *  2) Each Team must contains at least one fighter.
	 *  3) Each fighter must be setted with a fighter points.
	 *
	 *
	 * Postcondition
	 *	1) After the battle, it will has one winner.
	 * @throws MissingFighterException
	 *
*/

/*
 *------------------- PRECONDITIONS TEST------------------------------------
 */
	@Test
	public void testBattleStarMissingTeamException()
	{

	}

	@Test
	public void testTeamMissingFighterException()
	{

	}

	@Test
	public void testFighterWithoutPointsException()
	{

	}

/*
 *------------------- POSTCONDITIONS TEST ------------------------------------
 */
	@Test
	public void testAfterBattletWinnerMustExist()
	{

	}

/*
 * ------------------ BUSINESS TEST -----------------------------------------
 */

	@Test
	public void testRebelsWin() {

		AssertTrue(battle.rebelsWin());
		AssertFalse(battle.empireWin());
	}

	@Test
	public void testEmperialsWin()
	{

	}

	@Test
	public void testRebelsWinWithTheSamePointsOfEmperials()
	{

	}

/*
 * ----------------- DEVELOPER TEST --------------------------------------------
 */



}
