public class Bank{
    Account[] accounts = new Account[10];

    public Bank() {
        accounts[0] = new Account(123456789);
        accounts[1] = new SavingsAccount(234567891);
        accounts[2] = new CurrentAccount(345678912);
    }

    public void update(){
        for(Account account : accounts){
            account.update();
        }
    }
}