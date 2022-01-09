package JavaStandard7.practice;

class Point {
    public int x=10;
    public int y=20;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String getLocation(){
        return "x : " + x + "y : " + y;
    }
}
class Point3D extends Point{
    public int z=30;

    Point3D(){
        this(100,200,300);
    }

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public String getLocation(){    //오버라이딩
        // return "x : " + x + ", y : " + y + ", z : " + z;
        return super.getLocation()+", z : " + z;    //조상의 메서드 호출
    }
}
