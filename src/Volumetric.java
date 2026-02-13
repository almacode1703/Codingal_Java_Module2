class VolumeShape{
    public double getVolume(){
        return 0.0;
    }
}

class Cylinder extends VolumeShape{
    private double height;
    private double radius;

    public  Cylinder(double height, double radius){
        this.height = height;
        this.radius = radius;
    }
    public double getVolume(){
        return Math.PI * radius * radius * this.height;
    }
}

class Cube extends VolumeShape {
    private double radius;
    public Cube( double radius){
        this.radius = radius;
    }
    public double getVolume(){
        return 4/3 * Math.PI * radius * radius * radius;
    }
}

public class Volumetric {
    public static void main(String[] args) {
        VolumeShape[] volumes = new VolumeShape[2];
        volumes[0] = new Cylinder(6.5,5);
        volumes[1] = new Cube(5);
        System.out.printf("The Volume of the Cylinder : %.2f\n", volumes[0].getVolume());
        System.out.printf("The Volume of the Cube : %.2f\n", volumes[1].getVolume());
    }
}
