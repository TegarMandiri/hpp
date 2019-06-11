//Finished, will added more features++
//Ver. 2.00
//Credit Tegar Mandiri 2019
//Contact email: tegarmndr@gmail.com

import java.util.Scanner;
import java.text.DecimalFormat;

public class hpp{
	public static void main(String[] args){
		Scanner scan = new Scanner (System.in);

	//Variable

		String warning = "Masukan angka yang benar! \n";
		String warningNumber = "Masukan angka positif! \n";
		boolean benar = true;

	//Title

		System.out.println(" ");
		System.out.println(" ");
		System.out.println("//Copyright Tegar Mandiri 2019");
		System.out.println("-Ver. 2.00");
		System.out.println(" ");
		System.out.println("********** Menghitung biaya HPP, harga jual per Unit dan Laba **********");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("---------------- Bahan Baku ----------------");
		System.out.println(" ");

	//Bahan baku

		int totalBahanBaku = 0;
		int jumlahBahanBaku = 0;

		while (benar) {

			System.out.print("Total jenis bahan baku      => ");

				try {

					jumlahBahanBaku = scan.nextInt();
					
					if (jumlahBahanBaku >= 0) {

						benar = false;
					
					} else {
					
						System.out.println(warningNumber);
					
					}

				} catch (Exception e) {

					System.out.println(warning);
					scan.nextLine();
					benar = true;

				}
			}
		benar = true;

		//Array bahan baku

			int arrBahanBaku[] = new int[jumlahBahanBaku];

			for (int s = 0; s < arrBahanBaku.length; s++){

				System.out.print("Biaya bahan baku        " + (s+1) + " = Rp ");

					try {

						arrBahanBaku[s] = scan.nextInt();

						if (arrBahanBaku[s] >= 0) {

							benar = false;
					
						} else {
					
							System.out.println(warningNumber);
					
						}

					} catch (Exception e) {

						System.out.println(warning);
						s--;
						scan.nextLine();

					}
				}
				benar = true;

		//Total bahan baku

			System.out.println(" ");
			System.out.println("---------------------------------");

			for (int i = 0; i < arrBahanBaku.length; i++)
				totalBahanBaku += (int)arrBahanBaku[i];
				DecimalFormat totalBahanBakuformat = new DecimalFormat("#,###");
				System.out.println("Total biaya bahan baku          = Rp " + totalBahanBakuformat.format(totalBahanBaku));


	//Tenaga kerja

		System.out.println(" ");
		System.out.println(" ");
		System.out.println("---------------- Tenaga Kerja ----------------");
		System.out.println(" ");
		Integer tenagaKerja = null, waktuKerja = null;
		Double hargaKerja = null;

		while (benar) {

			System.out.print("Jumlah tenaga kerja		= ");

			try {

				tenagaKerja = scan.nextInt();

				if (tenagaKerja >= 0) {

					benar = false;
					
				} else {
					
					System.out.println(warningNumber);
					
				}

			} catch (Exception e) {

					System.out.println(warning);
					scan.nextLine();
					benar = true;

				}
			} 
		benar = true;

		while (benar) {

			System.out.print("Gaji per orang			= Rp ");

			try {

				hargaKerja = scan.nextDouble();

				if (hargaKerja >= 0) {

					benar = false;
					
				} else {
					
					System.out.println(warningNumber);
					
				}

			} catch (Exception e) {

					System.out.println(warning);
					scan.nextLine();
					benar = true;

				}
			}
		benar = true;

		while (benar) {

			System.out.print("waktu kerja (hari)		= ");

			try {

				waktuKerja = scan.nextInt();
				
				if (waktuKerja >= 0) {

					benar = false;
					
				} else {
					
					System.out.println(warningNumber);
					
				}

			} catch (Exception e) {

					System.out.println(warning);
					scan.nextLine();
					benar = true;

				}
			}
		benar = true;

		//Total tenaga kerja

			Double totalTenagaKerja = tenagaKerja * waktuKerja * hargaKerja;
			System.out.println(" ");
			DecimalFormat totalTenagaKerjaformat = new DecimalFormat("#,###");
			System.out.println("---------------------------------");
			System.out.println("Biaya Tenaga kerja		= Rp " + totalTenagaKerjaformat.format(totalTenagaKerja));
			System.out.println(" ");
			System.out.println(" ");


	//Overhead

		int biayaOverhead = 0;
		System.out.println("------------------ Overhead ------------------");
		System.out.println(" ");

		while (benar) {

			System.out.print("Biaya Overhead 			= Rp ");

			try {

				biayaOverhead = scan.nextInt();
				System.out.println(" ");
				System.out.println(" ");
				
				if (biayaOverhead >= 0) {

					benar = false;
					
				} else {
					
					System.out.println(warningNumber);
					
				}
			
			} catch (Exception e) {
			
				System.out.println(warning);
				scan.nextLine();
				benar = true;
			
			}
		}
		benar = true;

	//Menghitung per unit

		Double perUnit = 0.0, totalUnit;
		System.out.println("---------- Menghitung biaya per unit ----------");
		System.out.println(" ");

		Double totalSemua = totalBahanBaku + totalTenagaKerja + biayaOverhead;
		DecimalFormat totalSemuaformat = new DecimalFormat("#,###");
		System.out.println("Total Harga Pokok Produksi 	= Rp " + totalSemuaformat.format(totalSemua));

		while (benar) {
		
			System.out.print("Masukan jumlah unit	        = ");
		
			try {

				perUnit = scan.nextDouble();
				
				if (perUnit >= 0) {

					benar = false;
					
				} else {
					
					System.out.println(warningNumber);
					
				}

			} catch (Exception e) {

				System.out.println(warning);
				scan.nextLine();
				benar = true;

			}
		}
		benar = true;

		//Total per unit

			System.out.println(" ");
			System.out.println("---------------------------------");

			totalUnit = totalSemua / perUnit;
			DecimalFormat totalUnitformat = new DecimalFormat("#,###");
			System.out.println("Harga per unit			= Rp " + totalUnitformat.format(totalUnit));
			System.out.println("");
			System.out.println("");

	//Keuntungan laba per unit

		System.out.println("----------- Keuntungan Laba per unit ----------");
		System.out.println(" ");
		Double labaPersen = 0.0, hargaUnit, labaUnit;

		System.out.println("Harga per unit			= Rp " + totalUnitformat.format(totalUnit));

		while (benar) {
		
			System.out.print("Laba persen per unit 		= (%) ");
		
			try {

				labaPersen = scan.nextDouble();

				if (labaPersen >= 0) {

					benar = false;
					
				} else {
					
					System.out.println(warningNumber);
					
				}

			} catch (Exception e) {

				System.out.println(warning);
				scan.nextLine();
				benar = true;

			}
		}
		benar = true;

		System.out.println(" ");
		System.out.println("---------------------------------");
		hargaUnit = totalUnit + (totalUnit*labaPersen/100);
		DecimalFormat hargaUnitformat = new DecimalFormat("#,###");
		System.out.println("Harga jual produk 		= Rp " + hargaUnitformat.format(hargaUnit));

		labaUnit = labaPersen / 100 * totalUnit;
		DecimalFormat labaUnitformat = new DecimalFormat("#,###");
		System.out.println("Laba per unit 			= Rp " + labaUnitformat.format(labaUnit));
		System.out.println(" ");
		System.out.println(" ");

	//Keuntungan laba unit
		
		System.out.println("------------ Keuntungan Total Laba ------------");
		System.out.println(" ");
		Double totalJumlahUnit, totalLabaUnit, totalYangDidapat;

		totalJumlahUnit = perUnit;
		DecimalFormat totalJumlahUnitformat = new DecimalFormat("#,###");
		System.out.println("Total Unit 			= " + totalJumlahUnitformat.format(totalJumlahUnit));

		System.out.println("Total Harga Pokok Produksi 	= Rp " + totalSemuaformat.format(totalSemua));

		System.out.println("Harga jual produk 		= Rp " + hargaUnitformat.format(hargaUnit));

		System.out.println("Laba per unit 			= Rp " + labaUnitformat.format(labaUnit));
		System.out.println(" ");

		System.out.println("---------------------------------");

		totalYangDidapat = hargaUnit * totalJumlahUnit;
		DecimalFormat totalYangDidapatformat = new DecimalFormat("#,###");
		System.out.println("Total yang didapatkan		= Rp " + totalYangDidapatformat.format(totalYangDidapat));

		totalLabaUnit = perUnit * labaUnit;
		DecimalFormat totalLabaUnitformat = new DecimalFormat("#,###");
		System.out.println("Total Laba 		 	= Rp " + totalLabaUnitformat.format(totalLabaUnit));
	}
}
