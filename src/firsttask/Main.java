package firsttask;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        TreeSet<FirstTask> service = new TreeSet();

        service.add(new FixedHourlyCostPaidService("service1", "Google Orkut", 11));
        service.add(new FixedHourlyCostPaidService("service2", "Google Voice", 9.4));
        service.add(new FixedMonthlyCostPaidService("service5", "YouTube", 8064));
        service.add(new FixedHourlyCostPaidService("service3", "Mandrill", 11.2));
        service.add(new FixedHourlyCostPaidService("service4", "Google Finance", 7.8));
        service.add(new FixedMonthlyCostPaidService("service7", "Google Building Maker", 5347));
        service.add(new FixedMonthlyCostPaidService("service6", "LinkedIn", 6863));

        print(service);
        firstFive(service);
        lastTree(service);
    }

    static private void print(TreeSet<FirstTask> mass) {
        Iterator<FirstTask> iter = mass.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next().toString());
        }
    }

    private static void firstFive(TreeSet<FirstTask> mass) {
        Iterator<FirstTask> iter = mass.iterator();
        for (int i = 0; i < 5; i++) {
            System.out.println(iter.next().name);
        }
    }

    private static void lastTree(TreeSet<FirstTask> mass) {
        Iterator<FirstTask> iter = mass.iterator();
        for (int i = 0; i < 7; i++) {
            if (i < 4) {
                iter.next();
                continue;
            }
            System.out.println(iter.next().id);
        }
    }
}
