package TrackingSystemForCEO;

import java.util.ArrayList;

// bu sınıfta envanterdeki ürün stogunu görebilmek için oluştum franchiese ın altında olmalı bence
public class Envanter {
    //ürünleri burada oluşturmak için yaptım fakat bu sınıf Franchiesedan kalıtım olarak alınmalı ne kadar
    //franchiese varsa o kadar envanter oluşturulmalı yani her yeni franchiese yeni envanter demek olmalı
    ArrayList<Items> ıtemsList = new ArrayList();

    void addItemsList(Items a){
        ıtemsList.add(a); //Ürün Listesine Items nesnesini ekledim
    }

}
