package third;


public class Customer {
	//fields
		private int id;
		private String name;
		private String phone;
		private Account account;
		
		//constructors
		Customer(){}
		public Customer(int id, String name, String phone, Account account) {
			super();
			this.id = id;
			this.name = name;
			this.phone = phone;
			this.account = account;
		}
		//setter-getter
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public Account getAccount() {
			return account;
		}
		public void setAccount(Account account) {
			this.account = account;
		}
		//toString()
		@Override
		public String toString() {
			return "Customer Details:\nCustomerid=" + id + ", name=" + name + ", phone=" + phone + ", " + account + "";
		}		

}
