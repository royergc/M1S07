
## Ex 1 - Implemente uma Classe Pesssoa
Crie uma Classe Pessoa, contendo os atributos encapsulados, com seus respectivos seletores (getters) e modificadores (setters), e ainda o construtor padrão e pelo menos mais duas opções de construtores conforme sua percepção. Atributos: String nome; String endereço; String telefone.

### Solução:
Criei a classe Pessoa, com os atributos como *private* para garantir o encapsulamento e construtores padrão: um que não recebe nenhum parâmetro e inicializa as Strings vazias, um que recebe nome e endereço e um que recebe nome e telefone. Por fim implementei todos os getters e setters, conforme requisitado.

O código ficou assim (O código está no meu [GitHub](https://github.com/royergc) , no repositório [M1S07 - src - Ex1 -  Pessoa.java](https://github.com/royergc/M1S07)  ).

```
package Ex1;

public class Pessoa {
    private String nome;
    private String endereco;
    private String telefone;
    
    public Pessoa() {
        this.nome = "";
        this.endereco = "";
        this.telefone = "";
    }

    public Pessoa(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }
    
    public Pessoa(String nome, String telefone) {
        this.nome = nome;
        this.endereco = "";
        this.telefone = telefone;
    }
    
    public Pessoa(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = "";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
```
