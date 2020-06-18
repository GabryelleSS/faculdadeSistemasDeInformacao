package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDialog;
import com.jfoenix.controls.JFXDialogLayout;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
import javafx.scene.control.cell.PropertyValueFactory;
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
    
    TableView<Operacao> tabelaCarroCadastro = new TableView<>();
    TableView<Operacao> tabelaCarroVendido = new TableView<>();
    TableView<Operacao> tabelaCarroAlugado = new TableView<>();
    TableView<Operacao> tabelaCarroDevolvidos = new TableView<>();
    
    private List<Carro> listaCarros = new ArrayList();
    private List<Operacao> listaOperacoes = new ArrayList();
    
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
    @FXML
    private JFXTextField campoValor;
    @FXML
    private JFXTextField fieldBuscarPlacaAluguel;
    @FXML
    private JFXTextField fieldMarcaAluguel;
    @FXML
    private JFXTextField fieldModeloAluguel;
    @FXML
    private JFXTextField fieldAnoAluguel;
    @FXML
    private JFXTextField fieldTipoCarroAluguel;
    @FXML
    private JFXTextField fieldValorAluguel;
    @FXML
    private JFXTextField fieldKMAluguel;
    @FXML
    private JFXTextField fieldTanqueAluguel;
    private JFXButton btnSaidaCarros;
    private JFXButton btnEntradaCarros;
    @FXML
    private Pane containerAluguelCarroEntrada;
    @FXML
    private JFXButton saidaCarro;
    @FXML
    private JFXButton entradaCarro;
    @FXML
    private StackPane stackPaneAluguel;
    @FXML
    private JFXButton liberarCarro;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        btnAdd.setVisible(false);
        containerCadastroCarro.setVisible(false);
        containerVendaCarro.setVisible(false);
        containerAluguelCarroEntrada.setVisible(false);
        stackPane.setVisible(false);
        stackPaneAluguel.setVisible(false);
        entradaCarro.setVisible(false);
        saidaCarro.setVisible(false);
        liberarCarro.setVisible(false);
    }
    
    private ObservableList<Operacao> listaCarros() {
        
        GerenciadorDAO gereciadorDAO = new GerenciadorDAO();
        
        return FXCollections.observableArrayList(
            gereciadorDAO.selectCars()
        );
    }
    
    private ObservableList<Operacao> listaVenda() {
        
        GerenciadorDAO gereciadorDAO = new GerenciadorDAO();
        
        return FXCollections.observableArrayList(
            gereciadorDAO.selectCarsBuy()
        );
    }
    
    private ObservableList<Operacao> listaAluguel() {
        
        GerenciadorDAO gereciadorDAO = new GerenciadorDAO();
        
        return FXCollections.observableArrayList(
            gereciadorDAO.selectCarsRent()
        );
    }
    
    private ObservableList<Operacao> listaAluguelDevolvidos() {
        
        GerenciadorDAO gereciadorDAO = new GerenciadorDAO();
        
        return FXCollections.observableArrayList(
            gereciadorDAO.selectCarsDevolution()
        );
    }

    private void limparPanel() {

        root.getChildren().remove(tabelaCarroCadastro);
        root.getChildren().remove(tabelaCarroVendido);
        root.getChildren().remove(tabelaCarroAlugado);
        root.getChildren().remove(tabelaCarroDevolvidos);
        
        containerCadastroCarro.setVisible(false);
        containerVendaCarro.setVisible(false);
        containerAluguelCarroEntrada.setVisible(false);
        entradaCarro.setVisible(false);
        saidaCarro.setVisible(false);
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
        
        limparPanel();
        containerAluguelCarroEntrada.setVisible(true);
    }
   
    @FXML
    private void btnSelecionarCarro(ActionEvent event) {
        limparPanel();
        
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
        entradaCarro.setVisible(true);
        saidaCarro.setVisible(true);
                
        btnAdd.setVisible(true);
        
        seleciona = 3;
        
        containerBusca.setVisible(true);
    }


    @FXML
    private void btnAdd(ActionEvent event) {
        limparPanel();
        limparCampos();
        containerBusca.setVisible(false);
        saidaCarro.setVisible(false);
        entradaCarro.setVisible(false);
        
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
        
        TableColumn<Operacao, String> colPlaca = new TableColumn<>("Placa");
        TableColumn<Operacao, String> colModelo = new TableColumn<>("Modelo");
        TableColumn<Operacao, String> colDataHora = new TableColumn<>("Data e hora");
        TableColumn<Operacao, String> colValor = new TableColumn<>("Valor");
        TableColumn<Operacao, String> colKM = new TableColumn<>("Km");
        TableColumn<Operacao, String> colTanque = new TableColumn<>("Tanque");
        TableColumn<Operacao, String> colDispo = new TableColumn<>("Disp.");
        
        tabelaCarroCadastro.setItems(listaCarros());
        
        tabelaCarroCadastro.getColumns().addAll(colPlaca, colModelo,colDataHora, colValor, colKM, colTanque, colDispo);
        tabelaCarroCadastro.setPrefWidth(702);
        
        colPlaca.setCellValueFactory(new PropertyValueFactory<>("placa"));
        colModelo.setCellValueFactory(new PropertyValueFactory<>("modelo"));
        colDataHora.setCellValueFactory(new PropertyValueFactory<>("data"));
        colValor.setCellValueFactory(new PropertyValueFactory<>("valor"));
        colKM.setCellValueFactory(new PropertyValueFactory<>("quilometragem"));
        colTanque.setCellValueFactory(new PropertyValueFactory<>("tanque"));
        colDispo.setCellValueFactory(new PropertyValueFactory<>("disponibilidadeLocacao"));
        
        colPlaca.setPrefWidth(100);
        colModelo.setPrefWidth(100);
        colDataHora.setPrefWidth(100);
        colValor.setPrefWidth(100);
        colKM.setPrefWidth(100);
        colTanque.setPrefWidth(100);
        colDispo.setPrefWidth(100);
        
        root.getChildren().addAll(tabelaCarroCadastro);
    }

    private void tabelaCarroAlugado() {
        
        tabelaCarroAlugado.setId("tabelaCarro");
        
        liberarCarro.setVisible(true);
        
        TableColumn<Operacao, String> colPlaca = new TableColumn<>("Placa");
        TableColumn<Operacao, String> colModelo = new TableColumn<>("Modelo");
        TableColumn<Operacao, String> colEntrada = new TableColumn<>("Entrada");
        TableColumn<Operacao, String> colValor = new TableColumn<>("Valor");
        TableColumn<Operacao, String> colKM = new TableColumn<>("Km");
        TableColumn<Operacao, String> colTanque = new TableColumn<>("Tanque");
        
        tabelaCarroAlugado.setItems(listaAluguel());
        tabelaCarroAlugado.getColumns().addAll(colPlaca, colModelo,colEntrada, colValor, colKM, colTanque);
        
        tabelaCarroAlugado.setPrefWidth(702);
        
        colPlaca.setCellValueFactory(new PropertyValueFactory<>("placa"));
        colModelo.setCellValueFactory(new PropertyValueFactory<>("modelo"));
        colEntrada.setCellValueFactory(new PropertyValueFactory<>("data"));
        colValor.setCellValueFactory(new PropertyValueFactory<>("valor"));
        colKM.setCellValueFactory(new PropertyValueFactory<>("quilometragem"));
        colTanque.setCellValueFactory(new PropertyValueFactory<>("tanque"));
        
        colPlaca.setPrefWidth(100);
        colModelo.setPrefWidth(100);
        colEntrada.setPrefWidth(100);
        colValor.setPrefWidth(100);
        colKM.setPrefWidth(100);
        colTanque.setPrefWidth(200);
        
        root.getChildren().add(tabelaCarroAlugado);
    }

    private void tabelaCarroDevolvidos() {
        
        tabelaCarroDevolvidos.setId("tabelaCarro");
        
        TableColumn<Operacao, String> colPlaca = new TableColumn<>("Placa");
        TableColumn<Operacao, String> colModelo = new TableColumn<>("Modelo");
        TableColumn<Operacao, String> colDevolucao = new TableColumn<>("Devolução");
        TableColumn<Operacao, String> colValor = new TableColumn<>("Valor");
        TableColumn<Operacao, String> colKM = new TableColumn<>("Km");
        TableColumn<Operacao, String> colTanque = new TableColumn<>("Tanque");
        
        tabelaCarroDevolvidos.setItems(listaAluguelDevolvidos());
        tabelaCarroDevolvidos.getColumns().addAll(colPlaca, colModelo,colDevolucao, colValor, colKM, colTanque);
        tabelaCarroDevolvidos.setPrefWidth(702);
        
        colPlaca.setCellValueFactory(new PropertyValueFactory<>("placa"));
        colModelo.setCellValueFactory(new PropertyValueFactory<>("modelo"));
        colDevolucao.setCellValueFactory(new PropertyValueFactory<>("data"));
        colValor.setCellValueFactory(new PropertyValueFactory<>("valor"));
        colKM.setCellValueFactory(new PropertyValueFactory<>("quilometragem"));
        colTanque.setCellValueFactory(new PropertyValueFactory<>("tanque"));
        
        colPlaca.setPrefWidth(100);
        colModelo.setPrefWidth(100);
        colDevolucao.setPrefWidth(100);
        colValor.setPrefWidth(100);
        colKM.setPrefWidth(100);
        colTanque.setPrefWidth(200);
        
        root.getChildren().add(tabelaCarroDevolvidos);
    }

    private void tabelaCarroVendido() {
        
        tabelaCarroVendido.setId("tabelaCarro");
        
        TableColumn<Operacao, String> colPlaca = new TableColumn<>("Placa");
        TableColumn<Operacao, String> colModelo = new TableColumn<>("Modelo");
        TableColumn<Operacao, String> colMarca = new TableColumn<>("Marca");
        TableColumn<Operacao, String> colDataHora = new TableColumn<>("Data e hora");
        TableColumn<Operacao, String> colValor = new TableColumn<>("Valor");
        TableColumn<Operacao, String> colKM = new TableColumn<>("Km");
        TableColumn<Operacao, String> colTanque = new TableColumn<>("Tanque");
        
        tabelaCarroVendido.setItems(listaVenda());
        
        tabelaCarroVendido.getColumns().addAll(colPlaca, colModelo, colMarca, colDataHora, colValor, colKM, colTanque);
        tabelaCarroVendido.setPrefWidth(702);
        
        colPlaca.setCellValueFactory(new PropertyValueFactory<>("placa"));
        colModelo.setCellValueFactory(new PropertyValueFactory<>("modelo"));
        colMarca.setCellValueFactory(new PropertyValueFactory<>("marca"));
        colDataHora.setCellValueFactory(new PropertyValueFactory<>("data"));
        colValor.setCellValueFactory(new PropertyValueFactory<>("valor"));
        colKM.setCellValueFactory(new PropertyValueFactory<>("quilometragem"));
        colTanque.setCellValueFactory(new PropertyValueFactory<>("tanque"));
        
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
                System.out.println("Campos vazios.");
                
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
                stackPane.setVisible(false);
                dialog.close();
            }
        });
        
        content.setActions(button);
        
        dialog.show();
    }
    
    private void mensagemEditarTabelaAluguel(String header, String body) {
        stackPaneAluguel.setVisible(true);
        JFXDialogLayout content = new JFXDialogLayout();
        
        content.setHeading(new Text(header));
        
        content.setBody(new Text(body));
            
        String placa = tabelaCarroAlugado.getSelectionModel().getSelectedItem().getPlaca();
        double valor = tabelaCarroAlugado.getSelectionModel().getSelectedItem().getValor();
        int km = tabelaCarroAlugado.getSelectionModel().getSelectedItem().getQuilometragem();
        String tanque = tabelaCarroAlugado.getSelectionModel().getSelectedItem().getTanque();
        
        JFXDialog dialog = new JFXDialog(stackPaneAluguel, content, JFXDialog.DialogTransition.CENTER);
        
        JFXButton buttonCancel = new JFXButton("Cancel");
        buttonCancel.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                stackPaneAluguel.setVisible(false);
                dialog.close();
            }
        });
        
        JFXButton buttonOk = new JFXButton("OK");
        buttonOk.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                
                GerenciadorDAO gerenciadorDAO = new GerenciadorDAO();
                DadosAdicionaisCarro dadosAdicionaisCarro = new DadosAdicionaisCarro();
                
                dadosAdicionaisCarro.setQuilometragem((km));
                dadosAdicionaisCarro.setTanque(tanque);
                
                Operacao operacao = new Operacao();
                operacao.setTipoOperacao("Devolucao");

                operacao.setValor((valor));
                operacao.setQuilometragem(dadosAdicionaisCarro.getQuilometragem());
                operacao.setTanque(dadosAdicionaisCarro.getTanque());
                operacao.setPlaca(placa);

                Carro carro = new Carro();

                carro.setDisponibilidadeLocacao(0);
                carro.setPlaca(placa);

                GerenciadorDAO gerenciador = new GerenciadorDAO();

                gerenciador.insertOperation(operacao);
                gerenciador.updateAvailabilityCar(carro);
                
                stackPaneAluguel.setVisible(false);
                dialog.close();
            }
        });
        
        content.setActions(buttonCancel, buttonOk);
        
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
            mensagemDialog("Ops!", "Não foi possivel cadastrar o novo carro.");
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
    
    @FXML
    private void btnSalvarVenda(ActionEvent event) {
        
        if(campoBuscarPlaca.getText().trim().isEmpty() || campoValor.getText().trim().isEmpty() || campoMarca.getText().trim().isEmpty()) {
            mensagemDialog("Ops!", "Preencha os campos corretamente.");
        } else {
            DadosAdicionaisCarro dadosAdicionaisCarro = new DadosAdicionaisCarro();

            dadosAdicionaisCarro.setQuilometragem(Integer.parseInt(campoQuilometragem.getText().trim()));
            dadosAdicionaisCarro.setTanque(campoTanque.getText().trim());
            
            Operacao operacao = new Operacao();
            operacao.setTipoOperacao("Venda");
            
            operacao.setValor(Double.parseDouble(campoValor.getText().trim()));
            operacao.setQuilometragem(dadosAdicionaisCarro.getQuilometragem());
            operacao.setTanque(dadosAdicionaisCarro.getTanque());
            operacao.setPlaca(campoBuscarPlaca.getText().trim());
            
            Carro carro = new Carro();
            
            carro.setDisponibilidadeLocacao(1);
            carro.setPlaca(campoBuscarPlaca.getText().trim());
            
            GerenciadorDAO gerenciador = new GerenciadorDAO();
            
            gerenciador.insertOperation(operacao);
            gerenciador.updateAvailabilityCar(carro);
            
            mensagemDialog("Hey!", "Venda realizada com sucesso.");
        }
    }

    @FXML
    private void btnLimparCamposVendas(ActionEvent event) {
        
    }

    @FXML
    private void btnSalvarAluguel(ActionEvent event) {
        
        if(fieldBuscarPlacaAluguel.getText().trim().isEmpty() || fieldValorAluguel.getText().trim().isEmpty() || fieldMarcaAluguel.getText().trim().isEmpty()) {
            mensagemDialog("Ops!", "Preencha os campos corretamente.");
        } else {
            DadosAdicionaisCarro dadosAdicionaisCarro = new DadosAdicionaisCarro();

            dadosAdicionaisCarro.setQuilometragem(Integer.parseInt(fieldKMAluguel.getText().trim()));
            dadosAdicionaisCarro.setTanque(fieldTanqueAluguel.getText().trim());
            
            Operacao operacao = new Operacao();
            operacao.setTipoOperacao("Aluguel");
            
            operacao.setValor(Double.parseDouble(fieldValorAluguel.getText().trim()));
            operacao.setQuilometragem(dadosAdicionaisCarro.getQuilometragem());
            operacao.setTanque(dadosAdicionaisCarro.getTanque());
            operacao.setPlaca(fieldBuscarPlacaAluguel.getText().trim());
            
            Carro carro = new Carro();
            
            carro.setDisponibilidadeLocacao(2);
            carro.setPlaca(fieldBuscarPlacaAluguel.getText().trim());
            
            GerenciadorDAO gerenciador = new GerenciadorDAO();
            
            gerenciador.insertOperation(operacao);
            gerenciador.updateAvailabilityCar(carro);
            
            mensagemDialog("Hey!", "Aluguel realizado com sucesso.");
        }
    }

    @FXML
    private void btnLimparCamposAluguel(ActionEvent event) {
    }

    @FXML
    private void btnPesquisaPlacaAluguel(ActionEvent event) {
        String placa = fieldBuscarPlacaAluguel.getText().trim();
        
        if(!placa.isEmpty()) {
            Carro carro = new Carro();
            carro.setPlaca(placa);
            
            GerenciadorDAO gerenciador = new GerenciadorDAO();
            gerenciador.searchPlaca(carro);
            
            fieldMarcaAluguel.setText(carro.getMarca());
            fieldModeloAluguel.setText(carro.getModelo());
            fieldAnoAluguel.setText(String.valueOf(carro.getAno()));
            fieldTipoCarroAluguel.setText(carro.getTipoCarro());
            fieldKMAluguel.setText(String.valueOf(carro.getQuilometragem()));
            fieldTanqueAluguel.setText(carro.getTanque());
        }
    }

    @FXML
    private void btnCarrosDevolvidos(ActionEvent event) {
        tabelaCarroDevolvidos();
        entradaCarro.setVisible(false);
        saidaCarro.setVisible(false);
    }

    @FXML
    private void btnCarrosAlugadosEntrada(ActionEvent event) {
        tabelaCarroAlugado();
        entradaCarro.setVisible(false);
        saidaCarro.setVisible(false);
    }

    @FXML
    private void btnLiberarCarro(ActionEvent event) {
        if (tabelaCarroAlugado.getSelectionModel().getSelectedItem() != null) {
            
            mensagemEditarTabelaAluguel("Ei!", "Deseja liberar o aluguel do carro?");
        }

    }
    
    private void editarCampo() {
        
    }
}
