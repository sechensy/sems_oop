package task1;

public enum Month {
    JAN(1,"январь"),
    FEB(2,"февраль"),
    MAR(3,"март"),
    APR,
    MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC;
    private int numberMonth;
    private String ruNameMonth;

    Month(int numberMonth, String ruNameMonth) {
        this.numberMonth = numberMonth;
        this.ruNameMonth = ruNameMonth;
    }

    Month() {
    }

    public int getNumberMonth() {
        return numberMonth;
    }

    public String getRuNameMonth() {
        return ruNameMonth;
    }
}
