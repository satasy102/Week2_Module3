package codeGym.service;

import codeGym.model.Customer;

import java.util.ArrayList;

public class CustomerService {
    public static ArrayList<Customer> cusList=new ArrayList<>();

    static {
        Customer cus1=new Customer("Mai Văn Hoàng","1983-08-20","Hà Nội", "anh1.png");
        Customer cus2=new Customer("Nguyễn Văn Nam","1983-08-21","Bắc Giang", "anh2.png");
        Customer cus3=new Customer("Nguyễn Thái Hòa","1983-08-22","Nam Định", "anh3.png");
        Customer cus4=new Customer("Trần Đăng Khoa","1983-08-17","Hà Tây", "anh4.png");
        Customer cus5=new Customer("Nguyễn Đình Thi","1983-08-19","Hà Nội", "anh5.png");

        cusList.add(cus1);
        cusList.add(cus2);
        cusList.add(cus3);
        cusList.add(cus4);
        cusList.add(cus5);
    }

    public ArrayList<Customer> getCusList(){
        return cusList;
    }
}
