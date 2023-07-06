package team.flint.tree.model.enums;


/**
 * HTTP STATUS CODE
 */

public enum HttpCodeEnum {
    SUCCESS(200, "成功"),
    BAD(400, "客户端请求错误"),
    SERVER(500, "服务端响应错误");


    private final int code;

    private final String message;

    HttpCodeEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
