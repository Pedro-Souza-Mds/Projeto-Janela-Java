# Janela-Java

### Este Projeto consiste em uma aplicação Java simples, com a funcionalidade CRUD (Create, Read, Update e Delete) que realiza as quatro operações básicas (criação, consulta, atualização e destruição de dados) utilizadas em bases de dados relacionais fornecidas aos utilizadores do sistema que interagem através de uma janela de autenticação. 
&nbsp;
- Este Projeto foi desevolvido com base em especificações e orientações docentes. Como descrito a seguir:

&nbsp;<div align="center">
<img src="https://user-images.githubusercontent.com/108109540/176350886-ba791274-1081-4614-a766-d41173c5bced.png" width="500px" />
</div> &nbsp;
<div align="center">
<img src="https://user-images.githubusercontent.com/108109540/176349365-856d86c8-4251-45fa-9f63-3b4987d4e5e5.png" width="500px" />
</div> &nbsp; 

### Para desenvolvimento e funcionalidade efetiva da aplicação, houve a necessidade de uma conexão com um determinado banco de dados, nesse projeto foi utilizado o banco de dados Microsoft Access Database, onde foi usado bibliotecas na IDE NetBeans 8.2 do software chamado UCanAccess (Versão 5.0.1), que tem o objetivo de estabelecer a conexão SQL entre a aplicação e o banco de dados. O banco de dados possuem as seguintes estruturas:
- Tabela *Fornecedores*
- Tabela *Produtos*
- Tabela *Usuarios*
- *Relações*
<div align="center">
<img src="https://user-images.githubusercontent.com/108109540/176349356-17b888e7-0061-4c46-8b53-9d4a4ef12fb4.png" width="500px" />
<img src="https://user-images.githubusercontent.com/108109540/176349366-81232378-4130-4281-ac26-cb1301c2bc24.png" width="550px" />
<img src="https://user-images.githubusercontent.com/108109540/176349370-434c1f28-c514-470c-925a-25f5b685a5e8.png" width="500px" /> 
<img src="https://user-images.githubusercontent.com/108109540/176349367-8ac9df8b-c7df-4f03-bc64-e3bec71a5549.png" width="550px" />
</div>&nbsp;

### Como solicitado anteriormente a interação entre o usuário e a aplicação é feita através da interface Menu, onde cada Item de Menu deve ter sua janela de interface acessível quando o item for selecionado, entretanto, antes da tela de Menu, é feita uma autenticação em uma tela de Login, como a seguir:
&nbsp;

<div align="center">
<img src="https://user-images.githubusercontent.com/108109540/176349358-23b0f8c9-fe94-46bd-8dce-fbd14a4e68a2.png" width="500px" />
</div>

&nbsp;
<div align="center">
<img src="https://user-images.githubusercontent.com/108109540/176349359-2efb8693-3704-4ad5-8aaf-de558b0501be.png" width="380px" />&nbsp; 
<img src="https://user-images.githubusercontent.com/108109540/176349360-7bd50482-5c34-456c-8908-9d671214aef2.png" width="380px" />&nbsp; 
<img src="https://user-images.githubusercontent.com/108109540/176349364-811963f1-6c16-49b1-a9eb-6c2f5899a8c7.png" width="380px" />&nbsp;
</div>&nbsp;

## Item de de Menu: **ARQUIVO**
- **Fornecedores ->** Interface em que é possível buscar, inserir, alterar e/ou excluir um Fornecedor específico, onde possui id, nome e telefone.&nbsp;

- **Produtos ->** Interface em que é possível buscar, inserir, alterar e/ou excluir um Produto específico, onde possui id, nome, valor do produto e fornecedor.
- **Sair ->** Botão em que faz com o que o usuário saia da aplicação.

&nbsp;
<div align="center">
<img src="https://user-images.githubusercontent.com/108109540/176349344-2c233882-7fc2-4846-bcb6-dbc20036bf71.png" width="355px" />&nbsp; 
<img src="https://user-images.githubusercontent.com/108109540/176349347-964dc3fd-cda2-43dd-87bf-04a644dce375.png" width="380px" />&nbsp;
</div>&nbsp;

## Item de de Menu: **CONSUTAS**
- **Fornecedores ->** Interface em que é possível consultar os fornecedores cadastrados no banco de dados *Database2.accdb*, na tabela *Fornecedores*, que são inseridos pela janela ***Arquivo/Fornecedores***.&nbsp;

- **Produtos ->** Interface em que é possível consultar os produtos cadastrados no banco de dados *Database2.accdb*, na tabela *Produtos*, que são inseridos pela janela ***Arquivo/Fornecedores***.
- **Produtos Por Fornecedor ->** Interface em que é possível consultar os produtos cadastrados de acordo com seu fornecedor. Exemplo: consulta todos os produtos do fornecedor *Samsung*, ou seja, essa interface apresenta a relação dos produtos com seu fornecedor de acordo com a relação apresentada em *Relações* na base de dados *Database2.accdb*, em que as tabelas *Fornecedores* e *Produtos* estão 'ligadas' diretamente.

&nbsp;
<div align="center">
<img src="https://user-images.githubusercontent.com/108109540/176349349-61614fdd-36a8-473a-a30b-64f42e795d27.png" width="305px" />&nbsp; 
<img src="https://user-images.githubusercontent.com/108109540/176349351-be9408f0-03d7-4d89-9b89-2caac9006242.png" width="550px" />&nbsp;
</div>&nbsp;

<div align="center">
<img src="https://user-images.githubusercontent.com/108109540/176349353-adbd91ec-aa91-4708-b050-aa0586d93cf2.png" width="500px" />
</div>&nbsp;

## Item de de Menu: **AJUDA**
- **Sobre ->** Janela em que se apresenta dados sobre o desenvolvimento do projeto, como: aluno, professor/orientador, disciplina, curso, instituição e data de entrega.

&nbsp;
<div align="center">
<img src="https://user-images.githubusercontent.com/108109540/176349369-bc23f0f7-9d62-4f46-93e7-0145fdca337c.png" width="500px" />
</div>&nbsp;