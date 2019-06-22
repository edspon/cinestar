package dao;
import bd.clsBD;
public class daoPelicula {
    
    static clsBD clsBD = new clsBD("CineStar","root","");
 
    public String [][] getVerPeliculas(Object id) {
            clsBD.Sentencia(String.format("call usp_getVerPeliculas(%s)",id )); 
            return clsBD.getRegistros();
        }


    public String[] getVerPelicula(Object idPelicula) {
        clsBD.Sentencia(String.format("call usp_getPelicula(%s)",idPelicula )); 
        
            return clsBD.getRegistro();
    }

    
    }

