# Portifólio 3º Semestre

## Descrição
![Dashboard NextSchema](https://github.com/user-attachments/assets/e68cd547-da4d-4f59-8e22-77f9fee8a980)

- Desenvolvimento do NextSchema, plataforma web que simplifica a configuração das fontes de dados do pipeline Dom Rock, oferecendo telas administrativas para cadastro de clientes, soluções, usuários e acompanhamento do avanço dos metadados nos estágios Landing Zone, Bronze e Silver.
- A interface possibilita upload e inspeção de arquivos CSV/Excel, mapeamento de campos e regras de negócio (incluindo chaves de identificação e conversões De/Para), dashboards com métricas por cliente e histórico de auditoria para rastrear ações.
- Exportação de arquivos YAML que alimentam os demais sistemas da Dom Rock, reduzindo a carga manual dos especialistas de dados.
- Segue práticas ágeis em quatro sprints, cobrindo desde a ingestão inicial e validação dos metadados até os dashboards e exportações finais, sempre priorizando autenticação/autorização robusta, design responsivo e modelagem focada na rastreabilidade.
- Arquitetura dividida em front-end multipáginas e back-end Spring Boot 3, permitindo que perfis administrativos acelerem a implantação dos clientes e reduzam a dependência de técnicos especialistas.

## Tecnologias Utilizadas
![Stack utilizada](https://github.com/user-attachments/assets/cf9e5191-fed5-49e2-b330-71d88d047618)

- HTML para estruturar as páginas administrativas, CSS para garantir responsividade/usabilidade e JavaScript modular para interatividade (login, dashboards, upload/preview de arquivos).
- Java 21 com Spring Boot (Web, Data JPA, Security, Validation) e ModelMapper para expor APIs REST e encapsular regras de negócio.
- Spring Security com JWT para autenticação stateless, além de MySQL/H2 para persistência, geração de YAML e documentação das APIs via SpringDoc/OpenAPI.

## Contribuições Pessoais (seleção de commits)
- Refatorei o serviço de dashboard para considerar empresas dinâmicas, diferenciar status VALIDADO/PENDENTE e classificar corretamente cada metadata por estágio (`Back-end/src/main/java/com/api/nextschema/NextSchema/service/DashService.java`, commit 8eee9b3).
- Corrigi o endpoint público de métricas ao expor `/dash/quantityByStage` retornando o mapa de estágios e padronizando o contrato usado pelo front (`Back-end/src/main/java/com/api/nextschema/NextSchema/web/controller/DashController.java`, commit 7a4c327).
- Estruturei o fluxo completo de autenticação JWT ao desabilitar sessões, ajustar os controllers e integrar o login do front com tokens persistidos (`Back-end/src/main/java/com/api/nextschema/NextSchema/config/SecurityConfigurations.java`, `.../AuthenticationController.java`, `Front-end/Scripts/login.js`, commit 4bb7ce6).

## Hard Skills Adquiridas
- Modelagem e refino de APIs RESTful com Spring Boot 3, aplicando DTOs, serviços e controllers desacoplados.
- Domínio de coleções Java e regras de negócio para consolidar métricas inter-empresa em tempo real.
- Produção de documentação funcional orientada ao usuário, alinhando artefatos técnicos com a experiência do cliente.

## Soft Skills Adquiridas
- Comunicação clara com stakeholders e com o time para alinhar expectativas do cliente Dom Rock a cada sprint.
- Relato objetivo nas dailys e reviews, reportando bloqueios e avanços com foco em dados e métricas.
- Colaboração na resolução de problemas coletivos, alternando papéis de apoio técnico e facilitador dentro do squad.
