  
package com.ipartek.pojo.ejercicios;

import com.ipartek.pojo.Perro;



/**
 * La historia de los 8 perros mas famosos.<br>
 * Crear 8 perros con su constructor por defecto y setear el nombre e historia.<br>
 * Mostrar por pantalla sus nombres e historias;
 * 
 * 
 * @see https://blog.patasbox.com/los-8-perros-mas-fomos-de-la-historia/
 * @author ur00
 *
 */

public class Ejercicio1 {

	public static void main(String[] args) {
		
		
		
		
		Perro snoppy = new Perro();
		//snoppy.nombre = "Snoppy";
		snoppy.setNombre("Snoppy");
		//snoppy.peso = -12;
		snoppy.setPeso(12);
		
		Perro Laika = new Perro();
		Laika.setNombre("Laika");
		Laika.setPeso(-56);
		Laika.setHistoria("Esta famosa perrita sovi�tica fue el primer ser vivo en viajar al espacio. En 1957 emprendi� su viaje y desafortunadamente muri� a las 5 horas de despegar por el estr�s y la falta de ox�geno. Este suceso puso en el punto de mira los experimentos con animales. Desde entonces Laika ha sido un icono en la historia. ");
		
		Perro Hachiko = new Perro();
		Hachiko.setNombre("Hachiko");
		Hachiko.setHistoria("Pocos perros han sido tan famosos como �l, llegando incluso a traspasar la pantalla y hacernos soltar alguna que otra lagrimilla. Este perro de raza Akita conmocion� al mundo con su historia de lealtad y amor por su amo. Su historia se hizo famosa por estar durante 10 a�os esperando a su due�o en la estaci�n de metro, a pesar de que �ste hab�a muerto en uno de los trayectos. ");
		
		Perro Balto = new Perro();
		Balto.setNombre("Balto");
		Balto.setHistoria("Este husky siberiano comand� a un grupo de perros para llevar vacunas a un pueblo que ten�a una epidemia de difteria y que se encontraba aislado a mil kil�metros de distancia del hospital m�s cercano. Se le considera el h�roe de los ni�os del pueblo Nome.");
		
		Perro Rintintin = new Perro();
		Rintintin.setNombre("Rin tin tin");
		Rintintin.setHistoria("Este pastor alem�n se hizo famoso por interpretar 27 peliculas mudas de Hollywood. En 1929 incluso recibi� varios votos para ser el ganador de un premio �scar, sin embargo la propia academia lo tuvo que denegar por no ser una persona. ");
		
		Perro Stubby = new Perro();
		Stubby.setNombre("Stubby");
		Stubby.setHistoria("El sargento Stubby fue un h�roe de la Primera Guerra Mundial. Era un  american pitbull terrier que acompa�� durante los a�os de guerra a las tropas americanas. Se encargaba de avisarles de peligros y de gases que puedieran afectarles. Fue condecorado por el gobierno franc�s y estadounidense. ");
		
		Perro Pancho = new Perro();
		Pancho.setNombre("Pancho");
		Pancho.setHistoria("Pancho ha sido sin duda uno de los perros m�s famosos en Espa�a. Lo vimos hacerse millonario jugando a la primitiva e irse de vacaciones al Caribe. Tambi�n comparti� pantalla con la loca comunidad de vecinos de �Aqu� no hay quien viva�. Su muerte fue un momento duro para el cine espa�ol. ");
		
		Perro GreyfriarsBobby = new Perro();
		GreyfriarsBobby.setNombre("Greyfriars Bobby");
		GreyfriarsBobby.setHistoria("Es conocido por ser el perro m�s fiel del mundo. Para conocer su historia nos trasladamos hasta Edimburgo. Bobby fue acompa�ante durante varios a�os de un vigilante de seguridad. Despu�s de que �ste muriera Bobby pas� 14 a�os hasta su muerte junto a su tumba.");
		
		Perro Smoky = new Perro();
		Smoky.setNombre("Smoky");
		Smoky.setHistoria("Este peque�o Yorkshire fue encontrado por un soldado estadounidense en la Primera Guerra Mundial y le acompa�� en todas sus misiones. La historia cuenta que incluso ayud� a construir una base a�rea transportando cable. Fue tambi�n un perro terapia para las v�ctimas de la guerra que estaban hospitalizadas. ");
		

		System.out.println("Nombre: "+ snoppy.getNombre() + "  Peso: " + snoppy.getPeso() + " kg");
		System.out.println( "Nombre: "+ Laika.getNombre() + " Peso: " + Laika.getPeso() + " kg\n");
		System.out.println(Hachiko.getNombre() + ": " + Hachiko.getHistoria() + "\n");
		System.out.println(Balto.getNombre() + ": " + Balto.getHistoria()+ "\n");
		System.out.println(Rintintin.getNombre() + ": " + Rintintin.getHistoria()+ "\n");
		System.out.println(Stubby.getNombre() + ": " + Stubby.getHistoria()+ "\n");
		System.out.println(Pancho.getNombre() + ": " + Pancho.getHistoria()+ "\n");
		System.out.println(GreyfriarsBobby.getNombre() + ": " + GreyfriarsBobby.getHistoria()+ "\n");
		System.out.println(Smoky.getNombre() + ": " + Smoky.getHistoria()+ "\n");
		
	}

}