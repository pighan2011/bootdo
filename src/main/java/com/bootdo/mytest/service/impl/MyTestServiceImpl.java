package com.bootdo.mytest.service.impl;

import com.bootdo.common.utils.Query;
import com.bootdo.mytest.dao.MyTestDao;
import com.bootdo.mytest.entity.MClass;
import com.bootdo.mytest.entity.MyTeacher;
import com.bootdo.mytest.entity.MyTest;
import com.bootdo.mytest.service.MyTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyTestServiceImpl implements MyTestService {
    @Autowired
    private MyTestDao myTestDao;
    @Override
    public List<MyTest> findMyTestAll(Query query) {
        return myTestDao.selectMyTestAll(query);
    }

    @Override
    public int count(Query query) {
        return myTestDao.getCount(query);
    }

    @Override
    public int save(MyTest myTest) {
        return myTestDao.save(myTest);
    }

    @Override
    public int save1(MClass mClass) {
        return myTestDao.savec(mClass);
    }

    @Override
    public int update(MyTest myTest) {
        return myTestDao.update(myTest);
    }

    @Override
    public MyTest get(Long id) {
        return myTestDao.getMyTestById(id);
    }

    @Override
    public int remove(Long id) {
        return myTestDao.remove(id);
    }
    @Override
    public List<MClass> findMClassAll(Query query) {
        return myTestDao.selectMClassAll(query);
    }

    @Override
    public int countMClass(Query query) {
        return myTestDao.getMCount(query);
    }

    @Override
    public int getMaxId() {
        return myTestDao.getMaxId();
    }

    @Override
    public int updateMC(MClass mClass) {
        return myTestDao.updateMC(mClass);
    }

    @Override
    public int save2(MyTeacher m) {
        return myTestDao.savet(m);
    }

    @Override
    public List<MyTeacher> findMyTeacher(Query query) {
        return myTestDao.findMyTeacher(query);
    }

    @Override
    public int countMyTeacher(Query query) {
        return myTestDao.getCount1(query);
    }

    @Override
    public int updateMT(MyTeacher m) {
        return myTestDao.updateMT(m);
    }

    @Override
    public int removeTable1(Long id) {
        return myTestDao.removeTable1(id);
    }
    @Override
    public int removeTable2(Long id) {
        return myTestDao.removeTable2(id);
    }

    @Override
    public int removeTable11(Long id) {
        return myTestDao.removeTable11(id);
    }

    @Override
    public int removeTable22(Long id) {
        return myTestDao.removeTable22(id);
    }

}
