package BorrowingPolicy;

import enumDatatype.MembershipType;

public class BorrowingPolicyFactory {

    public BorrowingPolicy getUserPolicy(MembershipType membershipType) {
        return switch (membershipType) {
            case REGULAR -> new RegularUserPolicy();
            case PREMIUM -> new PremiumUserPolicy();
            case STUDENT -> new StudentUserPolicy();
        };
    }
}
