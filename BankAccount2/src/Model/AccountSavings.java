package Model;

import java.math.BigDecimal;

public class AccountSavings extends BaseAccount{
    public AccountSavings(String accountName, BigDecimal initialBalance) {
        super(accountName);
        this.balance = initialBalance;
    }
}
