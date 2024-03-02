package com.deployment.vaadin;

import com.deployment.vaadin.entity.Product;
import com.deployment.vaadin.entity.User;
import com.deployment.vaadin.repository.ProductRepository;
import com.deployment.vaadin.repository.UserRepository;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.NativeLabel;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.radiobutton.RadioButtonGroup;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.binder.Binder;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;

import java.awt.*;

@Route("")
public class MainView extends VerticalLayout {
    public MainView(UserRepository userRepository) {
       // VerticalLayout todosList = new VerticalLayout();
        TextField applicationName = new TextField("Application Name");
        TextField clientName = new TextField("Client Name");

        // Radio buttons for gender selection
        RadioButtonGroup<String> cloudGroup = new RadioButtonGroup<>();
        cloudGroup.setLabel("Select Cloud");
        cloudGroup.setItems("AWS", "Azure", "GCP");

        // List of values for country selection
        ComboBox<String> countryComboBox = new ComboBox<>();
        countryComboBox.setLabel("Country");
        countryComboBox.setItems("USA", "Canada", "UK", "Australia");

        Button registerButton = new Button("Register", event -> {
            User user = new User();
            user.setApplicationName(applicationName.getValue());
            user.setClientName(clientName.getValue());
            user.setCloud(cloudGroup.getValue());
            user.setCountry(countryComboBox.getValue());
            userRepository.save(user);
            Notification.show("Registration successful!");
        });
        // Add components to the layout
        add(applicationName,clientName,cloudGroup,countryComboBox,registerButton);
    }


}

