package day21;

public class Account {
    private long balance;

    public Account(){}
    public long getBalance(){
        return balance;
    }
    public  void deposit(int money){
        balance += money;
    }
    public void withdraw( int money){



            if (balance < money) {
                try {
                    throw new InsuffinientException("잔고부족");
                } catch (InsuffinientException e) {
                    throw new RuntimeException(e);
                }
            }
        balance -= money;
    }

}
