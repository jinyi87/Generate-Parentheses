import java.util.ArrayList;
import java.util.List;
/*Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

For example, given n = 3, a solution set is:

[
  "((()))",
  "(()())",
  "(())()",
  "()(())",
  "()()()"
]*/
public class Solution
{
	public List<String> generateParenthesis(int n)
	{
		List<String> list=new ArrayList<>();
		addparentheses(list, "", n, 0, 0);
		return list;
	}
	public void addparentheses(List<String> list,String str,int max,int left,int right)
	{
		if(left+right==max*2)
		{
			 list.add(str);
		}
		if(left<max)
			addparentheses(list, str+"(", max, left+1, right);
		if(right<left)
			addparentheses(list, str+")", max, left, right+1);
	}
}