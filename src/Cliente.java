import java.time.format.DateTimeFormatter;

public class Cliente {

	private static int ultimoID = 10_000;

    private String nome;
    private int documento;

    /**
     * Construtor do cliente. Cria um novo cliente a partir do nome informado.
     * TODO: utilize obrigatoriamente o método setNome para atribuir o nome ao cliente.
     * TODO: atribua ao cliente um número de documento gerado sequencialmente a partir
     * do contador estático ultimoID (e incremente o contador).
     */
    public Cliente (String nome) {

    	setNome(nome);
        this.ultimoID = ultimoID + 1;
        this.documento = ultimoID;

    }

    /**
     * TODO: retorne o nome do cliente.
     */
    public String getNome() {
    	
    	return this.nome;
    }

    /**
     * Atribui ao cliente o nome informado como parâmetro.
     * TODO: esse nome deve conter, pelo menos, duas palavras; caso contrário,
     * lance a exceção adequada (IllegalArgumentException).
     */
    public void setNome(String nome) {
        if(!nome.contains(" ")){
            throw new IllegalArgumentException("O nome deve conter, pelo menos, duas palavras");
        }
    	this.nome = nome;
    }

    /**
     * TODO: retorne uma representação textual do cliente, incluindo seu nome e documento.
     */
    @Override
    public String toString() {
		StringBuilder stringCliente = new StringBuilder();
		
        stringCliente.append("\n");

		stringCliente.append("Documento do Cliente: " + this.documento + "\n");
		
		stringCliente.append("Nome do Cliente: " + this.getNome() + "\n");
		
		return stringCliente.toString();
    }

    /**
     * TODO: retorne um código hash para o cliente, que corresponde a seu documento.
     */
    @Override
    public int hashCode(){
        return this.documento;
    }
}
