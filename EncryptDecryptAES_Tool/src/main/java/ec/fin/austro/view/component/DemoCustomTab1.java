/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.fin.austro.view.component;

import ec.fin.austro.view.MainPrincipal1;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;

/**
 *
 * @author lenovo
 */
public class DemoCustomTab1 extends JPanel {

    MainPrincipal1 customJTabbedPane;

    /**
     * JPanel contain a JLabel and a JButton to close
     */
    public DemoCustomTab1(MainPrincipal1 customJTabbedPane) {
        this.customJTabbedPane = customJTabbedPane;
        setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
        
        setBorder(new EmptyBorder(2, 2, 2, 2));
        setOpaque(false);
        addLabel();
        add(new CustomButton("X"));
    }

    private void addLabel() {
        JLabel label = new JLabel() {
            /**
             * set text for JLabel, it will title of tab
             */
            public String getText() {
                int index = customJTabbedPane.getjTabbedPaneDinamico()
                        .indexOfTabComponent(DemoCustomTab1.this);
                if (index != -1) {
                    return customJTabbedPane.getjTabbedPaneDinamico().getTitleAt(index);
                }
                return null;
            }
        };
        /**
         * add more space between the label and the button
         */
        label.setBorder(new EmptyBorder(0, 10, 0, 10));
        add(label);
    }

    class CustomButton extends JButton implements MouseListener {

        public CustomButton(String text) {
            int size = 15;
            setText(text);
            /**
             * set size for button close
             */
            setPreferredSize(new Dimension(size, size));
            setFont(new java.awt.Font("Segoe UI", 1, 12));
            setToolTipText("close the Tab");

            /**
             * set transparent
             */
            setContentAreaFilled(false);

            /**
             * set border for button
             */
            setBorder(new EtchedBorder());
            /**
             * don't show border
             */
            setBorderPainted(false);

            setFocusable(false);
            //setIcon(new javax.swing.ImageIcon(getClass().getResource("/del.png"))); 
            /**
             * add event with mouse
             */
            addMouseListener(this);

        }

        /**
         * when click button, tab will close
         */
        @Override
        public void mouseClicked(MouseEvent e) {
            int index = customJTabbedPane.getjTabbedPaneDinamico()
                    .indexOfTabComponent(DemoCustomTab1.this);
            if (index != -1) {
                customJTabbedPane.removeTab(index);
            }
        }

        @Override
        public void mousePressed(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        /**
         * show border button when mouse hover
         */
        @Override
        public void mouseEntered(MouseEvent e) {
            setBorderPainted(true);
            setForeground(Color.RED);
        }

        /**
         * hide border when mouse not hover
         */
        @Override
        public void mouseExited(MouseEvent e) {
            setBorderPainted(false);
            setForeground(Color.BLACK);
        }
    }
}
