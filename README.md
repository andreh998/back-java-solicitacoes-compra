## front-solicitacoes-compra

Back-end do sistema de solicitação de compra. Front-end disponível em: <br/>
https://github.com/andreh998/front-solicitacoes-compra

## Requisitos

Maven 3.6.3: https://maven.apache.org/download.cgi <br/>
JDK 1.8: https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html <br/>

## Executar em modo de Desenvolvimento

Para rodar o projeto em modo de desenvolvimento, clone ou faça o download e abra o mesmo com o Eclipse, aguarde o download das dependencias, e execute a classe `Aplication.java` em com.apirest.

## Deploy com JAR

Com esta build não precisamos ter o tomcat instalado na máquina.

Na pasta raiz do projeto execute o comando: <br/>
`mvn clean package` <br/>
Feito isso, será criada uma pasta chamada target na raiz, e dentro dela teremos um arquivo jar para executar o projeto. Neste caso o nome do arquivo é: <br/>
`ControleSolicitacoesRest-0.0.1-SNAPSHOT.jar`

Execute o comando dentro da pasta target para iniciar o servidor: <br/>

`javar -jar ControleSolicitacoesRest-0.0.1-SNAPSHOT.jar` <br/>


## Configurando o acesso da aplicação ao banco de dados

Altere o arquivo 'application.properties' em src/main/resoures com os dados de conexão do banco de dados de sua máquina: <br/>
spring.datasource.url=**coloque_aqui_a_url_de_conexão** <br/>
spring.datasource.username=**coloque_aqui_o_usuario** <br/>
spring.datasource.password=**coloque_aqui_a_senha** <br/>


