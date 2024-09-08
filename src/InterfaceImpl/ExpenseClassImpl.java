package InterfaceImpl;

import Interface.Account;

public class ExpenseClassImpl implements Account {
    @Override
    public void createAccount() {
        System.out.println("Expense account created");
    }
}
