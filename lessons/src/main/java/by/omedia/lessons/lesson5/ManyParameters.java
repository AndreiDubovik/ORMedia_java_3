package by.omedia.lessons.lesson5;

public class ManyParameters {
	
	private int a;
	private int b;
	private int c;
	private int d;
	private String name;
	private boolean isTrue;
	private double someValue;
	private double anotherValue;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	public int getD() {
		return d;
	}
	public void setD(int d) {
		this.d = d;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isTrue() {
		return isTrue;
	}
	public void setTrue(boolean isTrue) {
		this.isTrue = isTrue;
	}
	public double getSomeValue() {
		return someValue;
	}
	public void setSomeValue(double someValue) {
		this.someValue = someValue;
	}
	public double getAnotherValue() {
		return anotherValue;
	}
	public void setAnotherValue(double anotherValue) {
		this.anotherValue = anotherValue;
	}
	
	public static class Builder{
		
		private ManyParameters instance;
		
		private Builder(){
			this.instance = new ManyParameters();
		}
		
		
		
		public Builder setA(int a){
			this.instance.a = a;
			return this;
		}
		
		public Builder setB(int b){
			this.instance.b = b;
			return this;
		}
		
		public Builder setC(int c){
			this.instance.c = c;
			return this;
		}
		
		public Builder setD(int d){
			this.instance.d = d;
			return this;
		}
		
		public Builder setName(String name){
			this.instance.name = name;
			return this;
		}
		
		public static Builder build(){
			return new Builder();
		}
		
		public ManyParameters getManyParameters(){
			return this.instance;
		}
	}

}
