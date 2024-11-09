package HoaDon;
import java.time.LocalDate;
import java.util.Scanner;

public class DoiTra extends HoaDon {
    private String maDoiTra;
    private String tenDoiTra;
    private String dieuKienDoiTra;
    private int thoiGianDoiTra;
    private double phiDoiTra;
    private String hinhThucHoanTien;
    private LocalDate ngayBatDauApDung;
    private LocalDate ngayKetThucApDung;
    public DoiTra() {
    }
    
    public DoiTra(String maDoiTra, String tenDoiTra, String dieuKienDoiTra, int thoiGianDoiTra, double phiDoiTra,
        String hinhThucHoanTien, LocalDate ngayBatDauApDung, LocalDate ngayKetThucApDung) {
        this.maDoiTra = maDoiTra;
        this.tenDoiTra = tenDoiTra;
        this.dieuKienDoiTra = dieuKienDoiTra;
        this.thoiGianDoiTra = thoiGianDoiTra;
        this.phiDoiTra = phiDoiTra;
        this.hinhThucHoanTien = hinhThucHoanTien;
        this.ngayBatDauApDung = ngayBatDauApDung;
        this.ngayKetThucApDung = ngayKetThucApDung;
    }

    public String getMaDoiTra() {
        return maDoiTra;
    }
    public void setMaDoiTra(String maDoiTra) {
        this.maDoiTra = maDoiTra;
    }
    public String getTenDoiTra() {
        return tenDoiTra;
    }
    public void setTenDoiTra(String tenDoiTra) {
        this.tenDoiTra = tenDoiTra;
    }
    public String getDieuKienDoiTra() {
        return dieuKienDoiTra;
    }
    public void setDieuKienDoiTra(String dieuKienDoiTra) {
        this.dieuKienDoiTra = dieuKienDoiTra;
    }
    public int getThoiGianDoiTra() {
        return thoiGianDoiTra;
    }
    public void setThoiGianDoiTra(int thoiGianDoiTra) {
        this.thoiGianDoiTra = thoiGianDoiTra;
    }
    public double getPhiDoiTra() {
        return phiDoiTra;
    }
    public void setPhiDoiTra(double phiDoiTra) {
        this.phiDoiTra = phiDoiTra;
    }
    public String getHinhThucHoanTien() {
        return hinhThucHoanTien;
    }
    public void setHinhThucHoanTien(String hinhThucHoanTien) {
        this.hinhThucHoanTien = hinhThucHoanTien;
    }
    public LocalDate getNgayBatDauApDung() {
        return ngayBatDauApDung;
    }
    public void setNgayBatDauApDung(LocalDate ngayBatDauApDung) {
        this.ngayBatDauApDung = ngayBatDauApDung;
    }
    public LocalDate getNgayKetThucApDung() {
        return ngayKetThucApDung;
    }
    public void setNgayKetThucApDung(LocalDate ngayKetThucApDung) {
        this.ngayKetThucApDung = ngayKetThucApDung;
    }

    @Override
    public void nhap() {
        // TODO Auto-generated method stub
        super.nhap();
        System.out.print("Nhập mã đổi trả: ");
        maDoiTra = scanner.nextLine();

        System.out.print("Nhập tên đổi trả: ");
        tenDoiTra = scanner.nextLine();

        System.out.print("Nhập điều kiện đổi trả: ");
        dieuKienDoiTra = scanner.nextLine();

        System.out.print("Nhập thời gian đổi trả (số ngày): ");
        thoiGianDoiTra = scanner.nextInt();

        System.out.print("Nhập phí đổi trả: ");
        phiDoiTra = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Nhập hình thức hoàn tiền: ");
        hinhThucHoanTien = scanner.nextLine();

        System.out.print("Nhập ngày bắt đầu áp dụng: ");
        ngayBatDauApDung = LocalDate.parse(scanner.nextLine());

        System.out.print("Nhập ngày kết thúc áp dụng: ");
        ngayKetThucApDung = LocalDate.parse(scanner.nextLine());
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString()+"DoiTra{" +
                "maDoiTra='" + maDoiTra + '\'' +
                ", tenDoiTra='" + tenDoiTra + '\'' +
                ", dieuKienDoiTra='" + dieuKienDoiTra + '\'' +
                ", thoiGianDoiTra=" + thoiGianDoiTra +
                ", phiDoiTra=" + phiDoiTra +
                ", hinhThucHoanTien='" + hinhThucHoanTien + '\'' +
                ", ngayBatDauApDung=" + ngayBatDauApDung +
                ", ngayKetThucApDung=" + ngayKetThucApDung +
                '}';
    }

    

}
