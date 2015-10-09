#version 330 core

in vec4 in_Position;
in vec4 in_Color;

out vec4 pass_Color;

uniform mat4 Model;
uniform mat4 View;
uniform mat4 Projection;

void main(void) {
	gl_Position = Projection * View * Model * in_Position;
	
	pass_Color = in_Color;
}