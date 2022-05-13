package service;

import model.SanPham;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class SanPhamService {
        ArrayList<SanPham> sanPhams = new ArrayList<>();

        public void init(){
            sanPhams.add(new SanPham(1,"Quan","Day la quan",1,50000));
            sanPhams.add(new SanPham(2,"Ao","Day la ao",11,60000));
            sanPhams.add(new SanPham(3,"Giay","Day la giay",2,70000));
            sanPhams.add(new SanPham(4,"Dep","Day la dep",13,800000));
            sanPhams.add(new SanPham(5,"Mu","Day la mu",4,900000));
            sanPhams.add(new SanPham(6,"Nhan","Day la nhan",15,110000));
        }

    public ArrayList<SanPham> getSanPhams() {
        return sanPhams;
    }
    public SanPhamService(){
            init();
    }
    // in ra
    public void prinListSanPham(ArrayList<SanPham> list){
            for (SanPham sanPham:list){
                System.out.println(sanPham);
            }
    }
    // tìm kiếm sản phẩm theo tên
    public ArrayList<SanPham> findName(String name){
            ArrayList<SanPham>list = new ArrayList<>();
            for (SanPham sanPham:sanPhams){
                if (sanPham.getName().toLowerCase().contains(name.toLowerCase()))
                {
                    list.add(sanPham);
                }
            }return list;
    }
    // tìm theo id
    public SanPham findId(int id){
            for (SanPham sanPham:sanPhams){
                if (sanPham.getId()== id){
                    return sanPham;
                }
            }return null;
    }
    // xóa sản phẩm
    public void xoaSanpham(int id ){
        Iterator<SanPham> iterator = sanPhams.iterator();
        while (iterator.hasNext()){
            SanPham sanPham = iterator.next();
            if(sanPham.getId()==id){
                iterator.remove();
            }
        }
    }
    // cập nhật số lượng
    public SanPham capnhatSoluong(SanPham sanPham){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap So Luong : ");
        int newtSoluong = sc.nextInt();
        sanPham.setQuantity(newtSoluong);
        return sanPham;
    }
    // tìm theo số lượng < 5
    public ArrayList<SanPham> findSoluongg(){
            ArrayList<SanPham>list=new ArrayList<>();
            for (SanPham sanPham:sanPhams){
                if (sanPham.getQuantity()<5){
                    list.add(sanPham);
                }
            }return list;
    }
    // tìm theo giá < 50.000
    public ArrayList<SanPham> findGiamin(){
            ArrayList<SanPham> list = new ArrayList<>();
            for (SanPham sanPham:sanPhams){
                if (sanPham.getPrice()<500000){
                    list.add(sanPham);
                }
            }return list;
    }
    // tìm từ 50-100
    public ArrayList<SanPham> findGiatd(){
            ArrayList<SanPham> list = new ArrayList<>();
            for (SanPham sanPham:sanPhams){
                if (sanPham.getPrice()>=50000 && sanPham.getPrice()<=100000){
                    list.add(sanPham);
                }
            }return list;
    }
    public ArrayList<SanPham> findGiamax(){
            ArrayList<SanPham> list = new ArrayList<>();
            for (SanPham sanPham:sanPhams){
                if (sanPham.getPrice()>100000){
                    list.add(sanPham);
                }
            }return list;
    }
}
