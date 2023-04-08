package creational.prototype;

import java.util.Scanner;
class ContactDeepCopy implements Cloneable{
    private long phoneNo;
    private String email;
    private String address;
    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    ContactDeepCopy(long phoneNo, String email, String address ){
        this.phoneNo = phoneNo;
        this.email = email;
        this.address = address;
    }
    public void displayContact() {
        System.out.println("Phone no: "+this.phoneNo);
        System.out.println("Email: "+this.email);
        System.out.println("Address: "+this.address);
    }
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
public class StudentDataDeepCopy implements Cloneable {
    private String name;
    private int age;
    private ContactDeepCopy contact;
    public StudentDataDeepCopy(String name, int age, ContactDeepCopy contact){
        this.name = name;
        this.age = age;
        this.contact = contact;
    }
    public void displayData(){
        System.out.println("Name : "+this.name);
        System.out.println("Age : "+this.age);
        contact.displayContact();
    }
    protected Object clone() throws CloneNotSupportedException{
        StudentDataDeepCopy student = (StudentDataDeepCopy) super.clone();
        student.contact = (ContactDeepCopy) contact.clone();
        return student;
    }
    public static void main(String[] args) throws CloneNotSupportedException {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your name ");
        String name = sc.next();
        System.out.println("Enter your age ");
        int age = sc.nextInt();
        System.out.println("#############Contact details#############");
        System.out.println("Enter your phone number: ");
        long phoneNo = sc.nextLong();
        System.out.println("Enter your Email ID: ");
        String email = sc.next();
        System.out.println("Enter your address: ");
        String address = sc.next();
        System.out.println(" ");
        //Creating an object of the class
        StudentDataDeepCopy std = new StudentDataDeepCopy(name, age, new ContactDeepCopy(phoneNo, email, address));
        //Creating a clone of the above object
        StudentDataDeepCopy copiedStd = (StudentDataDeepCopy) std.clone();
        //Modifying the data of the contact object
        copiedStd.contact.setPhoneNo(000000000);
        copiedStd.contact.setEmail("XXXXXXXXXX");
        copiedStd.contact.setAddress("XXXXXXXXXX");
        System.out.println("Contents of the copied object::");
        copiedStd.displayData();
        System.out.println(" ");
        System.out.println("Contents of the original object::");
        std.displayData();
    }
}