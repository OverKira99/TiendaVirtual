package com.alejandrobeltran.tiendavirtual;

public class User {

    private String name, email, urlImageProfile ;
    private  String password;
    private String phone;

    public User() {
    }

    public User(String name, String email, String urlImageProfile, String password, String phone) {
        this.name = name;
        this.email = email;
        this.urlImageProfile = urlImageProfile;
        this.password = password;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUrlImageProfile() {
        return urlImageProfile;
    }

    public void setUrlImageProfile(String urlImageProfile) {
        this.urlImageProfile = urlImageProfile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
