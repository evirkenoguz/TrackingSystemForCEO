package TrackingSystemForCEO;

public class Items {
    String itemName;
    int itemNumber;
    double itemCost;
    double itemSalePrice;

    public Items(String itemName, int itemNumber, double itemCost) {

        this.itemName = itemName;
        this.itemNumber = itemNumber;
        this.itemCost = itemCost;
        itemSalePrice = itemCost + itemCost * 0.2; //ürünlerin kar marjı her zaman %20 dir

    }

    public Items(String itemName, double itemCost) {

        this.itemName = itemName;
        itemNumber = 1; //ürün nesnesi oluştururken adet girilmezse 1 adet ürün eklenir.
        this.itemCost = itemCost;
        itemSalePrice = itemCost + itemCost * 0.2;
    }

    public String getItemName() {
        return itemName;
    }

    public int getItemNumber() {
        return itemNumber;
    }

    public double getItemSalePrice() {
        return itemSalePrice;
    }
}

class Food extends Items {

    public Food(String itemName, int itemNumber, double itemCost) {
        super(itemName, itemNumber, itemCost);
    }
}

class NonFood extends Items {

    public NonFood(String itemName, int itemNumber, double itemCost) {
        super(itemName, itemNumber, itemCost);
    }
}
