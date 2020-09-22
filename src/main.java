public class main {
    public static void main(String[] args) {
        int accountStatus = 10000;
        int accountRefill = 100000;
        int bonus = accountRefill/100;
        if(accountRefill >=100000){
            accountStatus += accountRefill + bonus;
        }else{
           accountStatus += accountRefill;
        }
        System.out.println(accountStatus/100);
    }
}
