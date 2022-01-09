package JavaStandard7.practice;

public class Car {
    public String color;
    public int door;

    public void drive(){    //운전하는 기능
        System.out.println("drive, Brrrrr~");
    }
    public void stop(){ //멈추는 기능
      System.out.println("stop");
    }
}
class FireEngine extends Car{   //소방차
    public void water(){    //물뿌리는기능
        System.out.println("water");
    }
}
class Ambulance extends Car{    //구급차
    public void siren(){    //사이렌을 울리는 기능
        System.out.println("siren~");
    }
}
