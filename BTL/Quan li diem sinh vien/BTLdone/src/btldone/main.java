package btldone;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class main {
    static List<Student> studentList = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int choose;

        do {
            showMenu();
            choose = Integer.parseInt(input.nextLine());
            switch (choose) {
                case 1:
                    input();
                    ghiFile();
                    break;
                case 2:
                    editById();
                    break;
                case 3:
                    deleteById();
                    break;
                case 4:
                    sortByGpa();
                    break;
                case 5:
                    sortByName();
                    break;
                case 6:
                    showAll();
                    break;
                case 7:
                    docFile();
                    break;
                case 8:
                    DiemTong();
                    break;
                case 9:
                    donotPass();
                    break;
                default:
                    System.out.println("EXIT!");
                    break;
            }
        } while (choose != 9);
    }

    static void input() {
        int n, i;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("\nNHẬP SỐ SINH VIÊN: ");
            n = sc.nextInt();
        } while (n <= 0);
        studentList = new ArrayList<>(n);
        for (i = 0; i < n; i++) {
            Student x = new Student();
            System.out.printf("NHẬP SINH VIÊN THỨ %d: \n", i + 1);
            x.input();
            studentList.add(x);
        }
    }

    static void editById() {
        System.out.println("Nhập ID cần sửa : ");
        int id = Integer.parseInt(input.nextLine());

        for (Student student : studentList) {
            if (student.getId() == id) {
                //sua
                student.nhap();
                break;
            }
        }
    }

    static void deleteById() {
        System.out.println("Nhập ID cần xóa : ");
        int id = Integer.parseInt(input.nextLine());

        for (Student student : studentList) {
            if (student.getId() == id) {
                //sua
                studentList.remove(student);
                break;
            }
        }
    }

    
    static void sortByGpa() {
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return (o1.getCc() > o2.getCc()) ? 1 : -1;
            }
        });
    }

    static void sortByName() {
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getFullname().compareTo(o2.getFullname());
            }
        });
    }
    static void DiemTong(){
        for (Student student : studentList) {
            student.tong = (student.giaitich + student.lthdt + student.tienganh)/3;
            System.out.println("TÊN:  "+student.fullname+" ĐIỂM TB 3 môn: Giải Tích, lthđt, Tiếng Anh:  "+student.tong);
        }
    }
    static void donotPass(){
        
            int cout=0;
        for (Student student : studentList) {
            if(student.lthdt<=4){
                System.out.println("Tên sinh viên trượt: "+student.fullname);
                cout++;
            }
            
        }
        System.out.println("Số sinh viên trượt lthđt: "+cout);
    }
    static void showAll() {
        for (Student student : studentList) {
            student.display();
        }
    }
    static void ghiFile() {
        try {
            FileOutputStream fileOut = new FileOutputStream("input.txt");
            ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
            objOut.flush();
            objOut.writeObject(studentList);
            objOut.close();
            fileOut.close();
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    static void docFile() {
        try {
            studentList = new ArrayList<Student>();
            FileInputStream fin = new FileInputStream("input.txt");
            ObjectInputStream fout = new ObjectInputStream(fin);
            studentList = (ArrayList)fout.readObject(); for(Student x:studentList) {
                x.display();
            }
            fin.close();
            fout.close();

        }
        catch(FileNotFoundException e) {
            System.out.print("\nKHÔNG THẤY file.");
        }
        catch(Exception ex) {
            ex.printStackTrace();
        }
    }
    static void showMenu() {
        System.out.println("1. Add student");
        System.out.println("2. Edit student by ID");
        System.out.println("3. Delete student by ID");
        System.out.println("4. Sort student list by CC");
        System.out.println("5. Sort student list by Name");
        System.out.println("6. Show All Stundent");
        System.out.println("7. Read file input.txt and show all");
        System.out.println("8. Show GPA");
        System.out.println("9. Show don't Pass");
        System.out.println("10. Exit");
        System.out.println("Choose : ");
    }
}
