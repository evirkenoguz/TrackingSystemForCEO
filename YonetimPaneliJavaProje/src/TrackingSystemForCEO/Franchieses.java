package TrackingSystemForCEO;

//bu class ı oluşturma nedenim buradan franchieslerin kendi bakiyelerine , ürünlerine ve çalışanların sayı ve isimlerine erişebilecek
public class Franchieses extends ManagementPanel{
    private String franchiseOwner;
    private String franchiseRegion;
    private double franchiseBalance;


    public Franchieses(String franchiseRegion, String franchiseOwner, double franchiseBalance){
        System.out.println("We have new Franchise in " + franchiseRegion + " Congratulations..");
        this.franchiseOwner = franchiseOwner;
        this.franchiseRegion = franchiseRegion;
        this.franchiseBalance = franchiseBalance;
    }
    public String getFranchiseOwner(){
        return franchiseOwner;
    }
    public String getFranchiseRegion(){
        return franchiseRegion;
    }
    public double getFranchiseBalance(){
        return franchiseBalance;
    }
    public void setFranchiseOwner(String newFranchiseOwner){
        franchiseOwner = newFranchiseOwner;
        franchiseBalance = 0; //Yeni birisi satın alırsa 0'dan başlar aslında burda kazancın bir kısmını totalBalance a aktarmalı ama onu düşünürüz.
    }
}
