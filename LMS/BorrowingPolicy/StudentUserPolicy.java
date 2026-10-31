package BorrowingPolicy;

public class StudentUserPolicy implements BorrowingPolicy {
    @Override
    public int getBorrowingDays() {
        return 21;
    }
}
