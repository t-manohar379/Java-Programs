package Bank;

import java.util.Scanner;

public class BankController {
    
    public static Scanner sc = new Scanner(System.in); 
    public static Bank b = new Bank();
    public static int count = 1;
    
    // Register user
    public static void doRegister() {
        System.out.println("Enter ID: ");
        b.setId(sc.next());
        System.out.println("Enter Password: ");
        b.setPwd(sc.next());
        System.out.println("************ Registration Successful *************");
    }
    
    // Login check
    public static boolean isLoginSuccess() {
        System.out.println("Enter Login ID: ");
        String id = sc.next();
        System.out.println("Enter Password: ");
        String pwd = sc.next();
        return id.equals(b.getId()) && pwd.equals(b.getPwd());
    }
    
    // Open new account
    public static void openAccount() {
        System.out.println("Name: ");
        b.setName(sc.next());
        b.setAccNo(generateAccountNumber());
        b.setBal(54546); // default balance
        b.setIfsc("ICIC0001234");
        System.out.println("Phone number: ");
        b.setPh(sc.nextLong());
        System.out.println("Email: ");
        b.setEmail(sc.next());
        System.out.println("Pin: ");
        b.setPin(sc.nextInt());
        b.setAccType("Savings");
        System.out.println("DOB: ");
        b.setDob(sc.next());
        System.out.println("Account opened Successfully!");
    }
    
    // Generate account number
    public static String generateAccountNumber() {
        String accNo = "2020";
        long no = 345564764;
        no += count++;
        String acc = Long.toString(no);
        for (int i = 0; i < acc.length() && i < 9; i++) {
            accNo += acc.charAt(i);
        }
        return accNo;
    }
    
    // Check balance
    public static void checkBalance() {
        System.out.println("Enter Pin: ");
        int pin = sc.nextInt();
        if (pin == b.getPin())
            System.out.println("Balance: " + b.getBal());
        else
            System.out.println("Wrong pin");
    }
    
    // Print Passbook
    public static void passBook() {
        System.out.println("************** PassBook **************");
        System.out.println("######################################");
        System.out.println("Account Holder : " + b.getName());
        System.out.println("Account Number : " + b.getAccNo());
        System.out.println("Balance        : " + b.getBal());
        System.out.println("Account Type   : " + b.getAccType());
        System.out.println("IFSC           : " + b.getIfsc());
        System.out.println("Phone Number   : " + b.getPh());
        System.out.println("DOB            : " + b.getDob());
        System.out.println("Email          : " + b.getEmail());
        System.out.println("######################################");
    }
    
    // Withdraw
    public static void withdraw() {
        System.out.println("Enter Amount to Withdraw: ");
        double amt = sc.nextDouble();
        System.out.println("Enter Pin: ");
        int pin = sc.nextInt();
        if (pin == b.getPin()) {
            if (amt <= b.getBal()) {
                b.setBal(b.getBal() - amt);
                System.out.println("Transaction Successful!");
            } else {
                System.out.println("Insufficient Balance");
            }
        } else {
            System.out.println("Wrong Pin");
        }
    }
    
    // Deposit
    public static void deposit() {
        System.out.println("Enter Account Number: ");
        String accNo = sc.next();
        if (accNo.equals(b.getAccNo())) {
            System.out.println("Enter Amount: ");
            b.setBal(b.getBal() + sc.nextDouble());
            System.out.println("Transaction Successful!");
        } else {
            System.out.println("Invalid Account Number");
        }
    }
    
    // Change Pin
    public static void changePin() {
        System.out.println("Enter Old Pin: ");
        int oldPin = sc.nextInt();
        if (oldPin == b.getPin()) {
            System.out.println("Enter New Pin: ");
            int newPin = sc.nextInt();
            b.setPin(newPin);  // ✅ FIX: Now updates pin
            System.out.println("Pin changed Successfully!");
        } else {
            System.out.println("Wrong Pin");
        }
    }
}