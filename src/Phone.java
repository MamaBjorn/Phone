import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Phone implements Comparable<Phone>{
    String phoneCompany;
    String phoneModel;
    int phonePrice;
    Phone (String company, String model, int price) {
        phoneCompany = company;
        phoneModel = model;
        phonePrice = price;
    }

    @Override
    public int compareTo(Phone o) {
        return this.phonePrice - o.phonePrice;
    }

    @Override
    public String toString() {
        return phoneModel + " from " + phoneCompany + " for " + phonePrice;
    }

    public static void main(String[] args) {
        ArrayList<Phone> phones = new ArrayList<>();
        System.out.println();
        System.out.println("По цене: \n");
        phones.add(new Phone("Apple", "iPhone 11", 753848537));
        phones.add(new Phone("Huawei", "ээээ", 4444));
        phones.add(new Phone("Samsung", "Galaxy 483783785", 10));
        phones.add(new Phone("Apple", "iPhone 2", 100000000));
        phones.add(new Phone("РУССКИЙ", "Я РУССКИИИИИИЙ", 11));

        phones.stream().sorted().forEach(phone -> System.out.println(phone));

        System.out.println();
        System.out.println("\nОдна модель: \n");

        List<Phone> applePhones = phones.stream().filter(phone -> (phone.phoneCompany.contains("Apple"))).collect(Collectors.toList());

        applePhones.stream().forEach(iPhone -> System.out.println(iPhone));
    }
}
