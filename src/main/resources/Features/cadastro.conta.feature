# language:pt
# encoding UTF-8
# Automatizador : Francis_inmetrics

Funcionalidade: Cadastro de contas
  Como um desenvolvedor necessito:
  Informar dados da conta
  Informar valor do saldo inicial caso tenha sido  depositado
  Alterar nome do titular
  Alterarção protegida do saldo; Depositar, Sacar, negativar , taxar saque
  Exibir alterações realizadas
  Travar numero da conta


  Esquema do Cenário: Adicionar uma conta

    Dado que tenha os dados da conta "<id_conta>" e "<nome_cliente>"
    Quando inserir estes dados
    Então o sistema apresentará os dados da conta com sucesso

    Exemplos:
      | id_conta | nome_cliente   |
      | 00000001 | Roberto Carlos |
      | 00000002 | Mariza Monte   |



  Esquema do Cenário: Alterar o nome do titular

    Dado  que tenha uma conta
    E que tenha um novo nome "<novo_nome>" para o titular
    Quando trocar o nome
    Então o sistema apresentará o novo nome nos dados da conta

    Exemplos:

      | novo_nome      |
      | Mario Afoncin  |



  Esquema do Cenário: Depositar valores na conta
    Dado que tenha uma conta
    E que tenha uma valor "<valor_depositado>" para depositar
    Quando fizer o deposito
    Então o sistema apresentará o saldo somado ao depósito

    Exemplos:
      | valor_depositado  |
      | 0001.00           |
      | 0005.00           |
      | 0100.00           |
      | 1000.00           |

  Esquema do Cenário: Sacar valor da conta corrente
    Dado que tenha uma conta
    E que tenha o valor para ser sacado "<valor_saque>"
    Quando realizar o saque
    Então o sistema apresentará o saldo subtraido ao saque

    Exemplos:

      | valor_saque       |
      | 0011.00           |
      | 0005.00           |
      | 0100.00           |
      | 1000.00           |







