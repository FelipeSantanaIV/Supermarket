package implementation;

public class SupermarketArray implements Supermarket{

    private final String [] items;

    private int lastIndex;

    public SupermarketArray (final int size) {
        items = new String[size];
        //indicar ultimo elemento do vetor
        lastIndex = -1;
    }


    @Override
    public void add(String item) {
        if(lastIndex == items.length-1){
            System.err.println("Lista do Supermercado cheia");
        } else {
            lastIndex++;
            items[lastIndex] = item;
        }
    }

    @Override
    public void print() {
        System.out.println("#########################################");
        if (lastIndex <0 ) {
            System.out.println("Lista do Supermacado vazia");
        }
        for (int i = 0; i<= lastIndex; i++){
            System.out.println(i + " - " + items[i]);
        }
        System.out.println("#########################################");
    }

    @Override
    public void delete(int index) {
        if(index >= 0 && index <= lastIndex){
            shift(index);
            lastIndex--;
        } else {
            System.err.println("Indice inválido: " + index);
        }
    }

    //Função para puxar os elemntos da direita para esquerda
    private void shift(final int index) {
        for (int i = index; i < lastIndex;i++){
            items[i] = items[i+1];
        }
    }
}
