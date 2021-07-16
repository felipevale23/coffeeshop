package com.java.coffeeshop.app.prospect;

public class Custumers extends Prospect {

    public Custumers() {

    }

    @Override
    public void setFullName(String fullName) {

        this.fullName = fullName;

    }

    @Override
    public String getFullName() {

        return this.fullName;

    }

    @Override
    public void setCPF(String cpf) {

        this.cpf = cpf;

    }

    @Override
    public String getCPF() {

        return this.cpf;
    }

    @Override
    public void setphone(String phone) {

        this.phone = phone;

    }

    @Override
    public String getPhone() {

        return this.phone;

    }

}