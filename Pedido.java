import java.util.ArrayList;
import java.util.list;

public class Pedido{
    private int numero;
    private String data;
    private Cliente cliente;
    private list<produto> itens;
    private String status; 
     
    public Pedido ( int numero, String data, Cliente cliente){
        this.numero = numero;
        this.data = data;
        this.cliente = cliente;
        this.itens = new ArrayList<>();
        this.status = "em andamento";
    }
    
    public void adicionarItem(IProduto item){
        itens.add(item);
    }
    public void removerItem(IProduto item){
        itens.remover(item);
}

    public double calcularTotal() {
        double total = 0;
        for (IProduto item : item){
            total += item.getPreco();
        }
        return total;
    }
