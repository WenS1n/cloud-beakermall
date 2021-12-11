package cn.vesns.common.exception;

/**
 * @author : vip865047755@126.com
 * @version :JDK1.8
 * @date : 2021-12-11 0:55
 * @File : BizCodeEnum.java
 * @software: IntelliJ IDEA
 */
public enum BizCodeEnum {
    UNKNOWN_EXCEPTION(10000,"系统未知异常"),
    VAILD_EXCEPTION(10001,"参数格式校验失败");

    private Integer code;

    private String msg;

    BizCodeEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
