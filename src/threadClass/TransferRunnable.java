package threadClass;

public class TransferRunnable implements Runnable {
    private Bank bank;
    private int fromAccount;
    private double maxAmount;
    private int DELAY = 10;

    public TransferRunnable(Bank b, int from, double max) {
        bank = b;
        fromAccount = from;
        maxAmount = max;
    }

    public void run() {
        try {
            while (true) {
                //bank.size=100,maxAmount=1000
                int toAccount = (int) (bank.size() * Math.random());//0-100
                double amount = maxAmount * Math.random();//0-1000
                //fromAccount:0-100
                bank.transfer(fromAccount, toAccount, amount);
                Thread.sleep((int) (DELAY * Math.random()));
            }
        } catch (InterruptedException e) {
        }

    }
}
