import java.sql.*;

public class Main {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/PruebaBD";
        String usuario = "root";
        String password = "";

        String sql = "CREATE TABLE IF NOT EXISTS Usuarios (" +
                "id INT AUTO_INCREMENT PRIMARY KEY, " +
                "nombre VARCHAR(50) NOT NULL, " +
                "email VARCHAR(50), " +
                "edad INT" +
                ");";

        String nombre = "Juan Perez";
        String email = "juan.perez@example.com";
        int edad = 30;

        String sql1 = "INSERT INTO Usuarios (nombre, email, edad) VALUES (?, ?, ?)";

        try {
            Connection conexion = DriverManager.getConnection(url, usuario, password);

//        Statement statement = conexion.createStatement();
            PreparedStatement statement = conexion.prepareStatement(sql1);

            statement.setString(1, nombre);
            statement.setString(2, email);
            statement.setInt(3, edad);

//            statement.executeUpdate(sql);
            int filasAfectadas = statement.executeUpdate();
            System.out.println("Filas insertadas: " + filasAfectadas);


            System.out.println("Conexión exitosa");

            statement.close();
            conexion.close();


        } catch (SQLException e) {
            System.out.println("Error en la conexión");
            e.printStackTrace();
        }

    }
}