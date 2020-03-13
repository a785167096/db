package cn.tedu.db.common.pojo;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * 用于封装分页查询结果的VO类
 */
@Getter
@Setter
@ToString
public class PageObjectVO<T> {

    private Integer rowCount; // 总数据条数
    private Integer pageCount; // 总页数
    private Integer currentPage; // 当前页编号
    private Integer pageSize; // 每页数据条数
    private List<T> pageRecords; //当前页数据

    public PageObjectVO() {
    }

}