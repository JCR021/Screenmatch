import com.jcro.screenmatc.modelos.Episodio;
import com.jcro.screenmatc.modelos.Pelicula;
import com.jcro.screenmatc.modelos.Serie;
import com.jcro.screenmatch.calculo.Calculadora;
import com.jcro.screenmatch.calculo.Recomend;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.setNombre("Encanto");
        miPelicula.setFechaDeLanzamiento(2021);
        miPelicula.setDuracionEnMinutos(180);
        miPelicula.setIncluidoEnElPlan(true);

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(10);

        System.out.println(miPelicula.getTotalDelasEvaluaciones());
        System.out.println(miPelicula.calculaMedia());

        Serie casaDragon = new Serie();
        casaDragon.setEpis_temp(10);
        casaDragon.setMinutos_episo(50);
        casaDragon.setTemp(1);
        casaDragon.setNombre("La casa del dragon");
        casaDragon.setFechaDeLanzamiento(2021);
        casaDragon.muestraFichaTecnica();
        System.out.println(casaDragon.getDuracionEnMinutos());

        Pelicula otraPelicula = new Pelicula();
        otraPelicula.setNombre("Virgen a los 40");
        otraPelicula.setFechaDeLanzamiento(1999);
        otraPelicula.setDuracionEnMinutos(120);


        Calculadora calculadoratiempo = new Calculadora();
        calculadoratiempo.incluye(miPelicula);
        calculadoratiempo.incluye(otraPelicula);
        System.out.println("Tiempo que necesitas para ver nuestras peliculas " + calculadoratiempo.getTiempototal() + " minutos." );

        Recomend recomend = new Recomend();
        recomend.filtra(miPelicula);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("La destruccion de Jon Snow");
        episodio.setSerie(casaDragon);
        episodio.setTotalVisua(10);

        recomend.filtra(episodio);










//        com.jcro.screenmatc.modelos.Pelicula otraPelicula = new com.jcro.screenmatc.modelos.Pelicula();
//        otraPelicula.nombre = "Matrix";
//        otraPelicula.fechaDeLanzamiento = 1999;
//        otraPelicula.duracionEnMinutos = 180;
//

    }
}
