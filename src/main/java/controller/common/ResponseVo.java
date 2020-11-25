package controller.common;

public class ResponseVo<T> {
    private String code;
    private String msg;
    private T date;

    public ResponseVo(String code,String msg,T date){
        this.code = code;
        this.msg = msg;
        this.date = date;

    }

}
