package state;
import java.math.BigDecimal;

import main.ATM;
public interface ATMstate {
    void insertCard();

    void enterPin();

    void checkBalance();

    void withdraw(BigDecimal amount);

    void deposit(BigDecimal amount);

    void ejectCard();

}
