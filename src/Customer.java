/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tramy
 */

public class Customer extends Personal{

    private String customerCode;
    private String customerType;

    public Customer(String customerCode, String name, String gender, String dob, String customerType) {
        super(name, gender, dob);
        this.customerCode = customerCode;
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.customerType = customerType;
    }

    public String getCustomerCode() {
        return customerCode;
    }


    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }


    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    @Override
    public String toString() {
        return "Customer{"
                + "customerCode='" + customerCode + '\''
                + ", name='" + name + '\''
                + ", gender='" + gender + '\''
                + ", dob='" + dob + '\''
                + ", customerType='" + customerType + '\''
                + '}';
    }

}
