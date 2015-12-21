# TddStarWarsTutorial
A simple Star Wars tutorial who evidences the main TDD development steps.


Ih this Tutorial you can find six ajva project (based on JUnit). Each of them desribe the main TDD red/green/refactoring cycle. Please see "Test Driven Development By Example" by Kent Back.

- The first project showes which test units are created from the requirement. There are three kinds of test: Precondition, PostCondition and Business. Another test unit category is introduced later at the Refactoring stage.

- The second project complete test unit's body

- The third project make te test compilable according to "Fake-it" pattern

- The fourth project make the test run correctly

- The fifth ans sixth projectes introduce a simple refactoring using Builder pattern and some hierarchies.

The Star Wars tutorial requirements are the following:

	/** The program simulates a battlestar between  Rebel and Emperial Team.
	 *
	 * Rebel's Star Ship are the following:
	 * 	- A Wing : 1pt
	 *	- X Wing : 2pt
	 *	- Y Wing : 3pt
	 *  - B Wing:  1pt
	 *
	 * Emperial's Star Swip:
	 *	- Tie: 1pt
	 *	- Tie-Interceptor: 2pt
	 *  - Tie- Bomber: 3 pt
	 *
	 *  A team wins when total force points are greater then the other. When the total force points are the same, The Rebels win.
	 */
