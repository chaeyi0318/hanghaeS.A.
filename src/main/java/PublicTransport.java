public class PublicTransport {
    protected static int num;
    protected int oil = 100;
    protected int max_passenger = 30;
    protected int passenger = 0;
    protected int speed = 0;
    protected String status = "운행";

    PublicTransport() {
        ++num;
    }

    public static int getNum() {
        return num;
    }

    public static void setNum(int num) {
        PublicTransport.num = num;
    }

    public int getOil() {
        if(oil < 10) {
            System.out.println("주유량 : " + oil);
            System.out.println("주유가 필요하다.");
            this.status = "차고지행";
            return oil;
        }
        System.out.println("주유량 : " + oil);
        return oil;
    }

    public void setOil(int oil) {
        this.oil = oil;
    }

    public int getMax_passenger() {
        return max_passenger;
    }

    public void setMax_passenger(int max_passenger) {
        this.max_passenger = max_passenger;
    }

    public int getPassenger() {
        return passenger;
    }

    public void setPassenger(int passenger) {
        this.passenger = passenger;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void status(String status) {
        if(status.equals("운행")) {
            this.status = "운행";
        } else if(status.equals("차고지행")){
            this.status = "차고지행";
        }
    }

    public void changeSpeed(int speed) {
        this.speed += speed;
        System.out.println("현재 속도는 " + this.speed + "입니다.");
    }

    public void addOil(int oil) {
        this.oil += oil;
        getOil();
    }
}
