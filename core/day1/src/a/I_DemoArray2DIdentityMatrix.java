package a;

public class I_DemoArray2DIdentityMatrix {

	public static void main(String[] args) {


		int a[][] = { { 1,0, 0 }, { 0,1,0}, { 0,0,1} };
		
		boolean isIdentityMatrix=true;
		
		for(int i=0;i<a.length; i++) {
			for(int j=0;j<a[i].length; j++) {
				if(i==j) {
					if(a[i][j]!=1) {
						isIdentityMatrix=false;
						break;
					}
				}else {
					if(a[i][j]!=0) {
						isIdentityMatrix=false;
						break;
					}
				}
			}
		}
		System.out.println(isIdentityMatrix);

	}

	

}
