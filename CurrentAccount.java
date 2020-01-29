public class CurrentAccount extends Account{
    int overdraftLimit = 200;

    public CurrentAccount(int a){
        super(a);
    }

    public void Update(){
        if(bal < overdraftLimit){
            sendLetter();
        }
    }

    private void sendLetter(){
        System.out.println("You are over your overdraft limit");
        System.out.println(bal);
    }
}