package feira.solucao.notificacao;

public class NotificadorWhatsApp implements NotificadorPedido {
    @Override
    public void notificarFinalizacao(String contato, double total) {
        System.out.println("WhatsApp enviado para " + contato + ": Pedido finalizado! Total: R$ " + total);
    }
}