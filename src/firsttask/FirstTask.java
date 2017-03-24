package firsttask;

abstract class FirstTask implements Comparable<FirstTask> {
    String id;
    String name;
    double costs;

    FirstTask(String newId, String newName, double newCosts) {
        id = newId;
        name = newName;
        costs = newCosts;
    }

    // new method
    public int compareTo(FirstTask o) {
        int result;
        result = Double.compare(o.calculateAverageMonthlyCosts(), calculateAverageMonthlyCosts());
        if (result != 0) return result;
        for (int i = 0; i < name.length(); i++) {
            result = Character.compare(name.charAt(i), o.name.charAt(i));
            if (result != 0) return result;
        }
        return result;
    }

    public String toString(){
        return id + "/" + name + "/" + calculateAverageMonthlyCosts();
    }

    abstract double calculateAverageMonthlyCosts();
}

