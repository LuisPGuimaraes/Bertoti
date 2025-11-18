# Strategy + Observer + Composite

Campanhas de marketing combinam múltiplas mensagens (Composite), podem ser disparadas por diferentes canais (Strategy) e ainda informam interessados (Observer). Nesta pasta unimos os três patterns para ilustrar um fluxo completo e o respectivo anti-pattern monolítico.

## UML mental
Diagrama editável disponível em `diagram.puml`.
```plantuml
@startuml
interface DeliveryStrategy
class EmailStrategy
class SmsStrategy
DeliveryStrategy <|.. EmailStrategy
DeliveryStrategy <|.. SmsStrategy

interface DeliveryObserver
class AnalyticsListener
class AuditListener
DeliveryObserver <|.. AnalyticsListener
DeliveryObserver <|.. AuditListener

abstract class NotificationNode
class NotificationLeaf
class NotificationGroup
NotificationNode <|-- NotificationLeaf
NotificationNode <|-- NotificationGroup
NotificationGroup --> NotificationNode

class NotificationEngine {
  - DeliveryStrategy strategy
  - List<DeliveryObserver> observers
  + send(NotificationNode)
}
NotificationEngine --> DeliveryStrategy
NotificationEngine --> DeliveryObserver
NotificationEngine --> NotificationNode
@enduml
```

## Arquivos
- `PatternExample.java`: engine orquestrada com os três patterns.
