package br.com.generation.exercicio01;

public class TestaAnimais {

	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Preguica preguica = new Preguica();
		
		cachorro.setNome("Wendy");
		cachorro.setIdade(4);
		cachorro.setSom("Au au au");
		cachorro.setCorrer("Corre r�pido");
		
		cavalo.setNome("Alaz�o");
		cavalo.setIdade(5);
		cavalo.setSom("Hiiiinnnnnn ");
		cavalo.setCorrer("Corre muito r�pido");
		
		preguica.setNome("Pregui�inha");
		preguica.setIdade(2);
		preguica.setSom("Ahhhhh");
		preguica.setSubir("Pregui�a sobe em �rvores");
		
		System.out.println("=========== Nome dos Animais ===========");
		System.out.println(cachorro.getNome());
		System.out.println(cavalo.getNome());
		System.out.println(preguica.getNome());
		
		System.out.println("\n=========== Idade dos Animais ===========");
		System.out.println("Cachorro: " + cachorro.getIdade() + " anos");
		System.out.println("Cavalo: " + cavalo.getIdade() + " anos");
		System.out.println("Pregui�a: " + preguica.getIdade() + " anos");
		
		System.out.println("\n=========== Movimento dos Animais ===========");
		System.out.println("Cachorro: " + cachorro.getCorrer());
		System.out.println("Cavalo: " + cavalo.getCorrer());
		System.out.println("Pregui�a: " + preguica.getSubir());
		
		System.out.println("\n=========== Som dos Animais ===========");
		System.out.println("Cachorro: " + cachorro.getSom());
		System.out.println("Cavalo: " + cavalo.getSom());
		System.out.println("Pregui�a: " + preguica.getSom());
	}
}
