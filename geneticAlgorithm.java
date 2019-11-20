
import javax.swing.*;
public class geneticAlgorithm{

public static void main(String[] args) {
	
	JTextField populationSize = new JTextField(2);
	JTextField numberOfgeneration = new JTextField(2);
	JTextField crossOverValue = new JTextField(2);
	JTextField mutationRate = new JTextField(2);
	
	
	String errorMessage ="rip";
	boolean flag = true;
	
	
	while(flag) {
	JPanel inputPane = new JPanel();
	inputPane.add(new JLabel("Population Size:"));
	inputPane.add(populationSize);
	inputPane.add(new JLabel("NumberOfGeneration:"));
	inputPane.add(numberOfgeneration);
	inputPane.add(new JLabel("CrossOverValue:"));
	inputPane.add(crossOverValue);
	inputPane.add(new JLabel("mutationRate:"));
	inputPane.add(mutationRate);
	
	int result= JOptionPane.showConfirmDialog(null,inputPane,"Enter All Values",JOptionPane.OK_CANCEL_OPTION);
	int popSize= 	Integer.parseInt(populationSize.getText());
	int numOfGen= 	Integer.parseInt(numberOfgeneration.getText());
	int crossOverVal= 	Integer.parseInt(crossOverValue.getText());
	int mutRate= 	Integer.parseInt(mutationRate.getText());
	
	 
	flag=false;
	
	
	
	
}
}
public boolean isValidOptionA(int popSize,int numOfGen, int crossOverVal, int mutRate) {

	int[] inputs= int[1,2,3];
	
	
	return false;

	
}
}