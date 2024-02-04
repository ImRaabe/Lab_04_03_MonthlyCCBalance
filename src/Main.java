//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int cardBal = 5000;
        float interestRate = cardBal * 0.17f;


        System.out.println("Your credit balance after one month is: $" + (cardBal + interestRate));
        System.out.println("Your credit balance after two months is: $" + ((cardBal + interestRate) + ((cardBal + interestRate) * 0.17)));
    }
}