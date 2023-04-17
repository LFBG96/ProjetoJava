package com.trabalho; //LFBG96
/*
Put header here


 */

import java.net.URL;
import java.util.ResourceBundle;



import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;


public class FXMLController implements Initializable {
	
	
	
	Alert a = new Alert(AlertType.CONFIRMATION);
	
	@FXML
	private TextField txtNome;
	@FXML
	private TextField txtN1;
	@FXML
	private TextField txtN2;
	@FXML
	private Label lblNome;
	@FXML
	private Label lblN1;
	@FXML
	private Label lblN2;
	
	
	
	@FXML
	private TableView<Alunos> tbAlunos;
	@FXML
	private TableColumn<Alunos, String> colunaNome, colunaSituacao;
	@FXML
	private TableColumn<Alunos, Double> colunaN1,colunaN2,colunaMedia;
	
	private ObservableList<Alunos> listaAlunos = 
			FXCollections.observableArrayList();
    
    
    @FXML
	private Double n1;
    @FXML
	private Double n2;
    @FXML
	private Double t;
    
    @FXML
    private String situacao,nome;
    @FXML
    private Double media;
	
	
	public void clickCadastro() {
		if(txtNome.getText().equals("")) {
			lblNome.setText("Informe um Nome");
		}
		else {
			nome = txtNome.getText();
			lblNome.setText(null);
		}
		
		if(txtN1.getText().equals("")) {
			lblN1.setText("Informe a Primeira Nota");
			
		}
		else {
			
			double t = Double.parseDouble(txtN1.getText());
			if(t >=0 && t <=10) {
				n1 = t;
			}
			else {
				
				txtN1.setText("Informe um valor entre 0 e 10");
				
			}
			lblN1.setText(null);
		}
		if(txtN2.getText().equals("")) {
			lblN2.setText("Informe a Segunda Nota");
			
			
		}
		else {
			double t = Double.parseDouble(txtN2.getText());
			if(t >=0 && t <=10) {
				n2 = t;
			}
			else {
				lblN2.setText("Informe uma nota valida");
				txtN2.setText("Informe um valor entre 0 e 10");
				
			}
			lblN2.setText(null);
		}
		if(n1>=0 && n1 <=10 && n2>=0 && n2<=10) {
			media = (n1+n2)/2;
			if(media<4 && media >=0) {
				situacao = "Reprovado";
				
			}
			else if(media>=4 && media<7) {
				situacao = "Recuperação";
			}
			else if(media>=7 && media<=10) {
				situacao = "Aprovado";
			}
			
		}
		if(nome != null && n1 != null && n2 != null && media != null && situacao != null) {
			listaAlunos.add(new Alunos(nome,n1,n2,media,situacao));
			a.setAlertType(AlertType.INFORMATION);
			a.setHeaderText("Cadastro Aluno");
			a.setContentText("Aluno Cadastrado com Sucesso");
			a.setTitle("Aviso");
			a.show();
			nome = null;
			n1 = null;
			n2 = null;
			media = null;
			situacao = null;
			txtNome.clear();
			txtN1.clear();
			txtN2.clear();
		}		
	}
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    	colunaNome.setCellValueFactory(new PropertyValueFactory<>("nome"));

    	colunaN1.setCellValueFactory(new PropertyValueFactory<>("n1"));
    	colunaN2.setCellValueFactory(new PropertyValueFactory<>("n2"));
    	colunaMedia.setCellValueFactory(new PropertyValueFactory<>("media"));
    	colunaSituacao.setCellValueFactory(new PropertyValueFactory<>("situacao"));
    	tbAlunos.setItems(listaAlunos);
    	
    }    
}
