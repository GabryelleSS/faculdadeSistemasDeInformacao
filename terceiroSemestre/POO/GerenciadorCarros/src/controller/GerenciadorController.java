package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import model.Carro;

public class GerenciadorController implements Initializable {
    private int seleciona = 0;
    
    TableView<Carro> tabelaCarroCadastro = new TableView<>();
    TableView<Carro> tabelaCarroVendido = new TableView<>();
    TableView<Carro> tabelaCarroAlugado = new TableView<>();
    
    @FXML
    private Pane root;
    @FXML
    private Label breadcrumbs;
    @FXML
    private Label labelAcaoBtn;
    @FXML
    private Button btnAdd;    
    @FXML
    private Pane containerCadastroCarro;
    @FXML
    private Pane containerVendaCarro;
    @FXML
    private Pane containerAluguelCarro;
    @FXML
    private HBox containerBusca;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        btnAdd.setVisible(false);
        containerCadastroCarro.setVisible(false);
        containerVendaCarro.setVisible(false);
        containerAluguelCarro.setVisible(false);
    }

    private void limparPanel() {

        root.getChildren().remove(tabelaCarroCadastro);
        root.getChildren().remove(tabelaCarroVendido);
        root.getChildren().remove(tabelaCarroAlugado);
        
        containerCadastroCarro.setVisible(false);
        containerVendaCarro.setVisible(false);
        containerAluguelCarro.setVisible(false);
    }

    private void cadastrarCarro() {
        
        breadcrumbs.setText("Cadastro de carros");
        btnAdd.setVisible(true);
        
        containerCadastroCarro.setVisible(true);
    }

    private void vendaCarro() {
        
        breadcrumbs.setText("Venda de carros");
        btnAdd.setVisible(true);
        
        containerVendaCarro.setVisible(true);
    }
    
    private void aluguelCarro() {
        
        breadcrumbs.setText("Aluguel de carros");
        btnAdd.setVisible(true);
        
        containerAluguelCarro.setVisible(true);
    }

    @FXML
    private void btnSelecionarCarro(ActionEvent event) {
        breadcrumbs.setText("Carros Cadastrados");
        tabelaCarroCadastrado();
        
        labelAcaoBtn.setText("Adicionar novo carro");
        btnAdd.setVisible(true);
        
        seleciona = 1;
        
        containerBusca.setVisible(true);
    }

    @FXML
    private void btnSelecionaVenda(ActionEvent event) {
        limparPanel();
        
        breadcrumbs.setText("Carros Vendidos");
        tabelaCarroVendido();
        
        labelAcaoBtn.setText("Cadastrar nova venda");
        btnAdd.setVisible(true);
        
        seleciona = 2;
        
        containerBusca.setVisible(true);
    }
    
    @FXML
    private void btnSelecionaAluguel(ActionEvent event) {
        limparPanel();
        breadcrumbs.setText("Carros Alugados");
        
        labelAcaoBtn.setText("Cadastrar aluguel");
        tabelaCarroAlugado();
                
        btnAdd.setVisible(true);
        
        seleciona = 3;
        
        containerBusca.setVisible(true);
    }

    @FXML
    private void btnPesquisar(ActionEvent event) {
        
    }

    @FXML
    private void btnAdd(ActionEvent event) {
        limparPanel();
        containerBusca.setVisible(false);
        
        switch(seleciona) {
            case 1:
              cadastrarCarro();
              break;
            case 2:
              vendaCarro();
              break;
            case 3:
              aluguelCarro();
              break;
            default:
                break;
          }
    }
    
    private void tabelaCarroCadastrado() {
        
        tabelaCarroCadastro.setId("tabelaCarro");
        
        TableColumn<Carro, String> colPlaca = new TableColumn<>("Placa");
        TableColumn<Carro, String> colModelo = new TableColumn<>("Modelo");
        TableColumn<Carro, String> colDataHora = new TableColumn<>("Data e hora");
        TableColumn<Carro, String> colValor = new TableColumn<>("Valor");
        TableColumn<Carro, String> colKM = new TableColumn<>("Km");
        TableColumn<Carro, String> colTanque = new TableColumn<>("Tanque");
        TableColumn<Carro, String> colDispo = new TableColumn<>("Disp.");
        
        tabelaCarroCadastro.getColumns().addAll(colPlaca, colModelo,colDataHora, colValor, colKM, colTanque, colDispo);
        tabelaCarroCadastro.setPrefWidth(702);
        
        colPlaca.setPrefWidth(100);
        colModelo.setPrefWidth(100);
        colDataHora.setPrefWidth(100);
        colValor.setPrefWidth(100);
        colKM.setPrefWidth(100);
        colTanque.setPrefWidth(100);
        colDispo.setPrefWidth(100);
        
        root.getChildren().add(tabelaCarroCadastro);
    }

    private void tabelaCarroAlugado() {
        
        tabelaCarroAlugado.setId("tabelaCarro");
        
        TableColumn<Carro, String> colPlaca = new TableColumn<>("Placa");
        TableColumn<Carro, String> colModelo = new TableColumn<>("Modelo");
        TableColumn<Carro, String> colEntrada = new TableColumn<>("Entrada");
        TableColumn<Carro, String> colDevolucao = new TableColumn<>("Devolução");
        TableColumn<Carro, String> colValor = new TableColumn<>("Valor");
        TableColumn<Carro, String> colKM = new TableColumn<>("Km");
        TableColumn<Carro, String> colTanque = new TableColumn<>("Tanque");
        
        tabelaCarroAlugado.getColumns().addAll(colPlaca, colModelo,colEntrada, colDevolucao, colValor, colKM, colTanque);
        tabelaCarroAlugado.setPrefWidth(702);
        
        colPlaca.setPrefWidth(100);
        colModelo.setPrefWidth(100);
        colEntrada.setPrefWidth(100);
        colDevolucao.setPrefWidth(100);
        colValor.setPrefWidth(100);
        colKM.setPrefWidth(100);
        colTanque.setPrefWidth(100);
        
        root.getChildren().add(tabelaCarroAlugado);
    }

    private void tabelaCarroVendido() {
        
        tabelaCarroVendido.setId("tabelaCarro");
        
        TableColumn<Carro, String> colPlaca = new TableColumn<>("Placa");
        TableColumn<Carro, String> colModelo = new TableColumn<>("Modelo");
        TableColumn<Carro, String> colMarca = new TableColumn<>("Marca");
        TableColumn<Carro, String> colDataHora = new TableColumn<>("Data e hora");
        TableColumn<Carro, String> colValor = new TableColumn<>("Valor");
        TableColumn<Carro, String> colKM = new TableColumn<>("Km");
        TableColumn<Carro, String> colTanque = new TableColumn<>("Tanque");
        
        tabelaCarroVendido.getColumns().addAll(colPlaca, colModelo, colMarca, colDataHora, colValor, colKM, colTanque);
        tabelaCarroVendido.setPrefWidth(702);
        
        colPlaca.setPrefWidth(100);
        colModelo.setPrefWidth(100);
        colMarca.setPrefWidth(100);
        colDataHora.setPrefWidth(100);
        colValor.setPrefWidth(100);
        colKM.setPrefWidth(100);
        colTanque.setPrefWidth(100);
        
        root.getChildren().add(tabelaCarroVendido);
    }
}
