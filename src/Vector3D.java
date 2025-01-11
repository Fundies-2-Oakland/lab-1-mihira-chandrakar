import java.lang.Math;

public class Vector3D {
    double x;
    double y;
    double z;

    public Vector3D(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }


    public String toString() {
        return "("+x+", "+y+", "+z+")";
    }

    public double getMagnitude(){
        double xSquare = x*x;
        double ySquare = y*y;
        double zSquare = z*z;

        double sum = xSquare+ySquare+zSquare;

        return Math.abs(sum);
    }

    public static void main(String[] args) {
        Vector3D vector = new Vector3D(3.5,4.5,5.5);

        System.out.println(vector.getX());
        System.out.println(vector.getY());
        System.out.println(vector.getZ());

        System.out.println(vector);

        System.out.println(vector.getMagnitude());
    }
}

