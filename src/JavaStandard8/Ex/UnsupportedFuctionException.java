package JavaStandard8.Ex;

public class UnsupportedFuctionException extends RuntimeException{
  private final int ERR_CODE =100;

    UnsupportedFuctionException(String msg, int errCode) { // 생성자
       super(msg);    //조상의 생성자 RuntimeException(String msg)를 호출

  }

    public UnsupportedFuctionException(String msg) {
        this("msg",100);//ERR_CODE를 100으로 초기화한다.

    }

    public int getErrorCdoe(){
      return ERR_CODE;  //에러코드를 반환한다.
  }

    @Override
    public String getMessage() {    //Exception의 getMessage()를 오버라이딩한다.
        return getErrorCdoe()+super.getMessage();
    }
}
