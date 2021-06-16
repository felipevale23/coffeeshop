package src.prospect;

public class Prospect {

    protected double id;
    protected String fullName;
    protected double cpf;
    protected String phone;

    public double getNewID() {
        double newID = 1.0;
        return newID;

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
