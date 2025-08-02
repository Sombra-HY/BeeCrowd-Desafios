# Programa de Criptografia em 3 Passos

Este programa realiza três passadas sobre o texto de entrada para criptografar mensagens.

1. Na primeira passada, apenas letras minúsculas e maiúsculas são deslocadas 3 posições para a direita na tabela ASCII. Os demais caracteres permanecem inalterados.

2. Na segunda passada, a string resultante é invertida.

3. Na terceira passada, todos os caracteres da metade em diante (truncada) são deslocados uma posição para a esquerda na tabela ASCII.

## Entrada

A primeira linha contém um inteiro N (1 ≤ N ≤ 10⁴), indicando o número de linhas a serem processadas. As próximas N linhas contêm os textos a serem criptografados.

## Saída

Para cada linha de entrada, deve-se imprimir a versão criptografada da mensagem.

## Exemplo

### Entrada:
```
4
Texto #3
abcABC1
vxpdylY .ph
vv.xwfxo.fd
```

### Saída:
```
3# rvzgV
1FECedc
ks. \n{frzx
gi.r{hyz-xx
```
