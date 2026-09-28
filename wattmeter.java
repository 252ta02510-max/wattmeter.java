import java.util.*;

class wattmeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Voltage: ");
        double v = sc.nextDouble();

        System.out.print("Enter Current: ");
        double i = sc.nextDouble();

        double power = v * i;

        System.out.println("Power = " + power + " Watts");
    }
}
