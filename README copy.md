# Single-Layer-Perceptron-Specification

60 points)
In this project, you will implement in Java an artificial neural network system for
classifying letters with different fonts using perceptron learning. Please see page 74 of
the textbook for the well-known perceptron learning algorithm.
For the system training, it should use the input and output data dimensions specified in
its network training set (please see the attached sample training set and also page 72 of
your textbook for detail). However, the system should be able to handle pattern
classification problems with any data dimensions if the dimensions of its training and
testing datasets are consistent.
For the system application, you will conduct experiments with the system by deploying it
to multiple dimension-matched data sets (please see page 75 of the textbook for detail)
and save the classification results into files with the following format:
Actual Output:
A
1 -1 -1 -1 -1 -1 -1
Classified Output:
A
1 -1 -1 -1 -1 -1 -1
The files should also include an overall classification accuracy for the testing set.
Notes:
1) If there is no +1 or there are multiple +1 in a classified output, then the corresponding
testing letter should be regarded as “undecided”.
2) The system should use a user-specified threshold to determine if there are weight
changes in the system training.
For the second part of the project, you will perform various experiments and report them
in detail in your project writeup:
• Train your system by a training data set (for instance, the attached sample
training set) and then use the same set as a testing set. Does the system classify
the training samples correctly?
• For a fixed testing set, test your system (in terms of its convergence speed, or
the numbers of epochs required to converge) by selecting several values for the
learning rate alpha (0.25, 0.50, 0.75 and 1.00) and by selecting several values for
the threshold theta (0.00, 0.25, 0.50, 1.00, 5.00, 10.00, and 50.00).
Present your results in a table/curve, your analysis and concluding remarks.
• After training your system with the attached training set, test the ability your
system (in terms of its classification accuracy, or percentage of correctly
classified letters) to classify noisy versions of the training patterns. Create three
testing sets in this experiment:
o LNITest, which has low noise-interference (LNI) input patterns (see the
set on page 75 of the textbook),
o MNITest, which has medium noise-interference (MNI) input patterns (by
adding 3 additional wrong pixels wisely for each letter in LNITest), and
o HNITest, which has high noise-interference (HNI) input patterns (by
adding 6 additional wrong pixels wisely for each letter in LNITest).
Set alpha = 0.25 but try different values of the threshold theta (see the settings in
the previous step).
Present your results in a table/curve, your analysis and concluding remarks.
For this project, your source code, along with various training/testing sets must be
placed in the subdirectory comp380/proj1 in your Linux account. The system should
provide a user-friendly interface for training and testing. The following are possible
sample runs:
[Training through training data]
Welcome to my first neural network – A Perceptron Net!
Enter 1 to train using a training data file, enter 2 to use a trained weight settings
data file:
1
Enter the training data file name:
sampleTraining
Enter 0 to initialize weights to 0, enter 1 to initialize weights to random
values between -0.5 and 0.5:
1
Enter the maximum number of training epochs:
100
Enter a file name to save the trained weight settings:
sampleWeights
Enter the learning rate alpha from 0 to 1 but not including 0:
0.5
Enter the threshold theta:
1.0
Enter the threshold to be used for measuring weight changes:
0.00001
Training converged after 4 epochs.
Enter 1 to test/deploy using a testing/deploying data file, enter 2 to quit:
1
Enter the testing/deploying data file name:
sampleTesting
Enter a file name to save the testing/deploying results:
sampleResults
[Using trained weights files]
Welcome to my first neural network – A Perceptron Net!
Enter 1 to train using a training data file, enter 2 to use a trained weights file:
2
Enter the trained weight settings input data file name:
sampleWeights
Enter 1 to test/deploy using a testing/deploying data file, enter 2 to quit:
2
Enter the testing/deploying data file name:
sampleTesting
Enter a file name to save the testing/deploying results:
sampleResults
The typed project writeup (in PDF) to be submitted through email should contain
the following sections in order and all sections should begin with a new page)
1. Cover page (course name, term, project info, your names, instructor name, date,
etc.)
2. Assertion statement about the project completeness, correctness and punctuality
3. A detailed report on the experiments
4. Sample runs (produced by the script command in Linux)
5. Source code (it must be well documented)
