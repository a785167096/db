package cn.tedu.db.common.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 用于封装服务器给浏览器的响应信息
 * @param <T> 返回数据的类型
 */
@Getter
@Setter
@ToString
public class JsonResult<T>{
    private Integer state;
    private String message;
    private T data;

    public JsonResult() {
    }

    public JsonResult(Integer state, String message) {
        this.state = state;
        this.message = message;
    }

    public JsonResult(Integer state, String message, T data) {
        this.state = state;
        this.message = message;
        this.data = data;
    }
}