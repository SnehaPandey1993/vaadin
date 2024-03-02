package com.deployment.vaadin.view;

import com.deployment.vaadin.entity.DeploymentEntity;
import com.deployment.vaadin.repository.DeploymentRepository;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.checkbox.CheckboxGroup;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.NativeLabel;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

import java.util.List;

@Route("view")
public class MainView1 extends VerticalLayout {


    public MainView1(DeploymentRepository deploymentRepository) {

        FormLayout formLayout = new FormLayout();

        // Create text fields for username, email, and password
        TextField applicationName = new TextField("Application Name");
        TextField shortName = new TextField("Short Name");
        TextField carId = new TextField("Car ID");
        TextField automationTool = new TextField("Automation Tool");
        TextField confidentiality = new TextField("Confidentiality");
        TextField department = new TextField("Department");
        TextField costCenter = new TextField("Cost Center");
        TextField assignmentGroup = new TextField("Assignment Group");
        TextField owner = new TextField("Owner");
        TextField maintenanceType = new TextField("Maintenance Type");
        TextField resilience = new TextField("Resilience");
        CheckboxGroup<String> checkboxSub= new CheckboxGroup<>();
        checkboxSub.setLabel("Subscription");
        checkboxSub.setItems("apps","aks","mysql");
        CheckboxGroup<String> checkboxEnv= new CheckboxGroup<>();
        checkboxEnv.setLabel("Environment");
        checkboxEnv.setItems("dev","it","uat","prod");
        CheckboxGroup<String> checkboxRes= new CheckboxGroup<>();
        checkboxRes.setLabel("Resource Group");
        checkboxRes.setItems("vnetRG","appsRG");
        DeploymentEntity deployment=new DeploymentEntity();

            Button addButton = new Button("Add",event->{
                deployment.setApplicationName(String.valueOf(applicationName));
                deployment.setShortName(String.valueOf(shortName));
                deployment.setResilience(String.valueOf(resilience));
                deployment.setOwner(String.valueOf(owner));
                deployment.setMaintenanceType(String.valueOf(maintenanceType));
                deployment.setDepartment(String.valueOf(department));
                deployment.setConfidentiality(String.valueOf(confidentiality));
                deployment.setCarID(Long.parseLong(String.valueOf(carId)));
                deployment.setAssignmentGroup(String.valueOf(assignmentGroup));
                deployment.setCostCenter(Long.parseLong(String.valueOf(costCenter)));
                deployment.setAutomationTool(String.valueOf(automationTool));
                deployment.setSubscription((List<String>) checkboxSub);
                deployment.setEnvironment((List<String>) checkboxEnv);
                deployment.setResourceGroup((List<String>) checkboxRes);

                deploymentRepository.save(deployment);
                Notification.show("User Created successfully!");

            });



            Button deleteButton = new Button("Delete",event->{
                deploymentRepository.delete(deployment);
                Notification.show("User Created successfully!");

            });


       formLayout.add(applicationName,shortName,carId,automationTool,confidentiality,department,costCenter,assignmentGroup,owner,
                maintenanceType,resilience,checkboxEnv,checkboxSub,checkboxRes,addButton,deleteButton);
       add(formLayout);
    }
}


