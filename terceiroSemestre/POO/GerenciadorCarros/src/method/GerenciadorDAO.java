package method;

import java.sql.Connection;
import java.sql.PreparedStatement;
import connection.UtilDAO;
import java.text.SimpleDateFormat;
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
    
    public void insertOperation(Operacao operacao) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yyyy HH:mm");
        
        String sql = "insert into operacao(tipo_operacao, data_hora, valor, quilometragem, tanque, placa) \n" +
            " values(?, ?, ?, ?, ?, ?)";
        
        try {
            Connection conexao = UtilDAO.connection();
            
            PreparedStatement statement = conexao.prepareStatement(sql);
            
            statement.setString(1, operacao.getTipoOperacao());
            statement.setDate(2, new java.sql.Date(operacao.getData().getTime()));
            statement.setDouble(3, operacao.getValor());
            statement.setInt(4, operacao.getQuilometragem());
            statement.setString(5, operacao.getTanque());
            statement.setString(6, operacao.getPlaca());
            
            statement.execute();
            statement.close();
            
            conexao.close();
            
        } catch(Exception e) {
            System.out.println("Não foi possivel inserir a operação.");
        }
    }
    
}
