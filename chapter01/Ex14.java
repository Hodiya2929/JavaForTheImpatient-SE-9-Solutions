package chapter01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex14 {

	int sum;
	int dim;
	List<Integer> mat;

	public Ex14(int dim, List<Integer> mat) {
		this.dim = dim;
		this.mat = mat;
		this.sum=0;
	}

	public static void main(String[] args) throws Exception {

		Scanner scan= new Scanner(System.in);

		var mat = new ArrayList<Integer>();

		var matrixSize = 0;
		var i = 0;
		for(var line=scan.nextLine(); !line.isEmpty(); line = scan.nextLine(), i++){

			String[] ints =line.split(" ");

			if(i==0)
				matrixSize=ints.length;

			if(ints.length!=matrixSize)
				throw(new Exception("Length of all rows must be equals!"));


			for (int j = 0; j < matrixSize; j++) 
				mat.add(Integer.parseInt(ints[j]));

		}
		
		scan.close();

		if(i!=matrixSize)
			throw(new Exception("Number of columns must be equals to number of rows"));

		Ex14 isMagic=new Ex14(matrixSize, mat);
		System.out.println("Is this matrix is a 'majic matrix' ? "+isMagic.isMagic());

	}

	public boolean isMagic() {

		//  
		for(int i=0; i<this.dim; i++)
			this.sum+=mat.get(i);

		// check rows & columns
		int rowSum=0;
		int columnSum=0;

		for(int i=0; i < this.dim; i++) {

			rowSum=0;
			columnSum=0;

			for (int j = 0; j < this.dim ; j++) { 
				rowSum+=mat.get(dim*i+j);
				columnSum+=mat.get(dim*j+i);
			}

			if(rowSum!=this.sum||columnSum!=this.sum)
				return false;

		}

		// check diagonals
		var major = 0;
		var minor=0; 

		for(int i=0; i < this.dim; i++) {
			major+=mat.get(i*dim+i);
			minor+=mat.get(i*dim+dim-i-1);
		}

		if(major!=this.sum||minor!=this.sum)
			return false;


		return true;
	}

}
