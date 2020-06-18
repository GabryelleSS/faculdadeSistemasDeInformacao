package method;

import java.sql.Connection;
import java.sql.PreparedStatement;
import connection.UtilDAO;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import model.Carro;
import model.Operacao;

public class GerenciadorDAO {
    
    public void insertCars(Carro carro) {
        
        String sql = "insert into carro(placa, marca, modelo, ano, tipo_carro, quilometragem, tanque, disponibilidade) \n" +
            " values(?, ?, ?, ?, ?, ?, ?, " + 0 + ")";
        
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
            statement.setTimestamp(2, new Timestamp(System.currentTimeMillis()));
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
            String sql = "SELECT * FROM carro WHERE disponibilidade = 0 and placa = ?";
            
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
                carro.setDisponibilidadeLocacao(resultSet.getInt("disponibilidade"));
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
    
    public void updateAvailabilityCar(Carro carro) {
        String sql = "update carro set disponibilidade = ? WHERE placa = ?";
        
        try {
            Connection conexao = UtilDAO.connection();
            
            PreparedStatement statement = conexao.prepareStatement(sql);
            
            statement.setInt(1, carro.getDisponibilidadeLocacao());
            statement.setString(2, carro.getPlaca());
            
            statement.execute();
            statement.close();
            
            conexao.close();
        } catch(Exception e) {
            System.out.println("Não foi possivel vender o carro.");
        }
    }
    
    public ArrayList selectCars() {
        String sql = "SELECT carro.placa, carro.modelo, operacao.data_hora, operacao.valor, carro.quilometragem, carro.tanque, carro.disponibilidade FROM operacao \n" +
"                INNER JOIN carro ON (operacao.placa = carro.placa)\n" +
"                WHERE operacao.tipo_operacao = \"compra\"";
        
        ArrayList listaOperacao = new ArrayList();
        
        try {
            Connection conexao = UtilDAO.connection();
            
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);
            
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                
                Operacao operacao = new Operacao();
                
                operacao.setPlaca(resultSet.getString("placa"));
                operacao.setModelo(resultSet.getString("modelo"));
                operacao.setData(resultSet.getDate("data_hora"));
                operacao.setValor(resultSet.getInt("valor"));
                operacao.setQuilometragem(resultSet.getInt("quilometragem"));
                operacao.setTanque(resultSet.getString("tanque"));
                operacao.setDisponibilidadeLocacao(resultSet.getInt("disponibilidade"));
                
                listaOperacao.add(operacao);
            } 
            
            preparedStatement.execute();
            preparedStatement.close();
            
            conexao.close();
            
            return listaOperacao;
        } catch(Exception e) {
            System.out.println("Não foi possivel obter os dados dos carros");
            
            return listaOperacao;
        }
    }
    
    public ArrayList selectCarsBuy() {
        String sql = "SELECT carro.placa, carro.modelo, carro.marca ,operacao.data_hora, operacao.valor, carro.quilometragem, carro.tanque FROM operacao \n" +
            "INNER JOIN carro ON (operacao.placa = carro.placa)\n" +
            "WHERE operacao.tipo_operacao = \"venda\"";
        
        ArrayList listaOperacao = new ArrayList();
        
        try {
            Connection conexao = UtilDAO.connection();
            
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);
            
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                
                Operacao operacao = new Operacao();
                
                operacao.setPlaca(resultSet.getString("placa"));
                operacao.setModelo(resultSet.getString("modelo"));
                operacao.setMarca(resultSet.getString("marca"));
                operacao.setData(resultSet.getDate("data_hora"));
                operacao.setValor(resultSet.getInt("valor"));
                operacao.setQuilometragem(resultSet.getInt("quilometragem"));
                operacao.setTanque(resultSet.getString("tanque"));
                
                listaOperacao.add(operacao);
            } 
            
            preparedStatement.execute();
            preparedStatement.close();
            
            conexao.close();
            
            return listaOperacao;
        } catch(Exception e) {
            System.out.println("Não foi possivel obter os dados dos carros VENDA");
            
            return listaOperacao;
        }
    }
    
    public ArrayList selectCarsRent() {
        String sql = "SELECT carro.placa, carro.modelo, operacao.data_hora, operacao.valor, carro.quilometragem, carro.tanque FROM operacao \n" +
            "INNER JOIN carro ON (operacao.placa = carro.placa)\n" +
            "WHERE operacao.tipo_operacao = \"aluguel\" and carro.disponibilidade = 2";
        
        ArrayList listaOperacao = new ArrayList();
        
        try {
            Connection conexao = UtilDAO.connection();
            
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);
            
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                
                Operacao operacao = new Operacao();
                
                operacao.setPlaca(resultSet.getString("placa"));
                operacao.setModelo(resultSet.getString("modelo"));
                operacao.setData(resultSet.getDate("data_hora"));
                operacao.setValor(resultSet.getInt("valor"));
                operacao.setQuilometragem(resultSet.getInt("quilometragem"));
                operacao.setTanque(resultSet.getString("tanque"));
                
                listaOperacao.add(operacao);
            } 
            
            preparedStatement.execute();
            preparedStatement.close();
            
            conexao.close();
            
            return listaOperacao;
        } catch(Exception e) {
            System.out.println("Não foi possivel obter os dados dos carros ALUGUEL");
            
            return listaOperacao;
        }
    }
    
    public ArrayList selectCarsDevolution() {
        String sql = "SELECT carro.placa, carro.modelo, operacao.data_hora, operacao.valor, carro.quilometragem, carro.tanque FROM operacao \n" +
            "INNER JOIN carro ON (operacao.placa = carro.placa)\n" +
            "WHERE operacao.tipo_operacao = \"devolucao\"";
        
        ArrayList listaOperacao = new ArrayList();
        
        try {
            Connection conexao = UtilDAO.connection();
            
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);
            
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                
                Operacao operacao = new Operacao();
                
                operacao.setPlaca(resultSet.getString("placa"));
                operacao.setModelo(resultSet.getString("modelo"));
                operacao.setData(resultSet.getDate("data_hora"));
                operacao.setValor(resultSet.getInt("valor"));
                operacao.setQuilometragem(resultSet.getInt("quilometragem"));
                operacao.setTanque(resultSet.getString("tanque"));
                
                listaOperacao.add(operacao);
            } 
            
            preparedStatement.execute();
            preparedStatement.close();
            
            conexao.close();
            
            return listaOperacao;
        } catch(Exception e) {
            System.out.println("Não foi possivel obter os dados dos carros ALUGUEL");
            
            return listaOperacao;
        }
    }
    
}
