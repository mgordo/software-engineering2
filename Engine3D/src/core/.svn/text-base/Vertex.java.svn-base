package core;
/**
 * Vertex is a class for storing 3D point information.
 * This basic vertex class supports colors for the vertex points.
 * If textures are to be used, use TexturedVertex instead.
 * @author Mikkel
 *
 */
public class Vertex {
	// Vertex data
	protected float[] xyzw = new float[] {0f, 0f, 0f, 1f};
	protected float[] rgba = new float[] {1f, 1f, 1f, 1f};
	
	public static final int elementBytes = 4;
	
	public static final int positionElementCount = 4;
	public static final int colorElementCount = 4;
	
	public static final int positionByteCount = positionElementCount * elementBytes;
	public static final int colorByteCount = colorElementCount * elementBytes;
	
	// Byte offsets
	public static final int positionByteOffset = 0;
	public static final int colorByteOffset = positionByteOffset + positionByteCount;
	
	// Setters
	public void setXYZ(float x, float y, float z) {
		this.setXYZW(x, y, z, 1f);
	}
	
	public void setRGB(float r, float g, float b) {
		this.setRGBA(r, g, b, 1f);
	}
	
	public void setXYZW(float x, float y, float z, float w) {
		this.xyzw = new float[] {x, y, z, w};
	}
	
	public void setRGBA(float r, float g, float b, float a) {
		this.rgba = new float[] {r, g, b, a};
	}
	
	// Getters
	public float[] getElements() {
		float[] out = new float[Vertex.getElementCount()];
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
		
		return out;
	}
	public float[] getXYZW() {
		return new float[] {this.xyzw[0], this.xyzw[1], this.xyzw[2], this.xyzw[3]};
	}
	
	public float[] getRGBA() {
		return new float[] {this.rgba[0], this.rgba[1], this.rgba[2], this.rgba[3]};
	}
	
	// The number of elements the vertex has
	public static int getElementCount() {
		return positionElementCount + colorElementCount;
	}
	
	public static int getStride () {
		return positionByteCount + colorByteCount;
	}
}
