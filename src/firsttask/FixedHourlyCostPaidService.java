package firsttask;

class FixedHourlyCostPaidService extends FirstTask {

    FixedHourlyCostPaidService(String id_, String name_, double costs_) {
        super(id_, name_, costs_);
    }

    double calculateAverageMonthlyCosts() {
        return (30 * 24 * costs + 0.5) - (30 * 24 * costs + 0.5) % 1;
    }
}