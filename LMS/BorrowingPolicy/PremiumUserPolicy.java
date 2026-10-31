package BorrowingPolicy;

public class PremiumUserPolicy implements BorrowingPolicy {
    @Override
    public int getBorrowingDays() {
        return 30;
    }
}
