public class Sanpham {
    private int Id;
    private String Name;
    private String Hangsanxuat;
    private int Gia;

    public Sanpham(int id, String name, String hangsanxuat, int gia) {
        Id = id;
        Name = name;
        Hangsanxuat = hangsanxuat;
        Gia = gia;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getHangsanxuat() {
        return Hangsanxuat;
    }

    public void setHangsanxuat(String hangsanxuat) {
        Hangsanxuat = hangsanxuat;
    }

    public int getGia() {
        return Gia;
    }

    public void setGia(int gia) {
        Gia = gia;
    }

    @Override
    public String toString() {
        return "Sanpham{" +
                "Id='" + Id + '\'' +
                ", Name='" + Name + '\'' +
                ", Hangsanxuat='" + Hangsanxuat + '\'' +
                ", Gia=" + Gia +
                '}';
    }
}
