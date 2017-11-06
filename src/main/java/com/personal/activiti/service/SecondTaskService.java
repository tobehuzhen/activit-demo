package com.personal.activiti.service;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by huzhen on 2017/11/2.
 */
public class SecondTaskService implements JavaDelegate {

    public void execute(DelegateExecution delegateExecution) throws Exception {
        Thread.sleep(2000);
        System.out.println("第二个任务开始，variavles=" + delegateExecution.getVariables());
        delegateExecution.setVariable("second", "第二个serviceTask");
        Map<String,Object> variables = delegateExecution.getVariables();
        Set<Map.Entry<String,Object>> set = variables.entrySet();
        for(Iterator<Map.Entry<String,Object>> it = set.iterator();it.hasNext();){
            Map.Entry<String,Object> entry = it.next();
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
        Thread.sleep(2000);
        System.out.println("哇偶，执行了第二个serviceTask");
    }
}
