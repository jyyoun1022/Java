package 객체지향;

public class Subway {
    public String subwayNum;
    public int income;
    public int passenger;

    public Subway(String subwayNum) {
        this.subwayNum = subwayNum;
    }

    public void take(int money){
        this.income += money;
        passenger++;
    }

    public String getSubwayNum() {
        return subwayNum;
    }

    public int getIncome() {
        return income;
    }

    public int getPassenger() {
        return passenger;
    }
    public void showInfo(){
        System.out.println("지하철"+this.getSubwayNum()+"의 승객수는"+this.getPassenger()+"이며, 수입은"+getIncome()+"입니다.");
    }
}
