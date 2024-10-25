package com.mycompany.final_project_estelercreamy;
import java.util.Scanner;
/**
 *
 * @author izzaa
 */
public class FINAL_PROJECT_ESTELERCREAMY {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        double total=0, grandtotal=0, bayar=0, kembalian=0, uangbayar;
        double TotalPemasukanOwner=0;
        
        int pilihposisi=0, pilihmenu=0, pilihsubmenu=0, jumlah=0;
        
         double orismall=5000, orimedium=8000, orilarge=10000,kejusmall=10000, kejumedium=13000, kejularge=15000,
                duriansmall=10000, durianmedium=13000, durianlarge=15000, harga=0;
        
        do{
            System.out.println("PROGRAM KASIR ES TELER CREAMY");
            
            System.out.println("1. Kasir\n2. Admin\n3. Owner\n4. Exit");
            System.out.print("Pilih Posisi Anda : ");
            pilihposisi = input.nextInt();
            System.out.println("__________________________________");
            
            switch(pilihposisi){
                case 1://Kasir
                    grandtotal=0;
                    
                    System.out.println("PROGRAM KASIR (POSISI KASIR)");
                    
                    do{
                        System.out.println("DAFTAR MENU");
                        System.out.println("1. Es Teler Original");
                        System.out.println("2. Es Teler Keju");
                        System.out.println("3. Es Teler Durian");
                        System.out.println("4. Selesai");
                        
                        System.out.println("_________________________");
                        
                        System.out.print("Pilih : ");
                        pilihmenu=input.nextInt();
                        switch(pilihmenu){
                            case 1: 
                                do{
                                    System.out.println("Es Teler Original");
                                    System.out.println("[1] Small : [Rp."+ orismall+"]");
                                    System.out.println("[2] Medium : [Rp. "+ orimedium +"]");
                                    System.out.println("[3] Large : [Rp. "+ orilarge +"]");
                                    System.out.println("[4] Selesai\n");
                                    
                                    System.out.print("PILIH SUB MENU : ");
                                    pilihsubmenu = input.nextInt();
                                    
                                    switch(pilihsubmenu){
                                        case 1:
                                            System.out.println("Es Teler Original Small[Rp."+ orismall +"]");
                                            System.out.print("Jumlah : ");
                                            jumlah = input.nextInt();
                                            
                                            total=jumlah*orimedium;
                                            System.out.println("TOTAL : "+total);
                                            
                                            grandtotal=total + grandtotal;
                                            System.out.println("TOTAL FINAL : Rp. "+grandtotal);
                                            System.out.println("_____________________________");
                                            
                                            break;
                                            
                                        case 2:
                                            System.out.println("Es Teler Original Medium[Rp."+ orimedium +"]");
                                            System.out.print("Jumlah : ");
                                            jumlah = input.nextInt();
                                            
                                            total=jumlah*orimedium;
                                            System.out.println("TOTAL : "+total);
                                            
                                            grandtotal=total + grandtotal;
                                            System.out.println("TOTAL FINAL : Rp. "+grandtotal);
                                             System.out.println("_____________________________");
                                            
                                            break;
                                        
                                        case 3:
                                            System.out.println("Es Teler Original Large[Rp."+ orilarge +"]");
                                            System.out.print("Jumlah : ");
                                            jumlah = input.nextInt();
                                            
                                            total=jumlah*orilarge;
                                            System.out.println("TOTAL : "+total);
                                            
                                            grandtotal=total + grandtotal;
                                            System.out.println("TOTAL FINAL : Rp. "+grandtotal);
                                             System.out.println("_____________________________");
                                            
                                            break;
                                        
                                        case 4:
                                            System.out.println("TERIMA KASIH TELAH BERBELANJA");
                                            break;
                                        default:
                                            System.out.println("MAAF, COBA LAGI");                                       
                                    }
                                }while(pilihsubmenu!=4);
                            
                            break;
                            
                            case 2:
                                do{
                                    System.out.println("Es Teler Keju");
                                    System.out.println("[1] Small : [Rp."+ kejusmall+"]");
                                    System.out.println("[2] Medium : [Rp. "+ kejumedium +"]");
                                    System.out.println("[3] Large : [Rp. "+ kejularge +"]");
                                    System.out.println("[4] Selesai\n");
                                    
                                    System.out.print("PILIH SUB MENU : ");
                                    pilihsubmenu = input.nextInt(); 
                                    
                                    switch(pilihsubmenu){
                                        case 1:
                                            System.out.println("Es Teler Keju Small[Rp."+ kejusmall +"]");
                                            System.out.print("Jumlah : ");
                                            jumlah = input.nextInt();
                                            
                                            total=jumlah*kejusmall;
                                            System.out.println("TOTAL : "+total);
                                            
                                            grandtotal=total + grandtotal;
                                            System.out.println("TOTAL FINAL : Rp. "+grandtotal);
                                             System.out.println("_____________________________");
                                            
                                            break;
                                        case 2:
                                            System.out.println("Es Teler Keju Medium[Rp."+ kejumedium +"]");
                                            System.out.print("Jumlah : ");
                                            jumlah = input.nextInt();
                                            
                                            total=jumlah*kejumedium;
                                            System.out.println("TOTAL : "+total);
                                            
                                            grandtotal=total + grandtotal;
                                            System.out.println("TOTAL FINAL : Rp. "+grandtotal);
                                             System.out.println("_____________________________");
                                            
                                            break;
                                        
                                        case 3:
                                            System.out.println("Es Teler Keju Large[Rp."+ kejularge +"]");
                                            System.out.print("Jumlah : ");
                                            jumlah = input.nextInt();
                                            
                                            total=jumlah*kejularge;
                                            System.out.println("TOTAL : "+total);
                                            
                                            grandtotal=total + grandtotal;
                                            System.out.println("TOTAL FINAL : Rp. "+grandtotal);
                                             System.out.println("_____________________________");
                                            
                                            break;
                                        
                                        case 4:
                                            System.out.println("TERIMA KASIH TELAH BERBELANJA");
                                            break;
                                        default:
                                            System.out.println("MAAF, COBA LAGI");                                       
                                    }
                                }while(pilihsubmenu!=4);
                                
                            break;
                                
                            case 3:
                                do{
                                    System.out.println("Es Teler Durian");
                                    System.out.println("[1] Small : [Rp."+ duriansmall+"]");
                                    System.out.println("[2] Medium : [Rp. "+ durianmedium +"]");
                                    System.out.println("[3 Large : [Rp. "+ durianlarge +"]");
                                    System.out.println("[4 Selesai\n");
                                    
                                    System.out.print("PILIH SUB MENU : ");
                                    pilihsubmenu = input.nextInt(); 
                                    
                                    switch(pilihsubmenu){
                                         case 1:
                                            System.out.println("Es Teler durian Small[Rp."+ duriansmall+"]");
                                            System.out.print("Jumlah : ");
                                            jumlah = input.nextInt();
                                            
                                            total=jumlah*duriansmall;
                                            System.out.println("TOTAL : "+total);
                                            
                                            grandtotal=total + grandtotal;
                                            System.out.println("TOTAL FINAL : Rp. "+grandtotal);
                                             System.out.println("_____________________________");
                                            
                                            break;
                                        case 2:
                                            System.out.println("Es Teler durian Medium[Rp."+ durianmedium +"]");
                                            System.out.print("Jumlah : ");
                                            jumlah = input.nextInt();
                                            
                                            total=jumlah*durianmedium;
                                            System.out.println("TOTAL : "+total);
                                            
                                            grandtotal=total + grandtotal;
                                            System.out.println("TOTAL FINAL : Rp. "+grandtotal);
                                             System.out.println("_____________________________");
                                            
                                            break;
                                        
                                        case 3:
                                            System.out.println("Es Teler Durian Large[Rp."+ durianlarge +"]");
                                            System.out.print("Jumlah : ");
                                            jumlah = input.nextInt();
                                            
                                            total=jumlah*durianlarge;
                                            System.out.println("TOTAL : "+total);
                                            
                                            grandtotal=total + grandtotal;
                                            System.out.println("TOTAL FINAL : Rp. "+grandtotal);
                                             System.out.println("_____________________________");
                                            
                                            break;
                                        
                                        case 4:
                                            System.out.println("TERIMA KASIH TELAH BERBELANJA");
                                            break;
                                        default:
                                            System.out.println("MAAF, COBA LAGI");                                       
                                    }
                                }while(pilihsubmenu!=4);
                                
                            break; 
                            
                            case 4:
                                grandtotal=total + grandtotal;
                                System.out.println("TOTAL FINAL : Rp. "+grandtotal);
                                System.out.print("Uang Yang Di Bayar : ");
                                    uangbayar = input.nextDouble();

                                    if (uangbayar == grandtotal) {
                                        System.out.println("Uang Yang Di Bayarkan Pas, Terima Kasih");
                                    } else if (uangbayar > grandtotal){
                                        kembalian = uangbayar - grandtotal;
                                        System.out.println("Uang Kembalian Anda: Rp. " + kembalian+" TERIMA KASIH");
                                    } else {
                                        System.out.println("Mohon maaf, Uang Yang Dibayarkan Kurang");
                                    }

                                    TotalPemasukanOwner += grandtotal;
                                    System.out.println();
                                    
                                break;
                            }
                        
                        }while(pilihmenu!=4);
                    break;
                
                case 2://admin
                    
                    System.out.println(" PROGRAM KASIR( POSISI ADMIN)");
                    
                    do{
                        System.out.println("DAFTAR MENU");
                        System.out.println("1. Es Teler Original");
                        System.out.println("2. Es Teler Keju");
                        System.out.println("3. Es Teler Durian");
                        System.out.println("4. Selesai");
                        
                        System.out.println("_________________________");
                        
                        System.out.print("Pilih : ");
                        pilihmenu=input.nextInt();
                        switch(pilihmenu){
                            case 1:
                                do{
                                    System.out.println("Es Teler Original");
                                    System.out.println("[1] Small : [Rp."+ orismall+"]");
                                    System.out.println("[2] Medium : [Rp. "+ orimedium +"]");
                                    System.out.println("[3] Large : [Rp. "+ orilarge +"]");
                                    System.out.println("[4] Selesai\n");
                                    
                                    System.out.print("Pilih Sub Menu Yang Ingin Dirubah Harga : ");
                                    pilihsubmenu = input.nextInt();  
                                    
                                    switch(pilihsubmenu){
                                        case 1:
                                            System.out.println("Es Teler Original Small [Rp. " + orismall + "]");
                                            System.out.print("Masukkan Harga Baru Es Teler Original Small : ");
                                            orismall = input.nextDouble();
                                            
                                            System.out.println("Berhasil Merubah Harga !");
                                            System.out.println("Harga Baru : Rp. " + orismall);

                                            System.out.println();

                                            break;
                                            
                                        case 2:
                                            System.out.println("Es Teler Original Medium [Rp. " + orimedium + "]");
                                            System.out.print("Masukkan Harga Baru Es Teler Original Medium : ");
                                            orimedium = input.nextDouble();
                                            
                                            System.out.println("Berhasil Merubah Harga !");
                                            System.out.println("Harga Baru : Rp. " + orimedium);

                                            System.out.println();

                                            break;
                                            
                                        case 3:
                                            System.out.println("Es Teler Original Large [Rp. " + orilarge + "]");
                                            System.out.print("Masukkan Harga Baru Es Teler Original Large : ");
                                            orilarge = input.nextDouble();
                                            
                                            System.out.println("Berhasil Merubah Harga !");
                                            System.out.println("Harga Baru : Rp. " + orilarge);

                                            System.out.println();

                                            break;
                                            
                                        case 4:
                                            System.out.println("SELESAI !");
                                            System.out.println();
                                            break;
                                        default:
                                            System.out.println("MOHON MAAF, COBA LAGI");
                                    }
                                }while(pilihsubmenu != 4 );
                                
                            break;
                                    
                            case 2:
                                do{
                                    System.out.println("Es Teler Keju");
                                    System.out.println("[1] Small : [Rp."+ kejusmall+"]");
                                    System.out.println("[2] Medium : [Rp. "+ kejumedium +"]");
                                    System.out.println("[3] Large : [Rp. "+ kejularge +"]");
                                    System.out.println("[4] Selesai\n");
                                    
                                    System.out.print("Pilih Sub Menu Yang Ingin Dirubah Harga : ");
                                    pilihsubmenu = input.nextInt();  
                                    
                                    switch(pilihsubmenu){
                                        case 1:
                                            System.out.println("Es Teler Keju Small [Rp. " + kejusmall + "]");
                                            System.out.print("Masukkan Harga Baru Es Teler Keju Small : ");
                                            kejusmall = input.nextDouble();
                                            
                                            System.out.println("Berhasil Merubah Harga !");
                                            System.out.println("Harga Baru : Rp. " + kejusmall);

                                            System.out.println();

                                            break;
                                            
                                        case 2:
                                            System.out.println("Es Teler Keju Medium [Rp. " + kejumedium + "]");
                                            System.out.print("Masukkan Harga Baru Es Teler Keju Medium : ");
                                            kejumedium = input.nextDouble();
                                            
                                            System.out.println("Berhasil Merubah Harga !");
                                            System.out.println("Harga Baru : Rp. " + kejumedium);

                                            System.out.println();

                                            break;
                                            
                                        case 3:
                                            System.out.println("Es Teler Keju Large [Rp. " + kejularge + "]");
                                            System.out.print("Masukkan Harga Baru Es Teler Keju Large : ");
                                            kejularge = input.nextDouble();
                                            
                                            System.out.println("Berhasil Merubah Harga !");
                                            System.out.println("Harga Baru : Rp. " + kejularge);

                                            System.out.println();

                                            break;
                                            
                                        case 4:
                                            System.out.println("SELESAI !");
                                            System.out.println();
                                            break;
                                        default:
                                            System.out.println("MOHON MAAF, COBA LAGI");
                                    }
                                }while(pilihsubmenu != 4 ); 
                                
                            break;
                            
                            case 3:
                                do{
                                    System.out.println("Es Teler Durian");
                                    System.out.println("[1] Small : [Rp."+ duriansmall+"]");
                                    System.out.println("[2] Medium : [Rp. "+ durianmedium +"]");
                                    System.out.println("[3] Large : [Rp. "+ durianlarge +"]");
                                    System.out.println("[4] Selesai\n");
                                    
                                    System.out.print("Pilih Sub Menu Yang Ingin Dirubah Harga : ");
                                    pilihsubmenu = input.nextInt();  
                                    
                                    switch(pilihsubmenu){
                                        case 1:
                                            System.out.println("Es Teler Durian Small [Rp. " + kejusmall + "]");
                                            System.out.print("Masukkan Harga Baru Es Teler Durian Small : ");
                                            duriansmall = input.nextDouble();
                                            
                                            System.out.println("Berhasil Merubah Harga !");
                                            System.out.println("Harga Baru : Rp. " + duriansmall);

                                            System.out.println();

                                            break;
                                            
                                        case 2:
                                            System.out.println("Es Teler Durian Medium [Rp. " + durianmedium + "]");
                                            System.out.print("Masukkan Harga Baru Es Teler Durian Medium : ");
                                            durianmedium = input.nextDouble();
                                            
                                            System.out.println("Berhasil Merubah Harga !");
                                            System.out.println("Harga Baru : Rp. " + durianmedium);

                                            System.out.println();

                                            break;
                                            
                                        case 3:
                                            System.out.println("Es Teler Durian Large [Rp. " + durianlarge + "]");
                                            System.out.print("Masukkan Harga Baru Es Teler Keju Large : ");
                                            durianlarge = input.nextDouble();
                                            
                                            System.out.println("Berhasil Merubah Harga !");
                                            System.out.println("Harga Baru : Rp. " + durianlarge);

                                            System.out.println();

                                            break;
                                            
                                        case 4:
                                            System.out.println("SELESAI !");
                                            System.out.println();
                                            break;
                                        default:
                                            System.out.println("MOHON MAAF, COBA LAGI");
                                    }
                                }while(pilihsubmenu != 4 );
                            break;
                                    
                            case 4:
                            break;
                            
                            }
                    }while(pilihmenu!=4);
                    break;
                    
                case 3://Owner
                    System.out.println("PROGRAM KASIR (POSISI OWNER)");
                    
                    System.out.println("Total Semua Pemasukan : Rp. " + TotalPemasukanOwner );
                    break;
                    
                case 4:
                    break;
                default:
                    System.out.println("MOHON MAAF, COBA LAGI");
            }
        }while(pilihposisi!=4);
    }
}
