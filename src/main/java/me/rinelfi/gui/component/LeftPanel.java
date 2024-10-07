package me.rinelfi.gui.component;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;

public class LeftPanel extends JPanel {
	public LeftPanel() {
		Dimension dim = new Dimension(200, Integer.MAX_VALUE);
		DefaultMutableTreeNode download_categories = new DefaultMutableTreeNode();
		download_categories.add(this.alldownloads());
		download_categories.add(this.unfinished());
		download_categories.add(this.finished());
		JTree tree = new JTree(download_categories);
		
		this.setPreferredSize(dim);
		this.setLayout(new BorderLayout());
		this.setMinimumSize(dim);
		this.setMaximumSize(dim);
		this.add(tree, BorderLayout.CENTER);
	}
	
	private DefaultMutableTreeNode alldownloads() {
		DefaultMutableTreeNode      out = new DefaultMutableTreeNode("All downloads");
		DefaultMutableTreeNode[]    children = new DefaultMutableTreeNode[]{
				new DefaultMutableTreeNode("Compressed"),
				new DefaultMutableTreeNode("Documents"),
				new DefaultMutableTreeNode("Music"),
				new DefaultMutableTreeNode("Programs"),
				new DefaultMutableTreeNode("Video")
		};
		int i = 0;
		
		while (i < children.length)
			out.add(children[i++]);
		return (out);
	}
	
	private DefaultMutableTreeNode unfinished() {
		DefaultMutableTreeNode      out = new DefaultMutableTreeNode("Unfinished");
		DefaultMutableTreeNode[]    children = new DefaultMutableTreeNode[]{
				new DefaultMutableTreeNode("Compressed"),
				new DefaultMutableTreeNode("Documents"),
				new DefaultMutableTreeNode("Music"),
				new DefaultMutableTreeNode("Programs"),
				new DefaultMutableTreeNode("Video")
		};
		int i = 0;
		
		while (i < children.length)
			out.add(children[i++]);
		return (out);
	}
	
	private DefaultMutableTreeNode finished() {
		DefaultMutableTreeNode      out = new DefaultMutableTreeNode("Finished");
		DefaultMutableTreeNode[]    children = new DefaultMutableTreeNode[]{
				new DefaultMutableTreeNode("Compressed"),
				new DefaultMutableTreeNode("Documents"),
				new DefaultMutableTreeNode("Music"),
				new DefaultMutableTreeNode("Programs"),
				new DefaultMutableTreeNode("Video")
		};
		int i = 0;
		
		while (i < children.length)
			out.add(children[i++]);
		return (out);
	}
}
