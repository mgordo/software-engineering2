package core;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.HashMap;

import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.GL20;
//import org.lwjgl.opengl.GL30;
import org.lwjgl.util.glu.GLU;
import org.lwjgl.util.vector.Matrix4f;
import org.lwjgl.util.vector.Vector3f;
import org.lwjgl.util.vector.Vector4f;
import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.opengl.TextureLoader;
import org.newdawn.slick.util.ResourceLoader;

import scene.components.BoundingBoxComponent;
import scene.components.TransformComponent;
import utils.ObjLoader;

/**
 * The Model3D class contains the 3D data of the loaded 3D models.
 * Vertices (singular: Vertex) are points in space.
 * Indices describes the order that vertices should be drawn in.
 * Vertex color can be used to give a point a color which will be interpolated for the drawn pixel fragments.
 * Buffers are basically just arrays of data that OpenGL uses and wants in a special way.
 * @author Mikkel
 */
public class Model3D {
	// containing the data in a single structure so we avoid duplicates.
	private static HashMap<String, Model3D> model3DDataMap = new HashMap<String, Model3D>();
	static HashMap<String, Texture> textureDataMap = new HashMap<String, Texture>();

	// 3D Model related variables for buffers, buffer IDs, etc.
	private FloatBuffer vbo;// Vertex Buffer Object
	private IntBuffer ibo;	// Index Buffer Object
	private int vboId = 0;		// Vertex Buffer	Object ID
	private int iboId = 0;		// Index Buffer Object ID
	private int vaoId = 0;		// Vertex Array Object ID
	private int cboId = 0;		// Color Buffer Object ID
	private int indexCount = 0;
	private int vertexCount = 0;
	private int vsId = 0;		// Vertex Shader ID
	private int fsId = 0;		// Fragment Shader ID
	private int spId = 0;		// Shader Program ID
	private int modelLocation;
	private int viewLocation;
	private int projectionLocation;
	private ArrayList<Texture> textures = new ArrayList<Texture>(); // Texture references (not actual textures)
	

	/**
	 * The Model3D constructor takes its parameters and creates buffers, loads textures and creates a shader program.
	 * @param vertices an array of vertices.
	 * @param indices an array of indices.
	 * @param shaderPaths a hashmap containing "vert" and "frag" keys with corresponding relative string paths to the shader files.
	 * @param glVersionMinor the version minor number that is used in this context.
	 * @param glVersionMajor the version major number that is used in this context.
	 * @param texturePaths an array of relative string paths to the textures.
	 */
	public Model3D(TexturedVertex[] vertices, int[] indices, HashMap<String, String> shaderPaths, int glVersionMajor, int glVersionMinor, String... texturePaths) {
		createBuffers(vertices, indices);
		createTextures(texturePaths);
		createShaderProgram(shaderPaths, glVersionMajor, glVersionMinor);
	}

	public static void loadModel3D(String modelName) {
		// TODO Auto-generated method stub
		ObjLoader.load(modelName);
	}
	
	/**
	 * Creates the buffers that store the 3D data that will be uploaded to the graphics card and used by the shader program.
	 * @param vertices an array of vertices.
	 * @param indices an array of indices.
	 */
	private void createBuffers(Vertex[] vertices, int[] indices) {
		//TODO: Store the buffers in a static field as well (like the textures)
		// Vertex Buffer creation
		vertexCount = vertices.length;
		vbo = BufferUtils.createFloatBuffer(vertexCount * TexturedVertex.getElementCount());
		for (Vertex vert : vertices) {
			vbo.put(vert.getElements());
		}
		vbo.flip();
		vboId = GL15.glGenBuffers();

		// Index buffer creation
		indexCount = indices.length;
		ibo = BufferUtils.createIntBuffer(indexCount);
		ibo.put(indices);
		ibo.flip();
		iboId = GL15.glGenBuffers();

		// Vertex Array Object creation
		//vaoId = GL30.glGenVertexArrays();
		//GL30.glBindVertexArray(vaoId);

		// Buffer VBO
		//GL15.glBindBuffer(GL15.GL_ARRAY_BUFFER, vboId);
		//GL15.glBufferData(GL15.GL_ARRAY_BUFFER, vbo, GL15.GL_STATIC_DRAW);
		
		// Position data in attribute 0,
		// Color data in attribute 1,
		// Texture data in attribute 2
		//GL20.glVertexAttribPointer(0, TexturedVertex.positionElementCount, GL11.GL_FLOAT, false, TexturedVertex.getStride(), TexturedVertex.positionByteOffset);
		//GL20.glVertexAttribPointer(1, TexturedVertex.colorElementCount, GL11.GL_FLOAT, false, TexturedVertex.getStride(), TexturedVertex.colorByteOffset);
		//GL20.glVertexAttribPointer(2, TexturedVertex.textureElementCount, GL11.GL_FLOAT, false, TexturedVertex.getStride(), TexturedVertex.textureByteOffset);
		//GL30.glBindVertexArray(0);

		//GL15.glBindBuffer(GL15.GL_ARRAY_BUFFER, 0);

		// Buffer IBO
		iboId = GL15.glGenBuffers();
		GL15.glBindBuffer(GL15.GL_ELEMENT_ARRAY_BUFFER, iboId);
		GL15.glBufferData(GL15.GL_ELEMENT_ARRAY_BUFFER, ibo, GL15.GL_STATIC_DRAW);
	}
	
