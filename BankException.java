class BankExp extends Exception{
    public BankExp(String message){
        super(message);
    }
}
class depExp extends BankExp{
    public depExp(String message){
        super(message);
    }
}
class WithExp extends BankExp{
    public WithExp(String message){
        super(message);
    }
}

class BankApplication{
    double balance;
    BankApplication(double balance){
        this.balance=balance;
        System.out.println("current balance"+balance);
    }
    void deposit(double amount) throws depExp{
        if(amount<0){
            throw new depExp("invalid amount");
        }
        balance+=amount;
        System.out.println("balance"+balance);
    }
    void withdraw(double amount) throws WithExp {
        if(amount>balance){
            throw new WithExp("not enough balnce");
        }
        balance-=amount;
        System.out.println("balance"+balance);
    }
}
    class BankException{
    public static void main(String[] args) {
        try {
            BankApplication b1=new BankApplication(1000);
            b1.deposit(1000);
            b1.withdraw(100000);
            b1.deposit(-1);

            
        } catch (BankExp e) {
            System.out.println(e.getMessage());
        }
        
    }
}