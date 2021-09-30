#	language: pt
Funcionalidade: Realizar post em redes sociais

  @LinkedIn
  Cenario: Postar no LinkedIn
    Dado que eu acesse o linkedin
    Quando eu digitar o texto
    E carregar o video
    Entao o post deve ser publicado

  @Facebook
  Cenario: Postar no Facebook
    Dado que eu acesse o facebook
    Quando eu digitar o post
    Entao ele deve ser publicado
