package Codegym.tin.customer.service;

import Codegym.tin.customer.model.Customer;

import java.util.ArrayList;

public class CustomerService {
    public static ArrayList<Customer> customerArrayList = new ArrayList<>();

    static {
        Customer cus1 = new Customer(1, "Do Chanh Tin", "0966257540",
                "dochanhtin07041995@gmail.com", "17/8/1995", "Nam",
                "30 Nguyen duy Trinh, Hue");
        Customer cus2 = new Customer(2, "Do Tin Tin", "0966254540",
                "dochanhtin07041995@gmail.com", "17/8/1997", "Nu",
                "25 Nguyen duy Trinh, Hue");
        Customer cus3 = new Customer(3, "Tin Chanh Tin", "0966259540",
                "dochanhtin07041995@gmail.com", "17/8/1999", "Nam",
                "57 Nguyen duy Trinh, Hue");

        customerArrayList.add(cus1);
        customerArrayList.add(cus2);
        customerArrayList.add(cus3);
    }

    public void add(Customer customer) {
        customerArrayList.add(customer);
    }

    public void update(Customer customer) {
        for (Customer cus : customerArrayList) {
            if (customer.getId() == cus.getId()) {
                cus.setFullName(customer.getFullName());
                cus.setPhoneNumber(customer.getPhoneNumber());
                cus.setEmail(customer.getEmail());
                cus.setBirthday(customer.getBirthday());
                cus.setGender(customer.getGender());
                cus.setAddress(customer.getAddress());
            }
        }
    }

    public Customer findById(int id) {
        for (Customer customer : customerArrayList) {
            if (customer.getId() == id)
                return customer;
        }
        return null;
    }

    public void delete(int id) {
        Customer customer = findById(id);
        if (customer != null) {
            customerArrayList.remove(customer);
        }
    }


}
