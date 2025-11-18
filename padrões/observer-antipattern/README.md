# Anti-pattern Observer: Polling Caótico

Quando cada consumidor precisa ficar perguntando "algo mudou?" (polling), desperdiçamos recursos e criamos dependências ocultas. O exemplo mostra `Dashboard`, `MobileApp` e `Webhook` consultando o sujeito sem contrato de notificação.

## Sintomas
- App consulta o banco a cada X segundos.
- Consumidores implementam filtros inconsistentes.
- Sujeito precisa conhecer cada consumidor para liberar o acesso.

## UML do anti-pattern
O diagrama em `diagram.puml` mostra `DashboardClient` e `MobileClient` fazendo polling direto em `LegacyNewsDatabase`, evidenciando o acoplamento desnecessário.

## Como resolver
A solução é voltar ao Observer canônico com contrato `attach/notify`. A classe `RealtimeNewsFeed` demonstra a refatoração.

> Implementação completa do Observer está na pasta `observer-pattern`.

## Arquivos
- `AntiPatternExample.java`: cenário de polling e acoplamento com banco.
