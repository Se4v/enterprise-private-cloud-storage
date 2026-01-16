package org.example.storagebackend.common;

/**
 * 全局统一返回结果类
 */
public class Result<T> {
    private Integer code;   // 响应状态码
    private String msg;     // 响应提示消息
    private T data;         // 响应数据

    private Result() {}

    private Result(ResultCode resultCode, T data) {
        this.code = resultCode.getCode();
        this.msg = resultCode.getMsg();
        this.data = data;
    }

    private Result(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    // 成功返回（无数据，默认消息：操作成功）
    public static <T> Result<T> success() {
        return new Result<>(ResultCode.SUCCESS, null);
    }

    // 成功返回（带数据，默认消息：操作成功）
    public static <T> Result<T> success(T data) {
        return new Result<>(ResultCode.SUCCESS, data);
    }

    // 成功返回（无数据，自定义提示消息）
    public static <T> Result<T> success(String msg) {
        return new Result<>(ResultCode.SUCCESS.getCode(), msg, null);
    }

    // 成功返回（带数据 + 自定义提示消息）
    public static <T> Result<T> success(String msg, T data) {
        return new Result<>(ResultCode.SUCCESS.getCode(), msg, data);
    }

    // 失败返回（枚举状态码，无数据）
    public static <T> Result<T> fail(ResultCode resultCode) {
        return new Result<>(resultCode, null);
    }

    // 失败返回（仅自定义消息，默认系统错误码500）
    public static <T> Result<T> fail(String msg) {
        return new Result<>(ResultCode.SYSTEM_ERROR.getCode(), msg, null);
    }

    // 失败返回（自定义状态码 + 自定义消息，无数据）
    public static <T> Result<T> fail(Integer code, String msg) {
        return new Result<>(code, msg, null);
    }

    // 失败返回（自定义状态码 + 自定义消息 + 补充数据）
    public static <T> Result<T> fail(Integer code, String msg, T data) {
        return new Result<>(code, msg, data);
    }
}
