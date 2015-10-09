#version 330

in vec4 in_Position;
in vec4 in_Color;
in vec2 in_TextureCoord;

out vec4 pass_Color;
out vec2 pass_TextureCoord;

uniform mat4 Model;
uniform mat4 View;
uniform mat4 Projection;

void main(void) {
	gl_Position = Projection * View * Model * in_Position;
	
	pass_Color = in_Color;
	pass_TextureCoord = in_TextureCoord;
}