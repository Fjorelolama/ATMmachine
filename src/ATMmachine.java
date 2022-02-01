import java.util.Scanner;

public class ATMmachine {
    public static void main(String[] args) {
        Scanner UserInput = new Scanner(System.in);

        int[] idNumbers = {0,1,2,3,4,5,6,7,8,9};
        System.out.println("Enter an id: ");
        int IdUser = UserInput.nextInt();
        int balance = 100;
        int withdraw;
        int deposit;


        while (true) {

            System.out.println("Main menu ");
            System.out.println("1: Check Balance");
            System.out.println("2: Withdraw");
            System.out.println("3: Deposit");
            System.out.println("4: Exit");


            System.out.println("Enter a Choice: ");
            int Userchoice = UserInput.nextInt();

            if (Userchoice == 1) {
                System.out.println("The Balance is: " + balance);

            } else if (Userchoice == 2) {

                System.out.println("Enter the amount to withdraw: ");
                int WithdrawAmount = UserInput.nextInt();

                if (Userchoice > balance) {

                    System.out.println("Your credit is not sufficent");
                }
                balance = balance - WithdrawAmount;

            } else if (Userchoice == 3) {

                System.out.println("Enter the amount to deposit: ");
                int AmountDeposit = UserInput.nextInt();
                balance = AmountDeposit + balance;
                System.out.println("Now yor balance is: " + balance);
            } else if (Userchoice == 4) {
                break;
            } else {
                System.out.println("Enter one of the 4 choices");
            }
        }
    }
}
