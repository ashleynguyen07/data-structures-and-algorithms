/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tramy
 */
public enum ListOption {
    GENDER("male", "female"),
    DEGREE("intermediate", "college", "university"),
    CUSTOMER_TYPE("new", "member", "vip");

    private final String[] values;

    ListOption(String... values) {
        this.values = values;
    }

    public boolean contains(String value) {
        for (String val : values) {
            if (val.equals(value)) {
                return true;
            }
        }
        return false;
    }

    public String[] getValues() {
        return values;
    }
}
