public class Switch {
    public static void main(String[] args) {

        final Direction direction = Direction.LEFT;

        switch (direction){
            case LEFT:
                System.out.println("lewo");
                break;
            case RIGHT:
                System.out.println("lewo");
                break;
            case UP:
                System.out.println("lewo");
                break;
            case DOWN:
                System.out.println("lewo");
                break;


    }

    }enum Direction {LEFT, RIGHT, UP, DOWN, UNKNOWN}
}
