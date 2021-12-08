package btldone;

import java.io.Serializable;

public class Person implements Serializable {
    static String fullname;
    static String address;
    static int age;
    public Person() {
        super();
        fullname ="";
        address ="";
        age =0;
    }
    public Person(String hoTen, String gioiTinh, int age) {
        this.fullname = hoTen;
        this.address= gioiTinh;
        this.age= age;
    }
    public String getFullname() {
        return fullname;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    @Override
    public String toString() {
       return "Student{" + "fullname=" + fullname + ", address="
                + address + ", age=" + age + '}';
    }
}
