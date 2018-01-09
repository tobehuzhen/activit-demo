package com.personal.activiti.service;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;

import java.util.List;

/**
 * Created by huzhen on 2017/11/2.
 */
public class FirstTaskService implements JavaDelegate{

    public void execute(DelegateExecution delegateExecution) throws Exception {
        Thread.sleep(2000);
        System.out.println("第一个任务开始，variavles=" + delegateExecution.getVariables());
        delegateExecution.setVariable("first", "第一个serviceTask");
        Thread.sleep(2000);
        System.out.println("haha,第一个serviceTask开始执行了哦");
    }
}
