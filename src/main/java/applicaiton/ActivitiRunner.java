package applicaiton;

import org.activiti.engine.runtime.ProcessInstance;

/**
 * Created by huzhen on 2017/11/2.
 */
public class ActivitiRunner extends AbstractRunner{
    private static String deploymentId;

    @Override
    public void initialize() {
        deploymentId = repositoryService.createDeployment()
                .addClasspathResource("TriggerAutoProcess.bpmn20.xml")
                .deploy().getId();
    }

    public static void main(String [] args){
        AbstractRunner runner = new ActivitiRunner();
          /*  ProcessInstance pi = runner.getRuntimeService().startProcessInstanceByKey("TimeStartProcess");
        String processInstanceId = pi.getProcessInstanceId();
        System.out.println(pi+""+pi.isEnded());
        runner.getRepositoryService().deleteDeployment(deploymentId, true);*/
        while(true){}
}
}
