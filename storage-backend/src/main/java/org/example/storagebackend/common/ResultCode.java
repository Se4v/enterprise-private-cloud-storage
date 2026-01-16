package org.example.storagebackend.common;

/**
 * 响应状态码枚举
 */
public enum ResultCode {
    SUCCESS(200, "操作成功"),
    FAIL(400, "操作失败"),
    UNAUTHORIZED(401, "未登录或token已过期"),
    FORBIDDEN(403, "无操作权限"),
    NOT_FOUND(404, "请求资源不存在"),
    SYSTEM_ERROR(500, "系统异常，请稍后重试");

    private final Integer code;
    private final String msg;

    ResultCode(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
