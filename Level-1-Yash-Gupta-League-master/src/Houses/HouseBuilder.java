package Houses;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class HouseBuilder {
	Robot newRobot = new Robot();
	//1. have the tortoise start in the bottom left corner
	public void moveToBottomLeft() {
		newRobot.moveTo(100, 800);
	}
		//2. draw a house of height 100 with grass after it. This shape: |**|_
	public void drawHouse(int h) {
		newRobot.setSpeed(10);
		newRobot.penDown();
		newRobot.setRandomPenColor();
		newRobot.setPenWidth(8);
		newRobot.move(h);
		newRobot.turn(90);
		newRobot.setRandomPenColor();
		newRobot.move(100);
		newRobot.turn(90);
		newRobot.setRandomPenColor();
		newRobot.move(h);
		newRobot.turn(-90);
		newRobot.setPenColor(Color.green);
		newRobot.move(50);
		newRobot.turn(-90);
	}
	public void size(String size) {
		if (size.equals("small")) {
			drawHouse(60);
		}
		if(size.equals("medium")) {
			drawHouse(120);
		}
		if (size.equals("large")) {
			drawHouse(250);
		}
	}
	public void colorHeight(String size) {
		Color cHeight;
		if (size.equals("small")) {
			drawHouse(60);
			cHeight = Color.green;
		}
		if(size.equals("medium")) {
			drawHouse(120);
			cHeight = Color.MAGENTA;
		}
		if (size.equals("large")) {
			drawHouse(250);
			cHeight = Color.ORANGE;
		}
		}
	public void peakedRoofs() {
		
	}
		//3. extract the piece of code that draws the house into a method. Draw 10 houses.

		//4. Change the method to take int height as a parameter. Draw 9 houses of different heights

		//5. Make the method take a String instead of a height. 	
			
//		"small"		60
//		"medium"	 	120
//		"large"			250

		//6. Make the method take a color as well as a height. The houses are drawn in that color.

		//[optional] Set the scene to night time by setting the background to black using Tortoise.getBackgroundWindow().setColor

		//7. Give the houses peaked roofs

		//8. Extract that roof code into a method â€œdrawPointyRoofâ€� and create a new method: â€œdrawFlatRoofâ€�.

		//9. make large houses have flat rooves

}
