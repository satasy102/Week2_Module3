package Codegym;

import java.util.HashMap;

public class CustomerManager {
    static int id = 0;
    public HashMap<Integer, Customer> customerHashMap=new HashMap<>();
    public void add() {
        String name = inputFullName();
        String phone = inputPhone();
        String email = inputEmail();
        String birthday = inputBirthday();
        String gender = inputGender();
        String address = inputAddress();

        boolean isExist = checkDuplication(name, phone, email, birthday, gender, address);
        if (isExist) {
            System.out.println("This Student is Existed. System is auto Updated");

        } else {
            getID(customerHashMap);

            Customer student = new Customer(id, name, phone, email, birthday, gender, address);

            customerHashMap.put(id, student);
            System.out.println("Add Student success.");
        }
    }

    private void getID(HashMap<Integer, Customer> customerHashMap) {
        id = 0;
        for (int key : customerHashMap.keySet()) {
            if (id < customerHashMap.get(key).getId()) id = customerHashMap.get(key).getId();
        }
        id++;
    }

    private boolean checkDuplication(String name, String phone, String email, String birthday, String gender,
                                     String address) {
        for (int key : customerHashMap.keySet()) {

            if (customerHashMap.get(key).getFullName().equalsIgnoreCase(name) &&
                    customerHashMap.get(key).getPhoneNumber().equalsIgnoreCase(phone)) {
                updateStudent(email, birthday, gender, address, key);
                return true;
            }
        }


        return false;
    }

    private void updateStudent(String email, String birthday, String gender, String address, int key) {
        customerHashMap.get(key).setBirthday(birthday);
        customerHashMap.get(key).setEmail(email);
        customerHashMap.get(key).setGender(gender);
        customerHashMap.get(key).setAddress(address);
    }

    private String inputAddress() {
        System.out.println("Enter Student's address :");
        return standardize(sc.nextLine());
    }

    private String inputGender() {
        System.out.println("Enter Student's gender : Male/Female");
        String gender = sc.nextLine();
        return checkGender(gender);

    }

    private String checkGender(String sex) {
        while (!sex.equalsIgnoreCase("male") && !sex.equalsIgnoreCase("female")) {
            System.out.println("Gender is only Male or Female. Input again:");
            sex = sc.nextLine();
        }
        return sex;
    }

    private String inputBirthday() {
        System.out.println("Enter Student's birthday :");
        String birthday = sc.nextLine();
        return checkBirthday(birthday);
    }

    private String checkBirthday(String birthday) {
        String BIRTHDAY_REGEX = "^(0?[1-9]|[12][0-9]|3[01])[/-](0?[1-9]|1[012])[/-]\\d{4}$";
        Pattern pattern = Pattern.compile(BIRTHDAY_REGEX);
        Matcher matcher = pattern.matcher(birthday);
        if (matcher.matches()) return birthday;
        else {
            System.out.println("Invalid Birthday format. Input Again:");
            birthday = sc.nextLine();
            return checkBirthday(birthday);
        }
    }

    private String checkPhone(String phone) {
        String PHONE_REGEX = "^0[9873]+\\d{8}$";
        Pattern pattern = Pattern.compile(PHONE_REGEX);
        Matcher matcher = pattern.matcher(phone);
        if (matcher.matches()) return phone;
        else {
            System.out.println("Invalid Phone format. Input Again:");
            phone = sc.nextLine();
            return checkPhone(phone);
        }
    }

    private String inputPhone() {
        System.out.println("Enter Student's phone :");
        String phone = sc.nextLine();
        return checkPhone(phone);
    }

    private String checkEmail(String email) {
        String EMAIL_REGEX = "^[a-z][a-z0-9_.]{5,32}@[a-z0-9]{2,}(\\.[a-z0-9]{2,4}){1,2}$";
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()) return email;
        else {
            System.out.println("Invalid Email format. Input Again:");
            email = sc.nextLine();
            return checkEmail(email);
        }
    }

    private String inputEmail() {
        System.out.println("Enter Student's Email :");
        String email = sc.nextLine();
        return checkEmail(email);
    }

    private String inputFullName() {
        System.out.println("Enter Student's name :");
        String name = sc.nextLine();
        name = standardize(name);
        return checkFullName(name);
    }

    private String checkFullName(String name) {
        String NAME_REGEX = "^[A-Za-z ]{5,30}$";
        Pattern pattern = Pattern.compile(NAME_REGEX);
        Matcher matcher = pattern.matcher(name);
        if (matcher.matches()) return name;
        else {
            System.out.println("Invalid name format. Input Again:");
            name = sc.nextLine();
            name = standardize(name);
            return checkFullName(name);
        }
    }
}
