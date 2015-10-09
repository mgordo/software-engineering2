#version 120

uniform sampler2D texture_diffuse;

varying vec4 pass_Color;
varying vec2 pass_TextureCoord;

void main(void) {
	//vec4 out_Color = pass_Color;
	
	// Override out_Color with our texture pixel
	vec4 out_Color = texture2D(texture_diffuse, pass_TextureCoord);
	
	gl_FragColor = out_Color;
}