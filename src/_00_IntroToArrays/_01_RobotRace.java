package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;
import javax.swing.text.StyledEditorKit.ForegroundAction;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		Robot [] robo = new Robot[8];
	
		//2. create an array of 5 robots.
		
		//3. use a for loop to initialize the robots.
		for (int i = 0; i < robo.length; i++) {
			robo[i]= new Robot();
			robo[i].setSpeed(10);
			robo[i].setY(500);
			robo[i].setX((i*100)+80);
		}
			//4. make each robot start at the bottom of the screen, side by side, facing up
	
		//5. use another for loop to iterate through the array and make each robot move 
	    //   a random amount less than 50.
    	boolean racerunning = true;
		while(racerunning){
		for (int i = 0; i < robo.length; i++) {
			Random ran = new Random();
			robo [i].move(ran.nextInt(50));
			if(robo[i].getY()<75){
				racerunning=false;
			JOptionPane.showMessageDialog(null, "Robot " + (i+1) + " is the winner!");
			break;
			}
		}
		}
		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

		//7. declare that robot the winner and throw it a party!
    	
		//8. try different races with different amounts of robots.
    	
	    //9. make the robots race around a circular track.

	}
}
