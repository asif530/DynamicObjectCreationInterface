package InterfaceImpl;

import Interface.Account;

import java.sql.SQLOutput;

public class AssetClassImpl implements Account {
    @Override
    public void createAccount() {
        System.out.println("Asset account created");
    }
}
