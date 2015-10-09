package core;

import org.lwjgl.util.vector.Vector3f;
import org.lwjgl.util.vector.Vector4f;

/**
 * TexturedVertex is a class for storing information about points in 3D space.
 * What color they have (if used) and what texture coordinate they have.
 * @author Mikkel
 *
 */
public class TexturedVertex extends Vertex {
	private float[] st = new float[] {0f, 0f};
	
	// Elements per parameter
	public static final int textureElementCount = 2;
	
	// Bytes per element
	public static final int textureByteCount = textureElementCount * elementBytes;
	
	// Byte offset
	public static final int textureByteOffset = colorByteOffset + colorByteCount;
	
	// Setters
	public void setST(float s, float t) {
		this.st = new float[] {s, t};
	}
	
	// Getters
	public float[] getElements() {
		float[] out = new float[TexturedVertex.getElementCount()];
		int i = 0;
		
		// XYZW
		out[i++] = this.xyzw[0];
		out[i++] = this.xyzw[1];
		out[i++] = this.xyzw[2];
		out[i++] = this.xyzw[3];
		// RGBA
		out[i++] = this.rgba[0];
		out[i++] = this.rgba[1];
		out[i++] = this.rgba[2];
		out[i++] = this.rgba[3];
		// ST
		out[i++] = this.st[0];
		out[i++] = this.st[1];
		
		return out;
	}
	
	// The number of elements the TexturedVertex has
	public static int getElementCount() {
		return positionElementCount + colorElementCount + textureElementCount;
	}
	
	public Vector4f getElementVector() {
		return new Vector4f(xyzw[0],xyzw[1],xyzw[2],xyzw[3]);
	}
	
	// Stride
	public static int getStride () {
		return positionByteCount + colorByteCount + textureByteCount;
	}
}
