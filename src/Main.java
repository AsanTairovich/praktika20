public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Куз мезгилини бир айын жазыныз");
//        String period = scanner.nextLine();
//        Autumn autumn = Autumn.valueOf(period.toUpperCase());
//        switch (autumn){
//            case SEPTEMBER -> System.out.println(autumn.getInformation());
//            case OCTOBER -> System.out.println(autumn.getInformation());
//            case NOVEMBER -> System.out.println(autumn.getInformation());
//        }
        Planet planeta1=Planet.EARTH;
        Planet planeta2=Planet.JUPITER;
        Planet planeta3=Planet.MARS;
        Planet planeta4=Planet.MERCURY;
        Planet planeta5=Planet.NEPTUNE;
        Planet planeta6=Planet.PLUTO;
        Planet planeta7=Planet.SATURN;
        Planet planeta8=Planet.URANUS;
        Planet planeta9=Planet.VENUS;
        Planet[] array = new Planet[]{planeta1,planeta2,planeta3,planeta4,planeta5,planeta6,planeta7,planeta8,planeta9};

        max(array);
        mix(array);
    }
    static void max(Planet[] max){

        int a = 0;
        for (int i = 0; i < max.length; i++) {
            a = Math.max(a, max[i].dayOfAYear);
        }
        System.out.println("max  "+a);
    }
    static void mix(Planet[] mix){
        int a = mix[0].dayOfAYear;
        for (int i = 0; i < mix.length; i++) {
            a = Math.min(a, mix[i].dayOfAYear);
        }
        System.out.println("mix  "+a);
    }
}