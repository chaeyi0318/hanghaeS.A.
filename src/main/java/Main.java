public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus();
        Bus bus2 = new Bus();
        bus.getIn(2);
        bus.addOil(-50);
        bus.status("차고지행");
        bus.getIn(5);
        bus.addOil(10);
        bus2.getIn(30);
        bus2.getIn(5);
        bus.addOil(-55);
    }
}
