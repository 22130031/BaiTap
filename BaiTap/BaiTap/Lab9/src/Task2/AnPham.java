package Task2;

public abstract  class AnPham {
	protected String tieuDe;
	protected int soTrang;
	protected int namXuatBan;
	protected String tacGia;
	protected int giaTien;
	public AnPham(String tieuDe, int soTrang, int namXuatBan, String tacGia, int giaTien) {
		super();
		this.tieuDe = tieuDe;
		this.soTrang = soTrang;
		this.namXuatBan = namXuatBan;
		this.tacGia = tacGia;
		this.giaTien = giaTien;
	}
	abstract  String getType();
	public boolean tapChi10years() {
		if(this.getType().equals("Tap Chi") && (2021 - this.namXuatBan)> 10 )
		return true;
		return false;
	}
	public boolean cau8(AnPham a) {
		if(this.getType().equals(a.getType()) && this.tacGia.equals(a.tacGia))
			return true;
		return false;
	}
}
