import java.security.Key;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        //Declaração de um vetor de inteiros tamanho 5
        int[] meu_array = new int[5];

        //Inicializaçao do vetor 
        meu_array[0] = 10; //Na posição 0 estou guardando o elemento 10
        meu_array[1] = 20;
        meu_array[2] = 30;
        meu_array[3] = 40;
        meu_array[4] = 50;// Finalizo aqui pois são 5 elementos, pois o zero é contado

        //Recuperar os valores da array por acesso rápido
        int element0 = meu_array[0];
        int element1 = meu_array[1];

        System.out.println(element0);
        System.out.println(element1);

        //System.out.println(element0+" "+element1);//Também posso imprimir assim

        String[] lista_aluno = new String[5];

        //Nesse caso o tamanho é imposto pela quantidade de posiçõs que determinamos
        //nas variáveis

        //Acesso direto
        lista_aluno[0] = "João";
        lista_aluno[1] = "Vanessa";
        lista_aluno[2] = "Davi";
        lista_aluno[3] = "Sabrina";
        lista_aluno[4] = "Larissa";

        //A questão do tamanho é imposta por meio da inclusão de elementos
        String[] lista_cidades = {"Poá", "Itaim Paulista", 
         "Suzano", "Itu"};

        //System.out.println(lista_cidades);

        //Acesso posicional com o for
        for (int i=0; i<lista_aluno.length; i++)
        System.out.println("Elemento"+i+":"+lista_aluno[i]);

        for (int i = 0; i < lista_cidades.length; i++){
            System.out.println("Elemento " + i + ": " + lista_cidades[i]);
        }

        //Acesso posicional sem o for
        int[] array = {10,20,30,40,50};
        System.out.println(Arrays.toString(array));


        //Verificando tamanho do array
        System.out.println(array.length);

        //Copiando uma array
        int[] copia_cidade = array.clone();
        String [] copia_cidade2 = lista_cidades;

        System.out.println(Arrays.toString(copia_cidade2));

        //Copiando uma parte da array para outra 
        String[] copia_sel = Arrays.copyOf(lista_cidades, 2);

        System.out.println("Copia "+ Arrays.toString(copia_sel));

        //Organizando elementos
        int[] nova_array = {5,6,4,2,3,1,0};
        Arrays.sort(nova_array);

        System.out.println("Ordenada em: "+ Arrays.toString(nova_array));

        //Inserindo um valor igual em todas as posições    
        int[] array_vazia = new int[5];

        System.out.println(":"+ Arrays.toString(array_vazia));

        Arrays.fill(array_vazia,10);

        //Comparando arrays
        System.out.println(":"+ Arrays.toString(array_vazia));
        if(Arrays.equals(lista_cidades, copia_cidade2)){
            System.out.println("Elas são iguais ");
        }else{
            System.out.println("Elas são diferentes");
        }
        
        boolean resp = Arrays.equals(lista_cidades, copia_cidade2);
        System.out.println("São iguais: "+resp);

        //Buscando elementos
        int posicao = Arrays.binarySearch(nova_array, 30);
        System.out.println("Foi localizado na posição: "+posicao);

    }
}
