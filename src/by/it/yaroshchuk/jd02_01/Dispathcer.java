package by.it.yaroshchuk.jd02_01;

 class Dispathcer {
    static final int KSPEED = 100;

    private static int buyersInMarket = 0;

    static void addBuyer() {
        buyersInMarket++;
    }

    static void removeBuyer() {
        buyersInMarket--;
    }

    static int getBuyersInMarket() {
        return buyersInMarket;
    }
}
