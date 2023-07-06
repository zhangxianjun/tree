package team.flint.tree.model.enums;

import com.flint.parent.code.IStatusCode;

/**
 * HTTP STATUS CODE
 */

public enum BusinessEnum implements IStatusCode {

    FRESH(4100, "刷新NFT详情-Http Status Code 400");

    private final int code;

    private final String message;

    BusinessEnum(int code, String message) {
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
