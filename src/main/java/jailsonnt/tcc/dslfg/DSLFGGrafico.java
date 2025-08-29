package jailsonnt.tcc.dslfg;

import jailsonnt.tcc.dslfg.interfaceDoUsuario.AmbienteDeExecucaoDSLFG;
import jailsonnt.tcc.dslfg.interfaceDoUsuario.grafica.DSLFGTela;

public class DSLFGGrafico {

	public static void main(String args[]) {
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(DSLFGTela.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(DSLFGTela.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(DSLFGTela.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(DSLFGTela.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		}

		java.awt.EventQueue.invokeLater(new Runnable() {

			public void run() {
				DSLFGTela dslfgTela = new DSLFGTela();
				AmbienteDeExecucaoDSLFG dsl = AmbienteDeExecucaoDSLFG.obterInstância();
				dsl.fixarInterfaceDoUsuario(dslfgTela);
				dslfgTela.setVisible(true);
			}
		});
	}

}
