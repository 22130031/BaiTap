package Task2;

import java.util.List;

public class SachThamKhao extends AnPham{
	String linhVuc;
	List<Chuongsach> dsChuongSach;
	public SachThamKhao(String tieuDe, int soTrang, int namXuatBan, String tacGia, int giaTien, String linhVuc,
			List<Chuongsach> dsChuongSach) {
		super(tieuDe, soTrang, namXuatBan, tacGia, giaTien);
		this.linhVuc = linhVuc;
		this.dsChuongSach = dsChuongSach;
	}
	@Override
	String getType() {
		// TODO Auto-generated method stub
		return "Sach Tham Khao";
	}
	public SachThamKhao nhieuTrangNhat() {
		return null;
		
	}
}
