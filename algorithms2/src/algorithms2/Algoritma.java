package algorithms2;

import com.sun.media.jfxmedia.control.VideoDataBuffer;

public class Algoritma {
    public void obeb(int birinciSayi,int ikinciSayi) {
    	int kucukSayi=Math.min(birinciSayi, ikinciSayi);
    	int ebob=0;
    	for (int i = kucukSayi; i>0; i--) {
			if (birinciSayi%i==0 &&ikinciSayi%i==0) {
				ebob=i;
				break;
			}
		}
    	System.out.println("EBOB:"+ebob);
    }
    public void saslCarpan(int sayi) {
    	int bolen=2;
    	int bolunen=sayi;
    	System.out.println("asal çarpanlar:");
    	while(bolen<sayi) {
    		if (bolunen%bolen==0) {
				System.out.println(bolen+" ");
				bolunen/=bolen;
			}else {
				bolen++;
			}
    	}
    	System.out.print(sayi == bolunen ? "Asal sayı Girdiniz":"");
    	}
    public void dortunKatiKadarPiramit(int sayi) {
    	for (int i = 0; i <sayi-1; i++) {
			int pow=1;
			//her seferinde 2n-1 defa donecek
			for (int j = 1; j <=sayi*2-1; j++) {
                if (j>=sayi-i && j<=sayi+i) {
					System.out.println(pow);
					if (j<=sayi-1) 
						pow*=4;
					else 
						pow/=4;
                }else {
						System.out.println(" ");
					}
				}
			System.out.println();
			}
    	}
    public void tasKagitMakas(int kullanicidanAlınanSayi) {
    	//0-tas//1-kağıt//2-makas
    	//3 yapan kazanır
    	int bilgisayarKAzandi=0;
    	int kullaniciKAzandi=0;
    	while(bilgisayarKAzandi<3 &&kullaniciKAzandi<3) {
    		System.out.println("taş,kağıt,makas?");
    		int bilgisayar=(int)(Math.random()*3);
    		//bilgisayarın değeri yazdırılıyor
    		switch (bilgisayar) {
			case 0:
				System.out.println("Taş:");
				break;
			case 1:
				System.out.println("kağıt:");
				break;case 2:
					System.out.println("makas:");
					break;
    		}
    		System.out.println("kullanıcı:");
    		switch (kullanicidanAlınanSayi) {
			case 0:
				System.out.println("taş");
				break;
			case 1:
				System.out.println("kağıt");
				break; 
				case 2:
					System.out.println("makas");
					break;
			}
    		if (kullanicidanAlınanSayi==bilgisayar) {
				System.out.println("berabere");
			}else {
				if ((kullanicidanAlınanSayi==0 && bilgisayar==2) ||(kullanicidanAlınanSayi==1 && bilgisayar==0) ||(kullanicidanAlınanSayi==2 &&bilgisayar==1)) {
					System.out.println("bu eli bilgisayarkazandı");
					kullanicidanAlınanSayi++;
				}else {
					System.out.println("bu eli bilgisayarkazandı");
					bilgisayar++;
				}
				
			}
    		System.out.println("kullanıcı:"+kullaniciKAzandi+"-"+"bilgisayar"+bilgisayarKAzandi);
    	}
					System.out.println(kullaniciKAzandi==3 ?  "kullanıcı kazandı":"bilgisayar kazandı");
    	}
    }
