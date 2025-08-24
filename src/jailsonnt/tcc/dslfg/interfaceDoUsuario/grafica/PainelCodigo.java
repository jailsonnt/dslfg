package jailsonnt.tcc.dslfg.interfaceDoUsuario.grafica;

import java.awt.GridLayout;

import javax.swing.JPanel;

import org.fife.ui.rsyntaxtextarea.RSyntaxDocument;
import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;
import org.fife.ui.rsyntaxtextarea.SyntaxConstants;
import org.fife.ui.rtextarea.RTextScrollPane;

@SuppressWarnings("serial")
public class PainelCodigo extends JPanel {
	RSyntaxTextArea codigo = new RSyntaxTextArea();
	RTextScrollPane barraRolagem ;

	public String getCodigo() {
		return codigo.getText();
	}

	public PainelCodigo() {
		 GridLayout layout = new GridLayout();
		 RSyntaxDocument documentTeste = new RSyntaxDocument(SyntaxConstants.SYNTAX_STYLE_JAVA);
		 documentTeste.setSyntaxStyle(new DefinicaoDoDestaqueDeSintaxe());
		 codigo.setDocument(documentTeste);
		 barraRolagem = new RTextScrollPane(codigo);
	     barraRolagem.setViewportView(codigo);
	     codigo.setCodeFoldingEnabled(true);
	     codigo.setAntiAliasingEnabled(true);
	     barraRolagem.setFoldIndicatorEnabled(true);
	     this.add(barraRolagem);
	     this.setLayout(layout);
	     this.setVisible(true);
	}

	public PainelCodigo(String texto) {
		 GridLayout layout = new GridLayout();
		 RSyntaxDocument documentTeste = new RSyntaxDocument(SyntaxConstants.SYNTAX_STYLE_JAVA);
		 documentTeste.setSyntaxStyle(new DefinicaoDoDestaqueDeSintaxe());
		 codigo.setDocument(documentTeste);
		 barraRolagem = new RTextScrollPane(codigo);
	     barraRolagem.setViewportView(codigo);
	     codigo.setCodeFoldingEnabled(true);
	     codigo.setAntiAliasingEnabled(true);
	     barraRolagem.setFoldIndicatorEnabled(true);
	     this.add(barraRolagem);
	     this.setLayout(layout);
	     codigo.setText(texto);
	     this.setVisible(true);
	}
}
