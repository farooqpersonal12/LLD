package BorrowingPolicy;

public class RegularUserPolicy implements BorrowingPolicy {

    @Override
    public int getBorrowingDays() {
        return 14;
    }
    
}
