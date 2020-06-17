package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDialog;
import com.jfoenix.controls.JFXDialogLayout;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import method.GerenciadorDAO;
import model.Carro;
import model.DadosAdicionaisCarro;
import model.Operacao;

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
    @FXML
    private TextField fieldPlacaCarro;
    @FXML
    private TextField fieldModeloCarro;
    @FXML
    private TextField fieldAnoCarro;
    @FXML
    private ComboBox<String> fieldTipoCarro;
    @FXML
    private TextField fieldKmCarro;
    @FXML
    private ComboBox<String> fieldTanqueCarro;
    @FXML
    private TextField fieldValorCarro;
    @FXML
    private TextField fieldMarcaCarro;
    @FXML
    private StackPane stackPane;
    private JFXTextField campoPlaca;
    @FXML
    private JFXTextField campoModelo;
    @FXML
    private JFXTextField campoBuscarPlaca;
    @FXML
    private JFXTextField campoMarca;
    @FXML
    private JFXTextField campoAno;
    @FXML
    private JFXTextField campoTipoCarro;
    @FXML
    private JFXTextField campoQuilometragem;
    @FXML
    private JFXTextField campoTanque;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        btnAdd.setVisible(false);
        containerCadastroCarro.setVisible(false);
        containerVendaCarro.setVisible(false);
        containerAluguelCarro.setVisible(false);
        stackPane.setVisible(false);
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
        
        itensCamposTipoCarro();
        itensCamposTanque();
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
    
    private void itensCamposTipoCarro() {
        fieldTipoCarro.getItems().addAll(
            "Econômico",
            "Sedan",
            "SUV",
            "Prêmium"
        );
    }
    
    private void itensCamposTanque() {
        fieldTanqueCarro.getItems().addAll(
            "Vazio",
            "Cheio",
            "Metade",
            "Um_quarto",
            "Tres_quarto"
        );
    }
    
    private boolean verificaCamposVazios() {
        ArrayList<String> Campos = new ArrayList();
        
        Campos.add(fieldPlacaCarro.getText());
        Campos.add(fieldMarcaCarro.getText());
        Campos.add(fieldModeloCarro.getText());
        Campos.add(fieldAnoCarro.getText());
        Campos.add(fieldTipoCarro.getValue());
        Campos.add(fieldKmCarro.getText());
        Campos.add(fieldTanqueCarro.getValue());
        Campos.add(fieldValorCarro.getText());
        
        for(String campo : Campos) {
            if (campo.trim().isEmpty()) {
                System.out.println("Campo vazio");
                
                return false;
            } else {
                return true;
            }
        }
        
        return true;
    }
    
    private void limparCampos() {
        fieldPlacaCarro.clear();
        fieldMarcaCarro.clear();
        fieldModeloCarro.clear();
        fieldAnoCarro.clear();
        fieldTipoCarro.valueProperty().set(null);
        fieldKmCarro.clear();
        fieldTanqueCarro.valueProperty().set(null);
        fieldValorCarro.clear();
    }

    @FXML
    private void btnLimparCampos(ActionEvent event) {
        limparCampos();
    }
    
    private void mensagemDialog(String header, String body) {
        stackPane.setVisible(true);
        JFXDialogLayout content = new JFXDialogLayout();
        
        content.setHeading(new Text(header));
        content.setBody(new Text(body));
        
        JFXDialog dialog = new JFXDialog(stackPane, content, JFXDialog.DialogTransition.CENTER);
        
        JFXButton button = new JFXButton("OK");
        button.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                dialog.close();
            }
        });
        
        content.setActions(button);
        
        dialog.show();
    }

    @FXML
    private void btnSalvarCadastroCarro(ActionEvent event) {
        
        if (verificaCamposVazios()) {
            
            DadosAdicionaisCarro dadosAdicionaisCarro = new DadosAdicionaisCarro();
            
            dadosAdicionaisCarro.setQuilometragem(Integer.parseInt(fieldKmCarro.getText().trim()));
            dadosAdicionaisCarro.setTanque(fieldTanqueCarro.getValue().trim());
            
            Carro carro = new Carro();
            
            Operacao operacao = new Operacao();
            
            carro.setPlaca(fieldPlacaCarro.getText().trim());
            carro.setMarca(fieldMarcaCarro.getText().trim());
            carro.setModelo(fieldModeloCarro.getText().trim());
            carro.setAno(Integer.parseInt(fieldAnoCarro.getText().trim()));
            carro.setTipoCarro(fieldTipoCarro.getValue().trim());
            carro.setQuilometragem(dadosAdicionaisCarro.getQuilometragem());
            carro.setTanque(dadosAdicionaisCarro.getTanque());
            
            operacao.setTipoOperacao("Compra");
            operacao.setValor(Double.parseDouble(fieldValorCarro.getText()));
            operacao.setQuilometragem(dadosAdicionaisCarro.getQuilometragem());
            operacao.setTanque(dadosAdicionaisCarro.getTanque());
            operacao.setPlaca(fieldPlacaCarro.getText().trim());
            
            GerenciadorDAO gerenciador = new GerenciadorDAO();
            gerenciador.insertCars(carro);
            
            if (gerenciador.insertOperation(operacao)) {
                mensagemDialog("Hey!", "Carro cadastrado com sucesso.");
                limparCampos();
            } else {
                mensagemDialog("Ops!", "Não foi possivel cadastrar o novo carro.");
            }
            
            
            
        } else {
            System.out.println("Sou falso");
        }
        
    }

    @FXML
    private void btnPesquisaPlaca(ActionEvent event) {
        
        String placa = campoBuscarPlaca.getText().trim();
        
        if(!placa.isEmpty()) {
            Carro carro = new Carro();
            carro.setPlaca(placa);
            
            GerenciadorDAO gerenciador = new GerenciadorDAO();
            gerenciador.searchPlaca(carro);
            
            campoMarca.setText(carro.getMarca());
            campoModelo.setText(carro.getModelo());
            campoAno.setText(String.valueOf(carro.getAno()));
            campoTipoCarro.setText(carro.getTipoCarro());
            campoQuilometragem.setText(String.valueOf(carro.getQuilometragem()));
            campoTanque.setText(carro.getTanque());
        }
        
    }
}
