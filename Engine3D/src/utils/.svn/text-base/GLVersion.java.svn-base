package utils;
/**
 * 
 * This code I took from the mugen project. I'll add credit if we keep it.
 * 
 */
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GLVersion
{
  private int major, minor, sub;
  public GLVersion(int majorRev, int minorRev, int subMinorRev)
  {
    major = majorRev;
    minor = minorRev;
    sub = subMinorRev;
  }

  /**
   * @param versionString must be of the form "GL_VERSION_X" or
   * "GL_VERSION_X_Y" or "GL_VERSION_X_Y_Z" or "X.Y", where X, Y,
   * and Z are integers.
 * @return 
   *
   * @exception IllegalArgumentException if the argument is not a valid
   * OpenGL version identifier
   */
  public GLVersion(String versionString)
  {
    try 
    {
      if (versionString.startsWith("GL_VERSION_"))
      {
        StringTokenizer tok = new StringTokenizer(versionString, "_");

        tok.nextToken(); // GL_
        tok.nextToken(); // VERSION_ 
        if (!tok.hasMoreTokens()) { major = 0; return; }
        major = Integer.valueOf(tok.nextToken()).intValue();
        if (!tok.hasMoreTokens()) { minor = 0; return; }
        minor = Integer.valueOf(tok.nextToken()).intValue();
        if (!tok.hasMoreTokens()) { sub = 0; return; }
        sub = Integer.valueOf(tok.nextToken()).intValue();
      }
      else
      {
        StringTokenizer tok = new StringTokenizer(versionString, ". ");
        major = Integer.valueOf(tok.nextToken()).intValue();
        minor = Integer.valueOf(tok.nextToken()).intValue();

        // See if there's version-specific information which might
        // imply a more recent OpenGL version
        tok = new StringTokenizer(versionString, " ");
        if (tok.hasMoreTokens()) {
          tok.nextToken();
          if (tok.hasMoreTokens()) {
            Pattern p = Pattern.compile("\\D*(\\d+)\\.(\\d+)\\.?(\\d*).*");
            Matcher m = p.matcher(tok.nextToken());
            if (m.matches()) {
              int altMajor = Integer.valueOf(m.group(1)).intValue();
              int altMinor = Integer.valueOf(m.group(2)).intValue();
              // Avoid possibly confusing situations by putting some
              // constraints on the upgrades we do to the major and
              // minor versions
              if ((altMajor == major && altMinor > minor) ||
                  altMajor == major + 1) {
                major = altMajor;
                minor = altMinor;
              }
            }
          }
        }
      }
    }
    catch (Exception e)
    {
      throw (IllegalArgumentException)
        new IllegalArgumentException(
          "Illegally formatted version identifier: \"" + versionString + "\"")
            .initCause(e);
    }
  }

  public int compareTo(Object o)
  {
    GLVersion vo = (GLVersion)o;
    if (major > vo.major) return 1; 
    else if (major < vo.major) return -1; 
    else if (minor > vo.minor) return 1; 
    else if (minor < vo.minor) return -1; 
    else if (sub > vo.sub) return 1; 
    else if (sub < vo.sub) return -1; 

    return 0; // they are equal
  }

  public int getMajor() {
    return major;
  }

  public int getMinor() {
    return minor;
  }
}