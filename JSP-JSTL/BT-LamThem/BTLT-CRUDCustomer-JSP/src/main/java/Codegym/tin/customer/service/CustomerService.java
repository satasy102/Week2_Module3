package Codegym.tin.customer.service;

import Codegym.tin.customer.model.Customer;

import java.util.ArrayList;

public class CustomerService {
    public static ArrayList<Customer> customerArrayList = new ArrayList<>();

    static {
        Customer cus1 = new Customer(1, "Do Chanh Tin", "0966257852",
                "dochanhtin95@gmail.com", "17/5/1995", "Nam", "25 Nguy Hue, Hue");
        customerArrayList.add(cus1);
    }

    public void add(Customer customer) {
        customerArrayList.add(customer);
    }

    public void update(Customer customer) {
        for(Customer cus:customerArrayList){
            if(customer.getId()==cus.getId()){
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
