import java.util.Scanner;
import java.text.DecimalFormat;

public class hpp{
	public static void main(String[] args){

		Scanner keyboard = new Scanner (System.in);


	//Title
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("//Copryright Tegar Mandiri 2019");
		System.out.println(" ");
		System.out.println("********** Menghitung biaya HPP dan harga jual per Unit **********");
		System.out.println(" ");
		System.out.println("---------------- Bahan Baku ----------------");
		System.out.println(" ");

	//Total bahan mentah
		int total = 0;
		System.out.print("Total jenis bahan baku 		  => ");
		int numofbhn = keyboard.nextInt();
 
		//Array bahan baku
		int arrofbhn[] = new int[numofbhn];

		for (int s = 0; s < arrofbhn.length; s++){
			System.out.print("Biaya bahan baku	      " + (s+1) + " = ");
			arrofbhn[s] = keyboard.nextInt();
		}

			System.out.println("---------------------------------");
		for (int i = 0; i < arrofbhn.length; i++)
			total += (int)arrofbhn[i];
			System.out.println("Total biaya bahan baku 	        = " + total);


	//Tenaga kerja
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("---------------- Tenaga Kerja ----------------");
		System.out.println(" ");
		int tenagakerja, waktu;
		double harga;

		System.out.print("Jumlah tenaga kerja		= ");
		tenagakerja = keyboard.nextInt();
		System.out.println(" ");

		System.out.print("Gaji 1 hari per orang		= ");
		harga = keyboard.nextDouble();
		System.out.println(" ");

		System.out.print("Waktu kerja (hari)		= ");
		waktu= keyboard.nextInt();
		
		double tktotal = tenagakerja * waktu * harga;
		DecimalFormat tktotalformat = new DecimalFormat("#.##");
		System.out.println("---------------------------------");
		System.out.println("Biaya Tenaga kerja		= " + tktotalformat.format(tktotal));
		System.out.println(" ");
		System.out.println(" ");


	//Overhead
		int overhead, head;
		System.out.println("------------------ Overhead ------------------");
		System.out.println(" "); 
		System.out.print("Biaya Overhead 			= ");
		overhead = keyboard.nextInt();
		System.out.println(" ");
		System.out.println(" ");


	//Menghitung perunit
		Double unit, tunit;
		System.out.println("---------- Menghitung biaya per unit ----------");
		System.out.println(" ");

		Double alltotal = total + tktotal + overhead;
		DecimalFormat alltotalformat = new DecimalFormat("#.##");
		System.out.println("Total Harga Pokok Produksi 	= " + alltotalformat.format(alltotal));
		System.out.println("");
		System.out.print("Masukan jumlah unit	        = ");
		unit = keyboard.nextDouble();

		System.out.println("---------------------------------");
		tunit = alltotal / unit;
		DecimalFormat tunitformat = new DecimalFormat("#.##");
		System.out.println("Harga per unit			= " + tunitformat.format(tunit));
	}
}
