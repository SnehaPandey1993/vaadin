package com.deployment.vaadin.model;

import com.deployment.vaadin.entity.AzureAppService;
import com.deployment.vaadin.entity.AzureBlobStorage;
import com.deployment.vaadin.entity.AzureSqlDatabase;
import com.deployment.vaadin.entity.AzureVirtualMachine;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class AzureDeploymentSpecification {
    // Subscription details
    private String subscriptionId;
    private String subscriptionName;
    // Resource group details
    private String resourceGroupName;
    private String resourceGroupLocation;
    // Virtual network details
    private String virtualNetworkName;
    private String virtualNetworkAddressSpace;
    private List<String> subnets;
    // Azure service components

    @Autowired
    private List<AzureVirtualMachine> virtualMachines;
    @Autowired
    private List<AzureAppService> appServices;
    @Autowired
    private List<AzureSqlDatabase> sqlDatabases;
    @Autowired
    private List<AzureBlobStorage> blobStorages;
}
