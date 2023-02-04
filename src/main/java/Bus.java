public class Bus extends PublicTransport{
    protected int charge = 1000;
    Bus() {
        super();
        System.out.println(num + "번 버스객체 만들어짐!");
    }

    @Override
    public void status(String status) {
        super.status(status);
    }

    @Override
    public void changeSpeed(int speed) {
        super.changeSpeed(speed);
    }

    public void getIn(int passenger) {
        if(status.equals("운행") && passenger <= max_passenger - passenger) {
            System.out.println("탑승객 수 = " + passenger);
            System.out.println("잔여 승객 수 = " + (max_passenger - passenger));
            pay(passenger);
            max_passenger -= passenger;
        } else if (!this.status.equals("운행")) {
            System.out.println("운행중인 버스만 탈 수 있습니다.");
        } else {
            System.out.println("최대 승객 수를 초과했습니다.");
        }
    }

    public void pay(int passenger) {
        System.out.println("요금 확인 = " + passenger * charge);
    }

    @Override
    public void addOil(int oil) {
        super.addOil(oil);
    }
}
