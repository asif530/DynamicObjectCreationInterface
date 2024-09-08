package Factory;

import Enums.AccountType;
import Interface.Account;

import java.util.HashMap;
import java.util.Map;

public class BaseAccountFactory {
 /*   private static final Map<Integer, Account> accounts = new HashMap<>();
    //private static final Map<Integer, Account> animals = new EnumMap<>(AnimalType.class);

    static {
        for (AccountType type : AccountType.values()) {
            try {
                accounts.put(type.getAccountId(), type.getAccountType());
            } catch (Exception e) {
                throw new RuntimeException("Error creating account instance for type: " + type, e);
            }
        }
    }

    public static Account getAccount(Integer accountId) {
        return accounts.get(accountId);
    }*/
}
