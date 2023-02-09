import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Куз мезгилини бир айын жазыныз");
        String period = scanner.nextLine();
        Autumn autumn = Autumn.valueOf(period.toUpperCase());
        switch (autumn){
            case SEPTEMBER -> System.out.println(autumn.getInformation());
            case OCTOBER -> System.out.println(autumn.getInformation());
            case NOVEMBER -> System.out.println(autumn.getInformation());
        }
    }
}