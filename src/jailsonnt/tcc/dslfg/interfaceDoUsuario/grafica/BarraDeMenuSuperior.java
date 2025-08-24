package jailsonnt.tcc.dslfg.interfaceDoUsuario.grafica;

import java.awt.event.ActionEvent;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

@SuppressWarnings("serial")
public class BarraDeMenuSuperior extends JMenuBar {
	DSLFGTela framePrincipal = null;
	
	public BarraDeMenuSuperior(DSLFGTela framePrincipal) {
		this.framePrincipal = framePrincipal;
		this.add(criaMenuArquivo());
		this.add(criaMenuAjuda());
		this.add(criaMenuExemplo());
		this.setVisible(true);
	}
	
	private JMenu criaMenuExemplo() {
		JMenu exemplos = new JMenu("Exemplos");
		JMenuItem exemploUm = new JMenuItem("exemplo 1");
		exemplos.add(exemploUm);
		return exemplos;
	}

	private JMenu criaMenuAjuda() {
		JMenu menuAjuda = new JMenu("Ajuda");
		JMenuItem listaDeComandos = new JMenuItem("Lista De Comandos");
		listaDeComandos.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evento){
				AcaoDeListaDeComandos(evento);
			}
		});
		JMenuItem sobre = new JMenuItem("Sobre");
		sobre.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evento){
				AcaoDeSobre(evento);
			}
		});
		menuAjuda.add(listaDeComandos);
		menuAjuda.add(sobre);
		return menuAjuda;
	}


	private void AcaoDeSobre(ActionEvent evento) {
		framePrincipal.acaoDeSobre();
	}

	private void AcaoDeListaDeComandos(ActionEvent evento) {
		framePrincipal.AcaoDeListaDeComandos();
	}

	private JMenu criaMenuArquivo(){
		JMenu menuArquivo = new JMenu("Arquivo");
		JMenuItem abrir = new JMenuItem("Abrir");
		abrir.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evento){
				AcaoDeAbrirArquivo(evento);
			}
		});
		JMenuItem salvar = new JMenuItem("Salvar");
		salvar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evento){
				AcaoDeSalvarArquivo(evento);
			}
		});
		menuArquivo.add(abrir);
		menuArquivo.add(salvar);
		return menuArquivo;
	}

	private void AcaoDeSalvarArquivo(ActionEvent evento) {
		framePrincipal.AcaoDeSalvarArquivo();
		
	}

	private void AcaoDeAbrirArquivo(ActionEvent evento) {
		framePrincipal.AcaoDeAbrirArquivo();
	}

}
