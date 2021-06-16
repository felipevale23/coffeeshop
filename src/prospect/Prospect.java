package src.prospect;

import java.util.UUID;

public class Prospect {

    protected UUID id;
    protected String fullName;
    protected double cpf;
    protected String phone;

    public UUID getNewID() {

        return  UUID.randomUUID();

    }

    public void setFullName(String fullName) {

        this.fullName=fullName;

    }

    public String getFullName() {

        return this.fullName;

    }

    public void setCPF(double cpf) {

        this.cpf=cpf;

    }

    public double getCPF() {

        return this.cpf;
    }

    public void setphone(String phone) {

        this.phone=phone;

    }

    public String getPhone() {

        return this.phone;

    }

}
