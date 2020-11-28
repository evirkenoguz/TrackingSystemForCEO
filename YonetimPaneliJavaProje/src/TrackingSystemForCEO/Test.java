package TrackingSystemForCEO;
/**
 * @author OguzEvirgen
 * @since 27-11-2020
 *
 * */
public class Test {
    public static void main(String[] args) {
        //Yönetim paneli oluşturdum buradan parayı, franchiseları ve çalışan sayısını buna bağlı olarak
        // 1 ayda ödenecek maaş tutarlarını kontrol edeceğim

        ManagementPanel managementPanel = new ManagementPanel();

        Franchieses bodrumFranchise = new Franchieses("Bodrum", "Oğuz Evirken",0);
        managementPanel.franchiseAdd(bodrumFranchise);

        Franchieses istanbulFranchise = new Franchieses("Istanbul", "Ömer Faruk", 0);
        managementPanel.franchiseAdd(istanbulFranchise);

        Franchieses ankaraFranchise = new Franchieses("Ankara", "Serdar Demiral", 0);
        managementPanel.franchiseAdd(ankaraFranchise);



        //kaç tane franchise oldugu arayüzde yazacak
        managementPanel.howManyFranchiseWeHave();

        //Franchiseların özelliklerini yazdırmak için
        managementPanel.print(istanbulFranchise);
        managementPanel.print(bodrumFranchise);
        managementPanel.print(ankaraFranchise);

        istanbulFranchise.setFranchiseOwner("Fırat Arslan");
        managementPanel.print(istanbulFranchise);

        managementPanel.closedFranchise(ankaraFranchise);
        managementPanel.howManyFranchiseWeHave();






    }
}