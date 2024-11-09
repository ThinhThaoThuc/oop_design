package DonDatHang;

import java.util.Arrays;
import java.util.Scanner;

import HoaDon.HoaDon;

public class QLDonDatHang {
    private int soLuongDonHang;
    DonDatHang []dsddh = new DonDatHang[0];
    static Scanner sc = new Scanner(System.in);

    public void themDDH(DonDatHang ddh){
        DonDatHang [] newdsddh = Arrays.copyOf(dsddh,dsddh.length+1);
        newdsddh[dsddh.length]= ddh;
        dsddh = newdsddh;
    }

    public void xuatDDH(){
        for(DonDatHang i: dsddh){
            i.xuat();
        }
    }
    //xoa theo ma ddh
    public void xoaDonDatHang(String maDonDatHang) {
        boolean found = false;
        for (int i = 0; i < soLuongDonHang; i++) {
            if (dsddh[i].getMaDonDatHang().equals(maDonDatHang)) {
                for (int j = i; j < soLuongDonHang - 1; j++) {
                    dsddh[j] = dsddh[j + 1];
                }
                dsddh[soLuongDonHang - 1] = null;
                soLuongDonHang--;
                found = true;
                System.out.println("Đã xóa đơn đặt hàng có mã: " + maDonDatHang);
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy đơn đặt hàng có mã: " + maDonDatHang);
        }
    }
    public void timKiemDonDatHangTongTien(double tongTien) {
        boolean found = false;
        for (int i = 0; i < soLuongDonHang; i++) {
            if (dsddh[i].getTongTien() == tongTien) { // Giả sử có phương thức getGia()
                System.out.println(dsddh[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không có đơn đặt hàng nào với giá: " + tongTien);
        }
    }

    // 5. Sắp xếp đơn đặt hàng (theo giá tăng dần)
    public void sapXepDonDatHangTheoGia() {
        for (int i = 0; i < soLuongDonHang - 1; i++) {
            for (int j = i + 1; j < soLuongDonHang; j++) {
                if (dsddh[i].getTongTien() > dsddh[j].getTongTien()) { // Giả sử có phương thức getGia()
                    DonDatHang temp = dsddh[i];
                    dsddh[i] = dsddh[j];
                    dsddh[j] = temp;
                }
            }
        }
        System.out.println("Danh sách đơn đặt hàng đã được sắp xếp theo giá.");
    }

    // 6. Lấy số lượng đơn đặt hàng
    public void laySoLuongDonDatHang() {
        int count = 0;
        for (DonDatHang hd  : dsddh) {
            if (hd != null) count++;
        }
        System.out.println("Số lượng hóa đơn hiện tại: " + count);
    }
    public void menu() {
        int choice;
        do {
            System.out.println("===== QUẢN LÝ ĐƠN ĐẶT HÀNG =====");
            System.out.println("1. Thêm đơn đặt hàng");
            System.out.println("2. Xuất danh sách đơn đặt hàng");
            System.out.println("3. Xóa đơn đặt hàng");
            System.out.println("4. Tìm kiếm đơn đặt hàng theo giá");
            System.out.println("5. Sắp xếp đơn đặt hàng");
            System.out.println("6. Lấy số lượng đơn đặt hàng");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = sc.nextInt();
            sc.nextLine(); // Đọc dòng mới sau khi nhập số

            switch (choice) {
                case 1:
                    DonDatHang a= new DonDatHang();
                    a.nhap();
                    themDDH(a);
                    break;
                case 2:
                    System.out.println("Don dat hang: ");
                    xuatDDH();
                    break;
                case 3:
                    System.out.print("Nhập mã đơn đặt hàng cần xóa: ");
                    String maXoa = sc.nextLine();
                    xoaDonDatHang(maXoa);
                    break;
                case 4:
                    System.out.print("Nhập tong tien cần tìm: ");
                    double giaTimKiem = sc.nextDouble();
                    timKiemDonDatHangTongTien(giaTimKiem);
                    break;
                case 5:
                    sapXepDonDatHangTheoGia();
                    break;
                case 6:
                laySoLuongDonDatHang();
                break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        } while (choice != 0);
    }
    }



