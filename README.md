Notes
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
Getting following error:
constructor AccountType in enum Enums.AccountType cannot be applied to given types;
  required: no arguments
  found:    int,InterfaceImpl.AssetClassImpl
  reason: actual and formal argument lists differ in length
