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
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("---------------- Bahan Baku ----------------");
		System.out.println(" ");

	//Bahan baku
		int total = 0;
		System.out.print("Total jenis bahan baku      => ");
		int numofbhn = keyboard.nextInt();

		//Array bahan baku
		int arrofbhn[] = new int[numofbhn];

		for (int s = 0; s < arrofbhn.length; s++){
			System.out.print("Biaya bahan baku        " + (s+1) + " = Rp ");
			arrofbhn[s] = keyboard.nextInt();
		}

		//Total bahan baku
			System.out.println(" ");
			System.out.println("---------------------------------");
		for (int i = 0; i < arrofbhn.length; i++)
			total += (int)arrofbhn[i];
			System.out.println("Total biaya bahan baku          = Rp " + total);


	//Tenaga kerja
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("---------------- Tenaga Kerja ----------------");
		System.out.println(" ");
		int tenagakerja, waktu;
		double harga;

		System.out.print("Jumlah tenaga kerja		= ");
		tenagakerja = keyboard.nextInt();

		System.out.print("Gaji per orang			= Rp ");
		harga = keyboard.nextDouble();

		System.out.print("Waktu kerja (hari)		= ");
		waktu= keyboard.nextInt();
		
		//Total tenaga kerja
		double tktotal = tenagakerja * waktu * harga;
		System.out.println(" ");
		DecimalFormat tktotalformat = new DecimalFormat("#.##");
		System.out.println("---------------------------------");
		System.out.println("Biaya Tenaga kerja		= Rp " + tktotalformat.format(tktotal));
		System.out.println(" ");
		System.out.println(" ");


	//Overhead
		int overhead, head;
		System.out.println("------------------ Overhead ------------------");
		System.out.println(" "); 
		System.out.print("Biaya Overhead 			= Rp ");
		overhead = keyboard.nextInt();
		System.out.println(" ");
		System.out.println(" ");


	//Menghitung per unit
		Double unit, tunit;
		System.out.println("---------- Menghitung biaya per unit ----------");
		System.out.println(" ");

		Double alltotal = total + tktotal + overhead;
		DecimalFormat alltotalformat = new DecimalFormat("#.##");
		System.out.println("Total Harga Pokok Produksi 	= Rp " + alltotalformat.format(alltotal));
		System.out.print("Masukan jumlah unit	        = Rp ");
		unit = keyboard.nextDouble();

		//Total per unit
		System.out.println(" ");
		System.out.println("---------------------------------");
		tunit = alltotal / unit;
		DecimalFormat tunitformat = new DecimalFormat("#.##");
		System.out.println("Harga per unit			= Rp " + tunitformat.format(tunit));
		System.out.println("");
		System.out.println("");

	//Keuntungan laba per unit
		System.out.println("----------- Keuntungan Laba per unit ----------");
		System.out.println(" ");
		Double persen, hunit, lunit;

		System.out.println("Harga per unit			= Rp " + tunitformat.format(tunit));
		System.out.print("Laba persen per unit 		= ");
		persen = keyboard.nextDouble();

		System.out.println(" ");
		System.out.println("---------------------------------");
		hunit = tunit + (tunit*persen/100);
		DecimalFormat hunitformat = new DecimalFormat("#.##");
		System.out.println("Harga jual produk 		= Rp " + hunitformat.format(hunit));

		lunit = tunit - (tunit*persen/100);
		DecimalFormat lunitformat = new DecimalFormat("#.##");
		System.out.println("Laba per unit 			= Rp " + lunitformat.format(lunit));
		System.out.println(" ");
		System.out.println(" ");

	//Keuntungan laba unit
		System.out.println("------------ Keuntungan Total Laba ------------");
		System.out.println(" ");

		Double ttunit, talltotal, tlunit, ttlunit;
		System.out.println("Total Unit 			= Rp " + unit);

		talltotal = alltotal;
		DecimalFormat talltotalformat = new DecimalFormat("#.##");
		System.out.println("Total Harga Pokok Produksi 	= Rp " + talltotalformat.format(talltotal));

		ttunit = tunit;
		DecimalFormat ttunitformat = new DecimalFormat("#.##");
		System.out.println("Harga per unit			= Rp " + ttunitformat.format(ttunit));

		tlunit = lunit;
		DecimalFormat tlunitformat = new DecimalFormat("#.##");
		System.out.println("Laba per unit 			= Rp " + tlunitformat.format(tlunit));
		System.out.println(" ");

		System.out.println("---------------------------------");

		ttlunit = tunit * ttunit;
		System.out.println("Total Laba Unit 		= Rp " + ttlunit);
	}
}
