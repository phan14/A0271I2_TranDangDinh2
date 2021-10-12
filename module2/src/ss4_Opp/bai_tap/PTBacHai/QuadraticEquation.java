package ss4_Opp.bai_tap.PTBacHai;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return this.b * this.b - 4.0D * this.a * this.c;
    }

    public double getRoot1() {
        return this.getDiscriminant() < 0.0D ? 0.0D : (-this.b + Math.pow(this.getDiscriminant(), 0.5D)) / (2.0D * this.a);
    }

    public double getRoot2() {
        return this.getDiscriminant() < 0.0D ? 0.0D : (-this.b - Math.pow(this.getDiscriminant(), 0.5D)) / (2.0D * this.a);
    }

    public void getRoot() {
        if(this.getA()==0.0D){
            System.out.println("Không thỏa mản chương trình");
        } else if (this.getDiscriminant() < 0.0D) {
            System.out.print("Phương trình đã cho vô nghiệm");
        } else if (this.getDiscriminant() == 0.0D) {
            System.out.print("Phương trình đã cho có nghiệm kép là: x = " + this.getRoot1());
        } else {
            System.out.print("Phương trình đã cho có nghiệm là: x1 = " + this.getRoot1() + " và x2 = " + this.getRoot2());
        }

    }
}
