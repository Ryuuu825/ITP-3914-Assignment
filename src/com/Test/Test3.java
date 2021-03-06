/*	
 *	Author 		:	Lee Kai Pui (210339487) (IT114105/1B)
 *	
 *	File 		: 	Test3.java
 *	
 *	Describe	:   Wrote a small test to test the size of array will or not
                    affect the result of bingo
 */

package com.Test;
import com.Bingo.*;

public class Test3 {
    public static void main( String argv[] ) 
    {
        // set up the two game
        final int[][] cardOne = {
            {1}
        };

        final int[][] cardTwo = {
            {2,3}, 
            {4,5,6},

        };

        // setup the two game
        Host testGameOne = new Host(
            new Player("player 1" , cardOne)           
        );
        Host testGameTwo = new Host(
            new Player("Player 2" , cardTwo)
        );

        // update both game
        testGameOne.update(1);
        testGameOne.Bingo();

        testGameTwo.update(2);
        testGameTwo.update(3);
        testGameTwo.update(4);
        testGameTwo.update(5);
        testGameTwo.Bingo();

        // check the result
        System.out.println(testGameOne.isEndGame());
        System.out.println(testGameTwo.isEndGame());

    }
}
