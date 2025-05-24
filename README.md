[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/ybM3WQNb)

1- 
a) "Um relacionamento tem um é implementado via herança."
A afirmação é falsa, porque o relacionamento "tem um" é feito por composição, quando uma classe possui outra, não por herança, herança representa o relacionamento "é um".

b) "Quando uma subclasse redefinir um método de superclasse utilizando a mesma assinatura, diz-se que a subclasse sobrecarrega esse método de superclasse."
A afirmação é falsa, isso é chamado de sobrescrita (override), não sobrecarga, sobrecarga é quando há métodos com o mesmo nome, mas parâmetros diferentes.

2- Porque o protected permite que subclasses acessem diretamente os membros da superclasse, o que vai contra o princípio do encapsulamento, que busca proteger os dados internos da classe, o uso de private reforça isso, pois só permite o acesso dentro da própria classe. Já o protected facilita a reutilização de código em subclasses, mas expõe detalhes internos que deveriam estar escondidos. Por isso, o private é mais seguro, o protected deve ser usado apenas quando for realmente necessário para permitir a extensão da funcionalidade pela subclasse.

3- Em uma hierarquia de herança, quando um objeto de uma subclasse é criado, o construtor da superclasse é chamado primeiro, de forma explícita, com super() ou implícita. Isso é obrigatório porque a subclasse herda atributos da superclasse, e esses precisam ser inicializados antes da subclasse iniciar seu próprio construtor. Senão o objeto pode ficar em um estado inconsistente.
