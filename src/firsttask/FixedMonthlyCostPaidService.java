package firsttask;

class FixedMonthlyCostPaidService extends FirstTask {

    FixedMonthlyCostPaidService(String id_, String name_, double costs_) {
        super(id_, name_, costs_);
    }

    double calculateAverageMonthlyCosts() {
        return (costs + 0.5) - (costs + 0.5) % 1;
    }
}