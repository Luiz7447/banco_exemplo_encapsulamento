# 🏦 Sistema de Conta Bancária – Encapsulamento em Java

## 📘 Descrição

Este projeto foi desenvolvido em **Java** utilizando o **Apache NetBeans IDE 23** com o objetivo de **demonstrar o princípio de Encapsulamento**, um dos pilares da **Programação Orientada a Objetos (POO)**.  

A aplicação simula o funcionamento básico de uma **conta bancária**, permitindo ao usuário interagir com operações financeiras por meio de **caixas de diálogo (JOptionPane)**. O sistema exemplifica como proteger atributos de uma classe e controlá-los por meio de métodos acessores (`get` e `set`).

---

## ⚙️ Funcionalidades

- 🔐 **Login com senha** e bloqueio automático após três tentativas inválidas  
- 💸 **Saque** com verificação de saldo  
- 💰 **Depósito** com validação de valores  
- 🧾 **Verificação de saldo atual**  
- 🔄 **Troca de senha** com confirmação  
- 📋 **Exibição dos dados da conta** (nome, saldo e status do bloqueio)  
- 🪟 **Interface via JOptionPane** (simples e interativa)

---

## 🧠 Conceitos Aplicados

- Encapsulamento (`private`, `public`, `getters` e `setters`)
- Construtores de classe
- Estruturas condicionais e laços de repetição
- Manipulação de entrada e saída com `JOptionPane`
- Instanciação e interação entre classes (`Banco` e `Conta`)

---

## 🧩 Estrutura do Projeto

src/
- ├── Conta.java → Classe principal que representa a conta bancária.
- └── Banco.java → Classe que contém o método main e executa o sistema.

### **Classe Conta**
- Armazena dados do cliente (nome, saldo, senha e status da conta).  
- Controla o acesso aos atributos com métodos `get` e `set`.  
- Implementa as operações bancárias e o controle de tentativas de acesso.

### **Classe Banco**
- Responsável por criar uma instância da classe `Conta`.  
- Exibe o menu principal com as opções de operação da conta.

---

## 🚀 Como Executar

1. Abra o projeto no **Apache NetBeans IDE 23**  
2. Compile e execute a classe `Banco.java`  
3. Utilize as opções do menu exibido via `JOptionPane`  

---

## 🧑‍💻 Autor

**Luiz Felipe de Oliveira**  
📅 *Classe criada em 17/10/2024*  
💬 Projeto acadêmico desenvolvido para exemplificar o uso de **encapsulamento em Java**.

---

## 🧾 Licença

Este projeto é de uso educacional e pode ser livremente utilizado para fins de estudo e aprendizado.  
Sinta-se à vontade para clonar, modificar e aprimorar. ✨
