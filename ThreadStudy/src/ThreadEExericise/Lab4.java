package ThreadEExericise;

public class Lab4 {

    public static void main(String[] args) {
        luckyMoney luckyMoney1 = new luckyMoney("zzj");
        luckyMoney luckyMoney2 = new luckyMoney("hcw");
        luckyMoney luckyMoney3 = new luckyMoney("zhw");
        luckyMoney luckyMoney4 = new luckyMoney("yrf");
        luckyMoney luckyMoney5 = new luckyMoney("xxh");

        luckyMoney1.start();
        luckyMoney2.start();
        luckyMoney3.start();
        luckyMoney4.start();
        luckyMoney5.start();

    }
}
