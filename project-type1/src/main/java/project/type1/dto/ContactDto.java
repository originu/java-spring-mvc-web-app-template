package project.type1.dto;

public class ContactDto {

	private long   _id;
	private String name;
	private String tel;

	public long get_id() {
		return _id;
	}
	public void set_id(long _id) {
		this._id = _id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	@Override
	public String toString() {
		return "ContactDto [_id=" + _id + ", name=" + name + ", tel=" + tel
				+ "]";
	}
}
