package HoaDon;

import java.time.LocalDate;
import java.util.Scanner;

public class KhuyenMai extends HoaDon {
    private String maKhuyenMai;
    private String tenKhuyenMai;
    private LocalDate ngayBatDau;
    private LocalDate ngayKetThuc;
    private String dieuKienApDung;
    private String sanPhamApDung;
    private double tongKhuyenMai;

    public KhuyenMai(){}

    public KhuyenMai(String maKhuyenMai, String tenKhuyenMai, LocalDate ngayBatDau, LocalDate ngayKetThuc,
            String dieuKienApDung, String sanPhamApDung, double tongKhuyenMai) {
        this.maKhuyenMai = maKhuyenMai;
        this.tenKhuyenMai = tenKhuyenMai;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.dieuKienApDung = dieuKienApDung;
        this.sanPhamApDung = sanPhamApDung;
        this.tongKhuyenMai = tongKhuyenMai;
    };
    @Override
    public void nhap() {
        // TODO Auto-generated method stub
        super.nhap();
        System.out.print("Nhập mã khuyến mãi: ");
        maKhuyenMai = scanner.nextLine();

        System.out.print("Nhập tên khuyến mãi: ");
        tenKhuyenMai = scanner.nextLine();

        System.out.print("Nhập ngày bắt đầu ");
        ngayBatDau = LocalDate.parse(scanner.nextLine()); // Chuyển đổi chuỗi nhập vào thành LocalDate

        System.out.print("Nhập ngày kết thúc ");
        ngayKetThuc = LocalDate.parse(scanner.nextLine()); // Chuyển đổi chuỗi nhập vào thành LocalDate

        System.out.print("Nhập điều kiện áp dụng: ");
        dieuKienApDung = scanner.nextLine();

        System.out.print("Nhập sản phẩm áp dụng: ");
        sanPhamApDung = scanner.nextLine();

        System.out.print("Nhập tổng khuyến mãi: ");
        tongKhuyenMai = scanner.nextDouble();
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString()+
                "KhuyenMai{" +
                "maKhuyenMai='" + maKhuyenMai + '\'' +
                ", tenKhuyenMai='" + tenKhuyenMai + '\'' +
                ", ngayBatDau=" + ngayBatDau +
                ", ngayKetThuc=" + ngayKetThuc +
                ", dieuKienApDung='" + dieuKienApDung + '\'' +
                ", sanPhamApDung='" + sanPhamApDung + '\'' +
                ", tongKhuyenMai=" + tongKhuyenMai +
                '}';
    }
    
    
    
}
