package core;

import org.lwjgl.Sys;
import org.lwjgl.util.vector.Vector3f;

/**
 * Helper object that can be used
 * to calculate some math.
 * @author Mikkel
 *
 */
public class Helper {
	public static float coTangent(float angle) {
		return (float)(1f / Math.tan(angle));
	}

	public static float degreesToRadians(float degrees) {
		return degrees * (float)(Math.PI / 180d);
	}
	
	public static float radiansToDegrees(float radians) {
		return radians * (float)(180d/Math.PI);
	}
	
	public static long getTime() {
		return (Sys.getTime() * 1000) / Sys.getTimerResolution();
	}

	public static float angleBetweenVector3f(Vector3f v1,
			Vector3f v2) {
		return (float)Math.acos(Vector3f.dot(v1, v2) / magnitude(v1,v2));		
	}
	
	private static float magnitude(Vector3f v1, Vector3f v2){
		return (float)(Math.sqrt(v1.getX()*v1.getX() + v1.getY() * v1.getY() + v1.getZ() * v1.getZ()) * 
		Math.sqrt(v2.getX()*v2.getX() + v2.getY() * v2.getY() + v2.getZ() * v2.getZ()));
	}
}
