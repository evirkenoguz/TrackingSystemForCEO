package TrackingSystemForCEO;

import java.util.ArrayList;

//bu class ı oluşturma nedenim buradan franchieslerin kendi bakiyelerine , ürünlerine ve çalışanların sayı ve isimlerine erişebilecek
public class Franchieses extends ManagementPanel {
    private String franchiseOwner;
    private String franchiseRegion;
    private double franchiseBalance;
    private int franchiseEmployeeCounter;

    ArrayList<Items> itemsList = new ArrayList(); //bu magaza olan ürünler bu listeye

    public Franchieses(String franchiseRegion, String franchiseOwner, double franchiseBalance) {
        System.out.println("We have new Franchise in " + franchiseRegion + " Congratulations..");
        this.franchiseOwner = franchiseOwner;
        this.franchiseRegion = franchiseRegion;
        this.franchiseBalance = franchiseBalance;

    }


    public String getFranchiseOwner() {
        return franchiseOwner;
    }

    public String getFranchiseRegion() {
        return franchiseRegion;
    }

    public double getFranchiseBalance() {
        return franchiseBalance;
    }

    //Mağazayı birisi satın alırsa sahibinin değişmesi ve bakiyenin 0 olması için
    public void setFranchiseOwner(String newFranchiseOwner) {
        franchiseOwner = newFranchiseOwner;
        franchiseBalance = 0; //Yeni birisi satın alırsa 0'dan başlar aslında burda kazancın bir kısmını totalBalance a aktarmalı ama onu düşünürüz.
    }

    //override metod bu : mağazanın bakiyesinin gösterilmesi için
    public void showBalance() {
        System.out.println("This Store Balance : " + franchiseBalance + " TL");
    }

    //burada ise envanter listesine Items nesnesi eklemek için
    void addItems(Items a) {
        itemsList.add(a); //Ürün Listesine Items nesnesini ekledim
    }

    //bu method ile itemList teki ürünlerin ismini stogunu ve fiyatını yazdım
    public void showInventory(Franchieses bodrumFranchise) {
        System.out.println("This Franchise Products :");
        for (int i = 0; i < itemsList.size(); i++) {
            System.out.println("Item Name : " + bodrumFranchise.itemsList.get(i).itemName +
                    " Item Stock : " + bodrumFranchise.itemsList.get(i).itemNumber +
                    " Item Price : " + bodrumFranchise.itemsList.get(i).itemSalePrice);
        }
    }

    //bu methodda satılan ürün için yapılması gerekenleri yaptım
    public void sellITem(Items item, int piece) {
        double fee = (item.itemSalePrice * piece);

        setTotalBalance(fee); //burada Toplambakiyeyi değiştirdim.(Ana Panelde Gözükecek Toplam para) //kalıtım yapmamın nedeni üst sınıftan bunu kullanmak için

        franchiseBalance += (item.itemSalePrice * piece); //burada ise franchise bakiyesini arttırdım

        item.itemNumber -= piece; //burada stogu düşürdüm
        System.out.println(item.getItemName() + " Sold +" + (item.itemSalePrice * piece) + " TL"); //Deneme
    }

    //işe eleman almak için bu methodu kullanacağız ama alacağımız eleman bir nesne olacak;
    //bundan dolayı bu methoda Employees türünden bir nesne göndermeyi mantıklı buldum
    //çünkü çalışan nesnesi olmadan bunu işe almamalıyız.
    //yani öncelikle elemanı oluşturup elemanı daha sonra işe alacağız.
    public void recruiting(Employees employee){
        franchiseEmployeeCounter++; //franchise eleman sayısını arttırdım.
        setEmployeeCount(); //burada işe giren elemanın ana panelde sayımı arttırması için koydum
        setTotalEmployeesWage(employee); //toplam verilecek maaşı set ettim.
    }




}
