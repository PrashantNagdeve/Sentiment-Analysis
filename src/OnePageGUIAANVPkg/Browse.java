/*

 */
package OnePageGUIAANVPkg;

import java.io.File;
import java.io.FileReader;
import javax.swing.JFileChooser;

/**
 * This class allow to browse the review file containing the reviews
 * 
 */
public class Browse extends JFileChooser
{
    static String filepath;
        
    public void BrowseFile() 
    {
        JFileChooser JfOpenDialog=new JFileChooser();       
        JfOpenDialog.setVisible(true);
        JfOpenDialog.showOpenDialog(this);
        JfOpenDialog.setFileFilter(null);
        
        
        //getting Selected file path
        File file=JfOpenDialog.getSelectedFile();
        filepath=file.getPath().toString();    
        OnePageGUIAANVPkg.BackEndGUI.txtFieldFilePath.setText(filepath);
        
        //Adding *.txt file fileter to JfOpenDialog
        JfOpenDialog.setFileFilter(new MyCustomFileFilter());
    }
}

class MyCustomFileFilter extends javax.swing.filechooser.FileFilter
{

    @Override
    public boolean accept(File file) {
        return file.isDirectory()||file.getAbsolutePath().endsWith(".txt");
    }

    @Override
    public String getDescription() {
       return "Text documments(*.txt)";
    }
    
}