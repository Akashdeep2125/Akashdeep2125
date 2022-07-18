package com.oopshiding;

    class Bank1{
	private String name;
	Bank1(String name){
		this.name=name;
	}
	public String getBank1name() {
		return this.name; 
	}
}
	class Employee{
		private String name;
		Employee(String name){
			this.name=name;
		}
		public String getEmployeename() {
			return this.name;
		}
	}
		class Bank {
	public static void main(String[] args) {
		Bank1 bank = new Bank1("ICICI");
		Employee emp = new Employee("Radha");
		System.out.println(emp.getEmployeename()+" is employee of "+bank.getBank1name());
		
	}

}