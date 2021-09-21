# L2CodeEx01

LOGICA

A lógica que utilizei para fazer o exercício foi pegar do usuário quantas caixas e quantos produtos
o usuário gostaria de encaixotar e então salvar esses dados em matrizes deste jeito:

Caixas[Indice da caixa] [Altura,Largura,Comprimento]

Produto[Indice do produto] [Altura,Largura,Comprimento]

Após isto peguei os dados das caixas e somei sua altura,largura e comprimento para saber quais eram
as maiores caixas e então salvei estes dados em um vetor chamado "CaixaSoma" e apartir dele tive a
oportunidade de arrumar a matriz das Caixas em ordem crescente.

Também fiz um vetor chamado "CaixasNomes" para deixar mais organizado e facilitar na hora de imprimir
o resultado.

Porque deixar estes vetores em forma crescente é tão importante? É importante para o programa escolher
a menor caixa para o produto, facilitando e padronizando o código, fazendo com que dê para utilizar
o comando "break" para assim que o produto achar uma caixa em que ele caiba pegar ela mesmo, já que
o programa começara com 0 e irá subindo ele vai acabar escolhendo a menor caixa para o produto, fazendo
com que o programa só tenha que escolher se o produto cabe ou não na caixa.