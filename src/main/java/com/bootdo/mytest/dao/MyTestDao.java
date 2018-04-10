package com.bootdo.mytest.dao;

import com.bootdo.common.utils.Query;
import com.bootdo.mytest.entity.MClass;
import com.bootdo.mytest.entity.MyTeacher;
import com.bootdo.mytest.entity.MyTest;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MyTestDao {
    /**
     * 查询全部信息
     * @return 信息列表
     * @param query 参数
     */
    List<MyTest> selectMyTestAll(Query query);

    /**
     * 查询数据总条数
     * @param query 参数
     * @return 返回总条数
     */
    int getCount(Query query);

    /**
     * 添加测试数据
     * @param myTest 数据信息
     * @return 插入条数
     */
    int save(MyTest myTest);

    /**
     *
     * 更新测试数据
     * @param myTest 数据信息
     * @return 更新条数
     */
    int update(MyTest myTest);

    /**
     * 根据ID查询数据信息
     * @param id 数据ID
     * @return 数据信息
     */
    MyTest getMyTestById(Long id);

    /**
     * 根据ID删除数据信息
     * @param id 数据ID
     * @return 删除条数
     */
    int remove(Long id);

    int savec(MClass mClass);

    List<MClass> selectMClassAll(Query query);

    int getMCount(Query query);

    int getMaxId();

    int updateMC(MClass mClass);

    int savet(MyTeacher m);

    List<MyTeacher> findMyTeacher(Query query);

    int getCount1(Query query);

    int updateMT(MyTeacher m);

    int removeTable1(Long id);
    int removeTable2(Long id);

    int removeTable11(Long id);

    int removeTable22(Long id);
}
