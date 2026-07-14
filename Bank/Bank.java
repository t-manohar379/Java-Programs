package Bank;

public class Bank {
    private String id;
    private String name;
    private String accNo;
    private double bal;
    private String ifsc;
    private long ph;
    private String email;
    private int pin;
    private String accType;
    private String dob;
    private String pwd;

    public Bank() {
    }

    public Bank(String name, String accNo, double bal, String ifsc, long ph, 
                String email, int pin, String accType, String dob) {
        this.name = name;
        this.accNo = accNo;
        this.bal = bal;
        this.ifsc = ifsc;
        this.ph = ph;
        this.email = email;
        this.pin = pin;
        this.accType = accType;
        this.dob = dob;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) { 
        this.name = name;
    }

    public String getAccNo() {
        return accNo;
    }
    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public double getBal() {
        return bal;
    }
    public void setBal(double bal) { 
        this.bal = bal;
    }

    public String getIfsc() {
        return ifsc;
    }
    public void setIfsc(String ifsc) {
        this.ifsc = ifsc;
    }

    public long getPh() {
        return ph;
    }
    public void setPh(long ph) {
        this.ph = ph;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public int getPin() {
        return pin;
    }
    public void setPin(int pin) {
        this.pin = pin;
    }

    public String getDob() {
        return dob;
    }
    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAccType() {
        return accType;
    }
    public void setAccType(String accType) { 
        this.accType = accType;
    }

    public String getPwd() {
        return pwd;
    }
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
