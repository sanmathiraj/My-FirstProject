package collectionprograms;

public class CopyofElementsInArray {

	public static void main(String[] args) {
		String Array1[]= {"a","b","c","d","g","n"};
		String Array2[]=new String[Array1.length];
		for(int i=0;i<Array1.length;i++) {
			Array2[i]=Array1[i];
		}
		    System.out.println("Elements of original array:");
		for(int i=0;i<Array1.length;i++){
			System.out.println(Array1[i]+"");
		}
		     System.out.println("Elements of copied Array");
		for(int i=0;i<Array2.length;i++)
			{
				
			System.out.println(Array2[i]+"");
		}
		 
		
		}

}
