Notes </br>

```java
@AllArgsConstructor
@Getter
public enum AccountType {
    ASSET(1, new AssetClassImpl()),
    LIABILITY(2, new LiabilityClassImpl()),
    INCOME(3, new IncomeClassImpl()),
    EXPENSE(4, new ExpenseClassImpl());

    private final Integer accountId;
    private final Account accountType;
} 
```
```
Getting following error:
constructor AccountType in enum Enums.AccountType cannot be applied to given types;
  required: no arguments
  found:    int,InterfaceImpl.AssetClassImpl
  reason: actual and formal argument lists differ in length
```
```
The error occurs because enum constants in Java are created before any constructor logic is executed, 
 and you cannot instantiate the objects directly (like new AssetClassImpl()) within the enum constants. 
 To fix this, you can instantiate these classes lazily (when needed) or use a Supplier to defer instantiation.
Here’s how to correct the code using a Supplier
```

```java
@AllArgsConstructor
@Getter
public enum AccountType {
    ASSET(1, AssetClassImpl::new),
    LIABILITY(2, LiabilityClassImpl::new),
    INCOME(3, IncomeClassImpl::new),
    EXPENSE(4, ExpenseClassImpl::new);

    private final Integer accountId;
    private final Supplier<Account> accountSupplier;

    public Account getAccountType() {
        return accountSupplier.get();
    }
}
```

```
Key Changes:
1.  Use of Supplier<Account>: Instead of directly passing a new instance of AssetClassImpl, LiabilityClassImpl, etc., use Supplier<Account>. 
    This allows lazy instantiation and avoids trying to call the constructor at the time the enum constants are created.
    
2. Lazy Instantiation: You can now call getAccountType() to retrieve the actual Account object when needed.
```
```java
public class Main {
    public static void main(String[] args) {
        AccountType accountType = AccountType.ASSET;
        Account account = accountType.getAccountType();
        account.doSomething();  // Example method in your Account interface
    }
}
```
```
Explanation:
 => Enum Constants: ASSET(1, AssetClassImpl::new) ensures that AssetClassImpl is instantiated only when needed.
 => getAccountType(): This method will trigger the instantiation of the correct implementation (AssetClassImpl, LiabilityClassImpl, etc.) at runtime.
 => This approach solves the constructor error and allows for flexible, dynamic instantiation of the correct Account type.
```
