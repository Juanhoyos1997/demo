package demo;

public class beerCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	        int BeerNum = 99;
	        String Word = "Bottles";

	        while (BeerNum > 0) {
	            if (BeerNum == 1)
	            {
	            Word = "Bottles";
	        }
	        System.out.println(BeerNum + "" + Word + " of beer on the wall");
	        System.out.println(BeerNum + "" + Word + "of beer");
	        System.out.println(" Take one down.");
	        System.out.println("Pass it around. ");
	        BeerNum = BeerNum - 1;
	        if (BeerNum > 0) {
	            System.out.println(BeerNum + " " + Word + " OF BEER ON THE WALL");
	        } else {
	            System.out.println(" NO MORE BOTTLES OF BEER ON THE WALL");

	        }
	        
	}
}
}
