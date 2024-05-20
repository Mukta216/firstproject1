
public class Two_D_Array {

	public static void main(String[] args) {
		int rows=3;
		int colm=3;
		int table[][]=new int[rows][colm];
		table[0][0]=10;
		table[0][1]=11;
		table[0][2]=12;
		
		table[1][0]=20;
		table[1][1]=21;
		table[1][2]=22;
		
		table[2][0]=30;
		table[2][1]=31;
		table[2][2]=32;
		//row length
		System.out.println(table.length);
		//column length
		System.out.println(table[0].length);
		//to print the value of 1st dimention
		System.out.println(table[0][0]);
		//to print data in rectangular form
		for(int i=0;i<rows;i++) {
			for(int j=0;j<colm;j++) {
				System.out.print(" "+table[i][j]);
				
			}System.out.println(" ");
			
		}

	}

}
