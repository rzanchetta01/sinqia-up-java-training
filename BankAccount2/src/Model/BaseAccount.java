package Model;

import java.math.BigDecimal;
import java.util.UUID;

public abstract class BaseAccount {


    protected String id;
    protected BigDecimal balance;
    protected String accountName;

    public BaseAccount(String accountName) {
        this.accountName = accountName;
        id = UUID.randomUUID().toString();
        balance = BigDecimal.valueOf(0);
    }

    protected void withdraw(BigDecimal value) {
        if(balance.compareTo(value) < 0)
            throw new RuntimeException("Invalid value");

        this.balance = this.balance.subtract(value);
    }

    protected void deposit(BigDecimal value) {
        this.balance = this.balance.add(value);
    }
}
