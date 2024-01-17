package Task2;

public class TapChi extends AnPham{
	String tenTapChi;

	public TapChi(String tieuDe, int soTrang, int namXuatBan, String tacGia, int giaTien, String tenTapChi) {
		super(tieuDe, soTrang, namXuatBan, tacGia, giaTien);
		this.tenTapChi = tenTapChi;
	}

	@Override
	String getType() {
		// TODO Auto-generated method stub
		return "Tap Chi";
	}
}
