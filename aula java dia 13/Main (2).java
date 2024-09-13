class Pessoa{
  String nome;
  int idade;


  public Pessoa(String nome, int idade){
    this.nome = nome;
    this.idade = idade;
  
  }  
  public void exibirInformacoes(){
    System.out.println("Nome: " + nome);
    System.out.println("Idade: " + idade);
  }
}




public class Main {
  public static void main(String[] args) {
    Pessoa pessoa1 = new Pessoa("Miguel", 98);
    Pessoa pessoa2 = new Pessoa("Thaisa", 87);
    Pessoa pessoa3 = new Pessoa("Maryssa", 987);
    
    pessoa1.exibirInformacoes();
    pessoa2.exibirInformacoes();
    pessoa3.exibirInformacoes();
  }

 
}