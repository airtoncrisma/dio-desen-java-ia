# 📱 Modelagem e Diagramação de um Componente iPhone

## 📋 Descrição
O desafio, tem como objetivo modelar e diagramar a representação UML do componente iPhone, abrangendo suas funcionalidades como Reprodutor Musical, Aparelho Telefônico e Navegador na Internet.
Com base nisto, foram implementadas as classes e interfaces no formato de arquivos .java.


##  🎓 Diagrama UML 
<p align="center">
  <img src="https://github.com/airtoncrisma/dio-desen-java-ia/blob/main/tipos-variaveis/src/iphoneuml/doc/UML_IPHONE.drawio.png" alt="Diagrama de Classes">
</p>


Nesta seção, descrevemos as funcionalidades que seram modeladas


### `iPhone`

A classe `iPhone` é a classe principal que representa o dispositivo como um todo. Ela implementa as interfaces `ReprodutorMusical`, `AparelhoTelefonico` e `NavegadorInternet`. Isso permite que o iPhone desempenhe os papéis de reprodutor musical, aparelho telefônico e navegador na Internet. 

### `ReprodutorMusical`

A interface `ReprodutorMusical` define os métodos necessários para controlar a reprodução de música, como `tocar()`, `pausar()` e `selecionarMusica()`. As classes que implementam essa interface são capazes de reproduzir músicas.

### `AparelhoTelefonico`

A interface `AparelhoTelefonico` define os métodos para realizar chamadas telefônicas e enviar mensagens, incluindo `ligar()`, `atender()` e `iniciarCorreioVoz()`. As classes que implementam essa interface podem funcionar como dispositivos telefônicos.

### `NavegadorInternet`

A interface `NavegadorInternet` define métodos para a navegação na web, como `exibirPagina()`, `adicionarNovaAba()` e `atualizarPagina()`. As classes que implementam essa interface podem atuar como navegadores da Internet.

Cada classe ou interface desempenha uma função específica no sistema e contribui para a versatilidade do dispositivo iPhone, permitindo que ele execute diversas tarefas.
