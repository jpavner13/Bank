public class SavingsAccount extends Account{
    double interest = 1;

    public SavingsAccount(int a){
        super(a);
    }

    public void addInterest(){
        bal += interest;
    }

    public void update(){
        bal += interest;
        System.out.println(getBalance());
    }
}