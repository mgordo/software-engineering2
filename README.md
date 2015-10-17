# software-engineering2
Software Engineering 2 project - 3D visualization for Petri Nets

This project was done for the course "Software Engineering 2", taken at Denmarks Technical University during the autumm semester of the academic year 2013-2014.
Authors: D. González, J. Gjerstrup, M. Gordo, M. Holm Abrahamsen, S. Päusch and minor contributions by N. Joensen.

# What is this?
This huge project is based on Petri Nets, a mathematical model frequently used to describe distributed Systems. It can also be used to for describing many other systems, such as chemical reactions, data flows, or, in the case of this project, train traffic control. You can find more info on Petri Nets at Wikipedia: https://en.wikipedia.org/wiki/Petri_net, and also on the System Specification document.

This project utilizes our implementation of a Petri Net simulator, interacting in real time with our 3D engine module to draw on-screen changes of the Petri Net being simulated.
Specifically, the 3D module draws trains, train tracks, train switches and traffic lights, so the subyacent Petri Net is essentially modelling train traffic control. 
Because Petri Net simulation is "instantaneous" (doesn't have to wait for animations to finish or for the train to reach a specific position in the track), one of the main challenges was to syncronize the 3D module and the Petri Net Simulator module by designing a complete API that could serve our purposes.

Additionally, the project allows the user to customize what we call a "track geometry", that is, the end user can design a train track circuit that matches its given PetriNet and custimize the train tracks layout (what we call "the geometry", or "track geometry")

The 3D visualization is interactive: the end user can click on trains to stop them, create more trains on the fly, click on train switches to change the path, and turn on and off traffic lights. All these interactions are translated into the Petri Net Simulator, so what the end user is doing in the end is playing with the Petri Net simulation (through the 3D visualization) and see how different actions can change its behaviour. 

# What is this for?
When we want to study a fraction of reality we abstract and create a mathematical model, in order to understand its behaviour and properties. For example, we use Petri Nets to model chemical reactions and distributed systems.
However, when we abstract we lose grip of the reality we were modelling, and increasing complexity and layers of abstraction make it hard to return to the reality that originated the model.

That is the ultimate goal of this project: a mathematical model abstracts from reality to obtain a system we can work with, understand, and make predictions, but with this tool, the end user can understand and work with the model through the 3D visualization and therefore he/she can see how that translates back into reality.

# How does this work?
The project is released as a set of plugins for Eclipse. In order to run it you can follow the Handbook document

# I think I got it, but this is a bit vague..

The Handbook and System Specification documents contain all the necessary info to understand and run the project. 




