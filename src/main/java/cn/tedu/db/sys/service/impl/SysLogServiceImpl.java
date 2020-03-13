package cn.tedu.db.sys.service.impl;

import cn.tedu.db.common.pojo.PageObjectVO;
import cn.tedu.db.sys.mapper.SysLogMapper;
import cn.tedu.db.sys.pojo.SysLogDO;
import cn.tedu.db.sys.service.ISysLogService;
import cn.tedu.db.sys.service.ex.NoRecordException;
import cn.tedu.db.sys.service.ex.PageNumberException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName SysLogServiceImpl
 * @Description TODO
 * @Author hp
 * @Date 2020/3/13 15:20
 * @Version 1.0
 */
@Service
public class SysLogServiceImpl implements ISysLogService {
    @Autowired
    SysLogMapper mapper;
    private Integer pageSize=2;// 指定每页的数据条数

    @Override
    public PageObjectVO<SysLogDO> findSysLog(String username, Integer currentPage) throws NoRecordException {
        //判断currentPage是否为null或<1
        if (currentPage == null || currentPage < 1) {
            throw new PageNumberException("当前页码错误");
        }
        //调用持久层方法getRowCount，查询总数据条数
        int rowCount = mapper.getRowCount(username);
        //判断rowCount是否为0
        if (rowCount == 0) {
            //是：throw new NoRecordException
            throw new PageNumberException("为查询到相关数据");
        }

        //计算recordIndex=(courrentPage)*pageSize
        int recordIndex = (currentPage-1)*pageSize;
        //调用持久层方法listSysLog,查询当前页数据
        List<SysLogDO> pageRecords = mapper.listSysLog(username, currentPage, pageSize);
        //创建PageObject对象
        PageObjectVO<SysLogDO> vo = new PageObjectVO<> ();
        //向PageObjectVO对象中添加数据
        vo.setRowCount(rowCount);
        vo.setPageCount((rowCount-1)/pageSize+1);
        vo.setCurrentPage(currentPage);
        vo.setPageRecords(pageRecords);
        return vo;
    }
}