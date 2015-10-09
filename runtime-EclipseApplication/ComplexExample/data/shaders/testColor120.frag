#version 120

varying vec4 pass_Color;

void main(void) {
	gl_FragColor = pass_Color;
}