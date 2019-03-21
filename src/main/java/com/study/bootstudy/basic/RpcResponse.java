package com.study.bootstudy.basic;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * RpcResponse实体
 *
 * @author Faker
 * @version 1.0
 * @since 2019-03-14 16:01:24
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RpcResponse<T> implements Serializable {
    private Integer code;
    private String msg;
    private T data;

    public static RpcResponse success() {
        return new RpcResponse<>(0);
    }

    private RpcResponse(int code) {
        this.code = code;
    }

    public static <T> RpcResponse<T> success(T data) {
        return new RpcResponse<>(0, "", data);
    }

    public static RpcResponse error(Integer code, String msg) {
        return new RpcResponse(code, msg, null);
    }
}
