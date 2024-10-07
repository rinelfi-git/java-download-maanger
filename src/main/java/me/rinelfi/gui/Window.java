package me.rinelfi.gui;

import me.rinelfi.gui.component.LeftPanel;
import me.rinelfi.gui.component.Menu;
import me.rinelfi.view_model.View;
import me.rinelfi.view_model.ViewModel;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;

public class Window extends JFrame implements View {
    private ViewModel _vm;
    
	public Window() {
        super();
		Dimension   min_size = new Dimension(900, 500);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Java Download Manager");
        this.setMinimumSize(min_size);
        this.setSize(min_size);
        this._vm = new me.rinelfi.view_model.Window();
        this._vm.populate(this);
    }
    
    private JComponent right_component() {
        JComponent  out = new JPanel();
        
        out.setBackground(Color.RED);
        return (out);
    }
    
    public void build() {
        JPanel   root_pane = new JPanel();
        
        this.setJMenuBar(new Menu(this));
        root_pane.setLayout(new BoxLayout(root_pane, BoxLayout.X_AXIS));
        root_pane.add(new LeftPanel());
        root_pane.add(this.right_component());
        this.add(root_pane);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    
    @Override
    public void listen(ViewModel model) {
        System.out.println("Changed");
    }
}
