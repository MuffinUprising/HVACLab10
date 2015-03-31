package com.Casey;

import javax.swing.*;
import java.awt.event.*;
import java.util.Date;
import java.awt.*;
import java.util.*;
import java.awt.event.MouseEvent;

/**
 * Created by casey on 3/30/15.
 */
public class HVACGUI extends JFrame{
    private JPanel rootPanel;
    private JTextField serviceAddressField;
    private JTextField problemDescriptionField;
    private JTextField feeField;
    private JTextField resolutionField;
    private JCheckBox centralACCheckBox;
    private JCheckBox furnaceCheckBox;
    private JList list1;
    private JList resolvedList;
    private JList serviceCallList;
    private JLabel serviceCallLabel;
    private JLabel serviceAddressLabel;
    private JLabel reportDateLabel;
    private JLabel reportDateField;
    private JLabel problemDetectedLabel;
    private JLabel feeLabel;
    private JLabel resolutionDateLabel;
    private JLabel resolutionDateField;
    private JLabel resolutionLabel;
    private JLabel resolvedTicketsLabel;
    private JButton addServiceButton;
    private JButton resolveButton;

    //service call and resolved call models
    DefaultListModel<ServiceCall> supportTicketModel;
    DefaultListModel<ServiceCall> resolvedTicketLModel;
    HVAC hvac = new HVAC();

    protected HVACGUI() {
        //window setup
        super("HVAC Service Calls");
        setContentPane(rootPanel);
        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(new Dimension(1300, 500));

        //support and resolved ticket model
        supportTicketModel = new DefaultListModel<ServiceCall>();
        resolvedTicketLModel = new DefaultListModel<ServiceCall>();
        serviceCallList.setModel(supportTicketModel);
        resolvedList.setModel(resolvedTicketLModel);

        //listeners

        serviceAddressField.addKeyListener(new KeyAdapter() {
        });

        problemDescriptionField.addKeyListener(new KeyAdapter() {
        });
        addServiceButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }
        });
        resolutionField.addKeyListener(new KeyAdapter() {
        });
        feeField.addKeyListener(new KeyAdapter() {
        });
        resolveButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }
        });
        furnaceCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {

            }
        });
        centralACCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {

            }
        });
    }


}
