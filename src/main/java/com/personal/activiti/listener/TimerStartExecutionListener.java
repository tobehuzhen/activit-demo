package com.personal.activiti.listener;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.ExecutionListener;

import java.util.Date;

/**
 * Created by huzhen on 2018/1/5.
 */
public class TimerStartExecutionListener implements ExecutionListener {
    public void notify(DelegateExecution execution) throws Exception {
        System.out.println("定时器启动，10s后，自动提交任务结束流程"+ new Date());
    }
}
