package InterfaceImpl;

import Interface.Account;

public class IncomeClassImpl implements Account {
    @Override
    public void createAccount() {
        System.out.println("Income account created");
    }
}
