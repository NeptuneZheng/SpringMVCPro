package pojo;

import java.util.Date;

public class User {
    private String user_name;
    private String password;
    private double integral;
    private Date create_date;
    private Date last_update_date;
    private boolean status;

    public User() {
    }

    public User(String user_name, String password, double integral, Date create_date, Date last_update_date, boolean status) {
        this.user_name = user_name;
        this.password = password;
        this.integral = integral;
        this.create_date = create_date;
        this.last_update_date = last_update_date;
        this.status = status;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getIntegral() {
        return integral;
    }

    public void setIntegral(double integral) {
        this.integral = integral;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public Date getLast_update_date() {
        return last_update_date;
    }

    public void setLast_update_date(Date last_update_date) {
        this.last_update_date = last_update_date;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
