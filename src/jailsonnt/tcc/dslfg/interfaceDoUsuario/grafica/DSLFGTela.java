package jailsonnt.tcc.dslfg.interfaceDoUsuario.grafica;

import jailsonnt.tcc.dslfg.interfaceDoUsuario.AmbienteDeExecucaoDSLFG;
import jailsonnt.tcc.dslfg.interfaceDoUsuario.InterfaceDoUsuario;

import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Jailson
 */
@SuppressWarnings("serial")
public class DSLFGTela extends javax.swing.JFrame implements InterfaceDoUsuario {
    int tabCounter = 0;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExecutar = new javax.swing.JButton();
    private javax.swing.JButton btnFecharPnlAcoes = new javax.swing.JButton();
    private javax.swing.JButton btnNovoCod = new javax.swing.JButton();
    private javax.swing.JButton btnSalvar = new javax.swing.JButton();
    private javax.swing.JButton btnSalvarTodos = new javax.swing.JButton();
    private BarraDeMenuSuperior barraDeMenuSuperior = new BarraDeMenuSuperior(this);
    private javax.swing.JScrollPane barraDeRolagemDoTxtSaida = new javax.swing.JScrollPane();
    private javax.swing.JScrollPane barraDeRolagemDoTxtAvisos = new javax.swing.JScrollPane();
    private javax.swing.JPanel pnlAcoes = new javax.swing.JPanel();
    private javax.swing.JPanel pnlAvisos = new javax.swing.JPanel();
    private javax.swing.JPanel pnlMensagens = new javax.swing.JPanel();
    private javax.swing.JPanel pnlSaida = new javax.swing.JPanel();
    private javax.swing.JTabbedPane tabbedPannelCodigos = new javax.swing.JTabbedPane();
    private javax.swing.JTabbedPane tabbedPannelMensagens = new javax.swing.JTabbedPane();
    private static javax.swing.JTextArea txtAvisos = new javax.swing.JTextArea();
    public static javax.swing.JTextArea txtSaida = new javax.swing.JTextArea();
    
    public DSLFGTela() {
        inicializarComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        txtAvisos.setText("");
        txtSaida.setText("");
    }
    
