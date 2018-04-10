package com.bootdo.mytest.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;
import com.bootdo.mytest.entity.MClass;
import com.bootdo.mytest.entity.MyTeacher;
import com.bootdo.mytest.entity.MyTest;
import com.bootdo.mytest.service.MyTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/mytest")
public class MyTestController {
    @Autowired
    private MyTestService myTestService;
    private String prefix="mytest";

    /***********************************************************************/
    @RequestMapping(value = "/mastertable")
    String mastertable(Model model) {
        return prefix+"/mastertablelist";
    }

    /* @RequestMapping(value = "/addmastertable")
     String addmastertable(Model model) {
         return "mastertable/addmastertable";
     }*/
    @RequestMapping("/addnewtable")
    public String addnewtable(MyTest myTest){
        System.out.println(myTest);
        int i=0;
        if (myTest!=null){
            /*if (myTestService.save(myTest)>0){
                if (myTest.getMclass()!=null&&myTest.getMclass().size()>0){
                    for (MClass m:myTest.getMclass()){
                        m.setMid(myTest.getId());
                        myTestService.save1(m);
                    }
                }
            }*/
        }
        return "mastertable/mastertablelist";
    }


    /*@PostMapping("/addmastertable")
    @ResponseBody
    public R addmastertable(MClass mClass){
        mClass.setTestDate(new Date());
        if (myTestService.save1(mClass) > 0) {
            return R.ok();
        }
        return R.error();
    }*/
    @PostMapping("/updatemastertable")
    @ResponseBody
    public R updatemastertable(MClass mClass){
        mClass.setTestDate(new Date());
        if (myTestService.updateMC(mClass) > 0) {
            return R.ok();
        }
        return R.error();
    }


    /*******************************新形势***************************************/
    @RequestMapping(value = "/mastertablelist")
    String mastertablelist(Model model) {
        return prefix+"/mastertablelist";
    }
    @RequestMapping("/masterlist")
    @ResponseBody
    PageUtils masterlist(@RequestParam Map<String, Object> params) {
        // 查询列表数据
        Query query = new Query(params);
        List<MyTest> sysUserList = myTestService.findMyTestAll(query);
        int total = myTestService.count(query);
        PageUtils pageUtil = new PageUtils(sysUserList, total);
        return pageUtil;
    }
    @RequestMapping(value = "/addmastertable")
    String addmastertable(Model model) {
        return prefix+"/addmastertable2";
    }
    @RequestMapping("/addmassnewtable")
    @ResponseBody
    public R addmassnewtable(MyTest myTest){
        if ( myTestService.save(myTest)> 0) {
            int i=0;
            int j=0;
            if (myTest.getMclass()!=null){
                List<MClass> l= JSON.parseArray(myTest.getMclass(),MClass.class);
                for (MClass m:l){
                    m.setMid(myTest.getId());
                   i= myTestService.save1(m);
                }
            }
            if (myTest.getMyteacher()!=null){
                List<MyTeacher> l= JSON.parseArray(myTest.getMyteacher(),MyTeacher.class);
                for (MyTeacher m:l){
                    m.setMid(myTest.getId());
                   j= myTestService.save2(m);
                }
            }
            if (i+j>0){
                return R.ok();
            }
        }
        return R.error();
    }
    @RequestMapping("/editmastertable/{id}")
    String editmastertable(Model model, @PathVariable("id") Long id) {
        MyTest userDO = myTestService.get(id);
        model.addAttribute("mt", userDO);
        return prefix+"/editmastertable2";
    }
    @RequestMapping("/mastertablesonlist")
    @ResponseBody
    PageUtils mastertablesonlist(@RequestParam Map<String, Object> params, Model model) {
        Query query = new Query(params);
        List<MClass> sysUserList = myTestService.findMClassAll(query);
        int total = myTestService.countMClass(query);
        PageUtils pageUtil = new PageUtils(sysUserList, total);
        return pageUtil;
    }
    @RequestMapping("/getMyteacherlist")
    @ResponseBody
    PageUtils getMyteacherlist(@RequestParam Map<String, Object> params, Model model) {
        Query query = new Query(params);
        List<MyTeacher> sysUserList = myTestService.findMyTeacher(query);
        int total = myTestService.countMyTeacher(query);
        PageUtils pageUtil = new PageUtils(sysUserList, total);
        return pageUtil;
    }
    @RequestMapping("/editmassnewtable")
    @ResponseBody
    public R editmassnewtable(MyTest myTest){
        myTestService.update(myTest);
        int i=0;
        int j=0;
        if (myTest.getMclass()!=null&&myTest.getMap()!=null){
            List<MClass> l= JSON.parseArray(myTest.getMclass(),MClass.class);
            //第一种方式
            Map maps = (Map)JSON.parse(myTest.getMap());
            for (MClass m:l){
                if (maps.containsKey(m.getId()+"")){
                    myTestService.updateMC(m);
                }
                if (m.getTid()!=0){
                    m.setMid(myTest.getId());
                    myTestService.save1(m);
                }
            }
           i++;
        }
        if (myTest.getMyteacher()!=null&&myTest.getTmap()!=null){
            List<MyTeacher> l= JSON.parseArray(myTest.getMyteacher(),MyTeacher.class);
            //第一种方式
            Map maps = (Map)JSON.parse(myTest.getTmap());
            for (MyTeacher m:l){
                if (maps.containsKey(m.getId()+"")){
                    myTestService.updateMT(m);
                }
                if (m.getTid()!=0){
                    m.setMid(myTest.getId());
                    myTestService.save2(m);
                }
            }
            j++;
        }
        if (i+j>0){
            return R.ok();
        }
        return R.error();
    }
    @PostMapping("/removeTable1")
    @ResponseBody
    public R removeTable1(Long id) {
        if (myTestService.removeTable1(id) > 0) {
            return R.ok();
        }
        return R.error();
    }
    @PostMapping("/removeTable2")
    @ResponseBody
    public R removeTable2(Long id) {
        if (myTestService.removeTable2(id) > 0) {
            return R.ok();
        }
        return R.error();
    }
    @PostMapping("/removeTable")
    @ResponseBody
    public R removeTable(Long id) {
        int i=0;
        int j=0;
        if (myTestService.remove(id) > 0) {
             i=myTestService.removeTable11(id);
             j=myTestService.removeTable22(id);
             if (i+j>=0)
                return R.ok();
        }
        return R.error();
    }
}
