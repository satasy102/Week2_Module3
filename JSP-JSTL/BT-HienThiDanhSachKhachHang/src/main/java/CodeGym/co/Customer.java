package CodeGym.co;

public class Customer {
    private String name;
    private String dob;
    private String address;
    private String url_img;

    public Customer() {
    }

    public Customer(String name, String dob, String address, String url_img) {
        this.name = name;
        this.dob = dob;
        this.address = address;
        this.url_img = url_img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUrl_img() {
        return url_img;
    }

    public void setUrl_img(String url_img) {
        this.url_img = url_img;
    }
}
