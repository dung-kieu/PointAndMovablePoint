
public class Point {
    public float x ;
    public float y ;

    public Point(){

    }

    public Point(float x,float y){
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY(){
        float[] arr = new float[2];
        arr[0] = getX();
        arr[1] = getY();
        return arr;
    }

    public void setXY(float x,float y ){
        this.x = getX();
        this.y = getY();
    }

    @Override
    public String toString() {
        return "(" + getX() + " ," + getY() + ")";
    }
}
