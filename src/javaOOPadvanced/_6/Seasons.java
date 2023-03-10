package javaOOPadvanced._6;

public enum Seasons {
    SPRING("February March April"),
    SUMMER("May June July August"),
    FALL("September October"),
    WINTER("November December January"),;

    private String months;

    Seasons(String months) {
        this.months = months;
    }

    public String getMonths() {
        return months;
    }
}
