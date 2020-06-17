package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class UtilDAO {
    private static final String IP = "bd.server.ip";
    private static final String PORTA = "bd.server.porta";
    private static final String BANCO = "bd.server.banco";
    private static final String USER = "bd.server.user";
    private static final String PASSWORD = "bd.server.password";
    
    public static Connection connection() {
        Connection conexao = null;
        
        try {
            Properties prop = new Properties();
            
            ClassLoader classLoader = ClassLoader.getSystemClassLoader();
            prop.load(classLoader.getResourceAsStream("property/ambiente.properties"));
            
            String ip = prop.getProperty(IP);
            String porta = prop.getProperty(PORTA);
            String banco = prop.getProperty(BANCO);
            String user = prop.getProperty(USER);
            String password;
            
            if (prop.getProperty(PASSWORD) == null) {
                password = "";
            } else {
                password = prop.getProperty(PASSWORD);
            }
            
            conexao = DriverManager.getConnection("jdbc:mysql://"+ip+":"+porta+"/"+banco+"", ""+user+"", ""+password+"");
            
        } catch(Exception e) {
            System.out.println("Não foi possivel conectar ao banco.");
        }
        
        return conexao;
    } 
}
