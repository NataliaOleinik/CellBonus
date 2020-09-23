public class Main {
    public static void main(String[] args) {
        int accountStatus = 10000;
        int accountRefill = 10000;
        if(accountRefill >=100000){
            int bonus = accountRefill/100;
            accountStatus += accountRefill + bonus;
        }else{
           accountStatus += accountRefill;
        }
        System.out.println(accountStatus/100);
    }
}
