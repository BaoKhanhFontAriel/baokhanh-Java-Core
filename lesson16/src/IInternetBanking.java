import java.util.ArrayList;
import java.util.Scanner;

public interface IInternetBanking {
    ArrayList<String> transactionList = new ArrayList<>();
    void login(Scanner scanner);
    void transferMoney(Scanner scanner);
    void checkBalance();
    void checkTransactionHistory();
}
