package 객체지향;

public class Bus {
    public int busNum;
    public int income =0;
    public int passenger;

    public Bus(int busNum) {
        this.busNum = busNum;
    }
    public void take(int money){
        passenger++;
        this.income +=money;
    }

    public int getBusNum() {
        return busNum;
    }

    public int getIncome() {
        return income;
    }

    public int getPassenger() {
        return passenger;
    }
    public void showInfo(){
        System.out.println("버스번호"+this.getBusNum()+"의 수입은"+this.getIncome()+"이며,승객수는"+this.getPassenger()+"입니다.");
    }
}
