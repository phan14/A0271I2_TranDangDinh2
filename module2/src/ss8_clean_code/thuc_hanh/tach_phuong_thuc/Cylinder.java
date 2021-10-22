package ss8_clean_code.thuc_hanh.tach_phuong_thuc;

public class Cylinder {
    public static double getVolume(int radius, int height) {
        double baseArea = getBaseArea(radius);
        double perimeter = getPerimeter(radius, 2, Math.PI);
        double volume = perimeter * height + 2 * baseArea;
        return volume;
    }

    private static double getPerimeter(int radius, double i, double pi) {
        return i * pi * radius;
    }

    private static double getBaseArea(int radius) {
        return getPerimeter(radius, Math.PI, radius);
    }


}
