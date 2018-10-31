package dang.note.spring.common.entiy;


import dang.note.spring.common.entiy.constant.Code;
import lombok.Data;

import java.util.UUID;

@Data
public class ApiResult<T> {
    private int code;
    private String message;
    private String queryId = UUID.randomUUID().toString();
    private T data;


    public ApiResult(Code code, T data) {
        this.code = code.getCode();
        this.message = code.getMessage();
        this.data = data;
    }

    public ApiResult(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static <T> ApiResult success(T data) {
        return new ApiResult(Code.SUCCESS, data);
    }
}
