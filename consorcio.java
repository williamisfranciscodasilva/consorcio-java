import javax.swing.JOptionPane;
class consorcio
{
    public static void main(String args[])
    {
        float tot_val, tot_pres, val_pres, pres_pag, pres_pen, tot_pag, sal_dev;

        tot_val = Float.parseFloat(
        JOptionPane.showInputDialog("Digite o valor total"));
        tot_pres = Float.parseFloat(
        JOptionPane.showInputDialog("Digite o total de presta��es"));
        val_pres = tot_val / tot_pres;
        pres_pag = Float.parseFloat(
        JOptionPane.showInputDialog("Digite o total de presta��es pagas"));
        pres_pen = tot_pres - pres_pag;
        tot_pag = val_pres * pres_pag;
        sal_dev = tot_val - tot_pag;

        JOptionPane.showMessageDialog(null,"Valor total: "+tot_val+
        "\nTotal de Presta��es: "+tot_pres+
        "\nValor da presta��o: "+val_pres+
        "\nPresta��es pagas: "+pres_pag+
        "\nPresta��es pendentes: "+pres_pen+
        "\nTotal pago: "+tot_pag+
        "\nSaldo devedor: "+sal_dev);

        System.out.println("Valor total: "+tot_val);
        System.out.println("Total de Presta��es: "+tot_pres);
        System.out.println("Valor da presta��o: "+val_pres);
        System.out.println("Presta��es pagas: "+pres_pag);
        System.out.println("Presta��es pendentes: "+pres_pen);
        System.out.println("Total pago: "+tot_pag);
        System.out.println("Saldo devedor: "+sal_dev);
    }
}