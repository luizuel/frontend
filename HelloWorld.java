/**
 * public: declaração de exportacão publica de uma classe/método/função/variavel/etc...
 * 
 * class: declaração de classe (objeto).
 * 
 * HelloWorld: nome da classe (principal), que tem que ser igual ao nome do arquivo HelloWorld.java.
 * 
 * { "abre chaves": inicia o bloco de código.
 * 
 * static: declaração de método/função variável estática, pois essa declaração faz com que os dados não sejam perdidos/vazados na memória ou processamento.
 * 
 * void: (nulo) nesse caso, significa que o método não irá retornar, ou seja o retorno é: "nulo".
 * 
 * main: (principal) é o nome do método, neste caso, é o método principal, que irá executar o projeto.
 * 
 * ( "abre parenteses": inicio da declaração de parâmentros ou argumentos.
 * 
 * string: (texto) é o tipo do parâmentro ou argumento, serve também para declarar tipo de variável.
 * 
 * [] "abre e fecha colchete": é a delcaração de uma matriz.
 * 
 * args (argumentos): é o nome do parâmentro ou argumento.
 * 
 * ) "fechar parenteses": final da declaração de parâmetros ou argumentos.
 * 
 * System: (sistema) declaração/invocação da class "System".
 * 
 * . "ponto": é um operador de invocação.
 * 
 * out: (saída) depois do ponto, serve como uma declaração/invocação da subclasse "out" proveniente da classe "System".
 * 
 * println: (imprimir "print" linha "ln" -> line) depois do ponto, serve como uma declaração/invocação do método "println" pois logo após tem um "abre parenteses".
 * Obs: quando tem o "new" (novo) é uma declaração/invocação/criação de um novo objeto.
 * 
 * HelloWorld: é o texto propriamente dito dentro de aspas duplas.
 * 
 * " "aspas duplas": é a declaração/definição de texto.
 * 
 * ; "ponto e virgula": é a declaraçao de finalização de linha de código.
 * 
 * } "fecha chaves": é a declaração de finalização de bloco de código.
 * 
 */



public class HelloWorld {
    public static void main(String[] args){
        System.out.println("Hello World!");
    }
}