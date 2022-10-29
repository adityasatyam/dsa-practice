import java.util.Stack;

public class CalculateSum {

	public static void main(String[] args) {
		String expression = "2-1 + 2";
		Stack<String> stack = new Stack<>();
		Stack<String> vals = new Stack<>();
		char curr;
		for(int i=0;i<expression.length();i++) {
			curr = expression.charAt(i);
			if(curr == ' ')
				continue;
			else if(curr == '(')
				stack.push(""+curr);
			else if(curr == ')') {
				while(!stack.peek().equals("(")) {
					vals.add(stack.pop());
				}
				stack.pop();
				int sum = evaluate(vals);
				stack.push(""+sum);
				
			}
			else {
				stack.push(""+curr);
			}
		}
		System.out.println(stack);
		int sum = evaluate(stack);
		System.out.println(sum);

	}
	public static int evaluate(Stack stack) {
		System.out.println(stack);
		System.out.println(stack.peek());
		int sum = 0;
		String currOperand = "+";
		while(!stack.isEmpty()) {
			String top = (String)stack.pop();
				if(top.equals("+") || top.equals("-"))
					currOperand = top;
			
				else if(currOperand.equals("+")) {
					sum+= Integer.parseInt(""+top);
				}
				else if(currOperand .equals("-")) {
					sum-=Integer.parseInt(""+top);
				}
			}
		return sum;
	}

}
//Example 1:
//Input: s = "1 + 1"
//Output: 2
//
//Example 2:
//Input: s = " 2-1 + 2 "
//Output: 3
//
//Example 3:
//Input: s = "(1+(4+5+2)-3)+(6+8)"
//Output: 23

