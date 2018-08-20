### Contexto:
    É inquestionável a aplicação de estruturas do tipo
    árvore em diversas áreas conforme visto em aula. Pensando nisso,
    você (o grupo) deverá desenvolver alguns contratos baseados na
    árvore de pesquisa binária apresentada em aula.


### Interface:
    Você deverá usar a interface a seguir e isso
    significa que não deverá ser alterado nenhum nome. Lembre-se
    que, para a validação de cada contrato, o professor utiliza
    testes automatizados e, portanto, é fundamental que não seja
    alterado nada.

**Passo 1).** Crie a seguinte interface e vincule-a à classe
BinarySearchTree apresentada em aula.
~~~~
public interface BinarySearchTreeADT<K, V> {

    // Contratos implementados
    public void clear();
    public boolean isEmpty();
    public V search(K key);
    public void insert(K key, V value);
    public boolean delete(K key);
    public void preOrder();
    public void inOrder();
    public void postOrder();
    public void levelOrder();

    // Contratos não implementados
    public int countNodes();
    public int countInternalNodes();
    public int countLeaves();
    public int degree(K key);
    public int degreeTree();
    public int height(K key);
    public int heightTree();
    public int depth(K key);
    public String ancestors(K key);
    public String descendents(K key);
}
~~~~



**Passo 2).** Desenvolva em Java cada contrato conforme regra de
negócio descrita no Quadro 1. É obrigatório o desenvolvimento
dos contratos de forma recursiva e lembre-se que poderá ser
criado qualquer método que facilite o desenvolvimento.


### Quadro 1: Descrição dos Contratos

|  Contrato | Descrição |
|---|---|
|countNodes|  **Objetivo**: retornar o número de nós da árvore. **Parâmetros**:nenhum. **Retorno**: número de nós da árvore |
|countInternalNodes| **Objetivo**: retornar o número de nós internos da árvore. **Parâmetros**: nenhum. **Retorno**: número de nós internos da árvore ou zero caso a árvore esteja vazia. |
|  |  |
|  |  |
|  |  |
|  |  |
|  |  |
|  |  |
|  |  |
