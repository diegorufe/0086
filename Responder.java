import java.util.Random;
import java.util.ArrayList;
/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2011.07.31)
 */
public class Responder
{
    Random aleatorio;
    ArrayList<String> respuestas;

    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        aleatorio = new Random();
        respuestas = new ArrayList<String>();
        String[] respuestasDescritas = new String[5];
        respuestasDescritas[0] = "Describa su problema"; 
        respuestasDescritas[1] = "�Esta seguro/a de que ese es su problema?";
        respuestasDescritas[2] = "Describame el problema de nuevo, por favor";
        respuestasDescritas[3]= "Interesante, describa mas detalles de su problema";
        respuestasDescritas[4] = "�Esta seguro/a de que de verdad tiene un problema?";
        for(int i =0;i <5;i++){
            respuestas.add(respuestasDescritas[i]);
        }
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse()
    {
        return respuestas.get(aleatorio.nextInt(respuestas.size()));
    }

}
