package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

/**
 * Created by laperlablancaIV on 4/12/14.
 */
public class prova {
    private JButton button1;

    public prova() {

        button1.addComponentListener(new ComponentAdapter() {
        });
    }

    @Override
    public void componentResized(ComponentEvent e) {
        super.componentResized(e);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
