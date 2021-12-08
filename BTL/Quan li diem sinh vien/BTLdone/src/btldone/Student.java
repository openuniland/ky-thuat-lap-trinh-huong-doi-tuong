package btldone;

import java.util.Scanner;
public class Student extends Person {
    String fullname;
    String address;
    int age;
    int id;
    String faculty ;
    float cc;
    float giaitich;
    float lthdt;
    float tienganh;
    float ktmt;
    float csdl;
    float tong;
    public Student() {
        super();
        fullname = "";
        address ="";
        age =0;
        id =0;
        faculty ="";
        cc =0;
        giaitich =0;
        lthdt =0;
        tienganh =0;
        ktmt =0;
        csdl =0;
        tong =0;
    }

    public Student(String hoTen, String address, int age, int id, String faculty, float cc, 
            float giaitich, float lthdt, float tienganh,
            float ktmt, float csdl, float tong) {
        this.fullname = hoTen;
        this.address= address;
        this.age= age;
        this.id = id;
        this.faculty = faculty;
        this.cc = cc;
        this.giaitich = giaitich;
        this.lthdt = lthdt;
        this.tienganh = tienganh;
        this.ktmt = ktmt;
        this.csdl = csdl;
        this.tong = tong;
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

    public int getId() {
        return id;
    }

    public float getCc() {
        return cc;
    }

    public float getGiaitich() {
        return giaitich;
    }

    public float getLthdt() {
        return lthdt;
    }

    public float getTienganh() {
        return tienganh;
    }

    public float getKtmt() {
        return ktmt;
    }

    public float getCsdl() {
        return csdl;
    }

    public String getFaculty() {
        return faculty;
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

    public void setId(int id) {
        this.id = id;
    }

    public void setCc(float gpa) {
        this.cc = cc;
    }

    public void setGiaitich(float giaitich) {
        this.giaitich = giaitich;
    }

    public void setLthdt(float lthdt) {
        this.lthdt = lthdt;
    }

    public void setTienganh(float tienganh) {
        this.tienganh = tienganh;
    }

    public void setKtmt(float ktmt) {
        this.ktmt = ktmt;
    }

    public void setCsdl(float csdl) {
        this.csdl = csdl;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public float getTong() {
        return tong;
    }

    public void setTong(float tong) {
        this.tong = tong;
    }
    
    @Override
    public String toString() {
        return "Student{" + "fullname=" + fullname + ", id=" + id+ ", faculty="
                + faculty + ", address="
                + address + ", age=" + age + ", giải tích="+giaitich+", "
                + "lthdt="+lthdt+",tiếng anh="+tienganh+",ktmt="+ktmt+
                ",csdl="+csdl+", cc=" + cc + '}';
    }
    {
    }
    public void display() {
        System.out.println(toString());
    }
    public void input() {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Nhập ID : ");
        id = Integer.parseInt(input.nextLine());
        
        nhap();
    }
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("NHẬP HỌ TÊN: ");
        fullname = sc.nextLine();
        System.out.print("NHẬP ĐỊA CHỈ: ");
        address = sc.nextLine();
        System.out.print("NHẬP TUỔI: ");
        age = Integer.parseInt(sc.nextLine());
        System.out.print("NHẬP TÊN KHOA: ");
        faculty = sc.nextLine();
        System.out.print("NHẬP ĐIỂM CHUYÊN CẦN: ");
        cc = Float.parseFloat(sc.nextLine());
        System.out.print("NHẬP ĐIỂM GIẢI TÍCH: ");
        giaitich = Float.parseFloat(sc.nextLine());
        System.out.print("NHẬP ĐIỂM LTHDT: ");
        lthdt = Float.parseFloat(sc.nextLine());
        System.out.print("NHẬP ĐIỂM TIẾNG ANH: ");
        tienganh = Float.parseFloat(sc.nextLine());
        System.out.print("NHẬP ĐIỂM KTMT: ");
        ktmt = Float.parseFloat(sc.nextLine());
        System.out.print("NHẬP ĐIỂM CSDL: ");
        csdl = Float.parseFloat(sc.nextLine());
    }
}
