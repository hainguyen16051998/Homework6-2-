package Enttity;

import java.util.Scanner;

public class Person {
    private static int AUTO_ID = 100;
    protected int id;
    protected String name;
    protected String credits;
    protected String typeSubject;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCredits() {
        return credits;
    }

    public void setCredits(String credits) {
        this.credits = credits;
    }

    public String getTypeSubject() {
        return typeSubject;
    }

    public void setTypeSubject(String typeSubject) {
        this.typeSubject = typeSubject;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", credits='" + credits + '\'' +
                ", typeSubject='" + typeSubject + '\'' +
                '}';
    }

    public void nhapThongTin() {
        System.out.print("Nhập tên môn học: ");
        this.name = new Scanner(System.in).nextLine();
        System.out.print("Nhập số đơn vị học trình: ");
        this.credits = new Scanner(System.in).nextLine();
        System.out.println("Nhập loại môn: ");
        System.out.println("1. Đại cương");
        System.out.println("2. Cơ sở nghành");
        System.out.println("3. Chuyên ngành");
        System.out.print("Vui lòng chọn: ");
        int ch;
        do {
            ch = new Scanner(System.in).nextInt();
            if (ch >= 1 && ch <= 3) {
                break;
            }
            System.out.print("Chọn sai, chọn lại: ");
        } while (true);


    }
}
