package TrackingSystemForCEO;

public class Items {
    private String itemName;
    private int itemNumber;
    private double itemCost;
    private double itemSalePrice;

    public Items(String itemName, int itemNumber,double itemCost){
        this.itemName = itemName;
        this.itemNumber = itemNumber;
        this.itemCost = itemCost;
        itemSalePrice = itemCost + itemCost*0.2; //ürünlerin kar marjı her zaman %20 dir

    }
    public Items(String itemName, double itemCost){
        this.itemName = itemName;
        itemNumber = 1; //ürün nesnesi oluştururken adet girilmezse 1 adet ürün eklenir.
        this.itemCost = itemCost;
        itemSalePrice = itemCost + itemCost * 0.2;
    }
}
