package Ex3dot3dot13;

public class Main {

    public static void main(String[] args) {

        Robot robo = new Robot();

        System.out.println("Direction before — " + robo.getDirection());
        System.out.println("x before — " + robo.getX());
        System.out.println("y before — " + robo.getY());

        Robot.moveRobot(robo,65, 0);

        System.out.println("Direction after — " + robo.getDirection());
        System.out.println("x after — " + robo.getX());
        System.out.println("y after — " + robo.getY());

    }
}