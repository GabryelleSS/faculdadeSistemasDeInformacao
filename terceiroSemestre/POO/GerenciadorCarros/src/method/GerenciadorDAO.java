package method;

import java.sql.Connection;
import java.sql.PreparedStatement;
import connection.UtilDAO;
import java.sql.ResultSet;
import java.sql.Timestamp;
import model.Carro;
import model.Operacao;

public class GerenciadorDAO {
    
    public void insertCars(Carro carro) {
        
        String sql = "insert into carro(placa, marca, modelo, ano, tipo_carro, quilometragem, tanque, disponibilidade) \n" +
            " values(?, ?, ?, ?, ?, ?, ?, " + true + ")";
        
        try {
            Connection conexao = UtilDAO.connection();
            
            PreparedStatement statement = conexao.prepareStatement(sql);
            
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
    
    public boolean insertOperation(Operacao operacao) {
        String sql = "insert into operacao(tipo_operacao, data_hora, valor, quilometragem, tanque, placa) \n" +
            " values(?, ?, ?, ?, ?, ?)";
        
        try {
            Connection conexao = UtilDAO.connection();
            
            PreparedStatement statement = conexao.prepareStatement(sql);
            
            statement.setString(1, operacao.getTipoOperacao());
            statement.setTimestamp(2,new Timestamp(System.currentTimeMillis()));
            statement.setDouble(3, operacao.getValor());
            statement.setInt(4, operacao.getQuilometragem());
            statement.setString(5, operacao.getTanque());
            statement.setString(6, operacao.getPlaca());
            
            statement.execute();
            statement.close();
            
            conexao.close();
            
            return true;
        } catch(Exception e) {
            System.out.println("Não foi possivel inserir a COMPRA.");
            return false;
        }
    }
    
    public void searchPlaca(Carro carro) {
        try {

            Connection conexao = UtilDAO.connection();
            String sql = "SELECT * FROM carro WHERE placa = ?";
            
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);
            preparedStatement.setString(1, carro.getPlaca());

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                carro.setPlaca(resultSet.getString("placa"));
                carro.setMarca(resultSet.getString("marca"));
                carro.setModelo(resultSet.getString("modelo"));
                carro.setAno(resultSet.getInt("ano"));
                carro.setTipoCarro(resultSet.getString("tipo_carro"));
                carro.setQuilometragem(resultSet.getInt("quilometragem"));
                carro.setTanque(resultSet.getString("tanque"));
                carro.setDisponibilidadeLocacao(resultSet.getBoolean("disponibilidade"));
            } else {
                carro.setPlaca("");
            }
            
            preparedStatement.close();
            resultSet.close();
            conexao.close();
            
        } catch(Exception e) {
            carro.setPlaca("");
            
            System.out.println("Não foi possivel BUSCAR O CARRO.");
        }
    }
    
}
