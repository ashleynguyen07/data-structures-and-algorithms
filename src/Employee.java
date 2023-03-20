/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tramy
 */
public class Employee extends Personal {

    private String employeeCode;
    private String degree;

    public Employee(String employeeCode, String name, String gender, String dob, String degree) {
        super(name, gender, dob);
        this.employeeCode = employeeCode;
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.degree = degree;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    @Override
    public String toString() {
        return "Employee{"
                + "employeeCode='" + employeeCode + '\''
                + ", name='" + name + '\''
                + ", gender='" + gender + '\''
                + ", dob='" + dob + '\''
                + ", degree='" + degree + '\''
                + '}';
    }

}