	public FloatBuffer getVbo() {
		return vbo;
	}

	public IntBuffer getIbo() {
		return ibo;
	}

	/**
	 * Loads and stores textures for sampling by the shader program.
	 * Textures are reused if multiple objects use the same texture.
	 * @param relativeTexturePaths
	 */
	private void createTextures(String... relativeTexturePaths) {
		for (String path : relativeTexturePaths) {
			if (textureDataMap.containsKey(path)) {
				textures.add(textureDataMap.get(path));
				continue;
			}
			// TODO: Handle other formats than .PNG
			try {
				System.out.println("Loading texture '" + path + "'");
				textureDataMap.put(path, TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream(path)));
				textures.add(textureDataMap.get(path));
			} catch (IOException e) {
				System.err.println("Failed to load texture.".concat(path));
				e.printStackTrace();
				System.exit(-1);
			}
		}
	}
	
	/**
	 * Creates a shader program out of a vertex shader and a (pixel) fragment / pixel shader.
	 * @param relativeShaderPaths a HashMap containing "vert" and "frag" keys
	 * with corresponding relative string paths to the shader files.
	 * @param glVersionMinor the number after the period in the OpenGL version number
	 * @param glVersionMajor the number before the period in the OpenGL version number
	 */
	private void createShaderProgram(HashMap<String, String> relativeShaderPaths, int glVersionMajor, int glVersionMinor) {
		//TODO: Store shaders in a static field as well (like the textures)
		int errorCheckValue = GL11.glGetError();
		if (glVersionMajor <= 2) {
			vsId = this.loadShader(relativeShaderPaths.get("vert120"), GL20.GL_VERTEX_SHADER);
			fsId = this.loadShader(relativeShaderPaths.get("frag120"), GL20.GL_FRAGMENT_SHADER);
		} else if (glVersionMajor >= 3) {
			vsId = this.loadShader(relativeShaderPaths.get("vert330"), GL20.GL_VERTEX_SHADER);
			fsId = this.loadShader(relativeShaderPaths.get("frag330"), GL20.GL_FRAGMENT_SHADER);
		}
		
		spId = GL20.glCreateProgram();
		GL20.glAttachShader(spId, vsId);
		GL20.glAttachShader(spId, fsId);
		
		// Bind shader attributes and VAO attributes
		// Position
		GL20.glBindAttribLocation(spId, 0, "in_Position");
		// Color
		GL20.glBindAttribLocation(spId, 1, "in_Color");
		// Texture
		GL20.glBindAttribLocation(spId, 2, "in_TextureCoord");
		
		GL20.glLinkProgram(spId);
		
		if(!shaderProgramLinkSuccessful(spId))
			System.err.println("Shader compilation failed: " + GL20.glGetProgramInfoLog(spId,GL20.glGetProgrami(spId,GL20.GL_INFO_LOG_LENGTH)));
		
		GL20.glValidateProgram(spId);
		
		errorCheckValue = GL11.glGetError();
		if (errorCheckValue != GL11.GL_NO_ERROR) {
			System.out.println("ERROR - Could not create the shaders:" + GLU.gluErrorString(errorCheckValue));
			System.exit(-1);
		}		
		
		// Matrices
		modelLocation = GL20.glGetUniformLocation(spId, "Model");
		viewLocation = GL20.glGetUniformLocation(spId, "View");
		projectionLocation = GL20.glGetUniformLocation(spId, "Projection");
	}

	/**
	 * Loads shader files and returns int IDs for the shader that is generated.
	 * @param filename path to the shader file.
	 * @param type type of the shader.
	 * @return ID for the shader.
	 */
	private int loadShader(String filename, int type) {
		StringBuilder shaderSource = new StringBuilder();
		int shaderID = 0;
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader(filename));
			String line;
			while ((line = reader.readLine()) != null) {
				shaderSource.append(line).append("\n");
			}
			reader.close();
		} catch (IOException e) {
			System.err.println("Could not read file.");
			e.printStackTrace();
			System.exit(-1);
		}
		
		shaderID = GL20.glCreateShader(type);
		GL20.glShaderSource(shaderID, shaderSource);
		GL20.glCompileShader(shaderID);
		
		//Error checking the shader compilation
		if(!shaderCompileSuccessful(shaderID))
			System.err.println("Shader compilation failed: " + GL20.glGetShaderInfoLog(shaderID,GL20.glGetShaderi(shaderID,GL20.GL_INFO_LOG_LENGTH)));
		return shaderID;
	}
	
	private static boolean shaderCompileSuccessful(int shaderID) {
		  int status = GL20.glGetShaderi(shaderID, GL20.GL_COMPILE_STATUS);
		  return status == GL11.GL_TRUE;
		}
	
	private static boolean shaderProgramLinkSuccessful(int programID) {
		  int status = GL20.glGetProgrami(programID, GL20.GL_LINK_STATUS);
		  return status == GL11.GL_TRUE;
		}
	
	/**
	 * Detaches shaders, deletes them and the program using them.
	 * Deletes buffers, disables vertex attribute arrays.
	 * Deletes textures.
	 */
	public void dispose() {
		// Delete shader related things
		GL20.glDetachShader(spId, vsId);
		GL20.glDetachShader(spId, fsId);
		
		GL20.glDeleteShader(vsId);
		GL20.glDeleteShader(fsId);
		GL20.glDeleteProgram(spId);
		
		GL15.glDeleteBuffers(cboId);
		
		// Disable the vertex information data attributes from the VAO attributes list
		GL20.glDisableVertexAttribArray(0);
		GL20.glDisableVertexAttribArray(1);
		GL20.glDisableVertexAttribArray(2);
		
		// Unbind buffer
		GL15.glBindBuffer(GL15.GL_ARRAY_BUFFER, 0);
		
		// Delete the VBO
		GL15.glDeleteBuffers(vboId);
		
		// Delete the IBO
		GL15.glDeleteBuffers(iboId);
		
		// Delete the VAO
		//GL30.glBindVertexArray(0);
		//GL30.glDeleteVertexArrays(vaoId);
		
		// Delete textures
		if (textures != null) {
		for (Texture texture : textures) {
			GL11.glDeleteTextures(texture.getTextureID());
		}
		}
		
		textures = null;
		
		getModel3DDataMap().clear();
		textureDataMap.clear();
		
	}

	public int getVboId() {
		return vboId;
	}

	public int getIboId() {
		return iboId;
	}

	public int getVaoId() {
		return vaoId;
	}

	public int getCboId() {
		return cboId;
	}

	public int getIndexCount() {
		return indexCount;
	}

	public int getVertexCount() {
		return vertexCount;
	}

	public int getVsId() {
		return vsId;
	}

	public int getSpId() {
		return spId;
	}

	public ArrayList<Texture> getTextures() {
		return textures;
	}
	
	public int getModelLocation() {
		return modelLocation;
	}

	public int getViewLocation() {
		return viewLocation;
	}

	public int getProjectionLocation() {
		return projectionLocation;
	}

	public static HashMap<String, Model3D> getModel3DDataMap() {
		return model3DDataMap;
	}

	public static void setModel3DDataMap(HashMap<String, Model3D> model3dDataMap) {
		model3DDataMap = model3dDataMap;
	}
}
