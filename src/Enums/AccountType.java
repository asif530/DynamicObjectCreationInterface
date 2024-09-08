package Enums;

import Interface.Account;
import InterfaceImpl.*;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.function.Supplier;

@AllArgsConstructor
@Getter
public enum AccountType {
    ASSET(1, AssetClassImpl::new)
    ,LIABILITY(2,  LiabilityClassImpl::new)
    ,INCOME(3,  IncomeClassImpl::new)
    ,EXPENSE(4,  ExpenseClassImpl::new)
    ,PARENT(0,  ParentAccountImpl::new);

    private final Integer accountId;
    //    private final Account accountType;
    private final Supplier<Account> accountSupplier;

    public static Account getAccountById(Integer id) {
        for (AccountType accountType : AccountType.values()) {
            if (accountType.getAccountId().equals(id)) {
                return accountType.accountSupplier.get();  // Instantiate the correct Account implementation
            }
        }
        throw new IllegalArgumentException("Invalid account ID: " + id);
    }
}
