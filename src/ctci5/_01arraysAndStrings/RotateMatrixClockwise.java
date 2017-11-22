package ctci5._01arraysAndStrings;

import java.util.Arrays;

public class RotateMatrixClockwise {
	
	static Integer[][] rotate(Integer[][] M) {
		int n = M.length - 1;
		
		for (int i = 0; i <= n/2; i++) {
			for (int j = i; j < n - i; j++) {
				int t = M[i][j];
				
				M[i][j] = M[n-j][i];
				M[n-j][i] = M[n-i][n-j];
				M[n-i][n-j] = M[j][n-i];
				M[j][n-i] = t;
			}
		}
		
		return M;
	}

	public static void main(String[] args) {
		Integer[][] M = {
				{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4},
		};
		System.out.println(Arrays.deepToString(rotate(M)));
	}

}
