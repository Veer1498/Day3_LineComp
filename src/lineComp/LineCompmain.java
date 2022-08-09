package lineComp;
/**
 * * LineComparision using OOPs
 * @author Veer.Singa
 *
 */

public class LineCompmain {
	//Main Function
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LineComparision linecomp = new LineComparision();
		Welcome();
		System.out.println(" ");
		linecomp.lineLength();
		System.out.println(" ");
		linecomp.Comparing();

	}
	//Welcome Function
	public static void Welcome() {
		System.out.println("Welcome to Line Comparison Computation Program");
		System.out.println("==============================================");
		
	}

}
