public class MovablePoint implements Movable{
    int x;
    int y;
    int xspeed;
    int yspeed;

    public MovablePoint(int x, int y, int xspeed, int yspeed){
        this.x = x;
        this.y = y;
        this.xspeed = xspeed;
        this.yspeed = yspeed;
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
        return "x: " + x + "y: " + y +
                "Speed of x" + xspeed +
                "Speed of y" + yspeed;
    };
}
