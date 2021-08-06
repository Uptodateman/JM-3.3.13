package Ex3dot3dot13;

//СКРЫТО ВНУТРИ ВАЛИДАТОРА
public class Robot {

    static Direction direction = Direction.UP;
    static int x = 1;
    static int y = 2;

    public Direction getDirection() {
        return direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void turnLeft() {
        if (direction == Direction.DOWN) {
            direction = Direction.RIGHT;
        } else if (direction == Direction.RIGHT) {
            direction = Direction.UP;
        } else if (direction == Direction.UP) {
            direction = Direction.LEFT;
        } else if (direction == Direction.LEFT) {
            direction = Direction.DOWN;
        }
    } // turnLeft()

    public void turnRight() {
        if (direction == Direction.DOWN) {
            direction = Direction.LEFT;
        } else if (direction == Direction.RIGHT) {
            direction = Direction.DOWN;
        } else if (direction == Direction.UP) {
            direction = Direction.RIGHT;
        } else if (direction == Direction.LEFT) {
            direction = Direction.UP;
        }
    } //turnRight()

    public void stepForward() {
        if (direction == Direction.DOWN) {
            y--;
        } else if (direction == Direction.RIGHT) {
            x++;
        } else if (direction == Direction.UP) {
            y++;
        } else if (direction == Direction.LEFT) {
            x--;
        }
    } // stepForward()
//СКРЫТО ВНУТРИ ВАЛИДАТОРА

    //КОД ДЛЯ ПРОВЕРКИ
    public static void moveRobot(Robot robot, int toX, int toY) {
        while (robot.getX() > toX) {
            while (!robot.getDirection().equals(Direction.LEFT)) {
                robot.turnLeft();
            }
            robot.stepForward();
        }
        while (robot.getX() < toX) {
            while (!robot.getDirection().equals(Direction.RIGHT)) {
                robot.turnRight();
            }
            robot.stepForward();
        }
        while (robot.getY() > toY) {
            while (!robot.getDirection().equals(Direction.DOWN)) {
                robot.turnLeft();
            }
            robot.stepForward();
        }
        while (robot.getY() < toY) {
            while (!robot.getDirection().equals(Direction.UP)) {
                robot.turnRight();
            }
            robot.stepForward();
        }
    } //moveRobot
    //КОД ДЛЯ ПРОВЕРКИ

} // Robot