    static public void setTxtSaida(String saida){
    	txtSaida.setText(txtSaida.getText() + saida);
    }

    
    private void inicializarComponentes() {
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DSL FOR GRAPHS - DSLFG");

        pnlAcoes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlAcoes.setToolTipText("Ações");

        btnSalvar.setForeground(new java.awt.Color(240, 240, 240));
        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("icones/disquetePequeno.png")));
        btnSalvar.setToolTipText("Salvar");
        btnSalvar.setBorder(null);
        btnSalvar.setName("btnSalvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcaoDeSalvarArquivo();
            }
        });

        btnSalvarTodos.setIcon(new javax.swing.ImageIcon(getClass().getResource("icones/Save allpequeno.png"))); 
        btnSalvarTodos.setToolTipText("Salvar Todos");
        btnSalvarTodos.setBorder(null);
        btnSalvarTodos.setName("btnSalvarTodos");
        btnSalvarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JOptionPane.showMessageDialog(null, "Ainda não implementado");
            }
        });

        btnNovoCod.setIcon(new javax.swing.ImageIcon(getClass().getResource("icones/File Open-01pequeno.png"))); 
        btnNovoCod.setToolTipText("Novo algoritmo");
        btnNovoCod.setBorder(null);
        btnNovoCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoCodActionPerformed(evt);
            }
        });

        btnExecutar.setForeground(new java.awt.Color(240, 240, 240));
        btnExecutar.setIcon(new javax.swing.ImageIcon(getClass().getResource("icones/player_playpequeno.png"))); 
        btnExecutar.setToolTipText("Executar");
        btnExecutar.setBorder(null);
        btnExecutar.setName("btnExecutar");
        btnExecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExecutarActionPerformed(evt);
            }
        });

        btnFecharPnlAcoes.setText("x");
        btnFecharPnlAcoes.setBorder(null);
        btnFecharPnlAcoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFecharPnlAcoesMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlAcoesLayout = new javax.swing.GroupLayout(pnlAcoes);
        pnlAcoes.setLayout(pnlAcoesLayout);
        pnlAcoesLayout.setHorizontalGroup(
            pnlAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAcoesLayout.createSequentialGroup()
                .addComponent(btnSalvar)
                .addGap(2, 2, 2)
                .addComponent(btnSalvarTodos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNovoCod)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExecutar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnFecharPnlAcoes))
        );
        pnlAcoesLayout.setVerticalGroup(
            pnlAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnSalvarTodos)
            .addComponent(btnSalvar)
            .addComponent(btnExecutar)
            .addComponent(btnNovoCod)
            .addComponent(btnFecharPnlAcoes)
        );

        pnlMensagens.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mensagens", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(51, 51, 51))); // NOI18N

        txtSaida.setColumns(20);
        txtSaida.setRows(5);
        barraDeRolagemDoTxtSaida.setViewportView(txtSaida);

        javax.swing.GroupLayout pnlSaidaLayout = new javax.swing.GroupLayout(pnlSaida);
        pnlSaida.setLayout(pnlSaidaLayout);
        pnlSaidaLayout.setHorizontalGroup(
            pnlSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(barraDeRolagemDoTxtSaida, javax.swing.GroupLayout.DEFAULT_SIZE, 929, Short.MAX_VALUE)
        );
        pnlSaidaLayout.setVerticalGroup(
            pnlSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(barraDeRolagemDoTxtSaida, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        tabbedPannelMensagens.addTab("Saída", pnlSaida);

        txtAvisos.setColumns(20);
        txtAvisos.setRows(5);
        barraDeRolagemDoTxtAvisos.setViewportView(txtAvisos);

        javax.swing.GroupLayout pnlAvisosLayout = new javax.swing.GroupLayout(pnlAvisos);
        pnlAvisos.setLayout(pnlAvisosLayout);
        pnlAvisosLayout.setHorizontalGroup(
            pnlAvisosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(barraDeRolagemDoTxtAvisos, javax.swing.GroupLayout.DEFAULT_SIZE, 929, Short.MAX_VALUE)
        );
        pnlAvisosLayout.setVerticalGroup(
            pnlAvisosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(barraDeRolagemDoTxtAvisos, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        tabbedPannelMensagens.addTab("Avisos", pnlAvisos);

        javax.swing.GroupLayout pnlMensagensLayout = new javax.swing.GroupLayout(pnlMensagens);
        pnlMensagens.setLayout(pnlMensagensLayout);
        pnlMensagensLayout.setHorizontalGroup(
            pnlMensagensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPannelMensagens)
        );
        pnlMensagensLayout.setVerticalGroup(
            pnlMensagensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMensagensLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(tabbedPannelMensagens, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setJMenuBar(barraDeMenuSuperior);
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlAcoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tabbedPannelCodigos)
            .addComponent(pnlMensagens, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlAcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabbedPannelCodigos, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlMensagens, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }

    private void btnFecharPnlAcoesMouseClicked(java.awt.event.MouseEvent evt) {
        pnlAcoes.setVisible(false);
    }

    private void btnNovoCodActionPerformed(java.awt.event.ActionEvent evt) {
        tabCounter++;
        tabbedPannelCodigos.add("dslfg "+String.valueOf(tabCounter),new PainelCodigo());
    }

    private void btnExecutarActionPerformed(java.awt.event.ActionEvent evt) {
        PainelCodigo atual = (PainelCodigo) tabbedPannelCodigos.getSelectedComponent();

        try {
            AmbienteDeExecucaoDSLFG dsl = AmbienteDeExecucaoDSLFG.obterInstância();
            dsl.carregarPrograma(atual.getCodigo());
            txtSaida.setText("");
            txtAvisos.setText("");
            dsl.executar();
        }catch (Exception ex){
            txtAvisos.setText(ex.getMessage());
            tabbedPannelMensagens.setSelectedIndex(1);
        }   
    }
    
    public void acaoDeSobre(){
    	JDialog janelaSobre = new JDialog();
		janelaSobre.setLayout(new GridBagLayout());
		janelaSobre.setSize(300,250);
		String textoSobre = "<html>Universidade do vale do Itajaí<br>Centro de Ciências tecnológicas da terra e do mar";
		textoSobre += "<br>Curso de Ciência da Computação<br><br><br>Domain-Specific Language para grafos(DSLFG)<br><br>Autor:Jailson Nicoletti<br>Orientador: Rafael Santiago</html>";
		JLabel labelSobre = new JLabel(textoSobre);
		janelaSobre.add(labelSobre);
		janelaSobre.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		janelaSobre.setVisible(true);
    }
    
    public void AcaoDeListaDeComandos() {
    	JDialog janelaListaDeComandos = new JDialog();
		janelaListaDeComandos.setLayout(new GridLayout(1,1));
		janelaListaDeComandos.setSize(800,600);
		String textoListaDeComandos = "<html><tr><td>Comando</td><td>Exemplo</td><td>Descrição</td></tr>";
		JLabel labelListaDeComandos = new JLabel(textoListaDeComandos);
		janelaListaDeComandos.add(labelListaDeComandos);
		janelaListaDeComandos.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		janelaListaDeComandos.setVisible(true);
    }
    
    void AcaoDeAbrirArquivo(){
    	JFileChooser telaAbrir = new JFileChooser();
		int retornoDaTelaAbrir = telaAbrir.showOpenDialog(null);
		if (retornoDaTelaAbrir == JFileChooser.APPROVE_OPTION){
			File arquivoEscolhido = telaAbrir.getSelectedFile();
			
			try {
				FileInputStream fluxoDeLeitura = new FileInputStream(arquivoEscolhido);
				InputStreamReader leitorDeFluxo = new InputStreamReader(fluxoDeLeitura); 
				BufferedReader leitor = new BufferedReader(leitorDeFluxo); 
				String texto = obterStringDeArquivo(leitor);
				tabCounter++;
		        tabbedPannelCodigos.add("dslfg "+String.valueOf(tabCounter),new PainelCodigo(texto));
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Problema carregando o arquivo", "Aviso!", JOptionPane.WARNING_MESSAGE);
			} 
		}
    }
    
    void AcaoDeSalvarArquivo() {
    	JFileChooser telaAbrir = new JFileChooser();
		int retornoDaTelaAbrir = telaAbrir.showSaveDialog(null);
		if (retornoDaTelaAbrir == JFileChooser.APPROVE_OPTION){
			File arquivoEscolhido = telaAbrir.getSelectedFile();
			try {
				FileOutputStream fluxoDeGravação = new FileOutputStream(arquivoEscolhido); 
				PainelCodigo atual = (PainelCodigo) tabbedPannelCodigos.getSelectedComponent();
	            String código = atual.getCodigo();
	            fluxoDeGravação.write(código.getBytes());  
	            fluxoDeGravação.close(); 
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Problema salvando o arquivo", "Aviso!", JOptionPane.WARNING_MESSAGE);
			} 
		}
	}
    
	private String obterStringDeArquivo(BufferedReader leitor) throws IOException {
		String retorno = "";
		String linha = leitor.readLine(); 
	    while (linha != null) {
	    	retorno += linha+"\n";
	    	linha = leitor.readLine(); 
	    }
	    leitor.close();
		return retorno;
	}
   
	
    @Override
	public void imprimir(String texto) {
    	setTxtSaida(texto);
	}

}
