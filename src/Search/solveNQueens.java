package Search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class solveNQueens {

	public List<List<String>> solveNQueens(int n) {
		List<List<String>> res = new ArrayList<List<String>>();
		int[] queens = new int[n];
		Arrays.fill(queens,-1);
		Set<Integer> cols = new HashSet<Integer>();
		Set<Integer> pie = new HashSet<Integer>();
		Set<Integer> na = new HashSet<Integer>();
		backtrack(res,queens,n,0,cols,pie,na);
		return res;
		
    }
	public void backtrack(List<List<String>> res,int[] queens,int n,int row,
			Set<Integer> cols,Set<Integer> pie,Set<Integer> na) {
		if(row == n) {
			List<String> board = generateBoard(queens,n);
			res.add(board);
		}else {
			for(int i = 0;i<n;i++) {
				if(cols.contains(i)) {
					continue;
				}
				int pie1 = row - i;
				if(pie.contains(pie1)) {
					continue;
				}
				int na1 = row + i;
				if(na.contains(na1)) {
					continue;
				}
				queens[row] = i;
				cols.add(i);
				pie.add(pie1);
				na.add(na1);
				backtrack(res,queens,n,row+1,cols,pie,na);
				queens[row] = -1;
				cols.remove(i);
				pie.remove(pie1);
				na.remove(na1);
			}
		}
	}
		public List<String> generateBoard(int[] queens,int n){
			List<String> board = new ArrayList<String>();
			for(int i = 0;i<n;i++) {
				char[] row = new char[n];
				Arrays.fill(row,'.');
				row[queens[i]] = 'Q';
				board.add(new String(row));
			}
			return board;
		
	}
}
