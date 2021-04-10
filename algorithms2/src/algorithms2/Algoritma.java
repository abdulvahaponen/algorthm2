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
    	System.out.print(sayi == bolunen ? "Asal sayý Girdiniz":"");
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
}