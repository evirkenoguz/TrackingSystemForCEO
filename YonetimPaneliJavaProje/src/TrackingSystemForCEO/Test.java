package TrackingSystemForCEO;

/**
 * @author OguzEvirgen
 * @since 27-11-2020
 */
public class Test {
    public static void main(String[] args) {
        //Yönetim paneli oluşturdum buradan parayı, franchiseları ve çalışan sayısını buna bağlı olarak
        // 1 ayda ödenecek maaş tutarlarını kontrol edeceğim

        ManagementPanel managementPanel = new ManagementPanel();

        Franchieses bodrumFranchise = new Franchieses("Bodrum", "Oğuz Evirken", 0);
        managementPanel.franchiseAdd(bodrumFranchise);//Bu ve alt satırı aslında Franchieses class ında constructor içine yazabilirim.


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

        //franchise ın sahibi değiştirdim
        istanbulFranchise.setFranchiseOwner("Fırat Arslan");
        managementPanel.print(istanbulFranchise);

        //franchise kapanırsa listeden kaldırmak için
        managementPanel.closedFranchise(ankaraFranchise);

        //Bu markanın kaç tane mağazasını olduggunu göstermek için
        managementPanel.howManyFranchiseWeHave();

        //items nesnesi oluşturduk
        Items kahve = new Food("Kahve", 100, 5.0); //Upcasting

        //items nesnesini mağazanın envanterine nesne ekledim
        bodrumFranchise.addItems(kahve);

        //burada ise magazanın envanterine eklenmiş ürünleri ekrana yazdırdım.
        bodrumFranchise.showInventory(bodrumFranchise);

        //iki tane kahve sattık
        bodrumFranchise.sellITem(kahve, 2);


        //iki kahve sattıktan sonra mağaza bakiyesini gösterdim
        bodrumFranchise.showBalance();

        //mağazadaki para artınca toplam para da artmalı
        managementPanel.showBalance(); //bu kısımda sıkıntı yaşadım ama nedn oldugunu anlayamadım

        Employees employee1 = new Employees("Robert Downey JR"); //Çalışan nesnesi oluşturduk

        //maaşını ekrana denemek için yazdırdım
        System.out.println(employee1.salary);



        bodrumFranchise.recruiting(employee1); //employee1 nesnesini bodrumFranchiseinda işe aldım.

        //toplam ödenecek maaş
        managementPanel.showTotalEmployeesWages();

        //toplam kaç tane elaman var
        managementPanel.howManyEmployeeWeHave();


    }
}