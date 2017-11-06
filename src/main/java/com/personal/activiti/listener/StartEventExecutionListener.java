package com.personal.activiti.listener;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.ExecutionListener;

/**
 * Created by huzhen on 2017/11/3.
 */
public class StartEventExecutionListener implements ExecutionListener {
    public void notify(DelegateExecution delegateExecution) throws Exception {
        System.out.println("===流程启动");
    }
}
