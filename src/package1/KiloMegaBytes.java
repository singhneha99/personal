package package1;

public class KiloMegaBytes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printMegaBytesAndKiloBytes(2500);
	}
	public static void printMegaBytesAndKiloBytes(int kiloBytes)
	 {
	     if(kiloBytes<0)
	     {
	         System.out.println("Inavlid Value");
	     }
	     else
	     {
	        int megaBytes=0;
	        megaBytes = kiloBytes / 1024;
	        int remainingKiloBytes = kiloBytes % 1024;
	        System.out.println(kiloBytes + " KB = "+ megaBytes+ " MB and "+remainingKiloBytes+" KB");
	     }
	 }

}
