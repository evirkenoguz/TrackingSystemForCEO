package TrackingSystemForCEO;
//Management Paneli Arayüz Gibi düşündüm buradan takip etmeyen kişi franchieseların bölgesini ve sahibini görebilecek
//total bakiyeye erişebilecek ve toplam tüm işçi sayısını görebilecek buna göre total bakiyeden aylık eksilecek

import java.util.ArrayList;

public class ManagementPanel {
    ArrayList<Franchieses> franchiseList = new ArrayList();
    private static double totalBalance = 100000;
    private static int employeeCount = 0;//başlangıç olarak 0 aldık
    private static int totalEmployeesWage = 0; //başlangıç olarak 0 aldık çünkü bu miktarı arttıracağız

    //oluşturulan franchieses nesnesini listeye eklemek için
    void franchiseAdd(Franchieses newFranchise) {
        franchiseList.add(newFranchise);
        //System.out.println(franchiseList.size());  //Deneme

    }

    //franchise bilgilerini ekrana yazdırmak için
    public double getTotalBalance() {
        return totalBalance; //total balance ı her ürün satıldıgında arttırmak için
    }

    public void setTotalBalance(double fee) {
        totalBalance += fee; //total paraya satılan ürünü eklemek için
    }
    //bu method toplam eleman sayısını eleman nesnesi işe alınınca arttıracak;
    public void setEmployeeCount(){
        employeeCount++;
    }
    public void setTotalEmployeesWage(Employees employee){
        totalEmployeesWage += employee.salary;
    }

    //bu methodda mağaza bilgilerini ekrana yazdırdım
    void print(Franchieses a) {
        System.out.println("Owner : " + a.getFranchiseOwner() +
                " Region : " + a.getFranchiseRegion() +
                "Franchise Balance : " + a.getFranchiseBalance()
        );
    }

    //kaç adet franchise a sahip oldugunu bilmek için
    void howManyFranchiseWeHave() {
        System.out.println("We Have " + franchiseList.size() + " Franchise.");
    }

    //Franchise kapanırsa listeden silmek için
    void closedFranchise(Franchieses a) {
        franchiseList.remove(a);
    }

    //total bakiyeyi göstermek için method override olan method bu
    public void showBalance() {
        System.out.println("Total Balance : " + totalBalance + " TL");
    }

    //total çalışan sayısını görmek için Employees sınıfında override olan method
    public void howManyEmployeeWeHave() {
        System.out.println("We Have " + employeeCount + " Employees");
    }

    public void showTotalEmployeesWages(){
        System.out.println("Total Salary to be Given to Employees this Month : " + totalEmployeesWage + " TL");
    }

}
