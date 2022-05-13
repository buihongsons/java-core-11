package controller;

import com.sun.source.tree.LiteralTree;
import model.SanPham;
import service.SanPhamService;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class SanPhamController {
    SanPhamService sanPhamService = new SanPhamService();
    private void printMenu(){
        System.out.println("******** MENU ********");
        System.out.println("1.Xem danh sach san pham");
        System.out.println("2.Xim san pham theo ten");
        System.out.println("3.Tim san pham theo id");
        System.out.println("4.Tim san pham co so luong duoi 5");
        System.out.println("5. Tim san pham theo muc gia");
        System.out.println("6. Thoat");
    }
    public void run(){
        Scanner sc = new Scanner(System.in);
        boolean isContinue = true;
        int option ;
        while (isContinue){
            printMenu();
            System.out.println("Nhap lua chon");
            option = Integer.parseInt(sc.nextLine());
            switch (option){
                case 1 :{
                    System.out.println("Xem danh sach san pham");
                    ArrayList<SanPham> list = sanPhamService.getSanPhams();
                    sanPhamService.prinListSanPham(list);
                    break;

                }
                case 2:{
                    System.out.println("Tim san oham theo ten");
                    System.out.println("Nhap ten san pham muon tim: ");
                    String name = sc.nextLine();
                    ArrayList<SanPham> list = sanPhamService.findName(name);
                    if (list != null){
                        sanPhamService.prinListSanPham(list);
                    }else {
                        System.out.println("Khong tim thay san pham ");
                    }break;
                }
                case 3:{
                    System.out.println("Tim san pham theo id");
                    System.out.println("Nhap id san pham : ");
                    int id = Integer.parseInt(sc.nextLine());
                    SanPham sanPham = sanPhamService.findId(id);
                    if (sanPham == null){
                        System.out.println("Khong tim thay san pham nao ");
                    }else{
                        System.out.println(sanPham);
                        boolean isContinueSub = true;
                        int optionn;
                        while (isContinueSub){
                            System.out.println("1. Xoa san pham ");
                            System.out.println("2. Cap nhat so luong san pham ");
                            System.out.println("3. Thoat");
                            System.out.println("Nhap lua chon : ");
                            optionn = Integer.parseInt(sc.nextLine());
                            switch (optionn){
                                case 1:{
                                    sanPhamService.xoaSanpham(sanPham.getId());
                                    System.out.println("Xoa thanh cong ");
                                    isContinueSub = false;
                                    break;
                                }
                                case 2:{
                                    System.out.println("Cap nhat so luong san pham ");
                                    SanPham sanPham1 = sanPhamService.capnhatSoluong(sanPham);
                                    System.out.println("San pham da duoc cap nhat so luong ");
                                    System.out.println(sanPham1);
                                    break;
                                }
                                case 3:{
                                    isContinueSub = false;
                                    break;
                                }
                                default:{
                                    System.out.println("Lua chon khong phu hop ");
                                    break;
                                }
                            }
                        }
                    }break;
                }
                case 4:{
                    System.out.println("Danh sach san pham it hon 5");
                    ArrayList<SanPham> list = sanPhamService.findGiamin();
                    sanPhamService.prinListSanPham(list);
                    break;
                }
                case 5:{
                    System.out.println("Tim san pham theo muc gia ");
                    boolean isContinueSub = true;
                    int optionn;
                    while (isContinueSub){
                        System.out.println("1. Tim san pham duoi 50k");
                        System.out.println("2. Tim san pham trong khoang 50k > 100k");
                        System.out.println("3. Tim san pham > 100k");
                        System.out.println("4. Thoat");
                        System.out.println("Nhap lua chon : ");
                        optionn = Integer.parseInt(sc.nextLine());
                        switch (optionn){
                            case 1:{
                                System.out.println("Danh sach san pham < 50k ");
                                ArrayList<SanPham> list = sanPhamService.findGiamin();
                                sanPhamService.prinListSanPham(list);
                                break;
                            }
                            case 2:{
                                System.out.println("Danh sach san pham trong khoang 50k > 100k");
                                ArrayList<SanPham> list = sanPhamService.findGiatd();
                                if (list.isEmpty()){
                                    System.out.println("Khong tim thay san pham nao");
                                }else {
                                    sanPhamService.prinListSanPham(list);
                                }break;
                            }
                            case 3:{
                                System.out.println("Danh sach san pham > 100k");
                                ArrayList<SanPham> list = sanPhamService.findGiamax();
                                if (list.isEmpty()){
                                    System.out.println("Khong tim thay san pham nao");
                                }else {
                                    sanPhamService.prinListSanPham(list);
                                }break;
                            }
                            case 4:{
                                isContinueSub = false;
                                System.out.println("Thoat khoi submenu");
                                break;
                            }
                            default:{
                                System.out.println("Lua chon khong phu hop");
                                break;
                            }
                        }
                    }break;
                }
                case 6:{
                    isContinue = false;
                    System.out.println("Thoat khoi chuong trinh ");
                    break;
                }
                default:{
                    System.out.println("Lua chon khong phu hop");
                    break;
                }
            }
        }
    }
}
