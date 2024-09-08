package InterfaceImpl;

import Interface.Account;

public class LiabilityClassImpl implements Account {
    @Override
    public void createAccount() {
        System.out.println("Liability account created");
    }
}
