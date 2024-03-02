package com.deployment.vaadin.entity;




import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name="DEPLOYMENT_AZURE")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeploymentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String applicationName;
    private long carID;
    private String shortName;
    private String automationTool;
    private String description;
    private List<String> subscription;
    private List<String> environment;
    private List<String> resourceGroup;
    private List<String> subnet;
    private List<String> virtualNetwork;

    private String confidentiality;
    private String assignmentGroup;
    private String owner;
    private String maintenanceType;
    private long costCenter;
    private String department;
    private String resilience;
    private String privateEndPoint;
    private String appServiceSKU;
    private String azureDataFactorySKU;
    private String storageAccountType;
    private String vmLinuxSKU;
    private String vmWindowsSKU;
    private long dataDisk;
    private long osDisk;

}
