package User;

import enumDatatype.MembershipType;

public class User {
    private String userId;
    private String name;
    private int age;
    private String phoneNumber;
    private String email;
    private MembershipType userType;
    
    public MembershipType getUserType() {
        return userType;
    }

    public void setUserType(MembershipType userType) {
        this.userType = userType;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getDetails() {
        return "User [userId=" + userId
                + ", name=" + name
                + ", age=" + age
                + ", phoneNumber=" + phoneNumber
                + ", email=" + email + "]";
    }


}