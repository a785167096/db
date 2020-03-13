package cn.tedu.db.sys.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.util.Date;
import java.util.Objects;

/**
 * 用于封装系统日志信息的实体类
 * @ClassName SysLogDo
 * @Description TODO
 * @Author hp
 * @Date 2020/3/8 18:16
 * @Version 1.0
 */
@Getter
@Setter
@ToString
public class SysLogDO {
    private long id;
    private String username;
    private String operation;
    private String method;
    private String params;
    private long time;
    private String ip;
    private Date createdTime;

    public SysLogDO() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SysLogDO)) return false;
        SysLogDO SysLogDO = (SysLogDO) o;
        return id == SysLogDO.id &&
                time == SysLogDO.time &&
                Objects.equals(username, SysLogDO.username) &&
                Objects.equals(operation, SysLogDO.operation) &&
                Objects.equals(method, SysLogDO.method) &&
                Objects.equals(params, SysLogDO.params) &&
                Objects.equals(ip, SysLogDO.ip) &&
                Objects.equals(createdTime, SysLogDO.createdTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, operation, method, params, time, ip, createdTime);
    }
}