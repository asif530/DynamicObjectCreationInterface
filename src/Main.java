import Factory.BaseAccountFactory;
import Interface.Account;
import Enums.AccountType;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Account account = AccountType.getAccountById(0);
        account.createAccount();

    }

}