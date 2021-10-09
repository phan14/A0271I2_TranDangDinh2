package ss4_Opp.bai_tap.Fan;

public class main {
    public static void main(String[] args) {
        Fan fan1=new Fan();
        fan1.setOn(true);
        fan1.setSpeed(3);
        fan1.setColor("yellow");
        fan1.setRadius(10.D);
        System.out.println(" Fan 1:");
        System.out.println(fan1.toString());

//
        Fan fan2=new Fan();
        fan2.setOn(false);
        fan2.setSpeed(2);
        fan2.setColor("blue");
        fan2.setRadius(5.D);
        System.out.println(" Fan 2:");
        System.out.println(fan2.toString());
    }
}
