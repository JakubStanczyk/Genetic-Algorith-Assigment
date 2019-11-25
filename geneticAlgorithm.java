import javax.swing.*;
public class geneticAlgorithm
{

public static void main(String[] args)
{
	
	JTextField populationSize = new JTextField(2);
	JTextField numberOfGeneration = new JTextField(2);
	JTextField crossOverValue = new JTextField(2);
	JTextField mutationRate = new JTextField(2);
	int popSize = 0; 	
	int numOfGen=0;
	int crossOverVal=0;
	int mutRate=0; 	
	
	

	boolean flag = true;
	
	
	while(flag) 
	{
		
	JPanel inputPane = new JPanel();
	inputPane.add(new JLabel("Population Size:"));
	inputPane.add(populationSize);
	inputPane.add(new JLabel("NumberOfGeneration:"));
	inputPane.add(numberOfGeneration);
	inputPane.add(new JLabel("CrossOverValue:"));
	inputPane.add(crossOverValue);
	inputPane.add(new JLabel("mutationRate:"));
	inputPane.add(mutationRate);
	
	  int result = JOptionPane.showConfirmDialog(null,inputPane,"Enter All Values",JOptionPane.OK_CANCEL_OPTION);
	
	  if((isInputNull(populationSize.getText(),numberOfGeneration.getText(),crossOverValue.getText(),mutationRate.getText())))
	  {
	  
	 popSize= 	Integer.parseInt(populationSize.getText());
	 numOfGen= 	Integer.parseInt(numberOfGeneration.getText());
	 crossOverVal= 	Integer.parseInt(crossOverValue.getText());
	 mutRate= 	Integer.parseInt(mutationRate.getText());
	
	if(isValidOptionA(popSize, numOfGen, crossOverVal, mutRate)) {
		System.out.println("rip");
		
		break;
	}
	  }
	  else {
	  flag= true;
	  }
	  }
	  
	}
	
	
	
	


public static boolean isValidOptionA(int popSize,int numOfGen, int crossOverVal, int mutRate) 
{

	int[] inputs = { popSize, numOfGen, crossOverVal, mutRate } ;
	
	for( int i = 0; i<inputs.length;i++) 
	{
		
		
		if(inputs[i]<0) {
		JOptionPane.showMessageDialog(null,"All numbers have to have a positive value");
		return false;
		
		}
		else if((inputs[2]>100)&&(inputs[3]>100) )
		{
			return false;
		}
		}
	return true;
}
	

public static boolean isInputNull(String popSize,String numOfGen, String crossOverVal, String mutRate )
{
		if(((popSize.length()==0) ||(numOfGen.length()==0)|| (crossOverVal.length()==0)|| (mutRate.length()==0))) {
			JOptionPane.showMessageDialog(null,"All boxes have to be filled with a positive number");
	return false;
		}
		
		else
			return true;
	
	}
	
	


	
}
