package sources;

public class HelloAnonymus {
	public static void main(String args[]){
		HelloAnonymus hello = new HelloAnonymus();
		hello.sayhello();
	}

	interface Saludar{
		public void saluda();
	}
	public void sayhello(){
		//Using a local class to implement interface 'saludar'
		class Perro implements Saludar{//Declaration of local class
			@Override
			public void saluda() {
				System.out.println("Guau desde clase local");				
			}
		}
		//Instance of a local class
		Perro perro = new Perro();
		perro.saluda();
		
		//Using an Anonymous class
		Saludar gato = new Saludar(){//declaring and instantiating AT THE SAME TIME an anonymous class which implements an interface
			@Override
			public void saluda(){
				System.out.println("Miau desde clase anonima");	
			}
		};//finish ; because anonymous classes are expression
		gato.saluda();
		
		/**So the main difference (between local class and anonymous class) is that is with an anonymous we
		 * declare and instantiate the class at the same time valid because we only need one instance of the class
		 * implementing or overriding methods.
		 * If we want more than one instance we use a local class.
		 * If we only implement one method with an anonymous class we use lambda expressions*/
	}
}
