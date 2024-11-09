package ChuoiCungCap;

import java.util.Arrays;
import java.util.Scanner;

import DonDatHang.DonDatHang;

public class QLNhaCungCap {
    NhaCungCap [] dsncc = new NhaCungCap[0];
    static Scanner sc = new Scanner(System.in);

    public void themNCC(NhaCungCap a){
        NhaCungCap[] newdsncc = Arrays.copyOf(dsncc, dsncc.length+1);
        newdsncc[dsncc.length]= a;
        dsncc = newdsncc;
    }
    public void xuatNCC(){
        for(NhaCungCap a: dsncc){
            a.xuat();
        }
    } 
    public void xoaNhaCungCap(String maNCC) {
        boolean found = false;
        for (int i = 0; i < dsncc.length; i++) {
            if (dsncc[i].maNhaCungCap.equals(maNCC)) {
                for (int j = i; j < dsncc.length - 1; j++) {
                    dsncc[j] = dsncc[j + 1];
                }
                dsncc[dsncc.length - 1] = null;
                i--;
                found = true;
                System.out.println("Đã xóa nhà cung cấp có mã: " + maNCC);
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy nhà cung cấp có mã: " + maNCC);
        }
    }
    public void timKiemNhaCungCapTheoChiPhi(double chiPhi) {
        boolean found = false;
        for (int i = 0; i < dsncc.length; i++) {
            if (dsncc[i].chiPhiNhapHang == chiPhi) {
                System.out.println(dsncc[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không có nhà cung cấp nào với chi phí nhập hàng: " + chiPhi);
        }
    }
    public void sapXepNhaCungCapTheoChiPhi() {
        for (int i = 0; i < dsncc.length - 1; i++) {
            for (int j = i + 1; j < dsncc.length; j++) {
                if (dsncc[i].chiPhiNhapHang > dsncc[j].chiPhiNhapHang) {
                    NhaCungCap temp = dsncc[i];
                    dsncc[i] = dsncc[j];
                    dsncc[j] = temp;
                }
            }
        }
        System.out.println("Danh sách nhà cung cấp đã được sắp xếp theo chi phí nhập hàng.");
    }
    public void laySoLuongNhaCungCap() {
        int count = 0;
        for (NhaCungCap hd  : dsncc) {
            if (hd != null) count++;
        }
        System.out.println("Số lượng nha cung cap hiện tại: " + count);
    }

    public void menu() {
        int choice;
        do {
            System.out.println("===== QUẢN LÝ NHÀ CUNG CẤP =====");
            System.out.println("1. Thêm nhà cung cấp");
            System.out.println("2. Xuất danh sách nhà cung cấp");
            System.out.println("3. Xóa nhà cung cấp");
            System.out.println("4. Tìm kiếm nhà cung cấp theo chi phí nhập hàng");
            System.out.println("5. Sắp xếp nhà cung cấp theo chi phí nhập hàng");
            System.out.println("6. Lấy số lượng nhà cung cấp");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = sc.nextInt();
            sc.nextLine(); // Đọc dòng mới sau khi nhập số

            switch (choice) {
                case 1:
                    NhaCungCap ncc = new NhaCungCap();
                    ncc.nhap();
                    themNCC(ncc);
                    break;
                case 2:
                    xuatNCC();
                    break;
                case 3:
                    System.out.print("Nhập mã nhà cung cấp cần xóa: ");
                    String maXoa = sc.nextLine();
                    xoaNhaCungCap(maXoa);
                    break;
                case 4:
                    System.out.print("Nhập chi phí cần tìm: ");
                    double chiPhiTimKiem = sc.nextDouble();
                    timKiemNhaCungCapTheoChiPhi(chiPhiTimKiem);
                    break;
                case 5:
                    sapXepNhaCungCapTheoChiPhi();
                    break;
                case 6:
                    laySoLuongNhaCungCap();
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
