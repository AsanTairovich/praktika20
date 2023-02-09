public enum Planet {
    MERCURY(88),
    VENUS(225),
    EARTH(365),
    MARS(687),
    JUPITER(4333),
    NEPTUNE(60200),
    SATURN(10759),
    URANUS(30687),
    PLUTO(578);
    int dayOfAYear;

    Planet(int dayOfAYear) {
        this.dayOfAYear = dayOfAYear;
    }

    public int getDayOfAYear() {
        return dayOfAYear;
    }

}
