package TrackingSystemForCEO;

//eleman sayısını 1 arttırıcam management panelde yazan elemansayısını (static olacak)
//Bu class ı ilk teslimden sonra ilerleteceğim
//Franchiese ın altında String Dizisi oluşturulabilir en son arayüzde toplam yazacak ve toplam bakiyeden maaş olarak verilecek miktarı ona göre hesaplatacagım.
//alt sınıfları olarak yönetim , normal çalışan şeklinde onların maaşları farklı olacak
//kalıtım kısmını tam oturtamadıgım için böyle yapmaya karar verdim.
//Franchiese paneline bu sınıfın nesnelerini alan methodlar eklenecek elemanAl elemanÇıkar Bunlardan sonra ManagementPanel e MaaşlarıÖde methodu ekleyeceğim
//bu sınıfta çalışan nesnesini isim ile oluşturmak için kurdum
//hocam maaşları hangi sınıftan ürettiğime göre değiştirmeyi planladım fakat onu nasıl yapıcağımı bulamadıgım için burada bıraktım
public class Employees extends ManagementPanel {
    private String employeeName;
    double salary = 2000; //normal işçinin maaşı

    public Employees(String employName) {
        this.employeeName = employeeName;
    }


}

class Management extends Employees {


    public Management(String employeeName) {
        super(employeeName);

    }
}

class StandartEmployee extends Employees {


    public StandartEmployee(String employeeName) {
        super(employeeName);
    }



}
