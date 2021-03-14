package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace2 {

	public static void main(String[] args) {

		Robot[] robots = new Robot[5];

		for (int i = 0; i < robots.length; i++) {

			robots[i] = new Robot();
			robots[i].setSpeed(10);

		}

		robots[0].setX(100);
		robots[0].setY(500);

		robots[1].setX(100);
		robots[1].setY(500);

		robots[2].setX(100);
		robots[2].setY(500);

		robots[3].setX(100);
		robots[3].setY(500);

		robots[4].setX(100);
		robots[4].setY(500);

		boolean racenotover = true;

		while (racenotover) {

			for (int j = 0; j < robots.length; j++) {

				Random robrand = new Random();
				int introbrand = robrand.nextInt(51);

				robots[j].move(introbrand);

				if (robots[j].getY() >= 500 && robots[j].getX() <= 101) {
					racenotover = false;
					int newj = j + 1;
					JOptionPane.showMessageDialog(null, "Robot " + newj + " has won!");
					break;
				}
				
				else if (robots[j].getY() <= 100 && robots[j].getX() <= 100) {
					robots[j].turn(90);
					robots[j].move(50);
				}
				
				else if (robots[j].getY() <= 100 && robots[j].getX() >= 800) {
					robots[j].turn(90);
					robots[j].move(50);
				}
				
				else if (robots[j].getY() >= 500 && robots[j].getX() >= 800) {
					robots[j].turn(90);
					robots[j].move(50);
				}

			}

		}

	}
}

//8. try different races with different amounts of robots.

// 9. make the robots race around a circular track.