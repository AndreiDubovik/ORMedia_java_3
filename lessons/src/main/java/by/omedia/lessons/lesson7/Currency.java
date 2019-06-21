package by.omedia.lessons.lesson7;

public enum Currency {
	
	USD(1){
		@Override
		public String toString(){
			return "Доллар США";
		}
	},EUR(2),RUR(3);
	
	private int code;
	private Currency(int code){
		this.code = code;
	}
	public int getCode(){
		return this.code;
	}
	public double getRate(){
		switch(this){
		case USD:return 2.08;
		case EUR:return 2.15;
		case RUR:return 0.03;
		default:return 0.0;
		}
	}
}
