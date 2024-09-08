package InterfaceImpl;

import Interface.Account;

public class ParentAccountImpl implements Account {

    @Override
    public void createAccount() {
        System.out.println("No one Creates me");
    }
}
