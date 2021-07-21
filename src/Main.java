import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Sanpham> sanphamList = new ArrayList<>();
        sanphamList.add(new Sanpham(1, "Mai Đức Trung", "suzuki",100));
        sanphamList.add(new Sanpham(2, "Nguyễn Văn  Thản", "mazaha",200));
        sanphamList.add(new Sanpham(3, "Vũ Văn Bình", "Đà Nẵng",1000));
        sanphamList.add(new Sanpham(4, "Trần Ngọc Đại", "Hà Nội",400));
        sanphamList.add(new Sanpham(5, "HEHE", "Hà Nội",700));
        writeToFile("Sanpham.txt", sanphamList);
        List<Sanpham> ProductDataFromFile = readDataFromFile("student.txt");
        for (Sanpham sanpham : ProductDataFromFile){
            System.out.println(sanpham);
        }
    }

    public static void writeToFile(String path, List<Sanpham> sampham) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(sampham);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Sanpham> readDataFromFile(String path){
        List<Sanpham> students = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            students = (List<Sanpham>) ois.readObject();
            fis.close();
            ois.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return students;
    }
}
