package dao;
import bean.Cine;
import java.util.List;

public class daoCine {
    bd.clsBD clsBD = new bd.clsBD("CineStar","root","");
    public String [][] getVerCines(){
            clsBD.Sentencia( "call usp_getVerCines()" );
            return clsBD.getRegistros();
        }
    public List <Cine> getVerCinesList(){
        
         clsBD.Sentencia( "call usp_getVerCines()" );
         return new Cine().getListCine(clsBD.getRegistros());
//       return new Cine().getListCine(getVerCines());
         
        }
    }
