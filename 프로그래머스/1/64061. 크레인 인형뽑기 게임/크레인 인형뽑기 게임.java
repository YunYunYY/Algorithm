import java.util.ArrayList;
import java.util.Stack;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer=0;
		ArrayList<Stack<Integer>> aa = new ArrayList<Stack<Integer>>();
		for(int i=0;i<board.length;i++)
			aa.add(new Stack<Integer>());
		for(int i=board.length-1;i>=0;i--) {
			for(int j=0;j<board.length;j++) {
				Stack<Integer> a = aa.get(j);
				if(board[i][j]==0)continue;
				else a.add(board[i][j]);
			}
		}
		Stack<Integer> bb = new Stack<Integer>();
		for(int i=0;i<moves.length;i++) {
			int b = moves[i]-1;
			Stack<Integer> cc = aa.get(b);
			if(cc.isEmpty())continue;
			int c = cc.pop();
			if(!bb.isEmpty()&&bb.peek()==c) {
				//.out.println("peek:"+bb.peek()+"pop:"+c);
				answer+=2;bb.pop();
			}
			else {
				bb.add(c);//System.out.println("peek:"+bb.peek());
			}
		}
		return answer;
    }
}