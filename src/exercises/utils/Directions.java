package exercises.utils;

public enum Directions {
    RIGHT(1, 0),
    LEFT(-1, 0),
    UP(0, 1),
    DOWN(0, -1);
    public final int dX, dY;

    Directions(int dX, int dY) {
        this.dX = dX;
        this.dY = dY;
    }

//    public Directions inverse() {
//        switch (this) {
//            case RIGHT:
//                return LEFT;
//            case LEFT:
//                return RIGHT;
//            case UP:
//                return DOWN;
//            case DOWN:
//                return UP;
//        }
//        return null;
//    }
}
