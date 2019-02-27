package cn.wen.oa.entity;

public class Department {
    private String sn;

    private String name;

    private String address;

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn == null ? null : sn.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

		@Override
		public String toString() {
				return "Department{" +
								"sn='" + sn + '\'' +
								", name='" + name + '\'' +
								", address='" + address + '\'' +
								'}';
		}
}