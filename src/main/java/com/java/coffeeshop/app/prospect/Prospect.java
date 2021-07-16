package com.java.coffeeshop.app.prospect;

public abstract class Prospect {

    protected String fullName;
    protected String cep;
    protected String cpf;
    protected String birthdate;
    protected String phone;

    public void setFullName(String fullName) {

        this.fullName = fullName;

    }

    public String getFullName() {

        return this.fullName;

    }

    public void setCEP(String cep) {

        this.cep = cep;

    }

    public String getCEP() {

        return this.cep;

    }

    public void setCPF(String cpf) {

        this.cpf = cpf;

    }

    public String getCPF() {

        return this.cpf;
    }

    public void setBirthDate(String birthdate) {

        this.birthdate = birthdate;

    }

    public String getBirthDate() {

        return this.birthdate;

    }

    public void setphone(String phone) {

        this.phone = phone;

    }

    public String getPhone() {

        return this.phone;

    }

}
