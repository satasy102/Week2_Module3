package condegym.co.service;

import condegym.co.model.User;

import java.util.HashMap;
import java.util.Map;

public class UserService {
    public static Map<String, User> customerMap = new HashMap<>();

    static {User cus1=new User("dochanhtin7495@gmail.com","chanhtin123","Do Chanh Tin");
        User cus2=new User("volong95@gmail.com","longvo123","Vo Long");
        User cus3=new User("nguyenduongdo96gmail.com","duong123","Nguyen Do Duong");
        User cus4=new User("letanphuc95@gmail.com","tanphuc123","Le Tan Phuc");

        customerMap.put("dochanhtin7495@gmail.com", cus1);
        customerMap.put("volong95@gmail.com", cus2);
        customerMap.put("nguyenduongdo96gmail.com", cus3);
        customerMap.put("letanphuc95@gmail.com", cus4);
    }

}
