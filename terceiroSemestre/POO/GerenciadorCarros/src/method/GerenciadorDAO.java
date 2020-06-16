package method;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import connection.UtilDAO;
import model.Carro;

public class GerenciadorDAO {
    
    public void insertCars(Carro carro) {
        
        String sql = "insert into carro(placa, marca, modelo, ano, tipo_carro, quilometragem, tanque, disponibilidade) \n" +
            " values(?, ?, ?, ?, ?, ?, ?, " + true + ")";
        
        try {
            Connection conexao = UtilDAO.connection();
            
            PreparedStatement statement = (PreparedStatement) conexao.prepareStatement(sql);
            
            statement.setString(1, carro.getPlaca());
            statement.setString(2, carro.getMarca());
            statement.setString(3, carro.getModelo());
            statement.setInt(4, carro.getAno());
            statement.setString(5, carro.getTipoCarro());
            statement.setInt(6, carro.getQuilometragem());
            statement.setString(7, carro.getTanque());
            
            statement.execute();
            statement.close();
            
            conexao.close();
            
        } catch(Exception e) {
            System.out.println("Não foi possivel inserir carro.");
        }
    }
    
}
