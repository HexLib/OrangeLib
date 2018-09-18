

package orangelib.lib.window;

import javax.swing.*;
/**
 * WindowManager class for Windows.
 * 
 * @author HexLib Team
 * @version 1.00
 */
public class WindowManager {
   private static JFrame frame = null;
   private static IconImage img = new IconImage(".src/orangelib/development-512.png");
   /**
    * WindowManager.createFrame(String name);
    * 
    * Creates a JFrame.
    */
    public static void createFrame(String name) {
        frame = new JFrame(name);
        frame.setImageIcon(img);
    }
  
  /**
   * WindowManager.createFrame();
   * 
   * Creates a JFrame.
   */
   public static void createFrame() {
      frame = new JFrame();

   }
    
    /**
     * WindowManager.setSize(int width, int height);
     * 
     * sets the size of the JFrame.
     */
    public static void setSize(int width, int height) {
        frame.setSize(width, height);
    }
    
    /**
     * WindowManager.setTitle(String title);
     * 
     * sets the title of the JFrame.
     */
    public static void setTitle(String title) {
        frame.setTitle(title);
    }
    
    /**
     * WindowManager.setVisible(boolean vis);
     * 
     * sets the visibility of the JFrame.
     */
    public static void setVisible(boolean vis) {
        frame.setVisible(vis);
    }
    
    /**
     * WindowManager.add(Component c);
     * 
     * adds a component to the JFrame.
     */
    public static void add(Component c) {
        frame.add(c);
    }
    
    /**
     * WindowManager.auto();
     * 
     * automatically sets up the JFrame.
     */
    public static void auto() {
        frame.create();
        frame.setSize(1280, 720);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    public static void setIcon(ImageIcon icon) {
        img = icon;
        frame.setImageIcon(img);
    }
       
}
