public class Accumulator{ /* Accumulator Class */
			double valueSoFar; //creates a double to the hold the values computed
			String currentOperator; //creates a String for currentOperator
			Accumulator() { /* Accumulator Method */
			valueSoFar = 0.0; 
			currentOperator = "C"; //setting the currentOperator to equals the String "C"
			} /* End of Accumulator Method */
			/* Constructor calculate */
			void calculate(double numberOnDisplay, String nextOperator){ //The constructor for calculations
				if (currentOperator.equals("C")) { //checking if currentOperator equals "C"
					valueSoFar = numberOnDisplay; //sets the valuesSoFar to the current value numberOnDisplay
				}
					
			if (currentOperator.equals("+")) { //checking if currentOperator equals "+"
			valueSoFar = valueSoFar + numberOnDisplay; //computes valueSoFar plus numberOnDisplay
			} 
			if(currentOperator.equals("-")) { //checking if currentOperator equals "-"
				valueSoFar = valueSoFar - numberOnDisplay; //computes valueSoFar minus numberOnDisplay
			}
			if(currentOperator.equals("/")) { //checking if currentOperator equals "/"
				valueSoFar = valueSoFar / numberOnDisplay; //computes valueSoFar divided by numberOnDisplay
			}
			if(currentOperator.equals("*")) { //checking if currentOperator equals "*"
				valueSoFar = valueSoFar * numberOnDisplay; //computes valueSoFar multiplied by numberOnDisplay
			}
			if(currentOperator.equals("x^y")) { //checking if currentOperator equals "x^y"
				valueSoFar = Math.pow(valueSoFar, numberOnDisplay); //computes valueSoFar to the power of numberOnDisplay
			}
			
			if(currentOperator.equals("x^2")) { //checking if currentOperator equals "x^2"
				valueSoFar = Math.pow(valueSoFar, 2); //computes valueSoFar to the power of two
			}
			
			if(currentOperator.equals("|x|")) { //checking if currentOperator equals "|x|"
				valueSoFar = Math.abs(valueSoFar); //computes the absolute value of valueSoFar 
			}
			
			if(currentOperator.equals("sqrt")) { //checking if currentOperator equals "sqrt"
				valueSoFar = Math.sqrt(valueSoFar); //computes the square root of valueSoFar
			}
			
			if(currentOperator.equals("nthsqrt(x)")) { //checking if currentOperator equals "nthsqrt(x)"
				//computes the nthroot of valueSoFar to the root of numberOnDisplay
				valueSoFar = Math.pow(valueSoFar, 1.0/numberOnDisplay); 
				
			}
			
			
			
			currentOperator = nextOperator; //sets the currentOperator equal to the nextOperator
			} /* End of Constructor calculate*/
			
			/* getValue Method */
			double getValue() { 
			return valueSoFar; //returns the result of the computations
			} /* End of getValue Method */
			
			/* resetAccumulator Method */
			void resetAccumulator() { //Method for resetting the accumulator
				valueSoFar = 0.0; //sets values SoFar to 0
				currentOperator = "C";
			} /* End of resetAccumulator Method */
			
			
			} /* Accumulator */