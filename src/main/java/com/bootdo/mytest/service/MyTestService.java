package com.bootdo.mytest.service;

import com.bootdo.common.utils.Query;
import com.bootdo.mytest.entity.MClass;
import com.bootdo.mytest.entity.MyTeacher;
import com.bootdo.mytest.entity.MyTest;

import java.util.List;

public interface MyTestService {
    /**
     * 查询全部信息
     * @return 测试列表
     * @param query
     */
    List<MyTest> findMyTestAll(Query query);

    int count(Query query);

    int save(MyTest myTest);
    int save1(MClass mClass);

    int update(MyTest myTest);

    MyTest get(Long id);

    int remove(Long id);

    List<MClass> findMClassAll(Query query);

    int countMClass(Query query);

    int getMaxId();

    int updateMC(MClass mClass);

    int save2(MyTeacher m);

    List<MyTeacher> findMyTeacher(Query query);

    int countMyTeacher(Query query);

    int updateMT(MyTeacher m);

    int removeTable1(Long id);
    int removeTable2(Long id);

    int removeTable11(Long id);

    int removeTable22(Long id);
}
