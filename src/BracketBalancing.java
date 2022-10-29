import java.util.Stack;

public class BracketBalancing {

	public static void main(String[] args) {
		String brackets = "[()]{}{[()()]()}";
		Stack<Character> stack = new Stack<>();
		for(int i=0;i<brackets.length();i++) {
			Character bracket = brackets.charAt(i);
			if(bracket=='{' || bracket=='(' || bracket=='[') {
				stack.push(bracket);
			}
			else {
				if((bracket == '}' && stack.peek()== '{') ||
					(bracket == ']' && stack.peek()== '[')||
					(bracket == ')' && stack.peek()== '(')	
				) {
					stack.pop();
				}
				else {
					System.out.println("Not balanced");
					break;
				}
			}
		}
		if(stack.size()!=0)
			System.out.println("Not balanced");
		else {
			System.out.println("Balanced");
		}
	}

}
