# Perceptron
Perceptron java class with subclasses, neuron and neural net, in order to create a fully functioning pattern classification perceptron machine. <br>
The file, prompter.java, asks for the user to input a file for either setting the weights for the perceptron, which will then use the file for training, or to
input a file for the previously trained perceptron to interpret. In the examples provided, this perceptron takes an input of a matrix representing a letter using bipolar values. 1 being
what makes the shape of the letter, and -1 being blank space. 
<br> <br>
neuron class: simulates the actual weight changes and input/output processing <br>
neuralNet class: uses a matrix of neuron classes to simulate a 
perceptron with multiple inputs outputs<br>
prompter class: deals with user interface and performing certain operations based on the user's choice<br>
testsample.txt files: example input file for a perceptron with previously trained weights to test whether it recognized certain inputs. HNI being
a high level of noise, meaning many 'pixels' of the letter that it is supposed to represent are flipped. MNI being medium and LNI being low.<br>
fixedTestSample.txt: other example input file with random inputs specified in the file
trainingsamples.txt: the example input file that we used with the specific letter matrices that we would like our perceptron to classify through weight training<br>
out.txt: example of the output file produced when running the perceptron through testing with an input file
