package pl.sdacademy.designpatterns.proxy;

public class Person {
    private String email;
    private Role role;
    private boolean verified;

    public Person(String email, Role role, boolean verified) {
        this.email = email;
        this.role = role;
        this.verified = verified;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }
}
