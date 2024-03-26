/*
 * Authors: Daniel Daugbjerg, Kent Morris, Casey Klutznick, Thomas McKeown
 * Date Last Modified: 3/7/24
 * Description: Neuron class that handles weights and training
 */
import java.util.Random;

public class neuron{
    double[] weights;
    private final double weight_threshold;
    
    public neuron(int numInputs, double wt){
        weights = new double[numInputs];
        weight_threshold = wt;
    }

    public void createWeights(int userChoice){
        if (userChoice == 0){
            for (int i=0; i<weights.length; i++){
                weights[i] = 0;
            }
        }
        else{
            Random gen = new Random();
            for (int i=0; i<weights.length; i++){
                weights[i] = gen.nextDouble() - 0.5;
            }
        }
    }

    public boolean trainNeuron(int[] inputs, float answer, double alpha, double theta){
        double neurAns = 0;
        int y;
        boolean noChange = true;
        for (int i=0; i<inputs.length; i++){
            neurAns += inputs[i]*weights[i];
        }
        if (neurAns > theta){
            y = 1;
        }
        else if (neurAns < -theta){
            y = -1;
        }
        else {
            y = 0;
        }
        //account for very similar value/imperfect convergence
        if (y != answer){
            for (int i = 0; i < inputs.length; i++) {
                if (answer*inputs[i]*alpha > weight_threshold) {
                    noChange = false;
                    weights[i] = weights[i] + answer * inputs[i] * alpha;
                }
            }
        }
        return noChange;
    }

    public int calcAnswer(int[] inputs){
        double yin = 0;
        int y;
        for (int i=0; i<inputs.length; i++){
            yin += inputs[i]*weights[i];
        }
        if (yin >= 0){
            return 1;
        }
        else if (yin < 0){
            return -1;
        }
        return 0;
    }

    public double[] getWeights(){
        return weights;
    }

    public void setWeights(double[] winput){
        weights = winput;
    }

}
