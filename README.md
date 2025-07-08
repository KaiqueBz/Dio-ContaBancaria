# 💰 Conta Bancária em Java

Projeto desenvolvido durante o bootcamp **Santander | DIO**, com o objetivo de praticar lógica de programação e orientação a objetos em Java. O sistema simula uma conta bancária com operações básicas via terminal.

---

## 🚀 Funcionalidades

- Consultar saldo
- Consultar cheque especial
- Depositar dinheiro
- Sacar dinheiro
- Pagar boleto
- Verificar se a conta está usando o cheque especial

---

## 📋 Regras de Negócio

- O limite do cheque especial é calculado no momento da criação da conta:
  - Se o valor depositado for **R$500 ou menos**, o limite é fixo em **R$50**
  - Se o valor for **maior que R$500**, o limite é **50% do valor depositado**
- Quando o cheque especial for utilizado:
  - Será cobrada uma **taxa de 20%** sobre o valor utilizado, assim que houver saldo disponível para quitá-lo.

---

## 🛠️ Tecnologias

- Java 17+
- Orientação a Objetos
- Scanner (entrada de dados via terminal)

---

## 📂 Estrutura do Projeto

```plaintext
📦 ContaBancaria
├── Cliente.java
├── ContaBancaria.java
└── Main.java
