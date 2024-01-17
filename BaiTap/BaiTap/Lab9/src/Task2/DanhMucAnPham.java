package Task2;

import java.util.List;

public class DanhMucAnPham {
	List<AnPham> dsAnPham;

	public DanhMucAnPham(List<AnPham> dsAnPham) {
		super();
		this.dsAnPham = dsAnPham;
	}
	public int TongTien() {
		int TongTien = 0;
		for (AnPham ap : dsAnPham) {
			TongTien += ap.giaTien;
		}
		return TongTien;
	}
}
