package prospect;

public class Client extends Prospect {

    Client(String fullName, double cpf, String phone) {

        this.id = super.getNewID();
        this.fullName = fullName;
        this.cpf = cpf;
        this.phone = phone;

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
    public void setCPF(double cpf) {

        this.cpf = cpf;

    }

    @Override
    public double getCPF() {

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