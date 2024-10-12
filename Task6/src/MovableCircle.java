public class MovableCircle implements Movable {
    int radius;
    MovablePoint center;
    public MovableCircle(int x, int y, int xspeed, int yspeed, int radius) {
        center = new MovablePoint(x, y, xspeed, yspeed);
        this.radius = radius;
    }
    public void moveUp(){

    };
    public void moveDown(){

    };
    public void moveLeft(){

    };
    public void moveRight(){

    };
    @Override
    public String toString() {
        return "Center:" + center + "radius:" + radius;
    };

}
