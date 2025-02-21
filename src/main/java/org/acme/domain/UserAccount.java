package org.acme.domain;

public class UserAccount {
    private String name;
    private Long accountId;
    private long phone;
    private long newPhone;
    private String email;

    public UserAccount() {
    }
    public UserAccount(String name, Long accountId, long phone, long newPhone, String email) {
        this.name = name;
        this.accountId = accountId;
        this.phone = phone;
        this.newPhone = newPhone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public long getNewPhone() {
        return newPhone;
    }

    public void setNewPhone(long newPhone) {
        this.newPhone = newPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "UserAccount{" +
                "name='" + name + '\'' +
                ", accountId=" + accountId +
                ", phone=" + phone +
                ", newPhone=" + newPhone +
                ", email='" + email + '\'' +
                '}';
    }
}
