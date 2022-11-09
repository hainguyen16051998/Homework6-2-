package Enttity;

import Constant.Constant;

import java.util.Scanner;

public class Student extends Person {
    private static int AUTO_ID = 0;
    private int id;
    private String lop;
    private String type;

    public Student() {
        this.id = AUTO_ID;
        AUTO_ID++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", credits='" + credits + '\'' +
                ", typeSubject='" + typeSubject + '\'' +
                ", id=" + id +
                ", lop='" + lop + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        System.out.println("Nhập loại bạn đọc:  ");
        System.out.println("Chọn 1 trong các loại dưới đây: ");
        System.out.println("1. Sinh viên");
        System.out.println("2. Cao học");
        System.out.println("3. Giảng viên");
        int readTypeTemp;
        do {
            readTypeTemp = new Scanner(System.in).nextByte();
            if (readTypeTemp >= 1 && readTypeTemp <= 3) {
                break;
            }
            System.out.println("Loại bạn đọc không hợp lệ, nhập lại");
        }
        while (true);
        switch (readTypeTemp) {
            case 1:
                this.type = Constant.GENERAL_SUBJECT;
                break;
            case 2:
                this.type = Constant.BASIC_SUBJECT;
                break;
            case 3:
                this.type = Constant.SPECIALIZED_SUBJECT;
                break;
        }
    }
}