package org.codewithjindu;

public abstract class CashNote implements WithdrawalInterface {
    private int oneThousand;
    private int fiveHundred;
    private int twoHundred;
    private int hundred;
    private int fifty;
    private int twenty;
    private int ten;
    private int five;

    public CashNote() {
    }

    public CashNote(int oneThousand, int fiveHundred, int twoHundred, int hundred, int fifty, int twenty, int ten, int five) {
        this.oneThousand = oneThousand;
        this.fiveHundred = fiveHundred;
        this.twoHundred = twoHundred;
        this.hundred = hundred;
        this.fifty = fifty;
        this.twenty = twenty;
        this.ten = ten;
        this.five = five;
    }

    public int getOneThousand() {
        return oneThousand;
    }

    public void setOneThousand(int oneThousand) {
        this.oneThousand = oneThousand;
    }

    public int getFiveHundred() {
        return fiveHundred;
    }

    public void setFiveHundred(int fiveHundred) {
        this.fiveHundred = fiveHundred;
    }

    public int getTwoHundred() {
        return twoHundred;
    }

    public void setTwoHundred(int twoHundred) {
        this.twoHundred = twoHundred;
    }

    public int getHundred() {
        return hundred;
    }

    public void setHundred(int hundred) {
        this.hundred = hundred;
    }

    public int getFifty() {
        return fifty;
    }

    public void setFifty(int fifty) {
        this.fifty = fifty;
    }

    public int getTwenty() {
        return twenty;
    }

    public void setTwenty(int twenty) {
        this.twenty = twenty;
    }

    public int getTen() {
        return ten;
    }

    public void setTen(int ten) {
        this.ten = ten;
    }

    public int getFive() {
        return five;
    }

    public void setFive(int five) {
        this.five = five;
    }
}
