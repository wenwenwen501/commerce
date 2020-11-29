package controller.common;

import java.io.Serializable;

public class ResponseVo<T> implements Serializable{
    private static final long serialVersionUID = -7454367590246826175L;
    private String code;
    private String msg;
    private T date;

    public ResponseVo(String code,String msg,T date){
        this.code = code;
        this.msg = msg;
        this.date = date;

    }


    public String getCode() {
        return this.code;
    }

    public void setCode(final String code) {
        this.code = code;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(final String msg) {
        this.msg = msg;
    }

    public T getDate() {
        return this.date;
    }

    public void setDate(final T date) {
        this.date = date;
    }
}
