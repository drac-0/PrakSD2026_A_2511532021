package pekan3_2511532021;
import java.util.*;

public class StackPostfix_2511532021 {
	public static int postfixevaluate_2021(String expression) {
		Stack<Integer> s = new Stack<Integer>();
		Scanner input = new Scanner(expression);
		
		while(input.hasNext()) {
			if(input.hasNextInt()) {
				s.push(input.nextInt());
			}
			else {
				String operator = input.next();
				int operand2 = s.pop();
				int operand1 = s.pop();
				
				if (operator.equals("+")) {
					s.push(operand1 + operand2);
				}
				else if(operator.equals("-")) {
					s.push(operand1 - operand2);
				}
				else if(operator.equals("*")) {
					s.push(operand1 * operand2);
				}
				
				else {
					s.push(operand1 / operand2);
				}
			}
		}
		input.close();
		return s.pop();
	}
	
	public static void main(String[] args) {
		System.out.println("hasil postfix = " + postfixevaluate_2021("5 2 4 * + 7 -"));
	}
	
}
