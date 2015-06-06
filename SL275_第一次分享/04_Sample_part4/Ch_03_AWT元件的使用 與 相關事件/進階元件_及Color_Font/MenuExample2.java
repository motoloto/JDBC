import java.awt.*;
public class MenuExample2 {
    public static void main(String args[]) {
        Frame f = new Frame("MenuBar testing...");
        f.setSize(500, 300);
        f.setVisible(true);
        MenuBar bar = new MenuBar();
        f.setMenuBar(bar);
        Menu fileMenu = new Menu("File");
        bar.add(fileMenu);
        MenuItem inew = new MenuItem("New");
        fileMenu.add(inew);
        MenuItem iopen = new MenuItem("Open");
        fileMenu.add(iopen);
        fileMenu.addSeparator();

        CheckboxMenuItem iprint = new CheckboxMenuItem("Print mode");
        fileMenu.add(iprint);
        Menu subMenu = new Menu("Press me");
        fileMenu.add(subMenu);
        MenuItem ithis = new MenuItem("This");
        subMenu.add(ithis);
        MenuItem ithat = new MenuItem("That");
        subMenu.add(ithat);
        Menu helpMenu = new Menu("Help");
        bar.add(helpMenu);
        helpMenu.add(new MenuItem("about this program"));
        helpMenu.add(new MenuItem("content...."));
    }
}
