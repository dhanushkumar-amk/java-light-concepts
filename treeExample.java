import javax.swing.*;
import javax.swing.tree.*;

/**
 * treeExample
 */
public class treeExample {

    JFrame f;
    treeExample()
{
    f = new JFrame();
DefaultMutableTreeNode style  = new DefaultMutableTreeNode("Style");
DefaultMutableTreeNode color  = new DefaultMutableTreeNode("color");
DefaultMutableTreeNode font  = new DefaultMutableTreeNode("font");
style.add(font);
style.add(color);
DefaultMutableTreeNode red  = new DefaultMutableTreeNode("red");
DefaultMutableTreeNode black  = new DefaultMutableTreeNode("black");
DefaultMutableTreeNode green  = new DefaultMutableTreeNode("green");

color.add(red);
color.add(green);
color.add(black);

JTree t = new JTree(style);
f.add(t);
f.setSize(400,400);
// f.setLayout(null);
f.setVisible(true);

}
public static void main(String[] args) {
    new treeExample();
}
}
