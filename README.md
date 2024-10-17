
---
# Android - Teste de Integração do Investment Card

Este projeto é um aplicativo Android nativo criado para ensinar como realizar testes de integração em um componente chamado `InvestmentCard`. O projeto inclui dois exercícios principais:

1. Adicionar verificações de elementos específicos do `InvestmentCard`.
2. Identificar e corrigir um teste quebrado.

## Exercícios

1. **Verificação de elementos de tela**:
   - Assegure que os seguintes textos e valores estejam presentes:
     - **earnings**: `Rendimento: R$ 0,09`
     - **amount**: `R$ 11,52`
     - **date**: `DAQUI A 2 DIAS`

2. **Corrigir um teste quebrado**:
   - Um dos testes do `InvestmentCard` está quebrado. Encontre e corrija o problema para garantir que ele passe com sucesso.

## Requisitos

- Android Studio instalado
- Dispositivo Android ou emulador configurado

## Passos para Abrir e Executar o Projeto

1. **Clonar o repositório**:
   ```bash
   git clone https://github.com/jacksonsmith/android_test_integration.git
   ```
2. Abrir o projeto no Android Studio:
Abra o Android Studio e selecione File > Open,
 depois navegue até a pasta android_test_integration e clique em Open.
4. Executar o aplicativo:
5. Selecione um emulador ou dispositivo Android e clique no botão Run (ícone de Play) no Android Studio.
6. Executar os testes:
    No Android Studio, abra a aba Run > Edit Configurations..., selecione Android JUnit e escolha a classe de teste.
    Clique em Run para executar os testes.

## Estrutura do Projeto

Componentes: O componente InvestmentCard está localizado em app/src/main/java/com/example/myapplication/InvestmentCard.kt
Testes: Os testes para o InvestmentCard estão na pasta app/src/androidTest/java/com/example/myapplication/InvestmentCardTest.kt
