# Problema: Dígito Quebrado da Máquina de Datilografia

Durante anos, todos os contratos da Associação de Contratos da Modernolândia (ACM) foram datilografados em uma velha máquina de datilografia.

Recentemente, o Sr. Miranda percebeu que a máquina apresentava falha em um, e apenas um, dos dígitos numéricos. Mais especificamente, o dígito falho, quando datilografado, não é impresso na folha, como se a tecla correspondente não tivesse sido pressionada.

Ele quer saber, a partir dos valores originais dos contratos, qual valor realmente foi impresso (ou seja, sem o dígito com defeito).

## Entrada

Cada linha da entrada contém dois valores:
- Um dígito D (1 ≤ D ≤ 9), que representa o dígito com defeito.
- Um número N (1 ≤ N < 10¹⁰⁰), representando o valor original do contrato.

A entrada termina com a linha:  
```
0 0
```

## Saída

Para cada linha de entrada (exceto a última), imprima uma linha contendo o valor resultante após remover todas as ocorrências do dígito D em N.  
Caso o resultado seja uma string vazia (todos os dígitos foram removidos), imprima 0.

## Exemplo de Entrada
```
5 5000000
3 123456
9 23454324543423
9 99999999991999999
7 777
0 0
```

## Exemplo de Saída
```
0
12456
23454324543423
1
0
```

