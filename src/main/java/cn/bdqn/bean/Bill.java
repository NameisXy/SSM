package cn.bdqn.bean;

public class Bill {
    private String address;
    private Integer kg;
    private String telephon;
    private String price;

    @Override
    public String toString() {
        return "Bill{" +
                "address='" + address + '\'' +
                ", kg=" + kg +
                ", telephon='" + telephon + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getKg() {
        return kg;
    }

    public void setKg(Integer kg) {
        this.kg = kg;
    }

    public String getTelephon() {
        return telephon;
    }

    public void setTelephon(String telephon) {
        this.telephon = telephon;
    }
}
