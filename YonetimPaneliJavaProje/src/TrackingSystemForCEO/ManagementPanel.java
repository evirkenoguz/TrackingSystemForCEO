package TrackingSystemForCEO;
//Management Paneli Arayüz Gibi düşündüm buradan takip etmeyen kişi franchieseların bölgesini ve sahibini görebilecek
//total bakiyeye erişebilecek ve toplam tüm işçi sayısını görebilecek buna göre total bakiyeden aylık eksilecek

import java.util.ArrayList;

public class ManagementPanel {
    ArrayList<Franchieses> franchiseList = new ArrayList();
    private double totalBalance = 100000;

    //oluşturulan franchieses nesnesini listeye eklemek için
    void franchiseAdd(Franchieses newFranchise){
        franchiseList.add(newFranchise);
        System.out.println(franchiseList.size());

    }
    //franchise bilgilerini ekrana yazdırmak için
    void print(Franchieses a){
        System.out.println("Owner : " + a.getFranchiseOwner() +
                           " Region : " + a.getFranchiseRegion() +
                            "Franchise Balance : " + a.getFranchiseBalance()
        );
    }
    //kaç adet franchise a sahip oldugunu bilmek için
    void howManyFranchiseWeHave(){
        System.out.println("We Have " + franchiseList.size() + " Franchise.");
    }

    //Franchise kapanırsa listeden silmek için
    void closedFranchise(Franchieses a){
        franchiseList.remove(a);
    }


}
