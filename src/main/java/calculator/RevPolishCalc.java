package calculator;

public class RevPolishCalc implements InterfaceCalculator {
  private NumStack values;
  
  public RevPolishCalc() {
    this.values = new NumStack();
  }

  @Override
  public float evaluate(String what) throws BadTypeException, EmptyStackException {
    String[] equation = what.split("");
    String operators = "+-*/";
    
    for (int i = 0; i < equation.length; i++) {
      if (!operators.contains(equation[i])) {
        this.values.push(Float.parseFloat(equation[i]));
      } else {
        float n1 = this.values.pop();
        float n2 = this.values.pop();
    	switch (equation[i]) {
          case "+":
    	    this.values.push(n1 + n2);
    	    break;
          case "-":
      	    this.values.push(n2 - n1);
      	    break;
          case "*":
      	    this.values.push(n1 * n2);
      	    break;
          case "/":
      	    this.values.push(n2 / n1);
      	    break;
	      default:
	        break;
    	}
      }
    }
    
    return this.values.pop();
  }
}
