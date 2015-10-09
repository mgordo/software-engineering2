package utils;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

import javax.swing.JOptionPane;

public class JavaClassPathLoader {
	
	public JavaClassPathLoader(){
		setLibraryPath();
	}
	
	private void setLibraryPath(){
	       /* Set lwjgl library path so that LWJGL finds the natives depending on the OS. */
     String osName = System.getProperty("os.name");
     // Get .jar dir. new File(".") and property "user.dir" will not work if .jar is called from
     // a different directory, e.g. java -jar /someOtherDirectory/myApp.jar
     String nativeDir = "";
     try {
         nativeDir = new File(this.getClass().getProtectionDomain().getCodeSource().getLocation().
                 toURI()).getParent();
     } catch (URISyntaxException uriEx) {
         try {
             // Try to resort to current dir. May still fail later due to bad start dir.
             uriEx.printStackTrace();
             nativeDir = new File(".").getCanonicalPath();
         } catch (IOException ioEx) {
             // Completely failed
             ioEx.printStackTrace();
             JOptionPane.showMessageDialog(null, "Failed to locate native library directory. " +
                     "Error:\n" + ioEx.toString(), "Error", JOptionPane.ERROR_MESSAGE);
//             System.exit(-1);
         }
     }
     // Append library subdir
     nativeDir += File.separator + "org.lwjgl" + File.separator + "native" + File.separator;
     if (osName.startsWith("Windows")) {
         nativeDir += "windows";
     } else if (osName.startsWith("Linux") || osName.startsWith("FreeBSD")) {
         nativeDir += "linux";
     } else if (osName.startsWith("Mac OS X")) {
         nativeDir += "macosx";
     } else if (osName.startsWith("Solaris") || osName.startsWith("SunOS")) {
         nativeDir += "solaris";
     } else {
         JOptionPane.showMessageDialog(null, "Unsupported OS: " + osName + ". Exiting.",
                 "Error", JOptionPane.ERROR_MESSAGE);
//         System.exit(-1);
     }
     System.setProperty("org.lwjgl.librarypath", nativeDir);
	}
}
