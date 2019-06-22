package bd;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class clsBD {
   String _IP = "localhost", _PORT = "3306", _BD = "", _USER = "root", _PASSWORD = "root";
   Connection cn = null;
    PreparedStatement ps = null;

    public clsBD(String _BD) {
        this._BD = _BD;
        getConnection();
    }

    public clsBD(String _BD, String _USER, String _PASSWORD) {
        this._BD = _BD;
        this._USER = _USER;
        this._PASSWORD = _PASSWORD;
        getConnection();
    }

    public clsBD(String _IP, String _PORT, String _BD, String _USER, String _PASSWORD) {
        this._IP = _IP;
        this._PORT = _PORT;
        this._BD = _BD;
        this._USER = _USER;
        this._PASSWORD = _PASSWORD;
        getConnection();
    }

    private void getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection(String.format("jdbc:mysql://%s:%s/%s", _IP, _PORT, _BD), _USER, _PASSWORD);
//            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/CineStar", "root", "12456");
        } catch (ClassNotFoundException | SQLException ex) {
     
            System.out.println(ex.getMessage());
        }
    }

    public void Sentencia(String _SQL) {
        try {
            ps = cn.prepareStatement(_SQL);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public String[][] getRegistros() {
        String[][] mRegistros = null;
        try {
            ResultSet rs = ps.executeQuery();
            if (rs.last()) {
                int columnas = rs.getMetaData().getColumnCount();
                mRegistros = new String[rs.getRow()][columnas];
                rs.beforeFirst();
                

                int fila = -1;
                while (rs.next() && ++fila > -1) {
                    for (int i = 0; i < columnas; i++) {
                        mRegistros[fila][i] = rs.getString(i + 1).trim();
                    }
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return mRegistros;
    }

    public String[] getRegistro() {
                String[] amRegistro = null;
        try {
            ResultSet rs = ps.executeQuery();
            if (rs.last()) {
                int columnas = rs.getMetaData().getColumnCount();
                amRegistro = new String[columnas];
                

                    for (int i = 0; i < columnas; i++) {
                        amRegistro[i] = rs.getString(i + 1).trim();
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return amRegistro;
    }
}
