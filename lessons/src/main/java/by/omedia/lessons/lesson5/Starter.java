package by.omedia.lessons.lesson5;

public class Starter {

	public static void main(String[] args) {
		Object ob = 1;
		Wrapper<Integer> w = new Wrapper(ob);
		System.out.println(w.getObject()+1);
	}
	
	private static void builderExample(){
		ManyParameters mp = ManyParameters.Builder.build()
				.setA(1)
				.setB(1)
				.setC(3)
				.setD(8)
				.setName("hgfhgfhg")
				.getManyParameters();
	}
	
	public static void anonimClassExample(){
		Something something = new Something(){
			@Override
			public void doSomething() {
				System.out.println("something");
			}

			@Override
			public void anotherAction() {
				System.out.println("nothing");
			}
		};
		
		something.doSomething();
		something.anotherAction();
		System.out.println(something.getClass().getName());
		Something something2 = new Something(){
			@Override
			public void doSomething() {
				System.out.println("something");
			}

			@Override
			public void anotherAction() {
				System.out.println("nothing");
			}
		};
		System.out.println(something2.getClass().getName());
	}
	
	public static void singletoneExample(){
		SingletoneExample se = SingletoneExample.getInstance();
	}
	
	private interface Something{
		void doSomething();
		void anotherAction();
	}
	
	private interface AnotherInterface{
		Wrapper<String> getObject();
	}

}
