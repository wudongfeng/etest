package com.dang.etest.entity;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * Description: 测试方法的文档
 *
 * @Author dangqihe
 * @Date Create in 2018/4/23
 */
public class DocMethod {

    Method method;
    List<Case> caseList = new ArrayList<>();

    class  Case{
        Object[] args;
        Object result;

        Case(){

        }

        Case(Object[]args, Object result ){
            this.args = args;
            this.result = result;
        }
    }

    public DocMethod addCase(Object[]args, Object result){
        caseList.add(new Case());
        return this;
    }

}
