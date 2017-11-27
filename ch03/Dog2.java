public class Dog2 {
	String name;
	
	public static void main(String[] args) {
		//cria um objeto Dog e o acessa
		Dog2 dog1 = new Dog2();
		dog1.bark();
		dog1.name = "Bark";
		
		//cria uma matriz Dog
		Dog2[] myDogs = new Dog2[3];
		myDogs[0] = new Dog2();
		myDogs[1] = new Dog2();
		myDogs[2] = dog1;
		
		//acessa os objetos Dog usando as referÃªncias da matriz
		myDogs[0].name = "Fred";
		myDogs[1].name = "Marge";
		
		System.out.print("O nome do último cão é ");
		System.out.println(myDogs[2].name);
		
		//Executa um loop pela matriz e pede a todos os cÃ£es para latirem
		int x = 0;
		while (x < myDogs.length) {
			myDogs[x].bark();
			x = x + 1;
		}
	}
	
	public void bark() {
		System.out.println(name + " diz Ruff");
	}
	
	public void eat() {}
	
	public void chaseCat() {}
}